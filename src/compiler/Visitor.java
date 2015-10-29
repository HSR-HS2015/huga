package compiler;

import java.util.HashMap;
import java.util.Map;

import parser.HugaBaseVisitor;
import parser.HugaParser.AdditionContext;
import parser.HugaParser.Assignment_statementContext;
import parser.HugaParser.Declaration_statementContext;
import parser.HugaParser.DivisionContext;
import parser.HugaParser.Empty_statementContext;
import parser.HugaParser.Forward_additive_expressionContext;
import parser.HugaParser.Forward_assignmentContext;
import parser.HugaParser.Forward_declarationContext;
import parser.HugaParser.Forward_expressionContext;
import parser.HugaParser.Forward_multiplicative_expressionContext;
import parser.HugaParser.Forward_numberContext;
import parser.HugaParser.Forward_primary_expressionContext;
import parser.HugaParser.Forward_printlnContext;
import parser.HugaParser.Forward_statementContext;
import parser.HugaParser.Forward_unary_expressionContext;
import parser.HugaParser.MultiplicationContext;
import parser.HugaParser.NegotiateContext;
import parser.HugaParser.ParenthesisContext;
import parser.HugaParser.Println_statementContext;
import parser.HugaParser.Statement_list_loopContext;
import parser.HugaParser.SubtractionContext;
import parser.HugaParser.VariableContext;

public class Visitor extends HugaBaseVisitor<String> {
	
	private Map<String, Integer> variables = new HashMap<>();
	
	@Override
	public String visitEmpty_statement(Empty_statementContext ctx) {
		return "";
	}
	
	@Override
	public String visitForward_statement(Forward_statementContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitStatement_list_loop(Statement_list_loopContext ctx) {
		return visit(ctx.left) + visit(ctx.right);
	}
	
	@Override
	public String visitForward_expression(Forward_expressionContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitForward_declaration(Forward_declarationContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitForward_assignment(Forward_assignmentContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitForward_println(Forward_printlnContext ctx) {
		return visit(ctx.forward);
	}
	
	@Override
	public String visitDeclaration_statement(Declaration_statementContext ctx) {
		variables.put(ctx.identifier.getText(), variables.size());
		return "";
	}
	
	@Override
	public String visitAssignment_statement(Assignment_statementContext ctx) {
		return visit(ctx.expr) + "\n" +
				"istore " + variables.get(ctx.identifier.getText()) + "\n";
	}
	
	@Override
	public String visitPrintln_statement(Println_statementContext ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;\n" + 
				visit(ctx.expr) + 
				"invokevirtual java/io/PrintStream/println(I)V\n";
	}
	
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
	public String visitVariable(VariableContext ctx) {
		return "iload " + variables.get(ctx.identifier.getText()) + "\n";
	}
	
	@Override
	public String visitParenthesis(ParenthesisContext ctx) {
		return visitChildren(ctx.forward);
	}
}
