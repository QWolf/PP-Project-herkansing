package checker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import grammar.YallBaseListener;
import grammar.YallBaseVisitor;
import grammar.YallParser;
import grammar.YallParser.BlockContext;
import grammar.YallParser.DeclContext;
import grammar.YallParser.ToplevelblockPartContext;

public class YallChecker extends YallBaseVisitor<Type>{
	private final Map<String, IDTable> threads;
	private IDTable globalScope;
	private IDTable idtable;
	private final Map<ParseTree, IDTable> scopes;
	private final List<String> errors;
	private final Map<String, Lock> locks;
	
	private Map<String, String> unknownForks = new HashMap<String, String>();
	private Map<String, String> unknownLocks = new HashMap<String, String>();
	
	public YallChecker(){
		this.errors = new ArrayList<String>();
		this.scopes = new HashMap<ParseTree, IDTable>();
		this.locks = new HashMap<String, Lock>();
		this.globalScope = new IDTable(null, 0);
		this.threads = new HashMap<String, IDTable>();
		
	}
	
	
	@Override public Type visitProgram(@NotNull YallParser.ProgramContext ctx) { 
		if(ctx.init() != null){
			visit(ctx.init());
		}
		visit(ctx.toplevelblock());
		checkUnknownForks();
		return null;
	}


	@Override public Type visitInit(@NotNull YallParser.InitContext ctx) { 
		idtable = globalScope;
		
		for(DeclContext decl : ctx.decl()){
			visit (decl);
			}
		globalScope = idtable;
		return null;
	}

	@Override public Type visitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx) { 
		idtable = new IDTable(globalScope, 1);
		for(ToplevelblockPartContext tlbpc : ctx.toplevelblockPart()){
			visit(tlbpc);
		}
		return null;
	}
	
	@Override public Type visitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx) { 
		//Stores the old IDTable of the old thread while the new thread checks
		IDTable oldIDTable = idtable;
		if(threads.containsKey(ctx.ID().getText())){
			addError(ctx.start.getLine(), String.format("Thread %s already exists and thus cannot be created", ctx.ID().getText()));
		} else {
			visitChildren(ctx);
			threads.put(ctx.ID().getText(), idtable);
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
			idtable = new IDTable(idtable, idtable.getDepth() + 1);
			scopes.put(ctx, idtable);
			
			for(ParseTree stat : ctx.stat()){
				visit(stat);
			}
			
			idtable = idtable.getParentScope();
			return null;
	}


	@Override public Type visitStatDeclare(@NotNull YallParser.StatDeclareContext ctx){
		visit(ctx.decl());
		return null;
	}
	
	@Override public Type visitStatAssign(@NotNull YallParser.StatAssignContext ctx) { 
		Type exprType = visit(ctx.expr());
		Variable id = idtable.getID(ctx.ID().getText());
		if(id == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not found in scope and thus cannot be assigned to", ctx.ID().getText()));
		} else if(exprType != id.getType()){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s", ctx.expr().getText(), id.getType()));
		}
		return null;
	}
	

	@Override public Type visitStatIf(@NotNull YallParser.StatIfContext ctx) { 
		if(visit(ctx.expr()) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.expr().getText()));
		}
		for(BlockContext block : ctx.block()){
			visit(block);
		}
		return null;
	}
	
	@Override public Type visitStatWhile(@NotNull YallParser.StatWhileContext ctx) { 
		if(visit(ctx.expr()) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.expr().getText()));
		}
		visit(ctx.block());
		return null;
	}

	@Override public Type visitStatInput(@NotNull YallParser.StatInputContext ctx) { 
		Variable id = idtable.getID(ctx.ID().getText());
		if(id == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not found in scope and thus cannot be used as input", ctx.ID().getText()));
		}	
		return null;
	}
	
	@Override public Type visitStatOutput(@NotNull YallParser.StatOutputContext ctx) { 
		if(visit(ctx.expr()) == Type.ERROR){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an outputtable value", ctx.expr().getText()));
		}
		
		//TODO store output type
		return null;
	}

	//TODO locks
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
		if(!locks.containsKey(id)){
			addError(ctx.start.getLine(), String.format("Lock %s does not appear earlier in code, therefor cannot be locked at this point", id));
		}
		return null;
		
	}

	
	@Override public Type visitDeclDecl(@NotNull YallParser.DeclDeclContext ctx) { 
		String text = idtable.addVariable(visit(ctx.type()), ctx.ID().getText());
		if(text != null){
			addError(ctx.start.getLine(), text);
		}
		return null;
	}
	
	@Override public Type visitDeclAssign(@NotNull YallParser.DeclAssignContext ctx) { 
		Type type = visit(ctx.type());
		String text = idtable.addVariable(type, ctx.ID().getText());
		if(text != null){
			addError(ctx.start.getLine(), text);
		}
		if(type != visit(ctx.expr())){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s and thus cannot be assigned", ctx.expr().getText(), type));
		}
		return null;
	}

	@Override public Type visitExprBlock(@NotNull YallParser.ExprBlockContext ctx) { 
		return visit(ctx.expr());
	}

	@Override public Type visitExprNumOp(@NotNull YallParser.ExprNumOpContext ctx) { 
		if (visit(ctx.expr(0)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used with a numerical operator", ctx.expr(0).getText()));
		}
		if (visit(ctx.expr(1)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used with a numerical operator", ctx.expr(1).getText()));
		}
		return Type.INTEGER;
	}

	@Override public Type visitExprBoolOp(@NotNull YallParser.ExprBoolOpContext ctx) { 
		if (visit(ctx.expr(0)) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an boolean, therefor cannot be used with a boolean operator", ctx.expr(0).getText()));
		}
		if (visit(ctx.expr(1)) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an boolean, therefor cannot be used with a boolean operator", ctx.expr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	
	
	@Override public Type visitExprNot(@NotNull YallParser.ExprNotContext ctx) { 
		if (visit(ctx.expr()) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an boolean, cannot be inversed", ctx.expr().getText()));
		}
		return Type.BOOLEAN;		
	}

	
	@Override public Type visitExprCompOp(@NotNull YallParser.ExprCompOpContext ctx) { 
		if (visit(ctx.expr(0)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, sizes cannot be compared" , ctx.expr(0).getText()));
		}
		if (visit(ctx.expr(1)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, sizes cannot be compared" , ctx.expr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	

	
	@Override public Type visitExprCompEqOp(@NotNull YallParser.ExprCompEqOpContext ctx) { 
		Type typeLeft = visit(ctx.expr(0));
		Type typeRight = visit(ctx.expr(1));
		if (typeLeft == Type.ERROR){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to any type, equality cannot be checked"  ,ctx.expr(0).getText()));
		}
		if (typeRight == Type.ERROR){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to any type, equality cannot be checked"  ,ctx.expr(1).getText()));
		}
		if(typeLeft != typeRight){
				addError(ctx.start.getLine(), String.format("%s and %s cannot be resolved to the same type, therefor cannot be compared " ,ctx.expr(0).getText(), ctx.expr(1).getText()));
		}
		return Type.BOOLEAN;
	}
	
	@Override public Type visitExprUp(@NotNull YallParser.ExprUpContext ctx) {
		IDTable localIDTable = idtable;
		int upDepth = 0;
		if(ctx.NUM() != null){
			int num = Integer.parseInt(ctx.NUM().getSymbol().getText());
			upDepth = num;
			while(num > 0 && localIDTable != null){
				localIDTable = idtable.getParentScope();
				num--;
			}
		} else {
			upDepth = 1;
			localIDTable = idtable.getParentScope();
		}
		
		if(localIDTable == null){
			addError(ctx.start.getLine(), String.format("No scope is found %d levels above %s"  , upDepth, ctx.ID().getText()));
			return Type.ERROR;
		} else {
			Variable id = localIDTable.getID(ctx.ID().getText());
			if(id == null){
				addError(ctx.start.getLine(), String.format("Variable %s is not declared %d or more levels higher", ctx.ID().getText(), upDepth));
				return Type.ERROR;
			} else {
				return id.getType();
			}
		}
	}
		
	@Override public Type visitExprID(@NotNull YallParser.ExprIDContext ctx) { 
		Variable id = idtable.getID(ctx.getText());
		if(id == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not declared in this or higher scopes", ctx.getText()));
			return Type.ERROR;
		} else {
			return id.getType();
		}
	}
	
	@Override public Type visitExprNum(@NotNull YallParser.ExprNumContext ctx) { 
		return Type.INTEGER;
		
	}
	
	@Override public Type visitExprBool(@NotNull YallParser.ExprBoolContext ctx) { 
		return Type.BOOLEAN;
	}
	
	@Override public Type visitTypeBool(@NotNull YallParser.TypeBoolContext ctx) { 
		return Type.BOOLEAN;
	}

	@Override public Type visitTypeInt(@NotNull YallParser.TypeIntContext ctx) { 
		return Type.INTEGER;
	}
	
	
	
	
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

}
