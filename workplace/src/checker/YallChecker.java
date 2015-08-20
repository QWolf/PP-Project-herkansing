package checker;

import grammar.YallBaseVisitor;
import grammar.YallParser;
import grammar.YallParser.BlockContext;
import grammar.YallParser.BoolExprCompEqOpAddContext;
import grammar.YallParser.BoolExprCompEqOpBoolContext;
import grammar.YallParser.DeclContext;
import grammar.YallParser.ToplevelblockPartContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

public class YallChecker extends YallBaseVisitor<Type>{
	/*
	 * Type Checker for the YALL-language. 
	 */
	
	//List of all threads created by 'Fork'. SPID 0 is not in this list
	private final Map<String, Integer> threads;
	
	//Scopes, the global scope, the current focus and the table of all Scopes
	private IDTable globalScope;
	private IDTable idtable;
	private final Map<ParseTree, IDTable> scopes;
	
	//Number that should be appointed to next thread
	private int nextSPID;
	
	//List of joins that are unknown at the time they are checked. These are checked again at the end of the checker
	private Map<String, String> unknownForks = new HashMap<String, String>();
	
	//List of all locks by name
	private final Map<String, Lock> locks;

	//Error listener
	private final List<String> errors;

	private String name;
	
	
	public YallChecker(){
		this.errors = new ArrayList<String>();
		this.scopes = new HashMap<ParseTree, IDTable>();
		this.locks = new HashMap<String, Lock>();
		this.globalScope = new IDTable(null, 0, 0);
		this.threads = new HashMap<String, Integer>();
		nextSPID = 1;
		
	}
	
	
	@Override public Type visitProgram(@NotNull YallParser.ProgramContext ctx) { 
		//Program name
		name = ctx.ID().getText();
		//Init
		if(ctx.init() != null){
			visit(ctx.init());
		}
		//Program
		visit(ctx.toplevelblock());
		//Check the thread ID's that were unkown
		checkUnknownForks();
		return null;
	}


	@Override public Type visitInit(@NotNull YallParser.InitContext ctx) { 
		//Build the global Scope
		idtable = globalScope;
		
		for(DeclContext decl : ctx.decl()){
			visit (decl);
			}
		globalScope = idtable;
		return null;
	}

	/*
	 *TOPLVLBLOCK
	 */
	
	@Override public Type visitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx) { 
		//Base level of a thread
		idtable = new IDTable(null, 1, 0);
		
		for(ToplevelblockPartContext tlbpc : ctx.toplevelblockPart()){
			visit(tlbpc);
		}
		scopes.put(ctx, idtable);
		return null;
	}
	
	@Override public Type visitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx) { 
		//Stores the old IDTable of the old thread while the new thread checks
		IDTable oldIDTable = idtable;
		if(threads.containsKey(ctx.ID().getText())){
			addError(ctx.start.getLine(), String.format("Thread %s already exists and thus cannot be created", ctx.ID().getText()));
		} else {
			//Register thread in list
			threads.put(ctx.ID().getText(), nextSPID);
			nextSPID++;
			
			visit(ctx.toplevelblock());
		}
		idtable = oldIDTable;
		return null;
		
		}

	@Override public Type visitToplvlStat(@NotNull YallParser.ToplvlStatContext ctx) { 
		visit(ctx.stat());
		return null;
		}

	@Override public Type visitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx) { 
		if(!threads.containsKey(ctx.ID().getText())){
			//unknownForks is a list which tracks threads that might be defined at a later point. If they are, the errors are not put into the errorlog
			unknownForks.put(ctx.ID().getText(), String.format("Line %d : Thread %s was never and will never be defined", ctx.start.getLine(), ctx.ID().getText()));
		}
		return null;
	}

	
	@Override public Type visitBlockStatement(@NotNull YallParser.BlockStatementContext ctx) { 
		//Every block has it's own Scope level
		idtable = new IDTable(idtable, idtable.getDepth() + 1, idtable.getOffset());
		scopes.put(ctx, idtable);
		
		for(ParseTree stat : ctx.stat()){
			visit(stat);
		}
			
		idtable = idtable.getParentScope();
		return null;
	}


	/*
	 * STATEMENTS
	 */
	
	@Override public Type visitStatDeclare(@NotNull YallParser.StatDeclareContext ctx){
		visit(ctx.decl());
		return null;
	}
	
	@Override public Type visitStatAssign(@NotNull YallParser.StatAssignContext ctx) { 
		Type exprType = visit(ctx.expr());
		
		//Check if variable is in global or local scope
		Variable id = idtable.getID(ctx.ID().getText());
		Variable globalID = globalScope.getID(ctx.ID().getText());
		
		
		if(id == null && globalID == null){
			//Variable exists neither in global nor in local scope
			addError(ctx.start.getLine(), String.format("Variable %s is not found in scope and thus cannot be assigned to", ctx.ID().getText()));
		} else if(id != null && exprType != id.getType()){
			//Variable exists in local scope, but has a different type that the expression
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s", ctx.expr().getText(), id.getType()));
		} else if(id != null && exprType == id.getType()){
			//Variable exists in local scope and has correct type
					//No Action
		} else if(globalID.getType() != exprType){
			//Variable exists in global scope, but has a different type that the expression
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s", ctx.expr().getText(), globalID.getType()));
		}
		return null;
	}
	

	@Override public Type visitStatIf(@NotNull YallParser.StatIfContext ctx) { 
		if(visit(ctx.boolExpr()) != Type.BOOLEAN){
			//expression is not resolvable to boolean
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.boolExpr().getText()));
		}
		for(BlockContext block : ctx.block()){
			visit(block);
		}
		return null;
	}
	
	@Override public Type visitStatWhile(@NotNull YallParser.StatWhileContext ctx) { 
		if(visit(ctx.boolExpr()) != Type.BOOLEAN){
			//expression is not resolvable to boolean
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.boolExpr().getText()));
		}
		visit(ctx.block());
		return null;
	}

	@Override public Type visitStatInput(@NotNull YallParser.StatInputContext ctx) { 
		Variable id = idtable.getID(ctx.ID().getText());
		Variable globalID = globalScope.getID(ctx.ID().getText());
		if(id == null && globalID == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not found in scope and thus cannot be used as input", ctx.ID().getText()));
		}	
		return null;
	}
	
	@Override public Type visitStatOutputInt(@NotNull YallParser.StatOutputIntContext ctx) { 
		if(visit(ctx.addExpr()) != Type.INTEGER){
			//expression is not resolvable to integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer", ctx.addExpr().getText()));
		}
		return null;
	}
	
	@Override public Type visitStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx) { 
		if(visit(ctx.boolExpr()) != Type.BOOLEAN){
			//expression is not resolvable to boolean
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.boolExpr().getText()));
		}
		return null;
	}

	@Override public Type visitStatLock(@NotNull YallParser.StatLockContext ctx) { 
		String id = ctx.ID().getText();
		if(!locks.containsKey(id)){
			locks.put(id, new Lock(id, 2 * locks.size()));
		}
		return null;

	}

	@Override public Type visitStatUnlock(@NotNull YallParser.StatUnlockContext ctx) { 
		String id = ctx.ID().getText();
		//A lock should always be locked in the same thread before an unlock is possible
		//therefor it should always exist
		if(!locks.containsKey(id)){
			addError(ctx.start.getLine(), String.format("Lock %s does not appear earlier in code, therefor cannot be locked at this point", id));
		}
		return null;
		
	}

	/*
	 * DECLARATIONS
	 */
	
	@Override public Type visitDeclDecl(@NotNull YallParser.DeclDeclContext ctx) { 
		String text = idtable.addVariable(visit(ctx.type()), ctx.ID().getText());
		if(text != null){
			//return error if idtable gave one back
			addError(ctx.start.getLine(), text);
		}
		return null;
	}
	
	@Override public Type visitDeclAssign(@NotNull YallParser.DeclAssignContext ctx) { 
		Type type = visit(ctx.type());
		String text = idtable.addVariable(type, ctx.ID().getText());
		if(text != null){
			//return error if idtable gave one back
			addError(ctx.start.getLine(), text);
		}
		if(type != visit(ctx.expr())){
			//Expression does not resolve to the variables type
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s and thus cannot be assigned", ctx.expr().getText(), type));
		}
		return null;
	}

	
	/*
	 * EXPRESSIONS
	 */
	
	@Override public Type visitExprNumExpr(@NotNull YallParser.ExprNumExprContext ctx) { 
		return visit(ctx.addExpr()); 
	}

	@Override public Type visitExprBoolExpr(@NotNull YallParser.ExprBoolExprContext ctx) { 
		return visit(ctx.boolExpr()); 
	}	
	
	
	/*
	 * BOOLEAN EXPRESSIONS
	 */
		
	@Override public Type visitBoolParanteses(@NotNull YallParser.BoolParantesesContext ctx) { 
		return visit(ctx.boolExpr()); 
	}

	@Override public Type visitBoolExprBoolOp(@NotNull YallParser.BoolExprBoolOpContext ctx) { 
		if (visit(ctx.boolExpr(0)) != Type.BOOLEAN){
			//Lefthand expression is not resolvable to a boolean
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with a boolean operator", ctx.boolExpr(0).getText()));
		}
		if (visit(ctx.boolExpr(1)) != Type.BOOLEAN){
			//Righthand expression is not resolvable to a boolean
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with a boolean operator", ctx.boolExpr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	
	@Override public Type visitBoolExprNot(@NotNull YallParser.BoolExprNotContext ctx) { 
		if (visit(ctx.boolExpr()) != Type.BOOLEAN){
			//Expression is not resolvable to a boolean
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with NOT", ctx.boolExpr().getText()));
		}
		return Type.BOOLEAN;
	}
	
	@Override public Type visitBoolExprCompOp(@NotNull YallParser.BoolExprCompOpContext ctx) { 
		if (visit(ctx.addExpr(0)) != Type.INTEGER){
			//Lefthand expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used with a comparison operator", ctx.addExpr(0).getText()));
		}
		if (visit(ctx.addExpr(1)) != Type.INTEGER){
			//Righthand expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used with a comparison operator", ctx.addExpr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	
	
	@Override public Type visitBoolExprCompEqOpAdd(@NotNull BoolExprCompEqOpAddContext ctx) {
		Type typeLeft = visit(ctx.addExpr(0));
		Type typeRight = visit(ctx.addExpr(1));

		if (typeLeft == Type.ERROR){
			//Lefthand expression is not resolvable to a value
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a value, therefor cannot be used with an equality operator", ctx.addExpr(0).getText()));
		}
		if (typeRight == Type.ERROR){
			//Righthand expression is not resolvable to a value
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a value, therefor cannot be used with an equality operator", ctx.addExpr(1).getText()));
		}
		
		if(typeLeft != typeRight){
			//Expressions are not of the same type!
			addError(ctx.start.getLine(), String.format("%s could not be resolved to the same type as %s , therefor cannot be used with an equality operator", ctx.addExpr(0).getText(), ctx.addExpr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	
	
	@Override public Type visitBoolExprCompEqOpBool(@NotNull BoolExprCompEqOpBoolContext ctx) {
		Type typeLeft = visit(ctx.boolExpr(0));
		Type typeRight = visit(ctx.boolExpr(1));

		if (typeLeft == Type.ERROR){
			//Lefthand expression is not resolvable to a value
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a value, therefor cannot be used with an equality operator", ctx.boolExpr(0).getText()));
		}
		if (typeRight == Type.ERROR){
			//Righthand expression is not resolvable to a value
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a value, therefor cannot be used with an equality operator", ctx.boolExpr(1).getText()));
		}
		
		if(typeLeft != typeRight){
			//Expressions are not of the same type!
			addError(ctx.start.getLine(), String.format("%s could not be resolved to the same type as %s , therefor cannot be used with an equality operator", ctx.boolExpr(0).getText(), ctx.boolExpr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	
	@Override public Type visitBoolExprIDExpr(@NotNull YallParser.BoolExprIDExprContext ctx) { 
		return visit(ctx.idExpr()); 
	}
	
	@Override public Type visitBoolExprBool(@NotNull YallParser.BoolExprBoolContext ctx) { 
		return Type.BOOLEAN;
	}
	
	/*
	 * NUMERICAL EXPRESSIONS - ADDEXPR
	 */
	
	@Override public Type visitAddExprAddOp(@NotNull YallParser.AddExprAddOpContext ctx) { 
		if (visit(ctx.addExpr(0)) != Type.INTEGER){
			//Lefthand expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with an equality operator", ctx.addExpr(0).getText()));
		}
		if (visit(ctx.addExpr(1)) != Type.INTEGER){
			//Righthand expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with an equality operator", ctx.addExpr(1).getText()));
		}
		return Type.INTEGER;
	}
	
	@Override public Type visitAddExprMultExpr(@NotNull YallParser.AddExprMultExprContext ctx) { 
		return visit(ctx.multExpr()); 
	}
	
	/*
	 * NUMERICAL EXPRESSIONS - MULTEXPR
	 */
	
	@Override public Type visitMultExprMultOp(@NotNull YallParser.MultExprMultOpContext ctx) { 
		if (visit(ctx.multExpr(0)) != Type.INTEGER){
			//Lefthand expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with an equality operator", ctx.multExpr(0).getText()));
		}
		if (visit(ctx.multExpr(1)) != Type.INTEGER){
			//Righthand expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean, therefor cannot be used with an equality operator", ctx.multExpr(1).getText()));
		}
		return Type.INTEGER;
	}
	
	@Override public Type visitMultExprParenteses(@NotNull YallParser.MultExprParentesesContext ctx) { 
		return visit(ctx.addExpr()); 
	}
	
	@Override public Type visitMultExprIntExpr(@NotNull YallParser.MultExprIntExprContext ctx) { 
		return visit(ctx.intExpr()); 
	}
	
	/*
	 * INTEGER EXPRESSIONS
	 */
	
	@Override public Type visitIntExprNum(@NotNull YallParser.IntExprNumContext ctx) { 
		return Type.INTEGER;
		
	}
	

	
	@Override public Type visitIntExprAdd(@NotNull YallParser.IntExprAddContext ctx) { 
		if (visit(ctx.intExpr()) != Type.INTEGER){
			//Expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used to add 1", ctx.intExpr().getText()));
			return Type.ERROR;
		}
		return Type.INTEGER;
	}

	@Override public Type visitIntExprSub(@NotNull YallParser.IntExprSubContext ctx) { 
		if (visit(ctx.intExpr()) != Type.INTEGER){
			//Expression is not resolvable to an integer
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used to subtract 1", ctx.intExpr().getText()));
			return Type.ERROR;
		}
		return Type.INTEGER;
	}	
	
	

	/*
	 * ID EXPRESSIONS
	 */
	
	@Override public Type visitIdExprID(@NotNull YallParser.IdExprIDContext ctx) { 
		Variable id = idtable.getID(ctx.getText());
		Variable globalID = globalScope.getID(ctx.ID().getText());
		
		if(id != null){
			//Variable found in local scope
			return id.getType();
		} else if(globalID != null){
			//Variable found in global scope
			return globalID.getType();	
		} else {
			//Variable not found in global or local scope
			addError(ctx.start.getLine(), String.format("Variable %s is not declared in this or higher scopes", ctx.getText()));
			return Type.ERROR;
		}
	}

	@Override public Type visitIdExprUp(@NotNull YallParser.IdExprUpContext ctx) {
		//Expression to seek a variable upward from any scope above the current
		IDTable localIDTable = idtable;
		int upDepth = 0;
		if(ctx.NUM() != null){
			//Argument given, (at least) x scopes above the current one
			int num = Integer.parseInt(ctx.NUM().getSymbol().getText());
			upDepth = num;
			
			//Go x scopes up
			while(num > 0 && localIDTable != null){
				localIDTable = idtable.getParentScope();
				num--;
			}
		} else {
			//No argument given, seek in any scope except the current one
			upDepth = 1;
			
			//Go one scope up
			localIDTable = idtable.getParentScope();
		}
		
		if(idtable.getDepth() == upDepth){
			//If depth should be 0, target scope is the global scope
			localIDTable = globalScope;
		}

		if(localIDTable == null){
			//No scope exists upDepth levels higher than current scope
			addError(ctx.start.getLine(), String.format("No scope is found %d levels above %s"  , upDepth, ctx.ID().getText()));
			return Type.ERROR;
		} else {
			//Scope found
			Variable id = localIDTable.getID(ctx.ID().getText());
			if(id != null){
				//Variable found in scope
				return id.getType();
			} else {
				//Variable not found in target scope or up
				id = globalScope.getID(ctx.ID().getText());
				if(id != null){
					//Variable not found in target local scope, but found in global scope
					return id.getType();
				} else {
					//Variable not found in local or global scope
					addError(ctx.start.getLine(), String.format("Variable %s is not declared %d or more levels higher", ctx.ID().getText(), upDepth));
					return Type.ERROR;
				}
			}
		}
	}
	
	@Override public Type visitIdExprBlock(@NotNull YallParser.IdExprBlockContext ctx) { 
		//TODO no deeper scope level? (up counts blocks as scopes...)
		return visit(ctx.expr()); 
	}

	
	
	
	
	
	@Override public Type visitTypeBool(@NotNull YallParser.TypeBoolContext ctx) { 
		return Type.BOOLEAN;
	}

	@Override public Type visitTypeInt(@NotNull YallParser.TypeIntContext ctx) { 
		return Type.INTEGER;
	}
	
	
	
	//Add error to the error list
	private void addError(int line, String text){
		if(line != 0){
			errors.add(String.format("Line %d : %s", line, text ));
		} else {
			errors.add(text);
		}
		
	}
	public List<String> getErrors(){
		return errors;
	}
	
	/*
	 * Checks if the joins that were unknown at the time are defined after all
	 */
	public void checkUnknownForks(){
		for(String x : unknownForks.keySet()){
			if(!threads.containsKey(x)){
				addError(0, unknownForks.get(x));
			}
		}
	}
	
	public Map<String, Integer> getThreads(){
		return threads;
	}


	public IDTable getGlobalScope() {
		return globalScope;
	}
	
	public Map<ParseTree, IDTable> getScopes(){
		return scopes;
	}
	
	public Map<String, Lock> getLocks(){
		return locks;
	}


	public String getName() {
		return name;
	}

}
