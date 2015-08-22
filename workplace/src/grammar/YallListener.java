// Generated from Yall.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YallParser}.
 */
public interface YallListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multExprMultOp}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExprMultOp(@NotNull YallParser.MultExprMultOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExprMultOp}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExprMultOp(@NotNull YallParser.MultExprMultOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toplvlBlock}
	 * labeled alternative in {@link YallParser#toplevelblock}.
	 * @param ctx the parse tree
	 */
	void enterToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toplvlBlock}
	 * labeled alternative in {@link YallParser#toplevelblock}.
	 * @param ctx the parse tree
	 */
	void exitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toplvlFork}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 */
	void enterToplvlFork(@NotNull YallParser.ToplvlForkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toplvlFork}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 */
	void exitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statUnlock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatUnlock(@NotNull YallParser.StatUnlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statUnlock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatUnlock(@NotNull YallParser.StatUnlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExprIntExpr}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExprIntExpr(@NotNull YallParser.MultExprIntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExprIntExpr}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExprIntExpr(@NotNull YallParser.MultExprIntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprBool}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprBool(@NotNull YallParser.BoolExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprBool}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprBool(@NotNull YallParser.BoolExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull YallParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull YallParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExprParenteses}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExprParenteses(@NotNull YallParser.MultExprParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExprParenteses}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExprParenteses(@NotNull YallParser.MultExprParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatWhile(@NotNull YallParser.StatWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatWhile(@NotNull YallParser.StatWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(@NotNull YallParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(@NotNull YallParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(@NotNull YallParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(@NotNull YallParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExprID}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExprID(@NotNull YallParser.IdExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExprID}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExprID(@NotNull YallParser.IdExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExprAddOp}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExprAddOp(@NotNull YallParser.AddExprAddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExprAddOp}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExprAddOp(@NotNull YallParser.AddExprAddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statDeclare}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatDeclare(@NotNull YallParser.StatDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statDeclare}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatDeclare(@NotNull YallParser.StatDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprNot}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprNot(@NotNull YallParser.BoolExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprNot}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprNot(@NotNull YallParser.BoolExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolExpr}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolExpr(@NotNull YallParser.ExprBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolExpr}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolExpr(@NotNull YallParser.ExprBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprCompEqOpBool}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprCompEqOpBool(@NotNull YallParser.BoolExprCompEqOpBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprCompEqOpBool}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprCompEqOpBool(@NotNull YallParser.BoolExprCompEqOpBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprBoolOp}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprBoolOp(@NotNull YallParser.BoolExprBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprBoolOp}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprBoolOp(@NotNull YallParser.BoolExprBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statLock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatLock(@NotNull YallParser.StatLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statLock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatLock(@NotNull YallParser.StatLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprCompEqOpAdd}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprCompEqOpAdd(@NotNull YallParser.BoolExprCompEqOpAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprCompEqOpAdd}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprCompEqOpAdd(@NotNull YallParser.BoolExprCompEqOpAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(@NotNull YallParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(@NotNull YallParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExprSub}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExprSub(@NotNull YallParser.IntExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExprSub}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExprSub(@NotNull YallParser.IntExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExprNum}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExprNum(@NotNull YallParser.IntExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExprNum}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExprNum(@NotNull YallParser.IntExprNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(@NotNull YallParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(@NotNull YallParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull YallParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull YallParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link YallParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull YallParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link YallParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull YallParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declAssign}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclAssign(@NotNull YallParser.DeclAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declAssign}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclAssign(@NotNull YallParser.DeclAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(@NotNull YallParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(@NotNull YallParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(@NotNull YallParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(@NotNull YallParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolParanteses}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolParanteses(@NotNull YallParser.BoolParantesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolParanteses}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolParanteses(@NotNull YallParser.BoolParantesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprCompOp}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprCompOp(@NotNull YallParser.BoolExprCompOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprCompOp}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprCompOp(@NotNull YallParser.BoolExprCompOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumExpr}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumExpr(@NotNull YallParser.ExprNumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumExpr}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumExpr(@NotNull YallParser.ExprNumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toplvlStat}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 */
	void enterToplvlStat(@NotNull YallParser.ToplvlStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toplvlStat}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 */
	void exitToplvlStat(@NotNull YallParser.ToplvlStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(@NotNull YallParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(@NotNull YallParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExprBlock}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExprBlock(@NotNull YallParser.IdExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExprBlock}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExprBlock(@NotNull YallParser.IdExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(@NotNull YallParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(@NotNull YallParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#compEqOp}.
	 * @param ctx the parse tree
	 */
	void enterCompEqOp(@NotNull YallParser.CompEqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#compEqOp}.
	 * @param ctx the parse tree
	 */
	void exitCompEqOp(@NotNull YallParser.CompEqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statOutputBool}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statOutputBool}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExprUp}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExprUp(@NotNull YallParser.IdExprUpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExprUp}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExprUp(@NotNull YallParser.IdExprUpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(@NotNull YallParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(@NotNull YallParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(@NotNull YallParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(@NotNull YallParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declDecl}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclDecl(@NotNull YallParser.DeclDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declDecl}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclDecl(@NotNull YallParser.DeclDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExprIDExpr}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExprIDExpr(@NotNull YallParser.IntExprIDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExprIDExpr}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExprIDExpr(@NotNull YallParser.IntExprIDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExprIDExpr}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprIDExpr(@NotNull YallParser.BoolExprIDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExprIDExpr}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprIDExpr(@NotNull YallParser.BoolExprIDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExprMultExpr(@NotNull YallParser.AddExprMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExprMultExpr(@NotNull YallParser.AddExprMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toplvlJoin}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 */
	void enterToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toplvlJoin}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 */
	void exitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExprAdd}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExprAdd(@NotNull YallParser.IntExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExprAdd}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExprAdd(@NotNull YallParser.IntExprAddContext ctx);
}