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
		COMMA=32, EXCL=33, AT=34, PLUS=35, MINUS=36, TIMES=37, DIVIDE=38, AND=39, 
		OR=40, XOR=41, NOT=42, GT=43, LT=44, GE=45, LE=46, EQ=47, NE=48, ID=49, 
		NUM=50, COMMENT=51, COMMENTBLOCK=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'YALL'", "'global'", "'local'", "'is'", "'if'", "'then'", 
		"'else'", "'while'", "'lock'", "'unlock'", "'fork'", "'join'", "'do'", 
		"'none'", "'up'", "'input'", "'outputBoolean'", "'outputInt'", "'integer'", 
		"'boolean'", "'true'", "'false'", "'('", "')'", "'{'", "'}'", "';'", "'['", 
		"']'", "'''", "'\"'", "','", "'!'", "'@'", "'plus'", "'minus'", "'times'", 
		"'div'", "'and'", "'or'", "'xor'", "'not'", "'>>'", "'<<'", "'>='", "'=<'", 
		"'=='", "'/='", "ID", "NUM", "COMMENT", "COMMENTBLOCK", "WS"
	};
	public static final int
		RULE_program = 0, RULE_init = 1, RULE_toplevelblock = 2, RULE_toplevelblockPart = 3, 
		RULE_block = 4, RULE_stat = 5, RULE_decl = 6, RULE_expr = 7, RULE_numOp = 8, 
		RULE_addOp = 9, RULE_multOp = 10, RULE_boolOp = 11, RULE_compOp = 12, 
		RULE_compEqOp = 13, RULE_type = 14, RULE_bool = 15;
	public static final String[] ruleNames = {
		"program", "init", "toplevelblock", "toplevelblockPart", "block", "stat", 
		"decl", "expr", "numOp", "addOp", "multOp", "boolOp", "compOp", "compEqOp", 
		"type", "bool"
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
			setState(32); match(YALL);
			setState(33); match(ID);
			setState(35);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(34); init();
				}
			}

			setState(37); toplevelblock();
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
			setState(39); match(GLOBAL);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==BOOLEAN) {
				{
				{
				setState(40); decl();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(LOCAL);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << INPUT) | (1L << OUTPUTBOOL) | (1L << OUTPUTINT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(48); toplevelblockPart();
				}
				}
				setState(53);
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
			setState(64);
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
				setState(54); stat();
				}
				break;
			case FORK:
				_localctx = new ToplvlForkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(FORK);
				setState(56); match(ID);
				setState(57); match(LPAR);
				setState(58); toplevelblock();
				setState(59); match(RPAR);
				}
				break;
			case JOIN:
				_localctx = new ToplvlJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(JOIN);
				setState(62); match(ID);
				setState(63); match(SEMI);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << INPUT) | (1L << OUTPUTBOOL) | (1L << OUTPUTINT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(66); stat();
				}
				}
				setState(71);
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
	public static class StatOutputBoolContext extends StatContext {
		public TerminalNode OUTPUTBOOL() { return getToken(YallParser.OUTPUTBOOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		int _la;
		try {
			setState(119);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
				_localctx = new StatDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72); decl();
				}
				break;
			case ID:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(ID);
				setState(74); match(IS);
				setState(75); expr(0);
				setState(76); match(SEMI);
				}
				break;
			case IF:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78); match(IF);
				setState(79); match(LBLOCK);
				setState(80); expr(0);
				setState(81); match(RBLOCK);
				setState(82); match(THEN);
				setState(83); match(LBRACE);
				setState(84); block();
				setState(85); match(RBRACE);
				setState(91);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(86); match(ELSE);
					setState(87); match(LBRACE);
					setState(88); block();
					setState(89); match(RBRACE);
					}
				}

				}
				break;
			case WHILE:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93); match(WHILE);
				setState(94); match(LBLOCK);
				setState(95); expr(0);
				setState(96); match(RBLOCK);
				setState(97); match(DO);
				setState(98); match(LBRACE);
				setState(99); block();
				setState(100); match(RBRACE);
				}
				break;
			case INPUT:
				_localctx = new StatInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102); match(INPUT);
				setState(103); match(ID);
				setState(104); match(SEMI);
				}
				break;
			case OUTPUTBOOL:
				_localctx = new StatOutputBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105); match(OUTPUTBOOL);
				setState(106); expr(0);
				setState(107); match(SEMI);
				}
				break;
			case OUTPUTINT:
				_localctx = new StatOutputIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(109); match(OUTPUTINT);
				setState(110); expr(0);
				setState(111); match(SEMI);
				}
				break;
			case LOCK:
				_localctx = new StatLockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(113); match(LOCK);
				setState(114); match(ID);
				setState(115); match(SEMI);
				}
				break;
			case UNLOCK:
				_localctx = new StatUnlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(116); match(UNLOCK);
				setState(117); match(ID);
				setState(118); match(SEMI);
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
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DeclDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121); type();
				setState(122); match(ID);
				setState(123); match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125); type();
				setState(126); match(ID);
				setState(127); match(IS);
				setState(128); expr(0);
				setState(129); match(SEMI);
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
	public static class ExprCompEqOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompEqOpContext compEqOp() {
			return getRuleContext(CompEqOpContext.class,0);
		}
		public ExprCompEqOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprCompEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprCompEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprCompEqOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<NumOpContext> numOp() {
			return getRuleContexts(NumOpContext.class);
		}
		public NumOpContext numOp(int i) {
			return getRuleContext(NumOpContext.class,i);
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
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(YallParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitExprNot(this);
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
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
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
			setState(151);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134); match(NOT);
				setState(135); expr(7);
				}
				break;
			case LBLOCK:
				{
				_localctx = new ExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136); match(LBLOCK);
				setState(137); expr(0);
				setState(138); match(RBLOCK);
				}
				break;
			case UP:
				{
				_localctx = new ExprUpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140); match(UP);
				setState(141); match(LBLOCK);
				setState(144);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(142); match(NUM);
					setState(143); match(COMMA);
					}
				}

				setState(146); match(ID);
				setState(147); match(RBLOCK);
				}
				break;
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); match(NUM);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154); boolOp();
						setState(155); expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprCompOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158); compOp();
						setState(159); expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompEqOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162); compEqOp();
						setState(163); expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprNumOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(169); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(166); numOp();
								setState(167); expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(171); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(177);
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

	public static class NumOpContext extends ParserRuleContext {
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
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
		try {
			setState(180);
			switch (_input.LA(1)) {
			case TIMES:
			case DIVIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); multOp();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(179); addOp();
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
		enterRule(_localctx, 18, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 20, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIVIDE) ) {
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
		enterRule(_localctx, 22, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 24, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_compEqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(BOOLEAN);
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
		enterRule(_localctx, 30, RULE_bool);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197); match(FALSE);
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
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u00cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\5\2&\n\2\3\2\3\2\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C"+
		"\n\5\3\6\7\6F\n\6\f\6\16\6I\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\t\u00ac\n\t\r\t\16\t\u00ad\7\t\u00b0\n\t\f\t\16"+
		"\t\u00b3\13\t\3\n\3\n\5\n\u00b7\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u00c5\n\20\3\21\3\21\5\21\u00c9\n\21\3\21\2"+
		"\3\20\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\3\2%&\3\2\'(\3\2"+
		")+\3\2-\60\3\2\61\62\u00d8\2\"\3\2\2\2\4)\3\2\2\2\6\65\3\2\2\2\bB\3\2"+
		"\2\2\nG\3\2\2\2\fy\3\2\2\2\16\u0085\3\2\2\2\20\u0099\3\2\2\2\22\u00b6"+
		"\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3\2\2\2\32\u00be\3"+
		"\2\2\2\34\u00c0\3\2\2\2\36\u00c4\3\2\2\2 \u00c8\3\2\2\2\"#\7\3\2\2#%\7"+
		"\63\2\2$&\5\4\3\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\5\6\4\2(\3\3\2\2\2"+
		")-\7\4\2\2*,\5\16\b\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2"+
		"\2\2/-\3\2\2\2\60\61\7\5\2\2\61\5\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2"+
		"\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\2"+
		"8C\5\f\7\29:\7\r\2\2:;\7\63\2\2;<\7\31\2\2<=\5\6\4\2=>\7\32\2\2>C\3\2"+
		"\2\2?@\7\16\2\2@A\7\63\2\2AC\7\35\2\2B8\3\2\2\2B9\3\2\2\2B?\3\2\2\2C\t"+
		"\3\2\2\2DF\5\f\7\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2"+
		"IG\3\2\2\2Jz\5\16\b\2KL\7\63\2\2LM\7\6\2\2MN\5\20\t\2NO\7\35\2\2Oz\3\2"+
		"\2\2PQ\7\7\2\2QR\7\36\2\2RS\5\20\t\2ST\7\37\2\2TU\7\b\2\2UV\7\33\2\2V"+
		"W\5\n\6\2W]\7\34\2\2XY\7\t\2\2YZ\7\33\2\2Z[\5\n\6\2[\\\7\34\2\2\\^\3\2"+
		"\2\2]X\3\2\2\2]^\3\2\2\2^z\3\2\2\2_`\7\n\2\2`a\7\36\2\2ab\5\20\t\2bc\7"+
		"\37\2\2cd\7\17\2\2de\7\33\2\2ef\5\n\6\2fg\7\34\2\2gz\3\2\2\2hi\7\22\2"+
		"\2ij\7\63\2\2jz\7\35\2\2kl\7\23\2\2lm\5\20\t\2mn\7\35\2\2nz\3\2\2\2op"+
		"\7\24\2\2pq\5\20\t\2qr\7\35\2\2rz\3\2\2\2st\7\13\2\2tu\7\63\2\2uz\7\35"+
		"\2\2vw\7\f\2\2wx\7\63\2\2xz\7\35\2\2yJ\3\2\2\2yK\3\2\2\2yP\3\2\2\2y_\3"+
		"\2\2\2yh\3\2\2\2yk\3\2\2\2yo\3\2\2\2ys\3\2\2\2yv\3\2\2\2z\r\3\2\2\2{|"+
		"\5\36\20\2|}\7\63\2\2}~\7\35\2\2~\u0086\3\2\2\2\177\u0080\5\36\20\2\u0080"+
		"\u0081\7\63\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7"+
		"\35\2\2\u0084\u0086\3\2\2\2\u0085{\3\2\2\2\u0085\177\3\2\2\2\u0086\17"+
		"\3\2\2\2\u0087\u0088\b\t\1\2\u0088\u0089\7,\2\2\u0089\u009a\5\20\t\t\u008a"+
		"\u008b\7\36\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7\37\2\2\u008d\u009a"+
		"\3\2\2\2\u008e\u008f\7\21\2\2\u008f\u0092\7\36\2\2\u0090\u0091\7\64\2"+
		"\2\u0091\u0093\7\"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\7\63\2\2\u0095\u009a\7\37\2\2\u0096\u009a\7\63\2"+
		"\2\u0097\u009a\7\64\2\2\u0098\u009a\5 \21\2\u0099\u0087\3\2\2\2\u0099"+
		"\u008a\3\2\2\2\u0099\u008e\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\u00b1\3\2\2\2\u009b\u009c\f\n\2\2\u009c"+
		"\u009d\5\30\r\2\u009d\u009e\5\20\t\13\u009e\u00b0\3\2\2\2\u009f\u00a0"+
		"\f\b\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\5\20\t\t\u00a2\u00b0\3\2\2"+
		"\2\u00a3\u00a4\f\7\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\5\20\t\b\u00a6"+
		"\u00b0\3\2\2\2\u00a7\u00ab\f\13\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\5"+
		"\20\t\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u009b\3\2"+
		"\2\2\u00af\u009f\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\21\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\5\26\f\2\u00b5\u00b7\5\24\13\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\t\2\2"+
		"\2\u00b9\25\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\t"+
		"\4\2\2\u00bd\31\3\2\2\2\u00be\u00bf\t\5\2\2\u00bf\33\3\2\2\2\u00c0\u00c1"+
		"\t\6\2\2\u00c1\35\3\2\2\2\u00c2\u00c5\7\25\2\2\u00c3\u00c5\7\26\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c9\7\27\2"+
		"\2\u00c7\u00c9\7\30\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"!\3\2\2\2\22%-\65BG]y\u0085\u0092\u0099\u00ad\u00af\u00b1\u00b6\u00c4"+
		"\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}