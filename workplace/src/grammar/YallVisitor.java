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
	 * Visit a parse tree produced by the {@code multExprIntExpr}
	 * labeled alternative in {@link YallParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprIntExpr(@NotNull YallParser.MultExprIntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprBool}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprBool(@NotNull YallParser.BoolExprBoolContext ctx);
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
	 * Visit a parse tree produced by the {@code idExprID}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExprID(@NotNull YallParser.IdExprIDContext ctx);
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
	 * Visit a parse tree produced by the {@code boolExprCompEqOpAdd}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprCompEqOpAdd(@NotNull YallParser.BoolExprCompEqOpAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatIf(@NotNull YallParser.StatIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExprSub}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExprSub(@NotNull YallParser.IntExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExprNum}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExprNum(@NotNull YallParser.IntExprNumContext ctx);
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
	 * Visit a parse tree produced by the {@code idExprBlock}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExprBlock(@NotNull YallParser.IdExprBlockContext ctx);
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
	 * Visit a parse tree produced by the {@code statOutputBool}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExprUp}
	 * labeled alternative in {@link YallParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExprUp(@NotNull YallParser.IdExprUpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(@NotNull YallParser.TypeIntContext ctx);
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
	 * Visit a parse tree produced by the {@code intExprIDExpr}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExprIDExpr(@NotNull YallParser.IntExprIDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprIDExpr}
	 * labeled alternative in {@link YallParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprIDExpr(@NotNull YallParser.BoolExprIDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link YallParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprMultExpr(@NotNull YallParser.AddExprMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toplvlJoin}
	 * labeled alternative in {@link YallParser#toplevelblockPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExprAdd}
	 * labeled alternative in {@link YallParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExprAdd(@NotNull YallParser.IntExprAddContext ctx);
}