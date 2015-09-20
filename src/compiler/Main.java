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
		
		code = "-(3*(1+4)/5)";
		
		ANTLRInputStream input = new ANTLRInputStream(code);
		HugaLexer lexer = new HugaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HugaParser parser = new HugaParser(tokens);
		
		ParseTree tree = parser.expression();
		
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

}
