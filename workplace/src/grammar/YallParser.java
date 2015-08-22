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
		RULE_addExpr = 9, RULE_multExpr = 10, RULE_intExpr = 11, RULE_idExpr = 12, 
		RULE_addOp = 13, RULE_multOp = 14, RULE_boolOp = 15, RULE_compOp = 16, 
		RULE_compEqOp = 17, RULE_type = 18, RULE_bool = 19;
	public static final String[] ruleNames = {
		"program", "init", "toplevelblock", "toplevelblockPart", "block", "stat", 
		"decl", "expr", "boolExpr", "addExpr", "multExpr", "intExpr", "idExpr", 
		"addOp", "multOp", "boolOp", "compOp", "compEqOp", "type", "bool"
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
			setState(40); match(YALL);
			setState(41); match(ID);
			setState(43);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(42); init();
				}
			}

			setState(45); toplevelblock();
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
			setState(47); match(GLOBAL);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==BOOLEAN) {
				{
				{
				setState(48); decl();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(LOCAL);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << OUTPUTBOOL) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(56); toplevelblockPart();
				}
				}
				setState(61);
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
			setState(72);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case LOCK:
			case UNLOCK:
			case OUTPUTBOOL:
			case INTEGER:
			case BOOLEAN:
			case ID:
				_localctx = new ToplvlStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62); stat();
				}
				break;
			case FORK:
				_localctx = new ToplvlForkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(FORK);
				setState(64); match(ID);
				setState(65); match(LPAR);
				setState(66); toplevelblock();
				setState(67); match(RPAR);
				}
				break;
			case JOIN:
				_localctx = new ToplvlJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69); match(JOIN);
				setState(70); match(ID);
				setState(71); match(SEMI);
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << OUTPUTBOOL) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(74); stat();
				}
				}
				setState(79);
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
			setState(120);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
				_localctx = new StatDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80); decl();
				}
				break;
			case ID:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(ID);
				setState(82); match(IS);
				setState(83); expr();
				setState(84); match(SEMI);
				}
				break;
			case IF:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86); match(IF);
				setState(87); match(LBLOCK);
				setState(88); boolExpr(0);
				setState(89); match(RBLOCK);
				setState(90); match(THEN);
				setState(91); match(LBRACE);
				setState(92); block();
				setState(93); match(RBRACE);
				setState(99);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(94); match(ELSE);
					setState(95); match(LBRACE);
					setState(96); block();
					setState(97); match(RBRACE);
					}
				}

				}
				break;
			case WHILE:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101); match(WHILE);
				setState(102); match(LBLOCK);
				setState(103); boolExpr(0);
				setState(104); match(RBLOCK);
				setState(105); match(DO);
				setState(106); match(LBRACE);
				setState(107); block();
				setState(108); match(RBRACE);
				}
				break;
			case OUTPUTBOOL:
				_localctx = new StatOutputBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110); match(OUTPUTBOOL);
				setState(111); boolExpr(0);
				setState(112); match(SEMI);
				}
				break;
			case LOCK:
				_localctx = new StatLockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114); match(LOCK);
				setState(115); match(ID);
				setState(116); match(SEMI);
				}
				break;
			case UNLOCK:
				_localctx = new StatUnlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117); match(UNLOCK);
				setState(118); match(ID);
				setState(119); match(SEMI);
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
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DeclDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122); type();
				setState(123); match(ID);
				setState(124); match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126); type();
				setState(127); match(ID);
				setState(128); match(IS);
				setState(129); expr();
				setState(130); match(SEMI);
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
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprNumExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134); addExpr(0);
				}
				break;
			case 2:
				_localctx = new ExprBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135); boolExpr(0);
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
	public static class BoolExprCompEqOpAddContext extends BoolExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public CompEqOpContext compEqOp() {
			return getRuleContext(CompEqOpContext.class,0);
		}
		public BoolExprCompEqOpAddContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprCompEqOpAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprCompEqOpAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprCompEqOpAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprBoolContext extends BoolExprContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolExprBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprIDExprContext extends BoolExprContext {
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public BoolExprIDExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBoolExprIDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBoolExprIDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBoolExprIDExpr(this);
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

				setState(139); match(NOT);
				setState(140); boolExpr(6);
				}
				break;
			case 2:
				{
				_localctx = new BoolParantesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); match(LPAR);
				setState(142); boolExpr(0);
				setState(143); match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new BoolExprCompOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); addExpr(0);
				setState(146); compOp();
				setState(147); addExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolExprCompEqOpAddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); addExpr(0);
				setState(150); compEqOp();
				setState(151); addExpr(0);
				}
				break;
			case 5:
				{
				_localctx = new BoolExprIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); idExpr();
				}
				break;
			case 6:
				{
				_localctx = new BoolExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); bool();
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
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158); boolOp();
						setState(159); boolExpr(8);
						}
						break;
					case 2:
						{
						_localctx = new BoolExprCompEqOpBoolContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(162); compEqOp();
						setState(163); boolExpr(4);
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
	public static class MultExprIntExprContext extends MultExprContext {
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public MultExprIntExprContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterMultExprIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitMultExprIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitMultExprIntExpr(this);
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
			case LBLOCK:
			case ID:
			case NUM:
				{
				_localctx = new MultExprIntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); intExpr(0);
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

	public static class IntExprContext extends ParserRuleContext {
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
	 
		public IntExprContext() { }
		public void copyFrom(IntExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntExprNumContext extends IntExprContext {
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public IntExprNumContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIntExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIntExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIntExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprIDExprContext extends IntExprContext {
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public IntExprIDExprContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIntExprIDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIntExprIDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIntExprIDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprSubContext extends IntExprContext {
		public List<TerminalNode> SUB() { return getTokens(YallParser.SUB); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode SUB(int i) {
			return getToken(YallParser.SUB, i);
		}
		public IntExprSubContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIntExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIntExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIntExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprAddContext extends IntExprContext {
		public List<TerminalNode> ADD() { return getTokens(YallParser.ADD); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode ADD(int i) {
			return getToken(YallParser.ADD, i);
		}
		public IntExprAddContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIntExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIntExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIntExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_intExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new IntExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200); match(NUM);
				}
				break;
			case UP:
			case LBLOCK:
			case ID:
				{
				_localctx = new IntExprIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); idExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprAddContext(new IntExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(205); match(ADD);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(208); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new IntExprSubContext(new IntExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(211); match(SUB);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(214); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class IdExprContext extends ParserRuleContext {
		public IdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpr; }
	 
		public IdExprContext() { }
		public void copyFrom(IdExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExprIDContext extends IdExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public IdExprIDContext(IdExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIdExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIdExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIdExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprUpContext extends IdExprContext {
		public TerminalNode ID() { return getToken(YallParser.ID, 0); }
		public TerminalNode UP() { return getToken(YallParser.UP, 0); }
		public TerminalNode NUM() { return getToken(YallParser.NUM, 0); }
		public TerminalNode COMMA() { return getToken(YallParser.COMMA, 0); }
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public IdExprUpContext(IdExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIdExprUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIdExprUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIdExprUp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprBlockContext extends IdExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(YallParser.RBLOCK, 0); }
		public TerminalNode LBLOCK() { return getToken(YallParser.LBLOCK, 0); }
		public IdExprBlockContext(IdExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterIdExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitIdExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitIdExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExprContext idExpr() throws RecognitionException {
		IdExprContext _localctx = new IdExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idExpr);
		int _la;
		try {
			setState(234);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdExprIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); match(ID);
				}
				break;
			case UP:
				_localctx = new IdExprUpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222); match(UP);
				setState(223); match(LBLOCK);
				setState(226);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(224); match(NUM);
					setState(225); match(COMMA);
					}
				}

				setState(228); match(ID);
				setState(229); match(RBLOCK);
				}
				break;
			case LBLOCK:
				_localctx = new IdExprBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230); match(LBLOCK);
				setState(231); expr();
				setState(232); match(RBLOCK);
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
		enterRule(_localctx, 26, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 28, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 30, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 32, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 34, RULE_compEqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246); match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247); match(BOOLEAN);
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
		enterRule(_localctx, 38, RULE_bool);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251); match(FALSE);
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
		case 11: return intExpr_sempred((IntExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 3);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\7\6N\n\6\f\6\16\6Q\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0087\n\b\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00bf\n\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f\3"+
		"\r\3\r\3\r\5\r\u00cd\n\r\3\r\3\r\6\r\u00d1\n\r\r\r\16\r\u00d2\3\r\3\r"+
		"\6\r\u00d7\n\r\r\r\16\r\u00d8\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00e5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ed\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\5\24\u00fb\n\24\3\25\3\25\5\25\u00ff\n\25\3\25\2\6\22\24\26\30\26\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2\'(\3\2)+\3\2,.\3\2\60"+
		"\63\3\2\64\65\u010f\2*\3\2\2\2\4\61\3\2\2\2\6=\3\2\2\2\bJ\3\2\2\2\nO\3"+
		"\2\2\2\fz\3\2\2\2\16\u0086\3\2\2\2\20\u008a\3\2\2\2\22\u009d\3\2\2\2\24"+
		"\u00ac\3\2\2\2\26\u00be\3\2\2\2\30\u00cc\3\2\2\2\32\u00ec\3\2\2\2\34\u00ee"+
		"\3\2\2\2\36\u00f0\3\2\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2$\u00f6\3\2\2"+
		"\2&\u00fa\3\2\2\2(\u00fe\3\2\2\2*+\7\3\2\2+-\7\66\2\2,.\5\4\3\2-,\3\2"+
		"\2\2-.\3\2\2\2./\3\2\2\2/\60\5\6\4\2\60\3\3\2\2\2\61\65\7\4\2\2\62\64"+
		"\5\16\b\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668"+
		"\3\2\2\2\67\65\3\2\2\289\7\5\2\29\5\3\2\2\2:<\5\b\5\2;:\3\2\2\2<?\3\2"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?=\3\2\2\2@K\5\f\7\2AB\7\r\2\2BC\7"+
		"\66\2\2CD\7\31\2\2DE\5\6\4\2EF\7\32\2\2FK\3\2\2\2GH\7\16\2\2HI\7\66\2"+
		"\2IK\7\35\2\2J@\3\2\2\2JA\3\2\2\2JG\3\2\2\2K\t\3\2\2\2LN\5\f\7\2ML\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QO\3\2\2\2R{\5\16\b\2ST"+
		"\7\66\2\2TU\7\6\2\2UV\5\20\t\2VW\7\35\2\2W{\3\2\2\2XY\7\7\2\2YZ\7\36\2"+
		"\2Z[\5\22\n\2[\\\7\37\2\2\\]\7\b\2\2]^\7\33\2\2^_\5\n\6\2_e\7\34\2\2`"+
		"a\7\t\2\2ab\7\33\2\2bc\5\n\6\2cd\7\34\2\2df\3\2\2\2e`\3\2\2\2ef\3\2\2"+
		"\2f{\3\2\2\2gh\7\n\2\2hi\7\36\2\2ij\5\22\n\2jk\7\37\2\2kl\7\17\2\2lm\7"+
		"\33\2\2mn\5\n\6\2no\7\34\2\2o{\3\2\2\2pq\7\23\2\2qr\5\22\n\2rs\7\35\2"+
		"\2s{\3\2\2\2tu\7\13\2\2uv\7\66\2\2v{\7\35\2\2wx\7\f\2\2xy\7\66\2\2y{\7"+
		"\35\2\2zR\3\2\2\2zS\3\2\2\2zX\3\2\2\2zg\3\2\2\2zp\3\2\2\2zt\3\2\2\2zw"+
		"\3\2\2\2{\r\3\2\2\2|}\5&\24\2}~\7\66\2\2~\177\7\35\2\2\177\u0087\3\2\2"+
		"\2\u0080\u0081\5&\24\2\u0081\u0082\7\66\2\2\u0082\u0083\7\6\2\2\u0083"+
		"\u0084\5\20\t\2\u0084\u0085\7\35\2\2\u0085\u0087\3\2\2\2\u0086|\3\2\2"+
		"\2\u0086\u0080\3\2\2\2\u0087\17\3\2\2\2\u0088\u008b\5\24\13\2\u0089\u008b"+
		"\5\22\n\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\21\3\2\2\2\u008c"+
		"\u008d\b\n\1\2\u008d\u008e\7/\2\2\u008e\u009e\5\22\n\b\u008f\u0090\7\31"+
		"\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\32\2\2\u0092\u009e\3\2\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\u0095\5\"\22\2\u0095\u0096\5\24\13\2\u0096\u009e"+
		"\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\5$\23\2\u0099\u009a\5\24\13"+
		"\2\u009a\u009e\3\2\2\2\u009b\u009e\5\32\16\2\u009c\u009e\5(\25\2\u009d"+
		"\u008c\3\2\2\2\u009d\u008f\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0097\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a9\3\2\2\2\u009f"+
		"\u00a0\f\t\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\5\22\n\n\u00a2\u00a8\3"+
		"\2\2\2\u00a3\u00a4\f\5\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\5\22\n\6\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\b\13\1\2\u00ad\u00ae\5\26\f\2\u00ae\u00b5\3\2\2\2"+
		"\u00af\u00b0\f\4\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\5\24\13\5\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9"+
		"\b\f\1\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7\32\2"+
		"\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\5\30\r\2\u00be\u00b8\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\f\5\2\2\u00c1\u00c2\5\36"+
		"\20\2\u00c2\u00c3\5\26\f\6\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\27\3\2\2"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\r\1\2\u00ca\u00cd\7\67\2\2\u00cb"+
		"\u00cd\5\32\16\2\u00cc\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00dc\3"+
		"\2\2\2\u00ce\u00d0\f\5\2\2\u00cf\u00d1\7%\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00db\3\2"+
		"\2\2\u00d4\u00d6\f\4\2\2\u00d5\u00d7\7&\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00ce\3\2\2\2\u00da\u00d4\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00dc\3\2\2"+
		"\2\u00df\u00ed\7\66\2\2\u00e0\u00e1\7\21\2\2\u00e1\u00e4\7\36\2\2\u00e2"+
		"\u00e3\7\67\2\2\u00e3\u00e5\7\"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\66\2\2\u00e7\u00ed\7\37\2\2\u00e8"+
		"\u00e9\7\36\2\2\u00e9\u00ea\5\20\t\2\u00ea\u00eb\7\37\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed"+
		"\33\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1"+
		"\37\3\2\2\2\u00f2\u00f3\t\4\2\2\u00f3!\3\2\2\2\u00f4\u00f5\t\5\2\2\u00f5"+
		"#\3\2\2\2\u00f6\u00f7\t\6\2\2\u00f7%\3\2\2\2\u00f8\u00fb\7\25\2\2\u00f9"+
		"\u00fb\7\26\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\'\3\2\2"+
		"\2\u00fc\u00ff\7\27\2\2\u00fd\u00ff\7\30\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff)\3\2\2\2\32-\65=JOez\u0086\u008a\u009d\u00a7\u00a9"+
		"\u00b5\u00be\u00c6\u00cc\u00d2\u00d8\u00da\u00dc\u00e4\u00ec\u00fa\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}