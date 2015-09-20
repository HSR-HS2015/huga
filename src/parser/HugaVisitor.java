// Generated from .\Huga.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HugaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HugaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code forward_additive_expression}
	 * labeled alternative in {@link HugaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_additive_expression(HugaParser.Forward_additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward_multiplicative_expression}
	 * labeled alternative in {@link HugaParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_multiplicative_expression(HugaParser.Forward_multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link HugaParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(HugaParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link HugaParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(HugaParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link HugaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(HugaParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward_unary_expression}
	 * labeled alternative in {@link HugaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_unary_expression(HugaParser.Forward_unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link HugaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(HugaParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward_primary_expression}
	 * labeled alternative in {@link HugaParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_primary_expression(HugaParser.Forward_primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negotiate}
	 * labeled alternative in {@link HugaParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegotiate(HugaParser.NegotiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward_number}
	 * labeled alternative in {@link HugaParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_number(HugaParser.Forward_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link HugaParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(HugaParser.ParenthesisContext ctx);
}