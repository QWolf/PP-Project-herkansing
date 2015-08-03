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
	 * Visit a parse tree produced by the {@code exprNumOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumOp(@NotNull YallParser.ExprNumOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#numOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumOp(@NotNull YallParser.NumOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolOp(@NotNull YallParser.ExprBoolOpContext ctx);
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
	 * Visit a parse tree produced by the {@code lineStatement}
	 * labeled alternative in {@link YallParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStatement(@NotNull YallParser.LineStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatWhile(@NotNull YallParser.StatWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(@NotNull YallParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#funcreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncreturn(@NotNull YallParser.FuncreturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statDeclare}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatDeclare(@NotNull YallParser.StatDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull YallParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statJoin}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatJoin(@NotNull YallParser.StatJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statLock}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLock(@NotNull YallParser.StatLockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUp(@NotNull YallParser.ExprUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull YallParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineFunction}
	 * labeled alternative in {@link YallParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineFunction(@NotNull YallParser.LineFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatIf(@NotNull YallParser.StatIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompOp}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompOp(@NotNull YallParser.ExprCompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(@NotNull YallParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link YallParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(@NotNull YallParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(@NotNull YallParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declDeclAssign}
	 * labeled alternative in {@link YallParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclDeclAssign(@NotNull YallParser.DeclDeclAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(@NotNull YallParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statOutput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOutput(@NotNull YallParser.StatOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link YallParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(@NotNull YallParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFork}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFork(@NotNull YallParser.StatForkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link YallParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(@NotNull YallParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(@NotNull YallParser.ExprBoolContext ctx);
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
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(@NotNull YallParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statInput}
	 * labeled alternative in {@link YallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatInput(@NotNull YallParser.StatInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBlock}
	 * labeled alternative in {@link YallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBlock(@NotNull YallParser.ExprBlockContext ctx);
}