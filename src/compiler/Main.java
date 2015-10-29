package compiler;

import javax.swing.SwingUtilities;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.HugaLexer;
import parser.HugaParser;
import viewer.ParseTreeViewer;

public class Main {
	
	private static String code;
	private static boolean showParseTree = true;

	public static void main(String[] args) {
		
		code = "INT b; b = 7; println(b);";
		
		ANTLRInputStream input = new ANTLRInputStream(code);
		HugaLexer lexer = new HugaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HugaParser parser = new HugaParser(tokens);
		
		ParseTree tree = parser.statement_list();
		
		if(showParseTree) {
			SwingUtilities.invokeLater(new Runnable(){

				@Override
				public void run() {
					ParseTreeViewer viewer = 
					new ParseTreeViewer(parser, tree, 1.5);
					viewer.setVisible(true);
				}
				
			});
		}
		
		System.out.println(new Visitor().visit(tree));
	}
	
	public static String compile(ANTLRInputStream input) {
		HugaLexer lexer = new HugaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HugaParser parser = new HugaParser(tokens);
		
		ParseTree tree = parser.statement_list();
		return createJasminFile(new Visitor().visit(tree));
	}
	
	
	private static String createJasminFile(String instr) {
		return 	".class public Program\n" +
				".super java/lang/Object\n" +
				".method public static main([Ljava/lang/String;)V\n" +
				".limit stack 100\n" +
				".limit locals 100\n" +
				instr + 
				"return\n" + 
				".end method\n";
	}

}
