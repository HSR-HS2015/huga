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
		return 	visit(ctx.left) + "\n" +
				visit(ctx.right) + "\n" +
				"iadd\n";
	}
	
	@Override
	public String visitSubtraction(SubtractionContext ctx) {
		return 	visit(ctx.left) + "\n" +
				visit(ctx.right) + "\n" +
				"isub\n";
	}
	
	@Override
	public String visitForward_unary_expression(Forward_unary_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitMultiplication(MultiplicationContext ctx) {
		return 	visit(ctx.left) + "\n" +
				visit(ctx.right) + "\n" +
				"imul\n";
	}
	
	@Override
	public String visitDivision(DivisionContext ctx) {
		return 	visit(ctx.left) + "\n" +
				visit(ctx.right) + "\n" +
				"idiv\n";
	}
	
	@Override
	public String visitForward_primary_expression(Forward_primary_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitNegotiate(NegotiateContext ctx) {
		return  visit(ctx.forward) + "\n" + 
				"ineg\n";
	}
	
	@Override
	public String visitForward_number(Forward_numberContext ctx) {
		return "ldc " + ctx.getText();
	}
	
	@Override
	public String visitParenthesis(ParenthesisContext ctx) {
		return visitChildren(ctx.forward);
	}
}
