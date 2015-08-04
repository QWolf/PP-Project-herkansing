package checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import grammar.YallBaseListener;
import grammar.YallParser;

public class YallChecker extends YallBaseListener{
	private IDTable idtable;
	private List<String> errors;
	private Map<ParseTree, Type> ctxTypes;
	
	public YallChecker(){
		this.errors = new ArrayList<String>();
	}
	
	@Override 
	public void enterProgram(@NotNull YallParser.ProgramContext ctx) { 
		
	}

	@Override 
	public void exitProgram(@NotNull YallParser.ProgramContext ctx) { 
		
	}
	
	@Override public void enterBlockStatement(@NotNull YallParser.BlockStatementContext ctx) { 
		if(idtable != null){
			idtable = new IDTable(idtable, 0);
		} else {
			idtable = new IDTable(null, 0);
		}
	}

	@Override public void exitBlockStatement(@NotNull YallParser.BlockStatementContext ctx) { 
		idtable = idtable.getParentScope();
		//TODO offset?
		
	}
	
	@Override public void enterStatAssign(@NotNull YallParser.StatAssignContext ctx) { 
		Variable id = idtable.getID(ctx.ID().getText());
		if(id == null){
			errors.add("Variable " + ctx.ID().getText() + "is not found in scope and thus cannot be assigned to");
		} else {
			ctxTypes.put(ctx, id.getType());
		}
	}
	

	@Override public void exitStatIf(@NotNull YallParser.StatIfContext ctx) { 
		if(ctxTypes.get(ctx.expr()) != Type.BOOLEAN){
			errors.add(ctx.expr().getText() + " could not be resolved to a boolean");
		}	
	}
	
	@Override public void exitStatWhile(@NotNull YallParser.StatWhileContext ctx) { 
		if(ctxTypes.get(ctx.expr()) != Type.BOOLEAN){
			errors.add(ctx.expr().getText() + " could not be resolved to a boolean");
		}
	}

	@Override public void enterStatInput(@NotNull YallParser.StatInputContext ctx) { 
		Variable id = idtable.getID(ctx.ID().getText());
		if(id == null){
			errors.add("Variable " + ctx.ID().getText() + "is not found in scope and thus cannot be used as input");
		}	
	}
	
	@Override public void exitStatOutput(@NotNull YallParser.StatOutputContext ctx) { 
		if(ctxTypes.get(ctx.expr()) == Type.ERROR){
			errors.add(ctx.expr().getText() + " could not be resolved to an outputtable value");
		}
	}

	//TODO locks
	//TODO fork/join
	
	
	@Override public void exitDeclDecl(@NotNull YallParser.DeclDeclContext ctx) { 
		String text = idtable.addVariable(ctxTypes.get(ctx.type()), ctx.ID().getText());
		if(text != null){
			errors.add(text);
		}
	}
	
	@Override public void exitDeclAssign(@NotNull YallParser.DeclAssignContext ctx) { 
		String text = idtable.addVariable(ctxTypes.get(ctx.type()), ctx.ID().getText());
		if(text != null){
			errors.add(text);
		}
		if(ctxTypes.get(ctx.type()) != ctxTypes.get(ctx.expr())){
			errors.add(ctx.expr().getText() + "could not be resolved to type " + ctxTypes.get(ctx.type()) + " and thus cannot be assigned");
		}
	}

	@Override public void exitExprBlock(@NotNull YallParser.ExprBlockContext ctx) { 
		ctxTypes.put(ctx, ctxTypes.get(ctx.expr()));
	}

	@Override public void exitExprNumOp(@NotNull YallParser.ExprNumOpContext ctx) { 
		if (ctxTypes.get(ctx.expr(0)) != Type.INTEGER){
			errors.add(ctx.expr(0) + " could not be resolved to an integer, therefor cannot be used with a numerical operator");
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.INTEGER){
			errors.add(ctx.expr(1) + " could not be resolved to an integer, therefor cannot be used with a numerical operator");
		}
		ctxTypes.put(ctx, Type.INTEGER);
	}
	
	@Override public void exitExprBoolOp(@NotNull YallParser.ExprBoolOpContext ctx) { 
		if (ctxTypes.get(ctx.expr(0)) != Type.BOOLEAN){
			errors.add(ctx.expr(0) + " could not be resolved to an boolean, therefor cannot be used with a boolean operator");
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.BOOLEAN){
			errors.add(ctx.expr(1) + " could not be resolved to an boolean, therefor cannot be used with a boolean operator");
		}
		ctxTypes.put(ctx, Type.BOOLEAN);
	}
	
	@Override public void exitExprCompOp(@NotNull YallParser.ExprCompOpContext ctx) { 
		if (ctxTypes.get(ctx.expr(0)) != Type.INTEGER){
			errors.add(ctx.expr(0) + " could not be resolved to an integer, sizes cannot be compared");
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.INTEGER){
			errors.add(ctx.expr(1) + " could not be resolved to an integer, sizes cannot be compared");
		}
		ctxTypes.put(ctx, Type.BOOLEAN);
	}
	
	@Override public void exitExprCompEqOp(@NotNull YallParser.ExprCompEqOpContext ctx) { 
		Type typeLeft = ctxTypes.get(ctx.expr(0));
		Type typeRight = ctxTypes.get(ctx.expr(1));
		if (ctxTypes.get(ctx.expr(0)) != Type.ERROR){
			errors.add(ctx.expr(0) + " could not be resolved to any type, equality cannot be checked");
		}
		if (ctxTypes.get(ctx.expr(1)) != Type.ERROR){
			errors.add(ctx.expr(1) + " could not be resolved to any type, equality cannot be checked");
		}
		if(typeLeft != typeRight){
				errors.add(ctx.expr(0).getText() + " and " + ctx.expr(1).getText() + " cannot be resolved to the same type, therefor cannot be compared ");
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
			errors.add("No scope is found " + upDepth + " levels above " + ctx.ID().getText());
			ctxTypes.put(ctx, Type.ERROR);
		} else {
			Variable id = localIDTable.getID(ctx.ID().getText());
			if(id == null){
				errors.add("Variable " + ctx.ID().getText() + " is not declared  " + upDepth + " or more levels higher");
				ctxTypes.put(ctx, Type.ERROR);
			} else {
				ctxTypes.put(ctx, id.getType());
			}
		}
	}
		
	@Override public void exitExprID(@NotNull YallParser.ExprIDContext ctx) { 
		Variable id = idtable.getID(ctx.getText());
		if(id == null){
			errors.add("Variable " + ctx.getText() + " is not declared in this or higher scopes");
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



}
