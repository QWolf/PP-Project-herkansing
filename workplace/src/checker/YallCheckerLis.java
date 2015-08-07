package checker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import grammar.YallBaseListener;
import grammar.YallParser;

public class YallCheckerLis extends YallBaseListener{
	private final Map<String, IDTable> threads;
	private final IDTable globalScope;
	private IDTable idtable;
	private final Map<ParseTree, IDTable> scopes;
	private final List<String> errors;
	private final Map<ParseTree, Type> ctxTypes;
	private final Map<String, Lock> locks;
	
	public YallCheckerLis(){
		this.errors = new ArrayList<String>();
		this.scopes = new HashMap<ParseTree, IDTable>();
		this.ctxTypes = new HashMap<ParseTree, Type>();
		this.locks = new HashMap<String, Lock>();
		this.globalScope = new IDTable(null, 0);
		this.threads = new HashMap<String, IDTable>();
		
	}
	
	
//	@Override public void enterProgram(@NotNull YallParser.ProgramContext ctx) { 
//
//	}

//	@Override public void exitProgram(@NotNull YallParser.ProgramContext ctx) { 
//		
//	}
	
	
	@Override public void enterInit(@NotNull YallParser.InitContext ctx) { 

	}

	@Override public void enterToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx) { }

	
	@Override public void enterBlockStatement(@NotNull YallParser.BlockStatementContext ctx) { 
			idtable = new IDTable(idtable, idtable.getDepth() + 1);
			scopes.put(ctx, idtable);
	}

	@Override public void exitBlockStatement(@NotNull YallParser.BlockStatementContext ctx) { 
		idtable = idtable.getParentScope();
	}
	
	@Override public void exitStatAssign(@NotNull YallParser.StatAssignContext ctx) { 
		Variable id = idtable.getID(ctx.ID().getText());
		if(id == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not found in scope and thus cannot be assigned to", ctx.ID().getText()));
		} else if(ctxTypes.get(ctx.expr()) != id.getType()){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s", ctx.expr().getText(), id.getType()));
		}
	}
	

	@Override public void exitStatIf(@NotNull YallParser.StatIfContext ctx) { 
		if(ctxTypes.get(ctx.expr()) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.expr().getText()));
		}	
	}
	
	@Override public void exitStatWhile(@NotNull YallParser.StatWhileContext ctx) { 
		if(ctxTypes.get(ctx.expr()) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to a boolean", ctx.expr().getText()));
		}
	}

	@Override public void enterStatInput(@NotNull YallParser.StatInputContext ctx) { 
		Variable id = idtable.getID(ctx.ID().getText());
		if(id == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not found in scope and thus cannot be used as input", ctx.ID().getText()));
		}	
	}
	
	@Override public void exitStatOutput(@NotNull YallParser.StatOutputContext ctx) { 
		if(ctxTypes.get(ctx.expr()) == Type.ERROR){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an outputtable value", ctx.expr().getText()));
		}
	}

	//TODO locks
	@Override public void exitStatLock(@NotNull YallParser.StatLockContext ctx) { 
		String id = ctx.ID().getText();
		if(!locks.containsKey(id)){
			locks.put(id, new Lock(id, 2 * locks.size()));
		}

	}

	@Override public void exitStatUnlock(@NotNull YallParser.StatUnlockContext ctx) { 
		String id = ctx.ID().getText();
		if(!locks.containsKey(id)){
			addError(ctx.start.getLine(), String.format("Lock %s does not appear earlier in code, therefor cannot be locked at this point", id));
		}
		
	}

	//TODO fork/join
	
	
	@Override public void exitDeclDecl(@NotNull YallParser.DeclDeclContext ctx) { 
		String text = idtable.addVariable(ctxTypes.get(ctx.type()), ctx.ID().getText());
		if(text != null){
			addError(ctx.start.getLine(), text);
		}
	}
	
	@Override public void exitDeclAssign(@NotNull YallParser.DeclAssignContext ctx) { 
		String text = idtable.addVariable(ctxTypes.get(ctx.type()), ctx.ID().getText());
		if(text != null){
			addError(ctx.start.getLine(), text);
		}
		if(ctxTypes.get(ctx.type()) != ctxTypes.get(ctx.expr())){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to type %s and thus cannot be assigned", ctx.expr().getText(), ctxTypes.get(ctx.type())));
		}
	}

	@Override public void exitExprBlock(@NotNull YallParser.ExprBlockContext ctx) { 
		ctxTypes.put(ctx, ctxTypes.get(ctx.expr()));
	}

	@Override public void exitExprNumOp(@NotNull YallParser.ExprNumOpContext ctx) { 
		if (ctxTypes.get(ctx.expr(0)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used with a numerical operator", ctx.expr(0).getText()));
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, therefor cannot be used with a numerical operator", ctx.expr(1).getText()));
		}
		ctxTypes.put(ctx, Type.INTEGER);
	}

	@Override public void exitExprBoolOp(@NotNull YallParser.ExprBoolOpContext ctx) { 
		if (ctxTypes.get(ctx.expr(0)) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an boolean, therefor cannot be used with a boolean operator", ctx.expr(0).getText()));
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an boolean, therefor cannot be used with a boolean operator", ctx.expr(1).getText()));
		}
		ctxTypes.put(ctx, Type.BOOLEAN);
	}
	
	
	@Override public void exitExprNot(@NotNull YallParser.ExprNotContext ctx) { 
		if (ctxTypes.get(ctx.expr()) != Type.BOOLEAN){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an boolean, cannot be inversed", ctx.expr().getText()));
		}
		ctxTypes.put(ctx, Type.BOOLEAN);		
	}

	
	@Override public void exitExprCompOp(@NotNull YallParser.ExprCompOpContext ctx) { 
		if (ctxTypes.get(ctx.expr(0)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, sizes cannot be compared" , ctx.expr(0).getText()));
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.INTEGER){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to an integer, sizes cannot be compared" , ctx.expr(1).getText()));
		}
		ctxTypes.put(ctx, Type.BOOLEAN);
	}
	

	
	@Override public void exitExprCompEqOp(@NotNull YallParser.ExprCompEqOpContext ctx) { 
		Type typeLeft = ctxTypes.get(ctx.expr(0));
		Type typeRight = ctxTypes.get(ctx.expr(1));
		if (ctxTypes.get(ctx.expr(0)) == Type.ERROR){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to any type, equality cannot be checked"  ,ctx.expr(0).getText()));
		}
		if (ctxTypes.get(ctx.expr(1)) == Type.ERROR){
			addError(ctx.start.getLine(), String.format("%s could not be resolved to any type, equality cannot be checked"  ,ctx.expr(1).getText()));
		}
		if(typeLeft != typeRight){
				addError(ctx.start.getLine(), String.format("%s and %s cannot be resolved to the same type, therefor cannot be compared " ,ctx.expr(0).getText(), ctx.expr(1).getText()));
		}
		ctxTypes.put(ctx, Type.BOOLEAN);
	}
	
	@Override public void exitExprUp(@NotNull YallParser.ExprUpContext ctx) {
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
			ctxTypes.put(ctx, Type.ERROR);
		} else {
			Variable id = localIDTable.getID(ctx.ID().getText());
			if(id == null){
				addError(ctx.start.getLine(), String.format("Variable %s is not declared %d or more levels higher", ctx.ID().getText(), upDepth));
				ctxTypes.put(ctx, Type.ERROR);
			} else {
				ctxTypes.put(ctx, id.getType());
			}
		}
	}
		
	@Override public void exitExprID(@NotNull YallParser.ExprIDContext ctx) { 
		Variable id = idtable.getID(ctx.getText());
		if(id == null){
			addError(ctx.start.getLine(), String.format("Variable %s is not declared in this or higher scopes", ctx.getText()));
			ctxTypes.put(ctx, Type.ERROR);

		} else {
			ctxTypes.put(ctx, id.getType());
		}
	}
	
	@Override public void exitExprNum(@NotNull YallParser.ExprNumContext ctx) { 
		ctxTypes.put(ctx, Type.INTEGER);
		
	}
	
	@Override public void exitExprBool(@NotNull YallParser.ExprBoolContext ctx) { 
		ctxTypes.put(ctx, Type.BOOLEAN);
	}
	
	@Override public void exitTypeBool(@NotNull YallParser.TypeBoolContext ctx) { 
		ctxTypes.put(ctx, Type.BOOLEAN);
	}

	@Override public void exitTypeInt(@NotNull YallParser.TypeIntContext ctx) { 
		ctxTypes.put(ctx, Type.INTEGER);
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

}
