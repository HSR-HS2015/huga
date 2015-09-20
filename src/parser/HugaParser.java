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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7;
	public static final int
		RULE_expression = 0, RULE_additive_expression = 1, RULE_multiplicative_expression = 2, 
		RULE_unary_expression = 3, RULE_primary_expression = 4;
	public static final String[] ruleNames = {
		"expression", "additive_expression", "multiplicative_expression", "unary_expression", 
		"primary_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NUMBER"
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
		enterRule(_localctx, 0, RULE_expression);
		try {
			_localctx = new Forward_additive_expressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Forward_multiplicative_expressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(13);
			((Forward_multiplicative_expressionContext)_localctx).forward = multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(21);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new Additive_expressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(15);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(16);
						match(T__0);
						setState(17);
						((AdditionContext)_localctx).right = multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new Additive_expressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(18);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(19);
						match(T__1);
						setState(20);
						((SubtractionContext)_localctx).right = multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Forward_unary_expressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(27);
			((Forward_unary_expressionContext)_localctx).forward = unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new Multiplicative_expressionContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(29);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(30);
						match(T__2);
						setState(31);
						((MultiplicationContext)_localctx).right = unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new Multiplicative_expressionContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(32);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(33);
						match(T__3);
						setState(34);
						((DivisionContext)_localctx).right = unary_expression();
						}
						break;
					}
					} 
				}
				setState(39);
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
		enterRule(_localctx, 6, RULE_unary_expression);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case T__4:
			case NUMBER:
				_localctx = new Forward_primary_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((Forward_primary_expressionContext)_localctx).forward = primary_expression();
				}
				break;
			case T__1:
				_localctx = new NegotiateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__1);
				setState(42);
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
	public static class ParenthesisContext extends Primary_expressionContext {
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
		enterRule(_localctx, 8, RULE_primary_expression);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new Forward_numberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((Forward_numberContext)_localctx).forward = match(NUMBER);
				}
				break;
			case T__4:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__4);
				setState(47);
				expression();
				setState(48);
				match(T__5);
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
		case 1:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 2:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"&\n\4\f\4\16\4)\13\4\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\5\6\65\n"+
		"\6\3\6\2\4\4\6\7\2\4\6\b\n\2\2\67\2\f\3\2\2\2\4\16\3\2\2\2\6\34\3\2\2"+
		"\2\b-\3\2\2\2\n\64\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\b\3\1\2\17\20"+
		"\5\6\4\2\20\31\3\2\2\2\21\22\f\4\2\2\22\23\7\3\2\2\23\30\5\6\4\2\24\25"+
		"\f\3\2\2\25\26\7\4\2\2\26\30\5\6\4\2\27\21\3\2\2\2\27\24\3\2\2\2\30\33"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34\35"+
		"\b\4\1\2\35\36\5\b\5\2\36\'\3\2\2\2\37 \f\4\2\2 !\7\5\2\2!&\5\b\5\2\""+
		"#\f\3\2\2#$\7\6\2\2$&\5\b\5\2%\37\3\2\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(\7\3\2\2\2)\'\3\2\2\2*.\5\n\6\2+,\7\4\2\2,.\5\n\6\2-*"+
		"\3\2\2\2-+\3\2\2\2.\t\3\2\2\2/\65\7\t\2\2\60\61\7\7\2\2\61\62\5\2\2\2"+
		"\62\63\7\b\2\2\63\65\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\65\13\3\2\2\2\b"+
		"\27\31%\'-\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}