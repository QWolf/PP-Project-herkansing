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
	 * Enter a parse tree produced by the {@code exprNumOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumOp(@NotNull YallParser.ExprNumOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumOp(@NotNull YallParser.ExprNumOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompEqOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompEqOp(@NotNull YallParser.ExprCompEqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompEqOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompEqOp(@NotNull YallParser.ExprCompEqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YallParser#numOp}.
	 * @param ctx the parse tree
	 */
	void enterNumOp(@NotNull YallParser.NumOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YallParser#numOp}.
	 * @param ctx the parse tree
	 */
	void exitNumOp(@NotNull YallParser.NumOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolOp(@NotNull YallParser.ExprBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolOp(@NotNull YallParser.ExprBoolOpContext ctx);
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
	 * Enter a parse tree produced by the {@code exprUp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUp(@NotNull YallParser.ExprUpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUp(@NotNull YallParser.ExprUpContext ctx);
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
	 * Enter a parse tree produced by the {@code exprCompOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompOp(@NotNull YallParser.ExprCompOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompOp(@NotNull YallParser.ExprCompOpContext ctx);
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
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(@NotNull YallParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(@NotNull YallParser.ExprNotContext ctx);
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
	 * Enter a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(@NotNull YallParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(@NotNull YallParser.ExprNumContext ctx);
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
	 * Enter a parse tree produced by the {@code statOutput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatOutput(@NotNull YallParser.StatOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statOutput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatOutput(@NotNull YallParser.StatOutputContext ctx);
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
	 * Enter a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(@NotNull YallParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(@NotNull YallParser.ExprBoolContext ctx);
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
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(@NotNull YallParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(@NotNull YallParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statInput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatInput(@NotNull YallParser.StatInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statInput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatInput(@NotNull YallParser.StatInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBlock}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBlock(@NotNull YallParser.ExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBlock}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBlock(@NotNull YallParser.ExprBlockContext ctx);
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
}