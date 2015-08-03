// Generated from Yall.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YallParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		YALL=1, IS=2, IF=3, THEN=4, ELSE=5, WHILE=6, LOCK=7, UNLOCK=8, FORK=9, 
		JOIN=10, DO=11, FUNCTION=12, NONE=13, INTO=14, UP=15, INPUT=16, OUTPUT=17, 
		INTEGER=18, BOOLEAN=19, TRUE=20, FALSE=21, LPAR=22, RPAR=23, LBRACE=24, 
		RBRACE=25, SEMI=26, LBLOCK=27, RBLOCK=28, QUOTE=29, DQUOTE=30, COMMA=31, 
		EXCL=32, AT=33, PLUS=34, MINUS=35, TIMES=36, DIVIDE=37, AND=38, OR=39, 
		GT=40, LT=41, GE=42, LE=43, EQ=44, NE=45, ID=46, NUM=47, WS=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'YALL'", "'is'", "'if'", "'then'", "'else'", "'while'", 
		"'lock'", "'unlock'", "'fork'", "'join'", "'do'", "'function'", "'none'", 
		"'into'", "'up'", "'input'", "'output'", "'integer'", "'boolean'", "'true'", 
		"'false'", "'('", "')'", "'{'", "'}'", "';'", "'['", "']'", "'''", "'\"'", 
		"','", "'!'", "'@'", "'plus'", "'minus'", "'times'", "'div'", "'and'", 
		"'or'", "'>>'", "'<<'", "'>='", "'=<'", "'=='", "'//'", "ID", "NUM", "WS"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_line = 2, RULE_function = 3, RULE_funcreturn = 4, 
		RULE_stat = 5, RULE_decl = 6, RULE_expr = 7, RULE_numOp = 8, RULE_boolOp = 9, 
		RULE_compOp = 10, RULE_type = 11, RULE_bool = 12;
	public static final String[] ruleNames = {
		"program", "block", "line", "function", "funcreturn", "stat", "decl", 
		"expr", "numOp", "boolOp", "compOp", "type", "bool"
	};

	@Override
	public String getGrammarFileName() { return "Yall.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YallParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode YALL() { return getToken(YallParser.YALL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(YALL);
			setState(27); match(ID);
			setState(28); block();
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
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << FUNCTION) | (1L << INPUT) | (1L << OUTPUT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(30); line();
				}
				}
				setState(35);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineStatementContext extends LineContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public LineStatementContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterLineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitLineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitLineStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineFunctionContext extends LineContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LineFunctionContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterLineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitLineFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitLineFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case FUNCTION:
				_localctx = new LineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36); function();
				}
				break;
			case IF:
			case WHILE:
			case LOCK:
			case UNLOCK:
			case FORK:
			case JOIN:
			case INPUT:
			case OUTPUT:
			case INTEGER:
			case BOOLEAN:
			case ID:
				_localctx = new LineStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37); stat();
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

	public static class FunctionContext extends ParserRuleContext {
		public FuncreturnContext funcreturn() {
			return getRuleContext(FuncreturnContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(YallParser.LBRACE, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(YallParser.ID, i);
		}
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(YallParser.COMMA, i);
		}
		public TerminalNode INTO() { return getToken(YallParser.INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(YallParser.ID); }
		public TerminalNode FUNCTION() { return getToken(YallParser.FUNCTION, 0); }
		public TerminalNode RBRACE() { return getToken(YallParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(YallParser.COMMA); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(FUNCTION);
			setState(41); match(ID);
			setState(42); match(INTO);
			setState(43); funcreturn();
			setState(44); match(LBLOCK);
			setState(57);
			_la = _input.LA(1);
			if (_la==INTEGER || _la==BOOLEAN) {
				{
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(45); type();
						setState(46); match(ID);
						setState(47); match(COMMA);
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(54); type();
				setState(55); match(ID);
				}
			}

			setState(59); match(RBLOCK);
			setState(60); match(LBRACE);
			setState(61); block();
			setState(62); match(RBRACE);
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

	public static class FuncreturnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode NONE() { return getToken(YallParser.NONE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterFuncreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitFuncreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitFuncreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncreturnContext funcreturn() throws RecognitionException {
		FuncreturnContext _localctx = new FuncreturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcreturn);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); type();
				setState(65); match(ID);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(NONE);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatWhileContext extends StatContext {
		public TerminalNode RBRACE() { return getToken(YallParser.RBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(YallParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(YallParser.LBRACE, 0); }
		public TerminalNode WHILE() { return getToken(YallParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public StatWhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatForkContext extends StatContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode FORK() { return getToken(YallParser.FORK, 0); }
		public StatForkContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatFork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatFork(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatFork(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatFunctionContext extends StatContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YallParser.COMMA); }
		public TerminalNode LPAR() { return getToken(YallParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YallParser.RPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(YallParser.COMMA, i);
		}
		public StatFunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatDeclareContext extends StatContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StatDeclareContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatJoinContext extends StatContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode JOIN() { return getToken(YallParser.JOIN, 0); }
		public StatJoinContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatAssignContext extends StatContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode IS() { return getToken(YallParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public StatAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatLockContext extends StatContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode LOCK() { return getToken(YallParser.LOCK, 0); }
		public StatLockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatLock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatLock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatLock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatUnlockContext extends StatContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode UNLOCK() { return getToken(YallParser.UNLOCK, 0); }
		public StatUnlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatUnlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatUnlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatUnlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatInputContext extends StatContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode INPUT() { return getToken(YallParser.INPUT, 0); }
		public StatInputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatIfContext extends StatContext {
		public TerminalNode RBRACE(int i) {
			return getToken(YallParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(YallParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(YallParser.IF, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(YallParser.RBRACE); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(YallParser.LBRACE); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode THEN() { return getToken(YallParser.THEN, 0); }
		public TerminalNode LBRACE(int i) {
			return getToken(YallParser.LBRACE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public StatIfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatOutputContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode OUTPUT() { return getToken(YallParser.OUTPUT, 0); }
		public StatOutputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StatDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); decl();
				}
				break;
			case 2:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71); match(ID);
				setState(72); match(IS);
				setState(73); expr(0);
				setState(74); match(SEMI);
				}
				break;
			case 3:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76); match(IF);
				setState(77); match(LBLOCK);
				setState(78); expr(0);
				setState(79); match(RBLOCK);
				setState(80); match(THEN);
				setState(81); match(LBRACE);
				setState(82); block();
				setState(83); match(RBRACE);
				setState(89);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(84); match(ELSE);
					setState(85); match(LBRACE);
					setState(86); block();
					setState(87); match(RBRACE);
					}
				}

				}
				break;
			case 4:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91); match(WHILE);
				setState(92); match(LBLOCK);
				setState(93); expr(0);
				setState(94); match(RBLOCK);
				setState(95); match(DO);
				setState(96); match(LBRACE);
				setState(97); block();
				setState(98); match(RBRACE);
				}
				break;
			case 5:
				_localctx = new StatInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100); match(INPUT);
				setState(101); match(ID);
				setState(102); match(SEMI);
				}
				break;
			case 6:
				_localctx = new StatOutputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103); match(OUTPUT);
				setState(104); expr(0);
				setState(105); match(SEMI);
				}
				break;
			case 7:
				_localctx = new StatLockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(107); match(LOCK);
				setState(108); match(NUM);
				setState(109); match(SEMI);
				}
				break;
			case 8:
				_localctx = new StatUnlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(110); match(UNLOCK);
				setState(111); match(NUM);
				setState(112); match(SEMI);
				}
				break;
			case 9:
				_localctx = new StatForkContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(113); match(FORK);
				setState(114); match(NUM);
				setState(115); match(SEMI);
				}
				break;
			case 10:
				_localctx = new StatJoinContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(116); match(JOIN);
				setState(117); match(NUM);
				setState(118); match(SEMI);
				}
				break;
			case 11:
				_localctx = new StatFunctionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(119); match(ID);
				setState(120); match(LPAR);
				setState(130);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << TRUE) | (1L << FALSE) | (1L << LBLOCK) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(121); expr(0);
							setState(122); match(COMMA);
							}
							} 
						}
						setState(128);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					setState(129); expr(0);
					}
				}

				setState(132); match(RPAR);
				setState(133); match(SEMI);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclDeclContext extends DeclContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterDeclDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitDeclDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitDeclDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclDeclAssignContext extends DeclContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode IS() { return getToken(YallParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclDeclAssignContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterDeclDeclAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitDeclDeclAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitDeclDeclAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DeclDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136); type();
				setState(137); match(ID);
				setState(138); match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclDeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140); type();
				setState(141); match(ID);
				setState(142); match(IS);
				setState(143); expr(0);
				setState(144); match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNumOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NumOpContext numOp() {
			return getRuleContext(NumOpContext.class,0);
		}
		public ExprNumOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprNumOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprNumOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprNumOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public ExprBoolOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolContext extends ExprContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ExprBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUpContext extends ExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode UP() { return getToken(YallParser.UP, 0); }
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode COMMA() { return getToken(YallParser.COMMA, 0); }
		public TerminalNode LPAR() { return getToken(YallParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YallParser.RPAR, 0); }
		public ExprUpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprUp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public ExprNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBlockContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public ExprBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCompOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprCompOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprCompOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YallParser.COMMA); }
		public TerminalNode LPAR() { return getToken(YallParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YallParser.RPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(YallParser.COMMA, i);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(149); match(LBLOCK);
				setState(150); expr(0);
				setState(151); match(RBLOCK);
				}
				break;
			case 2:
				{
				_localctx = new ExprUpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); match(UP);
				setState(154); match(LPAR);
				setState(157);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(155); match(NUM);
					setState(156); match(COMMA);
					}
				}

				setState(159); match(ID);
				setState(160); match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); match(NUM);
				}
				break;
			case 4:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162); bool();
				}
				break;
			case 5:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(ID);
				setState(164); match(LPAR);
				setState(174);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << TRUE) | (1L << FALSE) | (1L << LBLOCK) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(165); expr(0);
							setState(166); match(COMMA);
							}
							} 
						}
						setState(172);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(173); expr(0);
					}
				}

				setState(176); match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprNumOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181); numOp();
						setState(182); expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(185); boolOp();
						setState(186); expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189); compOp();
						setState(190); expr(7);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class NumOpContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(YallParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(YallParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(YallParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(YallParser.MINUS, 0); }
		public NumOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterNumOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitNumOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitNumOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumOpContext numOp() throws RecognitionException {
		NumOpContext _localctx = new NumOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(YallParser.AND, 0); }
		public TerminalNode OR() { return getToken(YallParser.OR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(YallParser.GE, 0); }
		public TerminalNode LT() { return getToken(YallParser.LT, 0); }
		public TerminalNode GT() { return getToken(YallParser.GT, 0); }
		public TerminalNode LE() { return getToken(YallParser.LE, 0); }
		public TerminalNode EQ() { return getToken(YallParser.EQ, 0); }
		public TerminalNode NE() { return getToken(YallParser.NE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(YallParser.INTEGER, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(YallParser.BOOLEAN, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(BOOLEAN);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTrueContext extends BoolContext {
		public TerminalNode TRUE() { return getToken(YallParser.TRUE, 0); }
		public BoolTrueContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends BoolContext {
		public TerminalNode FALSE() { return getToken(YallParser.FALSE, 0); }
		public BoolFalseContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(FALSE);
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
		case 7: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);
		case 1: return precpred(_ctx, 7);
		case 2: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\64\n\5"+
		"\f\5\16\5\67\13\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7\5\7\u0085\n"+
		"\7\3\7\3\7\5\7\u0089\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0095"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\5\t\u00b1\n"+
		"\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00c3\n\t\f\t\16\t\u00c6\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\5\r\u00d0\n\r\3\16\3\16\5\16\u00d4\n\16\3\16\2\3\20\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\5\3\2$\'\3\2()\3\2*/\u00e8\2\34\3\2\2\2\4#\3\2\2"+
		"\2\6(\3\2\2\2\b*\3\2\2\2\nF\3\2\2\2\f\u0088\3\2\2\2\16\u0094\3\2\2\2\20"+
		"\u00b4\3\2\2\2\22\u00c7\3\2\2\2\24\u00c9\3\2\2\2\26\u00cb\3\2\2\2\30\u00cf"+
		"\3\2\2\2\32\u00d3\3\2\2\2\34\35\7\3\2\2\35\36\7\60\2\2\36\37\5\4\3\2\37"+
		"\3\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2"+
		"\2\2%#\3\2\2\2&)\5\b\5\2\')\5\f\7\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+"+
		"\7\16\2\2+,\7\60\2\2,-\7\20\2\2-.\5\n\6\2.;\7\35\2\2/\60\5\30\r\2\60\61"+
		"\7\60\2\2\61\62\7!\2\2\62\64\3\2\2\2\63/\3\2\2\2\64\67\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\30\r\29:\7\60\2\2:"+
		"<\3\2\2\2;\65\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\36\2\2>?\7\32\2\2?@\5\4"+
		"\3\2@A\7\33\2\2A\t\3\2\2\2BC\5\30\r\2CD\7\60\2\2DG\3\2\2\2EG\7\17\2\2"+
		"FB\3\2\2\2FE\3\2\2\2G\13\3\2\2\2H\u0089\5\16\b\2IJ\7\60\2\2JK\7\4\2\2"+
		"KL\5\20\t\2LM\7\34\2\2M\u0089\3\2\2\2NO\7\5\2\2OP\7\35\2\2PQ\5\20\t\2"+
		"QR\7\36\2\2RS\7\6\2\2ST\7\32\2\2TU\5\4\3\2U[\7\33\2\2VW\7\7\2\2WX\7\32"+
		"\2\2XY\5\4\3\2YZ\7\33\2\2Z\\\3\2\2\2[V\3\2\2\2[\\\3\2\2\2\\\u0089\3\2"+
		"\2\2]^\7\b\2\2^_\7\35\2\2_`\5\20\t\2`a\7\36\2\2ab\7\r\2\2bc\7\32\2\2c"+
		"d\5\4\3\2de\7\33\2\2e\u0089\3\2\2\2fg\7\22\2\2gh\7\60\2\2h\u0089\7\34"+
		"\2\2ij\7\23\2\2jk\5\20\t\2kl\7\34\2\2l\u0089\3\2\2\2mn\7\t\2\2no\7\61"+
		"\2\2o\u0089\7\34\2\2pq\7\n\2\2qr\7\61\2\2r\u0089\7\34\2\2st\7\13\2\2t"+
		"u\7\61\2\2u\u0089\7\34\2\2vw\7\f\2\2wx\7\61\2\2x\u0089\7\34\2\2yz\7\60"+
		"\2\2z\u0084\7\30\2\2{|\5\20\t\2|}\7!\2\2}\177\3\2\2\2~{\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0085\5\20\t\2\u0084\u0080\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\31\2\2\u0087\u0089\7\34\2\2\u0088"+
		"H\3\2\2\2\u0088I\3\2\2\2\u0088N\3\2\2\2\u0088]\3\2\2\2\u0088f\3\2\2\2"+
		"\u0088i\3\2\2\2\u0088m\3\2\2\2\u0088p\3\2\2\2\u0088s\3\2\2\2\u0088v\3"+
		"\2\2\2\u0088y\3\2\2\2\u0089\r\3\2\2\2\u008a\u008b\5\30\r\2\u008b\u008c"+
		"\7\60\2\2\u008c\u008d\7\34\2\2\u008d\u0095\3\2\2\2\u008e\u008f\5\30\r"+
		"\2\u008f\u0090\7\60\2\2\u0090\u0091\7\4\2\2\u0091\u0092\5\20\t\2\u0092"+
		"\u0093\7\34\2\2\u0093\u0095\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008e\3"+
		"\2\2\2\u0095\17\3\2\2\2\u0096\u0097\b\t\1\2\u0097\u0098\7\35\2\2\u0098"+
		"\u0099\5\20\t\2\u0099\u009a\7\36\2\2\u009a\u00b5\3\2\2\2\u009b\u009c\7"+
		"\21\2\2\u009c\u009f\7\30\2\2\u009d\u009e\7\61\2\2\u009e\u00a0\7!\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\60"+
		"\2\2\u00a2\u00b5\7\31\2\2\u00a3\u00b5\7\61\2\2\u00a4\u00b5\5\32\16\2\u00a5"+
		"\u00a6\7\60\2\2\u00a6\u00b0\7\30\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9"+
		"\7!\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b1\5\20\t\2\u00b0\u00ac\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b5\7\31\2\2\u00b3\u00b5\7\60\2\2\u00b4\u0096\3"+
		"\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u00a3\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4"+
		"\u00a5\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00c4\3\2\2\2\u00b6\u00b7\f\n"+
		"\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\5\20\t\13\u00b9\u00c3\3\2\2\2\u00ba"+
		"\u00bb\f\t\2\2\u00bb\u00bc\5\24\13\2\u00bc\u00bd\5\20\t\n\u00bd\u00c3"+
		"\3\2\2\2\u00be\u00bf\f\b\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\5\20\t\t"+
		"\u00c1\u00c3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00be"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\21\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\t\2\2\2\u00c8\23\3\2\2\2\u00c9"+
		"\u00ca\t\3\2\2\u00ca\25\3\2\2\2\u00cb\u00cc\t\4\2\2\u00cc\27\3\2\2\2\u00cd"+
		"\u00d0\7\24\2\2\u00ce\u00d0\7\25\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0\31\3\2\2\2\u00d1\u00d4\7\26\2\2\u00d2\u00d4\7\27\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\33\3\2\2\2\24#(\65;F[\u0080\u0084"+
		"\u0088\u0094\u009f\u00ac\u00b0\u00b4\u00c2\u00c4\u00cf\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}