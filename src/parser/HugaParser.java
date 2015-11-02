// Generated from .\Huga.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HugaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, IDENTIFIER=12, WHITESPACE=13;
	public static final int
		RULE_statement_list = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_println = 4, RULE_expression = 5, RULE_additive_expression = 6, RULE_multiplicative_expression = 7, 
		RULE_unary_expression = 8, RULE_primary_expression = 9;
	public static final String[] ruleNames = {
		"statement_list", "statement", "declaration", "assignment", "println", 
		"expression", "additive_expression", "multiplicative_expression", "unary_expression", 
		"primary_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'VAR INT'", "'='", "'println('", "')'", "'+'", "'-'", "'*'", 
		"'/'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
		"IDENTIFIER", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Huga.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HugaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Statement_listContext extends ParserRuleContext {
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	 
		public Statement_listContext() { }
		public void copyFrom(Statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement_list_loopContext extends Statement_listContext {
		public Statement_listContext left;
		public StatementContext right;
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_list_loopContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitStatement_list_loop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_statementContext extends Statement_listContext {
		public StatementContext forward;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Forward_statementContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Forward_statementContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(21);
			((Forward_statementContext)_localctx).forward = statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_list_loopContext(new Statement_listContext(_parentctx, _parentState));
					((Statement_list_loopContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(23);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(24);
					((Statement_list_loopContext)_localctx).right = statement();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Forward_declarationContext extends StatementContext {
		public DeclarationContext forward;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Forward_declarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_expressionContext extends StatementContext {
		public ExpressionContext forward;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Forward_expressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_assignmentContext extends StatementContext {
		public AssignmentContext forward;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Forward_assignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_printlnContext extends StatementContext {
		public PrintlnContext forward;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Forward_printlnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_println(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Empty_statementContext extends StatementContext {
		public Empty_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitEmpty_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Empty_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Forward_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((Forward_expressionContext)_localctx).forward = expression();
				setState(32);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new Forward_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				((Forward_declarationContext)_localctx).forward = declaration();
				setState(35);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new Forward_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				((Forward_assignmentContext)_localctx).forward = assignment();
				setState(38);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new Forward_printlnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				((Forward_printlnContext)_localctx).forward = println();
				setState(41);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_statementContext extends DeclarationContext {
		public Token identifier;
		public TerminalNode IDENTIFIER() { return getToken(HugaParser.IDENTIFIER, 0); }
		public Declaration_statementContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitDeclaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			_localctx = new Declaration_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			((Declaration_statementContext)_localctx).identifier = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assignment_statementContext extends AssignmentContext {
		public Token identifier;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(HugaParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			_localctx = new Assignment_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((Assignment_statementContext)_localctx).identifier = match(IDENTIFIER);
			setState(49);
			match(T__2);
			setState(50);
			((Assignment_statementContext)_localctx).expr = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Println_statementContext extends PrintlnContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Println_statementContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitPrintln_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			_localctx = new Println_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
			((Println_statementContext)_localctx).expr = expression();
			setState(54);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Forward_additive_expressionContext extends ExpressionContext {
		public Additive_expressionContext forward;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Forward_additive_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_additive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			_localctx = new Forward_additive_expressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((Forward_additive_expressionContext)_localctx).forward = additive_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	 
		public Additive_expressionContext() { }
		public void copyFrom(Additive_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Forward_multiplicative_expressionContext extends Additive_expressionContext {
		public Multiplicative_expressionContext forward;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Forward_multiplicative_expressionContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_multiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends Additive_expressionContext {
		public Additive_expressionContext left;
		public Multiplicative_expressionContext right;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public SubtractionContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends Additive_expressionContext {
		public Additive_expressionContext left;
		public Multiplicative_expressionContext right;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public AdditionContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		return additive_expression(0);
	}

	private Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Forward_multiplicative_expressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(59);
			((Forward_multiplicative_expressionContext)_localctx).forward = multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new Additive_expressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(T__5);
						setState(63);
						((AdditionContext)_localctx).right = multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new Additive_expressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(64);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(65);
						match(T__6);
						setState(66);
						((SubtractionContext)_localctx).right = multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	 
		public Multiplicative_expressionContext() { }
		public void copyFrom(Multiplicative_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisionContext extends Multiplicative_expressionContext {
		public Multiplicative_expressionContext left;
		public Unary_expressionContext right;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public DivisionContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_unary_expressionContext extends Multiplicative_expressionContext {
		public Unary_expressionContext forward;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Forward_unary_expressionContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_unary_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends Multiplicative_expressionContext {
		public Multiplicative_expressionContext left;
		public Unary_expressionContext right;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public MultiplicationContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Forward_unary_expressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(73);
			((Forward_unary_expressionContext)_localctx).forward = unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new Multiplicative_expressionContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(75);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(76);
						match(T__7);
						setState(77);
						((MultiplicationContext)_localctx).right = unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new Multiplicative_expressionContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(78);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(79);
						match(T__8);
						setState(80);
						((DivisionContext)_localctx).right = unary_expression();
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegotiateContext extends Unary_expressionContext {
		public Primary_expressionContext forward;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public NegotiateContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitNegotiate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_primary_expressionContext extends Unary_expressionContext {
		public Primary_expressionContext forward;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Forward_primary_expressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_primary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary_expression);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case T__9:
			case NUMBER:
			case IDENTIFIER:
				_localctx = new Forward_primary_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((Forward_primary_expressionContext)_localctx).forward = primary_expression();
				}
				break;
			case T__6:
				_localctx = new NegotiateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__6);
				setState(88);
				((NegotiateContext)_localctx).forward = primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Forward_numberContext extends Primary_expressionContext {
		public Token forward;
		public TerminalNode NUMBER() { return getToken(HugaParser.NUMBER, 0); }
		public Forward_numberContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitForward_number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends Primary_expressionContext {
		public Token identifier;
		public TerminalNode IDENTIFIER() { return getToken(HugaParser.IDENTIFIER, 0); }
		public VariableContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends Primary_expressionContext {
		public ExpressionContext forward;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HugaVisitor ) return ((HugaVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primary_expression);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new Forward_numberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				((Forward_numberContext)_localctx).forward = match(NUMBER);
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((VariableContext)_localctx).identifier = match(IDENTIFIER);
				}
				break;
			case T__9:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__9);
				setState(94);
				((ParenthesisContext)_localctx).forward = expression();
				setState(95);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 6:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 7:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bF\n\b\f\b"+
		"\16\bI\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tT\n\t\f\t\16\tW\13"+
		"\t\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13d\n\13\3\13"+
		"\2\5\2\16\20\f\2\4\6\b\n\f\16\20\22\24\2\2g\2\26\3\2\2\2\4-\3\2\2\2\6"+
		"/\3\2\2\2\b\62\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16<\3\2\2\2\20J\3\2\2\2"+
		"\22[\3\2\2\2\24c\3\2\2\2\26\27\b\2\1\2\27\30\5\4\3\2\30\35\3\2\2\2\31"+
		"\32\f\3\2\2\32\34\5\4\3\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35"+
		"\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 .\7\3\2\2!\"\5\f\7\2\"#\7\3\2\2"+
		"#.\3\2\2\2$%\5\6\4\2%&\7\3\2\2&.\3\2\2\2\'(\5\b\5\2()\7\3\2\2).\3\2\2"+
		"\2*+\5\n\6\2+,\7\3\2\2,.\3\2\2\2- \3\2\2\2-!\3\2\2\2-$\3\2\2\2-\'\3\2"+
		"\2\2-*\3\2\2\2.\5\3\2\2\2/\60\7\4\2\2\60\61\7\16\2\2\61\7\3\2\2\2\62\63"+
		"\7\16\2\2\63\64\7\5\2\2\64\65\5\f\7\2\65\t\3\2\2\2\66\67\7\6\2\2\678\5"+
		"\f\7\289\7\7\2\29\13\3\2\2\2:;\5\16\b\2;\r\3\2\2\2<=\b\b\1\2=>\5\20\t"+
		"\2>G\3\2\2\2?@\f\4\2\2@A\7\b\2\2AF\5\20\t\2BC\f\3\2\2CD\7\t\2\2DF\5\20"+
		"\t\2E?\3\2\2\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\17\3\2\2\2IG\3"+
		"\2\2\2JK\b\t\1\2KL\5\22\n\2LU\3\2\2\2MN\f\4\2\2NO\7\n\2\2OT\5\22\n\2P"+
		"Q\f\3\2\2QR\7\13\2\2RT\5\22\n\2SM\3\2\2\2SP\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2X\\\5\24\13\2YZ\7\t\2\2Z\\\5\24\13\2"+
		"[X\3\2\2\2[Y\3\2\2\2\\\23\3\2\2\2]d\7\r\2\2^d\7\16\2\2_`\7\f\2\2`a\5\f"+
		"\7\2ab\7\7\2\2bd\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2d\25\3\2\2\2\n\35"+
		"-EGSU[c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}