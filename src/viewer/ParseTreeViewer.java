package viewer;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.HugaParser;

public class ParseTreeViewer extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private final JPanel panel;
	private final TreeViewer viewer;
	
	public ParseTreeViewer(HugaParser parser, ParseTree tree, double scale) {
		panel = new JPanel();
		viewer = new TreeViewer(
				Arrays.asList(parser.getRuleNames()),tree);
		viewer.setScale(scale);
		panel.add(viewer);
		this.add(panel);
		this.setTitle("ParseTreeViewer");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(512, 256);
	}

}
