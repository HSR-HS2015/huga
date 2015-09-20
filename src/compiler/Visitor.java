package compiler;

import parser.HugaBaseVisitor;
import parser.HugaParser.AdditionContext;
import parser.HugaParser.DivisionContext;
import parser.HugaParser.Forward_additive_expressionContext;
import parser.HugaParser.Forward_multiplicative_expressionContext;
import parser.HugaParser.Forward_numberContext;
import parser.HugaParser.Forward_primary_expressionContext;
import parser.HugaParser.Forward_unary_expressionContext;
import parser.HugaParser.MultiplicationContext;
import parser.HugaParser.NegotiateContext;
import parser.HugaParser.ParenthesisContext;
import parser.HugaParser.SubtractionContext;

public class Visitor extends HugaBaseVisitor<String> {
	
	@Override
	public String visitForward_additive_expression(Forward_additive_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitForward_multiplicative_expression(Forward_multiplicative_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitAddition(AdditionContext ctx) {
		visit(ctx.left);
		System.out.println("MOVE D0, -(SP)");
		visit(ctx.right);
		System.out.println("ADD (SP)+, D0");
		return null;
	}
	
	@Override
	public String visitSubtraction(SubtractionContext ctx) {
		visit(ctx.left);
		System.out.println("MOVE D0, -(SP)");
		visit(ctx.right);
		System.out.println("SUB (SP)+, D0");
		System.out.println("NEG D0");
		return null;
	}
	
	@Override
	public String visitForward_unary_expression(Forward_unary_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitMultiplication(MultiplicationContext ctx) {
		visit(ctx.left);
		System.out.println("MOVE D0, -(SP)");
		visit(ctx.right);
		System.out.println("MULS (SP)+, D0");
		return null;
	}
	
	@Override
	public String visitDivision(DivisionContext ctx) {
		visit(ctx.left);
		System.out.println("MOVE D0, -(SP)");
		visit(ctx.right);
		System.out.println("DIVS (SP)+, D0");
		return null;
	}
	
	@Override
	public String visitForward_primary_expression(Forward_primary_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitNegotiate(NegotiateContext ctx) {
		visit(ctx.forward);
		System.out.println("NEG D0");
		return null;
	}
	
	@Override
	public String visitForward_number(Forward_numberContext ctx) {
		System.out.println("MOVE #" + ctx.getText() + ", D0");
		return null;
	}
	
	@Override
	public String visitParenthesis(ParenthesisContext ctx) {
		return visitChildren(ctx);
	}
}
