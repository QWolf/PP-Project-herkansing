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
		YALL=1, GLOBAL=2, LOCAL=3, IS=4, IF=5, THEN=6, ELSE=7, WHILE=8, LOCK=9, 
		UNLOCK=10, FORK=11, JOIN=12, DO=13, NONE=14, UP=15, INPUT=16, OUTPUTBOOL=17, 
		OUTPUTINT=18, INTEGER=19, BOOLEAN=20, TRUE=21, FALSE=22, LPAR=23, RPAR=24, 
		LBRACE=25, RBRACE=26, SEMI=27, LBLOCK=28, RBLOCK=29, QUOTE=30, DQUOTE=31, 
		COMMA=32, EXCL=33, AT=34, ADD=35, SUB=36, PLUS=37, MINUS=38, TIMES=39, 
		DIVIDE=40, MODULO=41, AND=42, OR=43, XOR=44, NOT=45, GT=46, LT=47, GE=48, 
		LE=49, EQ=50, NE=51, ID=52, NUM=53, COMMENT=54, COMMENTBLOCK=55, WS=56;
	public static final String[] tokenNames = {
		"<INVALID>", "'YALL'", "'global'", "'local'", "'is'", "'if'", "'then'", 
		"'else'", "'while'", "'lock'", "'unlock'", "'fork'", "'join'", "'do'", 
		"'none'", "'up'", "'input'", "'outputBoolean'", "'outputInt'", "'integer'", 
		"'boolean'", "'true'", "'false'", "'('", "')'", "'{'", "'}'", "';'", "'['", 
		"']'", "'''", "'\"'", "','", "'!'", "'@'", "'+'", "'-'", "'plus'", "'minus'", 
		"'times'", "'div'", "'mod'", "'and'", "'or'", "'xor'", "'not'", "'>>'", 
		"'<<'", "'>='", "'=<'", "'=='", "'/='", "ID", "NUM", "COMMENT", "COMMENTBLOCK", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_init = 1, RULE_toplevelblock = 2, RULE_toplevelblockPart = 3, 
		RULE_block = 4, RULE_stat = 5, RULE_decl = 6, RULE_expr = 7, RULE_boolExpr = 8, 
		RULE_addExpr = 9, RULE_multExpr = 10, RULE_baseExpr = 11, RULE_addOp = 12, 
		RULE_multOp = 13, RULE_boolOp = 14, RULE_compOp = 15, RULE_compEqOp = 16, 
		RULE_type = 17, RULE_bool = 18;
	public static final String[] ruleNames = {
		"program", "init", "toplevelblock", "toplevelblockPart", "block", "stat", 
		"decl", "expr", "boolExpr", "addExpr", "multExpr", "baseExpr", "addOp", 
		"multOp", "boolOp", "compOp", "compEqOp", "type", "bool"
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
		public ToplevelblockContext toplevelblock() {
			return getRuleContext(ToplevelblockContext.class,0);
		}
		public TerminalNode YALL() { return getToken(YallParser.YALL, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(YALL);
			setState(39); match(ID);
			setState(41);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(40); init();
				}
			}

			setState(43); toplevelblock();
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

	public static class InitContext extends ParserRuleContext {
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public TerminalNode LOCAL() { return getToken(YallParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(YallParser.GLOBAL, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(GLOBAL);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==BOOLEAN) {
				{
				{
				setState(46); decl();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); match(LOCAL);
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

	public static class ToplevelblockContext extends ParserRuleContext {
		public ToplevelblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevelblock; }
	 
		public ToplevelblockContext() { }
		public void copyFrom(ToplevelblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToplvlBlockContext extends ToplevelblockContext {
		public ToplevelblockPartContext toplevelblockPart(int i) {
			return getRuleContext(ToplevelblockPartContext.class,i);
		}
		public List<ToplevelblockPartContext> toplevelblockPart() {
			return getRuleContexts(ToplevelblockPartContext.class);
		}
		public ToplvlBlockContext(ToplevelblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterToplvlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitToplvlBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitToplvlBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToplevelblockContext toplevelblock() throws RecognitionException {
		ToplevelblockContext _localctx = new ToplevelblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_toplevelblock);
		int _la;
		try {
			_localctx = new ToplvlBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << INPUT) | (1L << OUTPUTBOOL) | (1L << OUTPUTINT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(54); toplevelblockPart();
				}
				}
				setState(59);
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

	public static class ToplevelblockPartContext extends ParserRuleContext {
		public ToplevelblockPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevelblockPart; }
	 
		public ToplevelblockPartContext() { }
		public void copyFrom(ToplevelblockPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToplvlForkContext extends ToplevelblockPartContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public ToplevelblockContext toplevelblock() {
			return getRuleContext(ToplevelblockContext.class,0);
		}
		public TerminalNode FORK() { return getToken(YallParser.FORK, 0); }
		public TerminalNode LPAR() { return getToken(YallParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YallParser.RPAR, 0); }
		public ToplvlForkContext(ToplevelblockPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterToplvlFork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitToplvlFork(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitToplvlFork(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToplvlStatContext extends ToplevelblockPartContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ToplvlStatContext(ToplevelblockPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterToplvlStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitToplvlStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitToplvlStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToplvlJoinContext extends ToplevelblockPartContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode JOIN() { return getToken(YallParser.JOIN, 0); }
		public ToplvlJoinContext(ToplevelblockPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterToplvlJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitToplvlJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitToplvlJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToplevelblockPartContext toplevelblockPart() throws RecognitionException {
		ToplevelblockPartContext _localctx = new ToplevelblockPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_toplevelblockPart);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case LOCK:
			case UNLOCK:
			case INPUT:
			case OUTPUTBOOL:
			case OUTPUTINT:
			case INTEGER:
			case BOOLEAN:
			case ID:
				_localctx = new ToplvlStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60); stat();
				}
				break;
			case FORK:
				_localctx = new ToplvlForkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(FORK);
				setState(62); match(ID);
				setState(63); match(LPAR);
				setState(64); toplevelblock();
				setState(65); match(RPAR);
				}
				break;
			case JOIN:
				_localctx = new ToplvlJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(JOIN);
				setState(68); match(ID);
				setState(69); match(SEMI);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStatementContext extends BlockContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockStatementContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			_localctx = new BlockStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << INPUT) | (1L << OUTPUTBOOL) | (1L << OUTPUTINT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(72); stat();
				}
				}
				setState(77);
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(YallParser.RBRACE, 0); }
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
	public static class StatOutputBoolContext extends StatContext {
		public TerminalNode OUTPUTBOOL() { return getToken(YallParser.OUTPUTBOOL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public StatOutputBoolContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatOutputBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatOutputBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatOutputBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatOutputIntContext extends StatContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TerminalNode OUTPUTINT() { return getToken(YallParser.OUTPUTINT, 0); }
		public StatOutputIntContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterStatOutputInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitStatOutputInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitStatOutputInt(this);
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
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(YallParser.RBRACE); }
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		int _la;
		try {
			setState(125);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
				_localctx = new StatDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78); decl();
				}
				break;
			case ID:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(ID);
				setState(80); match(IS);
				setState(81); expr();
				setState(82); match(SEMI);
				}
				break;
			case IF:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84); match(IF);
				setState(85); match(LBLOCK);
				setState(86); boolExpr(0);
				setState(87); match(RBLOCK);
				setState(88); match(THEN);
				setState(89); match(LBRACE);
				setState(90); block();
				setState(91); match(RBRACE);
				setState(97);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(92); match(ELSE);
					setState(93); match(LBRACE);
					setState(94); block();
					setState(95); match(RBRACE);
					}
				}

				}
				break;
			case WHILE:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99); match(WHILE);
				setState(100); match(LBLOCK);
				setState(101); boolExpr(0);
				setState(102); match(RBLOCK);
				setState(103); match(DO);
				setState(104); match(LBRACE);
				setState(105); block();
				setState(106); match(RBRACE);
				}
				break;
			case INPUT:
				_localctx = new StatInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108); match(INPUT);
				setState(109); match(ID);
				setState(110); match(SEMI);
				}
				break;
			case OUTPUTBOOL:
				_localctx = new StatOutputBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111); match(OUTPUTBOOL);
				setState(112); boolExpr(0);
				setState(113); match(SEMI);
				}
				break;
			case OUTPUTINT:
				_localctx = new StatOutputIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(115); match(OUTPUTINT);
				setState(116); addExpr(0);
				setState(117); match(SEMI);
				}
				break;
			case LOCK:
				_localctx = new StatLockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(119); match(LOCK);
				setState(120); match(ID);
				setState(121); match(SEMI);
				}
				break;
			case UNLOCK:
				_localctx = new StatUnlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122); match(UNLOCK);
				setState(123); match(ID);
				setState(124); match(SEMI);
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
	public static class DeclAssignContext extends DeclContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode IS() { return getToken(YallParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YallParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclAssignContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterDeclAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitDeclAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitDeclAssign(this);
			else return visitor.visitChildren(this);
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

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DeclDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); type();
				setState(128); match(ID);
				setState(129); match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131); type();
				setState(132); match(ID);
				setState(133); match(IS);
				setState(134); expr();
				setState(135); match(SEMI);
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
	public static class ExprBoolExprContext extends ExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExprBoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumExprContext extends ExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public ExprNumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprNumExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); addExpr(0);
				}
				break;
			case 2:
				_localctx = new ExprBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140); boolExpr(0);
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprNotContext extends BoolExprContext {
		public TerminalNode NOT() { return getToken(YallParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolExprNotContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprBaseExprContext extends BoolExprContext {
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public BoolExprBaseExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprBaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprCompEqOpBoolContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public CompEqOpContext compEqOp() {
			return getRuleContext(CompEqOpContext.class,0);
		}
		public BoolExprCompEqOpBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprCompEqOpBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprCompEqOpBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprCompEqOpBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParantesesContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(YallParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YallParser.RPAR, 0); }
		public BoolParantesesContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolParanteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolParanteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolParanteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprBoolOpContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BoolExprBoolOpContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprCompOpContext extends BoolExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public BoolExprCompOpContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(144); match(NOT);
				setState(145); boolExpr(4);
				}
				break;
			case 2:
				{
				_localctx = new BoolParantesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146); match(LPAR);
				setState(147); boolExpr(0);
				setState(148); match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new BoolExprCompOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); addExpr(0);
				setState(151); compOp();
				setState(152); addExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolExprBaseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); baseExpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprBoolOpContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158); boolOp();
						setState(159); boolExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolExprCompEqOpBoolContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162); compEqOp();
						setState(163); boolExpr(3);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExprAddOpContext extends AddExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AddExprAddOpContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterAddExprAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitAddExprAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitAddExprAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprMultExprContext extends AddExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AddExprMultExprContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterAddExprMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitAddExprMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitAddExprMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddExprMultExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(171); multExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprAddOpContext(new AddExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174); addOp();
					setState(175); addExpr(3);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class MultExprContext extends ParserRuleContext {
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	 
		public MultExprContext() { }
		public void copyFrom(MultExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultExprParentesesContext extends MultExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(YallParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YallParser.RPAR, 0); }
		public MultExprParentesesContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterMultExprParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitMultExprParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitMultExprParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprBaseExprContext extends MultExprContext {
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public MultExprBaseExprContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterMultExprBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitMultExprBaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitMultExprBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprMultOpContext extends MultExprContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public MultExprMultOpContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterMultExprMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitMultExprMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitMultExprMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		return multExpr(0);
	}

	private MultExprContext multExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultExprContext _localctx = new MultExprContext(_ctx, _parentState);
		MultExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_multExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new MultExprParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183); match(LPAR);
				setState(184); addExpr(0);
				setState(185); match(RPAR);
				}
				break;
			case UP:
			case TRUE:
			case FALSE:
			case LBLOCK:
			case ID:
			case NUM:
				{
				_localctx = new MultExprBaseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); baseExpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultExprMultOpContext(new MultExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
					setState(190);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(191); multOp();
					setState(192); multExpr(4);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class BaseExprContext extends ParserRuleContext {
		public BaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
	 
		public BaseExprContext() { }
		public void copyFrom(BaseExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseExprBlockContext extends BaseExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public BaseExprBlockContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseExprIDContext extends BaseExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public BaseExprIDContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseExprUpContext extends BaseExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode UP() { return getToken(YallParser.UP, 0); }
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode COMMA() { return getToken(YallParser.COMMA, 0); }
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public BaseExprUpContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprUp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseExprNumContext extends BaseExprContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public BaseExprNumContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseExprBoolContext extends BaseExprContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BaseExprBoolContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseExprAddContext extends BaseExprContext {
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public List<TerminalNode> ADD() { return getTokens(YallParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(YallParser.ADD, i);
		}
		public BaseExprAddContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseExprSubContext extends BaseExprContext {
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public List<TerminalNode> SUB() { return getTokens(YallParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(YallParser.SUB, i);
		}
		public BaseExprSubContext(BaseExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBaseExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBaseExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBaseExprSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExprContext baseExpr() throws RecognitionException {
		return baseExpr(0);
	}

	private BaseExprContext baseExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BaseExprContext _localctx = new BaseExprContext(_ctx, _parentState);
		BaseExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_baseExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new BaseExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200); match(ID);
				}
				break;
			case UP:
				{
				_localctx = new BaseExprUpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(UP);
				setState(202); match(LBLOCK);
				setState(205);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(203); match(NUM);
					setState(204); match(COMMA);
					}
				}

				setState(207); match(ID);
				setState(208); match(RBLOCK);
				}
				break;
			case LBLOCK:
				{
				_localctx = new BaseExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(LBLOCK);
				setState(210); expr();
				setState(211); match(RBLOCK);
				}
				break;
			case NUM:
				{
				_localctx = new BaseExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213); match(NUM);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BaseExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new BaseExprAddContext(new BaseExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_baseExpr);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(219); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(218); match(ADD);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(221); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new BaseExprSubContext(new BaseExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_baseExpr);
						setState(223);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(225); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(224); match(SUB);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(227); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(YallParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(YallParser.MINUS, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(YallParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(YallParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(YallParser.MODULO, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
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
		public TerminalNode XOR() { return getToken(YallParser.XOR, 0); }
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
		enterRule(_localctx, 28, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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

	public static class CompEqOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(YallParser.EQ, 0); }
		public TerminalNode NE() { return getToken(YallParser.NE, 0); }
		public CompEqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compEqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterCompEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitCompEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitCompEqOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompEqOpContext compEqOp() throws RecognitionException {
		CompEqOpContext _localctx = new CompEqOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compEqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NE) ) {
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
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244); match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(BOOLEAN);
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
		enterRule(_localctx, 36, RULE_bool);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249); match(FALSE);
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
		case 8: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 9: return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 10: return multExpr_sempred((MultExprContext)_localctx, predIndex);
		case 11: return baseExpr_sempred((BaseExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean baseExpr_sempred(BaseExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multExpr_sempred(MultExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\3\3\3\3\7\3\62\n\3\f"+
		"\3\16\3\65\13\3\3\3\3\3\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"d\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00bf\n\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00da\n\r\3\r\3\r\6\r\u00de\n\r\r\r\16\r\u00df\3\r\3\r\6\r\u00e4"+
		"\n\r\r\r\16\r\u00e5\7\r\u00e8\n\r\f\r\16\r\u00eb\13\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00f9\n\23\3\24\3\24"+
		"\5\24\u00fd\n\24\3\24\2\6\22\24\26\30\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\7\3\2\'(\3\2)+\3\2,.\3\2\60\65\3\2\64\65\u010f\2(\3\2"+
		"\2\2\4/\3\2\2\2\6;\3\2\2\2\bH\3\2\2\2\nM\3\2\2\2\f\177\3\2\2\2\16\u008b"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u009d\3\2\2\2\24\u00ac\3\2\2\2\26\u00be\3"+
		"\2\2\2\30\u00d9\3\2\2\2\32\u00ec\3\2\2\2\34\u00ee\3\2\2\2\36\u00f0\3\2"+
		"\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2$\u00f8\3\2\2\2&\u00fc\3\2\2\2()\7"+
		"\3\2\2)+\7\66\2\2*,\5\4\3\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5\6\4\2.\3"+
		"\3\2\2\2/\63\7\4\2\2\60\62\5\16\b\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\5\2\2\67\5"+
		"\3\2\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2"+
		"=;\3\2\2\2>I\5\f\7\2?@\7\r\2\2@A\7\66\2\2AB\7\31\2\2BC\5\6\4\2CD\7\32"+
		"\2\2DI\3\2\2\2EF\7\16\2\2FG\7\66\2\2GI\7\35\2\2H>\3\2\2\2H?\3\2\2\2HE"+
		"\3\2\2\2I\t\3\2\2\2JL\5\f\7\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"N\13\3\2\2\2OM\3\2\2\2P\u0080\5\16\b\2QR\7\66\2\2RS\7\6\2\2ST\5\20\t\2"+
		"TU\7\35\2\2U\u0080\3\2\2\2VW\7\7\2\2WX\7\36\2\2XY\5\22\n\2YZ\7\37\2\2"+
		"Z[\7\b\2\2[\\\7\33\2\2\\]\5\n\6\2]c\7\34\2\2^_\7\t\2\2_`\7\33\2\2`a\5"+
		"\n\6\2ab\7\34\2\2bd\3\2\2\2c^\3\2\2\2cd\3\2\2\2d\u0080\3\2\2\2ef\7\n\2"+
		"\2fg\7\36\2\2gh\5\22\n\2hi\7\37\2\2ij\7\17\2\2jk\7\33\2\2kl\5\n\6\2lm"+
		"\7\34\2\2m\u0080\3\2\2\2no\7\22\2\2op\7\66\2\2p\u0080\7\35\2\2qr\7\23"+
		"\2\2rs\5\22\n\2st\7\35\2\2t\u0080\3\2\2\2uv\7\24\2\2vw\5\24\13\2wx\7\35"+
		"\2\2x\u0080\3\2\2\2yz\7\13\2\2z{\7\66\2\2{\u0080\7\35\2\2|}\7\f\2\2}~"+
		"\7\66\2\2~\u0080\7\35\2\2\177P\3\2\2\2\177Q\3\2\2\2\177V\3\2\2\2\177e"+
		"\3\2\2\2\177n\3\2\2\2\177q\3\2\2\2\177u\3\2\2\2\177y\3\2\2\2\177|\3\2"+
		"\2\2\u0080\r\3\2\2\2\u0081\u0082\5$\23\2\u0082\u0083\7\66\2\2\u0083\u0084"+
		"\7\35\2\2\u0084\u008c\3\2\2\2\u0085\u0086\5$\23\2\u0086\u0087\7\66\2\2"+
		"\u0087\u0088\7\6\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\35\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0085\3\2\2\2\u008c\17\3\2\2\2\u008d"+
		"\u0090\5\24\13\2\u008e\u0090\5\22\n\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092\b\n\1\2\u0092\u0093\7/\2\2\u0093"+
		"\u009e\5\22\n\6\u0094\u0095\7\31\2\2\u0095\u0096\5\22\n\2\u0096\u0097"+
		"\7\32\2\2\u0097\u009e\3\2\2\2\u0098\u0099\5\24\13\2\u0099\u009a\5 \21"+
		"\2\u009a\u009b\5\24\13\2\u009b\u009e\3\2\2\2\u009c\u009e\5\30\r\2\u009d"+
		"\u0091\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00a9\3\2\2\2\u009f\u00a0\f\7\2\2\u00a0\u00a1\5\36\20\2\u00a1"+
		"\u00a2\5\22\n\b\u00a2\u00a8\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\5"+
		"\"\22\2\u00a5\u00a6\5\22\n\5\u00a6\u00a8\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\23\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\13\1\2\u00ad\u00ae"+
		"\5\26\f\2\u00ae\u00b5\3\2\2\2\u00af\u00b0\f\4\2\2\u00b0\u00b1\5\32\16"+
		"\2\u00b1\u00b2\5\24\13\5\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\25\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\f\1\2\u00b9\u00ba\7\31\2\2\u00ba"+
		"\u00bb\5\24\13\2\u00bb\u00bc\7\32\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf"+
		"\5\30\r\2\u00be\u00b8\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c6\3\2\2\2"+
		"\u00c0\u00c1\f\5\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c3\5\26\f\6\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca"+
		"\b\r\1\2\u00ca\u00da\7\66\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00cf\7\36\2"+
		"\2\u00cd\u00ce\7\67\2\2\u00ce\u00d0\7\"\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\66\2\2\u00d2\u00da\7"+
		"\37\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\5\20\t\2\u00d5\u00d6\7\37\2\2"+
		"\u00d6\u00da\3\2\2\2\u00d7\u00da\7\67\2\2\u00d8\u00da\5&\24\2\u00d9\u00c9"+
		"\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00e9\3\2\2\2\u00db\u00dd\f\4\2\2\u00dc\u00de\7%"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e3\f\3\2\2\u00e2\u00e4\7&"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00e1\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\31\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed\33\3\2\2\2\u00ee"+
		"\u00ef\t\3\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\t\4\2\2\u00f1\37\3\2\2\2\u00f2"+
		"\u00f3\t\5\2\2\u00f3!\3\2\2\2\u00f4\u00f5\t\6\2\2\u00f5#\3\2\2\2\u00f6"+
		"\u00f9\7\25\2\2\u00f7\u00f9\7\26\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9%\3\2\2\2\u00fa\u00fd\7\27\2\2\u00fb\u00fd\7\30\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\'\3\2\2\2\31+\63;HMc\177\u008b"+
		"\u008f\u009d\u00a7\u00a9\u00b5\u00be\u00c6\u00cf\u00d9\u00df\u00e5\u00e7"+
		"\u00e9\u00f8\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}