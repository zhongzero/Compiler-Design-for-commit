// Generated from E:/Compiler-Design/src/FrontEnd/Parser\Mx.g4 by ANTLR 4.10.1
package FrontEnd.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, VOID=34, BOOL=35, INT=36, STRING=37, NEW=38, CLASS=39, 
		NULL=40, THIS=41, IF=42, ELSE=43, FOR=44, WHILE=45, BREAK=46, CONTINUE=47, 
		RETURN=48, INT_CONSTANT=49, STRING_CONSTANT=50, BOOL_CONSTANT=51, IDENTIFIER=52, 
		WS=53, LINE_COMMENT=54, BLOCK_COMMENT=55;
	public static final int
		RULE_program = 0, RULE_defAllType = 1, RULE_functionDefinitionStatement = 2, 
		RULE_classDefinitionStatement = 3, RULE_classConstructorStatement = 4, 
		RULE_variableDefinitionStatement = 5, RULE_variableDefinitionList = 6, 
		RULE_variableDefinitionSingle = 7, RULE_statement = 8, RULE_block = 9, 
		RULE_expression = 10, RULE_expressionList = 11, RULE_parameterdataList = 12, 
		RULE_parameterList = 13, RULE_constant = 14, RULE_newformat = 15, RULE_nonarraytype = 16, 
		RULE_type = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defAllType", "functionDefinitionStatement", "classDefinitionStatement", 
			"classConstructorStatement", "variableDefinitionStatement", "variableDefinitionList", 
			"variableDefinitionSingle", "statement", "block", "expression", "expressionList", 
			"parameterdataList", "parameterList", "constant", "newformat", "nonarraytype", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "','", "'='", "'.'", "'['", 
			"']'", "'++'", "'--'", "'!'", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'>>'", "'<<'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&'", 
			"'|'", "'^'", "'&&'", "'||'", "'->'", "'void'", "'bool'", "'int'", "'string'", 
			"'new'", "'class'", "'null'", "'this'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "VOID", "BOOL", 
			"INT", "STRING", "NEW", "CLASS", "NULL", "THIS", "IF", "ELSE", "FOR", 
			"WHILE", "BREAK", "CONTINUE", "RETURN", "INT_CONSTANT", "STRING_CONSTANT", 
			"BOOL_CONSTANT", "IDENTIFIER", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DefAllTypeContext> defAllType() {
			return getRuleContexts(DefAllTypeContext.class);
		}
		public DefAllTypeContext defAllType(int i) {
			return getRuleContext(DefAllTypeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << CLASS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(36);
				defAllType();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DefAllTypeContext extends ParserRuleContext {
		public FunctionDefinitionStatementContext functionDefinitionStatement() {
			return getRuleContext(FunctionDefinitionStatementContext.class,0);
		}
		public ClassDefinitionStatementContext classDefinitionStatement() {
			return getRuleContext(ClassDefinitionStatementContext.class,0);
		}
		public VariableDefinitionStatementContext variableDefinitionStatement() {
			return getRuleContext(VariableDefinitionStatementContext.class,0);
		}
		public DefAllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defAllType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterDefAllType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitDefAllType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitDefAllType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefAllTypeContext defAllType() throws RecognitionException {
		DefAllTypeContext _localctx = new DefAllTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defAllType);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				functionDefinitionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				classDefinitionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				variableDefinitionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
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

	public static class FunctionDefinitionStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MxParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionStatementContext functionDefinitionStatement() throws RecognitionException {
		FunctionDefinitionStatementContext _localctx = new FunctionDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(48);
				match(VOID);
				}
				break;
			case BOOL:
			case INT:
			case STRING:
			case IDENTIFIER:
				{
				setState(49);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(54);
				parameterList();
				}
			}

			setState(57);
			match(T__2);
			setState(58);
			block();
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

	public static class ClassDefinitionStatementContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public List<FunctionDefinitionStatementContext> functionDefinitionStatement() {
			return getRuleContexts(FunctionDefinitionStatementContext.class);
		}
		public FunctionDefinitionStatementContext functionDefinitionStatement(int i) {
			return getRuleContext(FunctionDefinitionStatementContext.class,i);
		}
		public List<VariableDefinitionStatementContext> variableDefinitionStatement() {
			return getRuleContexts(VariableDefinitionStatementContext.class);
		}
		public VariableDefinitionStatementContext variableDefinitionStatement(int i) {
			return getRuleContext(VariableDefinitionStatementContext.class,i);
		}
		public List<ClassConstructorStatementContext> classConstructorStatement() {
			return getRuleContexts(ClassConstructorStatementContext.class);
		}
		public ClassConstructorStatementContext classConstructorStatement(int i) {
			return getRuleContext(ClassConstructorStatementContext.class,i);
		}
		public ClassDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionStatementContext classDefinitionStatement() throws RecognitionException {
		ClassDefinitionStatementContext _localctx = new ClassDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDefinitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CLASS);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(T__3);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(63);
					functionDefinitionStatement();
					}
					break;
				case 2:
					{
					setState(64);
					variableDefinitionStatement();
					}
					break;
				case 3:
					{
					setState(65);
					classConstructorStatement();
					}
					break;
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__4);
			setState(72);
			match(T__0);
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

	public static class ClassConstructorStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ClassConstructorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassConstructorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassConstructorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassConstructorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorStatementContext classConstructorStatement() throws RecognitionException {
		ClassConstructorStatementContext _localctx = new ClassConstructorStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classConstructorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(T__1);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(76);
				parameterList();
				}
			}

			setState(79);
			match(T__2);
			setState(80);
			block();
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

	public static class VariableDefinitionStatementContext extends ParserRuleContext {
		public VariableDefinitionListContext variableDefinitionList() {
			return getRuleContext(VariableDefinitionListContext.class,0);
		}
		public VariableDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVariableDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVariableDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVariableDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionStatementContext variableDefinitionStatement() throws RecognitionException {
		VariableDefinitionStatementContext _localctx = new VariableDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefinitionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			variableDefinitionList();
			setState(83);
			match(T__0);
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

	public static class VariableDefinitionListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDefinitionSingleContext> variableDefinitionSingle() {
			return getRuleContexts(VariableDefinitionSingleContext.class);
		}
		public VariableDefinitionSingleContext variableDefinitionSingle(int i) {
			return getRuleContext(VariableDefinitionSingleContext.class,i);
		}
		public VariableDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVariableDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVariableDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVariableDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionListContext variableDefinitionList() throws RecognitionException {
		VariableDefinitionListContext _localctx = new VariableDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type(0);
			setState(86);
			variableDefinitionSingle();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(87);
				match(T__5);
				setState(88);
				variableDefinitionSingle();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class VariableDefinitionSingleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefinitionSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVariableDefinitionSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVariableDefinitionSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVariableDefinitionSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionSingleContext variableDefinitionSingle() throws RecognitionException {
		VariableDefinitionSingleContext _localctx = new VariableDefinitionSingleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDefinitionSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(95);
				match(T__6);
				setState(96);
				expression(0);
				}
			}

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
	public static class Stat_emptyContext extends StatementContext {
		public Stat_emptyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_forContext extends StatementContext {
		public VariableDefinitionListContext init1;
		public ExpressionListContext init2;
		public ExpressionContext condition;
		public ExpressionContext update;
		public StatementContext forstat;
		public TerminalNode FOR() { return getToken(MxParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDefinitionListContext variableDefinitionList() {
			return getRuleContext(VariableDefinitionListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Stat_forContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_for(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_continueContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MxParser.CONTINUE, 0); }
		public Stat_continueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_continue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_continue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_ifContext extends StatementContext {
		public ExpressionContext condition;
		public StatementContext ifstat;
		public StatementContext elsestat;
		public TerminalNode IF() { return getToken(MxParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MxParser.ELSE, 0); }
		public Stat_ifContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_returnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MxParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stat_returnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_return(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_whileContext extends StatementContext {
		public ExpressionContext condition;
		public StatementContext whilestat;
		public TerminalNode WHILE() { return getToken(MxParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Stat_whileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_while(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_vardefContext extends StatementContext {
		public VariableDefinitionStatementContext variableDefinitionStatement() {
			return getRuleContext(VariableDefinitionStatementContext.class,0);
		}
		public Stat_vardefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_vardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_vardef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_blockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Stat_blockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_expressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stat_expressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_breakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MxParser.BREAK, 0); }
		public Stat_breakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat_break(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Stat_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				expression(0);
				setState(100);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Stat_emptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new Stat_vardefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				variableDefinitionStatement();
				}
				break;
			case 4:
				_localctx = new Stat_ifContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(IF);
				setState(105);
				match(T__1);
				setState(106);
				((Stat_ifContext)_localctx).condition = expression(0);
				setState(107);
				match(T__2);
				setState(108);
				((Stat_ifContext)_localctx).ifstat = statement();
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(109);
					match(ELSE);
					setState(110);
					((Stat_ifContext)_localctx).elsestat = statement();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Stat_forContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(FOR);
				setState(114);
				match(T__1);
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(115);
					((Stat_forContext)_localctx).init1 = variableDefinitionList();
					}
					break;
				case 2:
					{
					setState(116);
					((Stat_forContext)_localctx).init2 = expressionList();
					}
					break;
				}
				setState(119);
				match(T__0);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NEW) | (1L << NULL) | (1L << THIS) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(120);
					((Stat_forContext)_localctx).condition = expression(0);
					}
				}

				setState(123);
				match(T__0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NEW) | (1L << NULL) | (1L << THIS) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(124);
					((Stat_forContext)_localctx).update = expression(0);
					}
				}

				setState(127);
				match(T__2);
				setState(128);
				((Stat_forContext)_localctx).forstat = statement();
				}
				break;
			case 6:
				_localctx = new Stat_whileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(WHILE);
				setState(130);
				match(T__1);
				setState(131);
				((Stat_whileContext)_localctx).condition = expression(0);
				setState(132);
				match(T__2);
				setState(133);
				((Stat_whileContext)_localctx).whilestat = statement();
				}
				break;
			case 7:
				_localctx = new Stat_breakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				match(BREAK);
				setState(136);
				match(T__0);
				}
				break;
			case 8:
				_localctx = new Stat_continueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				match(CONTINUE);
				setState(138);
				match(T__0);
				}
				break;
			case 9:
				_localctx = new Stat_returnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				match(RETURN);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NEW) | (1L << NULL) | (1L << THIS) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(140);
					expression(0);
					}
				}

				setState(143);
				match(T__0);
				}
				break;
			case 10:
				_localctx = new Stat_blockContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__3);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << NEW) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(148);
				statement();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
	public static class Expr_constContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Expr_constContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_newContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public NewformatContext newformat() {
			return getRuleContext(NewformatContext.class,0);
		}
		public Expr_newContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_new(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_new(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_assignContext extends ExpressionContext {
		public ExpressionContext operand1;
		public ExpressionContext operand2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expr_assignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_functionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterdataListContext parameterdataList() {
			return getRuleContext(ParameterdataListContext.class,0);
		}
		public Expr_functionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_binaryContext extends ExpressionContext {
		public ExpressionContext operand1;
		public Token op;
		public ExpressionContext operand2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expr_binaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_binary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_arrayContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expr_arrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_lambdaContext extends ExpressionContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterdataListContext parameterdataList() {
			return getRuleContext(ParameterdataListContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public Expr_lambdaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_lambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_lambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_lambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_memberContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public Expr_memberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_member(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_singlebeforeContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_singlebeforeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_singlebefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_singlebefore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_singlebefore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_THISContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public Expr_THISContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_THIS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_THIS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_THIS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_bracketContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_bracketContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_bracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_singleafterContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_singleafterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_singleafter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_singleafter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_singleafter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_IDContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public Expr_IDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new Expr_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				match(IDENTIFIER);
				}
				break;
			case NULL:
			case INT_CONSTANT:
			case STRING_CONSTANT:
			case BOOL_CONSTANT:
				{
				_localctx = new Expr_constContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				constant();
				}
				break;
			case THIS:
				{
				_localctx = new Expr_THISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(THIS);
				}
				break;
			case NEW:
				{
				_localctx = new Expr_newContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(NEW);
				setState(161);
				newformat();
				}
				break;
			case T__1:
				{
				_localctx = new Expr_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__1);
				setState(163);
				expression(0);
				setState(164);
				match(T__2);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				{
				_localctx = new Expr_singlebeforeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((Expr_singlebeforeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
					((Expr_singlebeforeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				expression(10);
				}
				break;
			case T__8:
				{
				_localctx = new Expr_lambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(168);
					match(T__8);
					setState(169);
					match(T__27);
					setState(170);
					match(T__9);
					}
					break;
				case 2:
					{
					setState(171);
					match(T__8);
					setState(172);
					match(T__9);
					}
					break;
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(175);
					match(T__1);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
						{
						setState(176);
						parameterList();
						}
					}

					setState(179);
					match(T__2);
					}
				}

				setState(182);
				match(T__32);
				setState(183);
				block();
				setState(184);
				match(T__1);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NEW) | (1L << NULL) | (1L << THIS) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(185);
					parameterdataList();
					}
				}

				setState(188);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						((Expr_binaryContext)_localctx).operand2 = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((Expr_binaryContext)_localctx).operand2 = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(199);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						((Expr_binaryContext)_localctx).operand2 = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(202);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						((Expr_binaryContext)_localctx).operand2 = expression(7);
						}
						break;
					case 5:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						((Expr_binaryContext)_localctx).operand2 = expression(6);
						}
						break;
					case 6:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						((Expr_binaryContext)_localctx).operand2 = expression(5);
						}
						break;
					case 7:
						{
						_localctx = new Expr_binaryContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_binaryContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						((Expr_binaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((Expr_binaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						((Expr_binaryContext)_localctx).operand2 = expression(4);
						}
						break;
					case 8:
						{
						_localctx = new Expr_assignContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_assignContext)_localctx).operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						match(T__6);
						setState(215);
						((Expr_assignContext)_localctx).operand2 = expression(2);
						}
						break;
					case 9:
						{
						_localctx = new Expr_memberContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(217);
						match(T__7);
						setState(218);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new Expr_arrayContext(new ExpressionContext(_parentctx, _parentState));
						((Expr_arrayContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(220);
						match(T__8);
						setState(221);
						((Expr_arrayContext)_localctx).index = expression(0);
						setState(222);
						match(T__9);
						}
						break;
					case 11:
						{
						_localctx = new Expr_functionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(225);
						match(T__1);
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NEW) | (1L << NULL) | (1L << THIS) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(226);
							parameterdataList();
							}
						}

						setState(229);
						match(T__2);
						}
						break;
					case 12:
						{
						_localctx = new Expr_singleafterContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(231);
						((Expr_singleafterContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((Expr_singleafterContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			expression(0);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(238);
				match(T__5);
				setState(239);
				expression(0);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParameterdataListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParameterdataListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdataList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParameterdataList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParameterdataList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParameterdataList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdataListContext parameterdataList() throws RecognitionException {
		ParameterdataListContext _localctx = new ParameterdataListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterdataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expression(0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(246);
				match(T__5);
				setState(247);
				expression(0);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			type(0);
			setState(254);
			match(IDENTIFIER);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(255);
				match(T__5);
				setState(256);
				type(0);
				setState(257);
				match(IDENTIFIER);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOL_CONSTANT() { return getToken(MxParser.BOOL_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(MxParser.INT_CONSTANT, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(MxParser.STRING_CONSTANT, 0); }
		public TerminalNode NULL() { return getToken(MxParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << BOOL_CONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NewformatContext extends ParserRuleContext {
		public NewformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newformat; }
	 
		public NewformatContext() { }
		public void copyFrom(NewformatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Newformat_classContext extends NewformatContext {
		public NonarraytypeContext nonarraytype() {
			return getRuleContext(NonarraytypeContext.class,0);
		}
		public Newformat_classContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewformat_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewformat_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewformat_class(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Newformat_multiArrayContext extends NewformatContext {
		public NonarraytypeContext nonarraytype() {
			return getRuleContext(NonarraytypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Newformat_multiArrayContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewformat_multiArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewformat_multiArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewformat_multiArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Newformat_normalContext extends NewformatContext {
		public NonarraytypeContext nonarraytype() {
			return getRuleContext(NonarraytypeContext.class,0);
		}
		public Newformat_normalContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewformat_normal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewformat_normal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewformat_normal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Newformat_errorContext extends NewformatContext {
		public NonarraytypeContext nonarraytype() {
			return getRuleContext(NonarraytypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Newformat_errorContext(NewformatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewformat_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewformat_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewformat_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewformatContext newformat() throws RecognitionException {
		NewformatContext _localctx = new NewformatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_newformat);
		try {
			int _alt;
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new Newformat_errorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				nonarraytype();
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(267);
						match(T__8);
						setState(268);
						expression(0);
						setState(269);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(277); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(275);
						match(T__8);
						setState(276);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(279); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(285); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(281);
						match(T__8);
						setState(282);
						expression(0);
						setState(283);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(287); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new Newformat_multiArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				nonarraytype();
				setState(294); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(290);
						match(T__8);
						setState(291);
						expression(0);
						setState(292);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(296); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(T__8);
						setState(299);
						match(T__9);
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Newformat_classContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				nonarraytype();
				setState(306);
				match(T__1);
				setState(307);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new Newformat_normalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				nonarraytype();
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

	public static class NonarraytypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MxParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MxParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MxParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public NonarraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonarraytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNonarraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNonarraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNonarraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonarraytypeContext nonarraytype() throws RecognitionException {
		NonarraytypeContext _localctx = new NonarraytypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nonarraytype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_arrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_arrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_basicContext extends TypeContext {
		public NonarraytypeContext nonarraytype() {
			return getRuleContext(NonarraytypeContext.class,0);
		}
		public Type_basicContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_basic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_basic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Type_basicContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(315);
			nonarraytype();
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_arrayContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(317);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(318);
					match(T__8);
					setState(319);
					match(T__9);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 17:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"3\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003C\b\u0003\n\u0003\f\u0003F\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007b\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bp\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b\u0001\b\u0001\b\u0003"+
		"\bz\b\b\u0001\b\u0001\b\u0003\b~\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0003\b\u0092\b\b\u0001\t\u0001\t"+
		"\u0005\t\u0096\b\t\n\t\f\t\u0099\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\n\u0001"+
		"\n\u0003\n\u00b2\b\n\u0001\n\u0003\n\u00b5\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00bb\b\n\u0001\n\u0001\n\u0003\n\u00bf\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e4\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00e9\b\n\n\n\f\n\u00ec\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00f1\b\u000b\n\u000b\f\u000b\u00f4\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00f9\b\f\n\f\f\f\u00fc\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0104\b\r\n\r\f\r\u0107\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0004\u000f\u0110\b\u000f\u000b\u000f\f\u000f\u0111\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u0116\b\u000f\u000b\u000f\f\u000f\u0117"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u011e\b\u000f"+
		"\u000b\u000f\f\u000f\u011f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0004\u000f\u0127\b\u000f\u000b\u000f\f\u000f\u0128\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u012d\b\u000f\n\u000f\f\u000f\u0130\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0137\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0141\b\u0011\n\u0011"+
		"\f\u0011\u0144\t\u0011\u0001\u0011\u0000\u0002\u0014\"\u0012\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"\u0000\u000b\u0001\u0000\u000b\u0010\u0001\u0000\u0011\u0013\u0001"+
		"\u0000\u000f\u0010\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0019\u0001"+
		"\u0000\u001a\u001b\u0001\u0000\u001c\u001e\u0001\u0000\u001f \u0001\u0000"+
		"\u000b\f\u0002\u0000((13\u0002\u0000#%44\u0172\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0002.\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006"+
		"<\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000"+
		"\u0000\fU\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"\u0091\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014"+
		"\u00be\u0001\u0000\u0000\u0000\u0016\u00ed\u0001\u0000\u0000\u0000\u0018"+
		"\u00f5\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000\u0000\u0000\u001c"+
		"\u0108\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000 \u0138"+
		"\u0001\u0000\u0000\u0000\"\u013a\u0001\u0000\u0000\u0000$&\u0003\u0002"+
		"\u0001\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0001\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*/\u0003\u0004\u0002\u0000+/\u0003\u0006"+
		"\u0003\u0000,/\u0003\n\u0005\u0000-/\u0005\u0001\u0000\u0000.*\u0001\u0000"+
		"\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u000003\u0005\"\u0000\u0000"+
		"13\u0003\"\u0011\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u00054\u0000\u000057\u0005\u0002\u0000\u0000"+
		"68\u0003\u001a\r\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003\u0012\t\u0000"+
		";\u0005\u0001\u0000\u0000\u0000<=\u0005\'\u0000\u0000=>\u00054\u0000\u0000"+
		">D\u0005\u0004\u0000\u0000?C\u0003\u0004\u0002\u0000@C\u0003\n\u0005\u0000"+
		"AC\u0003\b\u0004\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0005\u0000\u0000HI\u0005\u0001\u0000\u0000I\u0007"+
		"\u0001\u0000\u0000\u0000JK\u00054\u0000\u0000KM\u0005\u0002\u0000\u0000"+
		"LN\u0003\u001a\r\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0003\u0012\t\u0000"+
		"Q\t\u0001\u0000\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\u0001\u0000"+
		"\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0003\"\u0011\u0000V[\u0003\u000e"+
		"\u0007\u0000WX\u0005\u0006\u0000\u0000XZ\u0003\u000e\u0007\u0000YW\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\r\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u00054\u0000\u0000_`\u0005\u0007\u0000\u0000`b\u0003\u0014"+
		"\n\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000f\u0001"+
		"\u0000\u0000\u0000cd\u0003\u0014\n\u0000de\u0005\u0001\u0000\u0000e\u0092"+
		"\u0001\u0000\u0000\u0000f\u0092\u0005\u0001\u0000\u0000g\u0092\u0003\n"+
		"\u0005\u0000hi\u0005*\u0000\u0000ij\u0005\u0002\u0000\u0000jk\u0003\u0014"+
		"\n\u0000kl\u0005\u0003\u0000\u0000lo\u0003\u0010\b\u0000mn\u0005+\u0000"+
		"\u0000np\u0003\u0010\b\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u0092\u0001\u0000\u0000\u0000qr\u0005,\u0000\u0000ru\u0005\u0002"+
		"\u0000\u0000sv\u0003\f\u0006\u0000tv\u0003\u0016\u000b\u0000us\u0001\u0000"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wy\u0005\u0001\u0000\u0000xz\u0003\u0014\n\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{}\u0005\u0001\u0000\u0000|~\u0003\u0014\n\u0000}|\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0003\u0000\u0000\u0080\u0092\u0003\u0010\b\u0000\u0081\u0082\u0005"+
		"-\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083\u0084\u0003\u0014"+
		"\n\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0003\u0010\b"+
		"\u0000\u0086\u0092\u0001\u0000\u0000\u0000\u0087\u0088\u0005.\u0000\u0000"+
		"\u0088\u0092\u0005\u0001\u0000\u0000\u0089\u008a\u0005/\u0000\u0000\u008a"+
		"\u0092\u0005\u0001\u0000\u0000\u008b\u008d\u00050\u0000\u0000\u008c\u008e"+
		"\u0003\u0014\n\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0005"+
		"\u0001\u0000\u0000\u0090\u0092\u0003\u0012\t\u0000\u0091c\u0001\u0000"+
		"\u0000\u0000\u0091f\u0001\u0000\u0000\u0000\u0091g\u0001\u0000\u0000\u0000"+
		"\u0091h\u0001\u0000\u0000\u0000\u0091q\u0001\u0000\u0000\u0000\u0091\u0081"+
		"\u0001\u0000\u0000\u0000\u0091\u0087\u0001\u0000\u0000\u0000\u0091\u0089"+
		"\u0001\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0097"+
		"\u0005\u0004\u0000\u0000\u0094\u0096\u0003\u0010\b\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0005\u0000\u0000\u009b\u0013\u0001\u0000\u0000\u0000\u009c\u009d\u0006"+
		"\n\uffff\uffff\u0000\u009d\u00bf\u00054\u0000\u0000\u009e\u00bf\u0003"+
		"\u001c\u000e\u0000\u009f\u00bf\u0005)\u0000\u0000\u00a0\u00a1\u0005&\u0000"+
		"\u0000\u00a1\u00bf\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005\u0002\u0000"+
		"\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a5\u00bf\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0000\u0000\u0000"+
		"\u00a7\u00bf\u0003\u0014\n\n\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa"+
		"\u0005\u001c\u0000\u0000\u00aa\u00ae\u0005\n\u0000\u0000\u00ab\u00ac\u0005"+
		"\t\u0000\u0000\u00ac\u00ae\u0005\n\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b4\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0005\u0002\u0000\u0000\u00b0\u00b2\u0003\u001a"+
		"\r\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u0003\u0000"+
		"\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005!\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0012\t\u0000\u00b8\u00ba\u0005\u0002\u0000\u0000\u00b9"+
		"\u00bb\u0003\u0018\f\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005\u0003\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u009c"+
		"\u0001\u0000\u0000\u0000\u00be\u009e\u0001\u0000\u0000\u0000\u00be\u009f"+
		"\u0001\u0000\u0000\u0000\u00be\u00a0\u0001\u0000\u0000\u0000\u00be\u00a2"+
		"\u0001\u0000\u0000\u0000\u00be\u00a6\u0001\u0000\u0000\u0000\u00be\u00ad"+
		"\u0001\u0000\u0000\u0000\u00bf\u00ea\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\n\t\u0000\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2\u00e9\u0003"+
		"\u0014\n\n\u00c3\u00c4\n\b\u0000\u0000\u00c4\u00c5\u0007\u0002\u0000\u0000"+
		"\u00c5\u00e9\u0003\u0014\n\t\u00c6\u00c7\n\u0007\u0000\u0000\u00c7\u00c8"+
		"\u0007\u0003\u0000\u0000\u00c8\u00e9\u0003\u0014\n\b\u00c9\u00ca\n\u0006"+
		"\u0000\u0000\u00ca\u00cb\u0007\u0004\u0000\u0000\u00cb\u00e9\u0003\u0014"+
		"\n\u0007\u00cc\u00cd\n\u0005\u0000\u0000\u00cd\u00ce\u0007\u0005\u0000"+
		"\u0000\u00ce\u00e9\u0003\u0014\n\u0006\u00cf\u00d0\n\u0004\u0000\u0000"+
		"\u00d0\u00d1\u0007\u0006\u0000\u0000\u00d1\u00e9\u0003\u0014\n\u0005\u00d2"+
		"\u00d3\n\u0003\u0000\u0000\u00d3\u00d4\u0007\u0007\u0000\u0000\u00d4\u00e9"+
		"\u0003\u0014\n\u0004\u00d5\u00d6\n\u0002\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0007\u0000\u0000\u00d7\u00e9\u0003\u0014\n\u0002\u00d8\u00d9\n\u0010"+
		"\u0000\u0000\u00d9\u00da\u0005\b\u0000\u0000\u00da\u00e9\u00054\u0000"+
		"\u0000\u00db\u00dc\n\u000f\u0000\u0000\u00dc\u00dd\u0005\t\u0000\u0000"+
		"\u00dd\u00de\u0003\u0014\n\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e0\u00e1\n\f\u0000\u0000\u00e1\u00e3"+
		"\u0005\u0002\u0000\u0000\u00e2\u00e4\u0003\u0018\f\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e9\u0005\u0003\u0000\u0000\u00e6\u00e7\n\u000b"+
		"\u0000\u0000\u00e7\u00e9\u0007\b\u0000\u0000\u00e8\u00c0\u0001\u0000\u0000"+
		"\u0000\u00e8\u00c3\u0001\u0000\u0000\u0000\u00e8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00c9\u0001\u0000\u0000\u0000\u00e8\u00cc\u0001\u0000\u0000"+
		"\u0000\u00e8\u00cf\u0001\u0000\u0000\u0000\u00e8\u00d2\u0001\u0000\u0000"+
		"\u0000\u00e8\u00d5\u0001\u0000\u0000\u0000\u00e8\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00db\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u0015\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f2\u0003\u0014\n\u0000\u00ee\u00ef\u0005\u0006\u0000\u0000"+
		"\u00ef\u00f1\u0003\u0014\n\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u0017\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00fa\u0003\u0014\n\u0000\u00f6\u00f7"+
		"\u0005\u0006\u0000\u0000\u00f7\u00f9\u0003\u0014\n\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0019\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003"+
		"\"\u0011\u0000\u00fe\u0105\u00054\u0000\u0000\u00ff\u0100\u0005\u0006"+
		"\u0000\u0000\u0100\u0101\u0003\"\u0011\u0000\u0101\u0102\u00054\u0000"+
		"\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u001b\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0007\t\u0000\u0000"+
		"\u0109\u001d\u0001\u0000\u0000\u0000\u010a\u010f\u0003 \u0010\u0000\u010b"+
		"\u010c\u0005\t\u0000\u0000\u010c\u010d\u0003\u0014\n\u0000\u010d\u010e"+
		"\u0005\n\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010b\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0115\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\t\u0000\u0000\u0114\u0116\u0005\n"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u011d\u0001\u0000\u0000\u0000\u0119\u011a\u0005\t\u0000"+
		"\u0000\u011a\u011b\u0003\u0014\n\u0000\u011b\u011c\u0005\n\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0137\u0001\u0000\u0000\u0000"+
		"\u0121\u0126\u0003 \u0010\u0000\u0122\u0123\u0005\t\u0000\u0000\u0123"+
		"\u0124\u0003\u0014\n\u0000\u0124\u0125\u0005\n\u0000\u0000\u0125\u0127"+
		"\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u012e\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\t\u0000\u0000\u012b\u012d\u0005\n\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0137\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0003"+
		" \u0010\u0000\u0132\u0133\u0005\u0002\u0000\u0000\u0133\u0134\u0005\u0003"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0137\u0003 \u0010"+
		"\u0000\u0136\u010a\u0001\u0000\u0000\u0000\u0136\u0121\u0001\u0000\u0000"+
		"\u0000\u0136\u0131\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u001f\u0001\u0000\u0000\u0000\u0138\u0139\u0007\n\u0000\u0000"+
		"\u0139!\u0001\u0000\u0000\u0000\u013a\u013b\u0006\u0011\uffff\uffff\u0000"+
		"\u013b\u013c\u0003 \u0010\u0000\u013c\u0142\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\n\u0001\u0000\u0000\u013e\u013f\u0005\t\u0000\u0000\u013f\u0141"+
		"\u0005\n\u0000\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0141\u0144\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143#\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\"\'.27BDM[aouy}\u008d\u0091\u0097\u00ad\u00b1\u00b4\u00ba"+
		"\u00be\u00e3\u00e8\u00ea\u00f2\u00fa\u0105\u0111\u0117\u011f\u0128\u012e"+
		"\u0136\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}