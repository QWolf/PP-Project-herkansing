// Generated from Yall.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YallParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YallVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multExprMultOp}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprMultOp(@NotNull YallParser.MultExprMultOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprBlock}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprBlock(@NotNull YallParser.BaseExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toplvlBlock}
	 * labeled alternative in {@link YallParser#toplevelblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toplvlFork}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statUnlock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatUnlock(@NotNull YallParser.StatUnlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull YallParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExprParenteses}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprParenteses(@NotNull YallParser.MultExprParentesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatWhile(@NotNull YallParser.StatWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(@NotNull YallParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(@NotNull YallParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statOutputInt}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOutputInt(@NotNull YallParser.StatOutputIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprID}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprID(@NotNull YallParser.BaseExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprAddOp}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprAddOp(@NotNull YallParser.AddExprAddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statDeclare}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatDeclare(@NotNull YallParser.StatDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprNot}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprNot(@NotNull YallParser.BoolExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprBaseExpr}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprBaseExpr(@NotNull YallParser.BoolExprBaseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolExpr}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolExpr(@NotNull YallParser.ExprBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprCompEqOpBool}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprCompEqOpBool(@NotNull YallParser.BoolExprCompEqOpBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprBoolOp}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprBoolOp(@NotNull YallParser.BoolExprBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statLock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLock(@NotNull YallParser.StatLockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatIf(@NotNull YallParser.StatIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprSub}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprSub(@NotNull YallParser.BaseExprSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(@NotNull YallParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull YallParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link YallParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull YallParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declAssign}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAssign(@NotNull YallParser.DeclAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(@NotNull YallParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprNum}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprNum(@NotNull YallParser.BaseExprNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(@NotNull YallParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolParanteses}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParanteses(@NotNull YallParser.BoolParantesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprCompOp}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprCompOp(@NotNull YallParser.BoolExprCompOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumExpr}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumExpr(@NotNull YallParser.ExprNumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toplvlStat}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplvlStat(@NotNull YallParser.ToplvlStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(@NotNull YallParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(@NotNull YallParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#compEqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompEqOp(@NotNull YallParser.CompEqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExprBaseExpr}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprBaseExpr(@NotNull YallParser.MultExprBaseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statOutputBool}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(@NotNull YallParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprUp}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprUp(@NotNull YallParser.BaseExprUpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprBool}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprBool(@NotNull YallParser.BaseExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssign(@NotNull YallParser.StatAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declDecl}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclDecl(@NotNull YallParser.DeclDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statInput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatInput(@NotNull YallParser.StatInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprMultExpr(@NotNull YallParser.AddExprMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExprAdd}
	 * labeled alternative in {@link YallParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExprAdd(@NotNull YallParser.BaseExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toplvlJoin}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx);
}