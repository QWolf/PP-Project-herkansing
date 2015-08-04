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
		RULE_program = 0, RULE_block = 1, RULE_function = 2, RULE_funcreturn = 3, 
		RULE_stat = 4, RULE_decl = 5, RULE_expr = 6, RULE_numOp = 7, RULE_boolOp = 8, 
		RULE_compOp = 9, RULE_type = 10, RULE_bool = 11;
	public static final String[] ruleNames = {
		"program", "block", "function", "funcreturn", "stat", "decl", "expr", 
		"numOp", "boolOp", "compOp", "type", "bool"
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode YALL() { return getToken(YallParser.YALL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
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
			setState(24); match(YALL);
			setState(25); match(ID);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << FUNCTION) | (1L << INPUT) | (1L << OUTPUT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(26); block();
				}
				}
				setState(31);
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
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
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
	public static class BlockFunctionContext extends BlockContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockFunctionContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).enterBlockFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YallListener ) ((YallListener)listener).exitBlockFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YallVisitor ) return ((YallVisitor<? extends T>)visitor).visitBlockFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case FUNCTION:
				_localctx = new BlockFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32); function();
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
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33); stat();
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YallParser.COMMA); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
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
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(FUNCTION);
			setState(37); match(ID);
			setState(38); match(INTO);
			setState(39); funcreturn();
			setState(40); match(LBLOCK);
			setState(53);
			_la = _input.LA(1);
			if (_la==INTEGER || _la==BOOLEAN) {
				{
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(41); type();
						setState(42); match(ID);
						setState(43); match(COMMA);
						}
						} 
					}
					setState(49);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(50); type();
				setState(51); match(ID);
				}
			}

			setState(55); match(RBLOCK);
			setState(56); match(LBRACE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << FUNCTION) | (1L << INPUT) | (1L << OUTPUT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(57); block();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(RBRACE);
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
		enterRule(_localctx, 6, RULE_funcreturn);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); type();
				setState(66); match(ID);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); match(NONE);
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(YallParser.WHILE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
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
		enterRule(_localctx, 8, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new StatDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71); decl();
				}
				break;
			case 2:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(ID);
				setState(73); match(IS);
				setState(74); expr(0);
				setState(75); match(SEMI);
				}
				break;
			case 3:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77); match(IF);
				setState(78); match(LBLOCK);
				setState(79); expr(0);
				setState(80); match(RBLOCK);
				setState(81); match(THEN);
				setState(82); match(LBRACE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << FUNCTION) | (1L << INPUT) | (1L << OUTPUT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(83); block();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89); match(RBRACE);
				setState(99);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(90); match(ELSE);
					setState(91); match(LBRACE);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << FUNCTION) | (1L << INPUT) | (1L << OUTPUT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
						{
						{
						setState(92); block();
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(98); match(RBRACE);
					}
				}

				}
				break;
			case 4:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101); match(WHILE);
				setState(102); match(LBLOCK);
				setState(103); expr(0);
				setState(104); match(RBLOCK);
				setState(105); match(DO);
				setState(106); match(LBRACE);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOCK) | (1L << UNLOCK) | (1L << FORK) | (1L << JOIN) | (1L << FUNCTION) | (1L << INPUT) | (1L << OUTPUT) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(107); block();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113); match(RBRACE);
				}
				break;
			case 5:
				_localctx = new StatInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115); match(INPUT);
				setState(116); match(ID);
				setState(117); match(SEMI);
				}
				break;
			case 6:
				_localctx = new StatOutputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118); match(OUTPUT);
				setState(119); expr(0);
				setState(120); match(SEMI);
				}
				break;
			case 7:
				_localctx = new StatLockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122); match(LOCK);
				setState(123); match(NUM);
				setState(124); match(SEMI);
				}
				break;
			case 8:
				_localctx = new StatUnlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(125); match(UNLOCK);
				setState(126); match(NUM);
				setState(127); match(SEMI);
				}
				break;
			case 9:
				_localctx = new StatForkContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(128); match(FORK);
				setState(129); match(NUM);
				setState(130); match(SEMI);
				}
				break;
			case 10:
				_localctx = new StatJoinContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(131); match(JOIN);
				setState(132); match(NUM);
				setState(133); match(SEMI);
				}
				break;
			case 11:
				_localctx = new StatFunctionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(134); match(ID);
				setState(135); match(LPAR);
				setState(145);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << TRUE) | (1L << FALSE) | (1L << LBLOCK) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(136); expr(0);
							setState(137); match(COMMA);
							}
							} 
						}
						setState(143);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(144); expr(0);
					}
				}

				setState(147); match(RPAR);
				setState(148); match(SEMI);
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
		enterRule(_localctx, 10, RULE_decl);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new DeclDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151); type();
				setState(152); match(ID);
				setState(153); match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclDeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155); type();
				setState(156); match(ID);
				setState(157); match(IS);
				setState(158); expr(0);
				setState(159); match(SEMI);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164); match(LBLOCK);
				setState(165); expr(0);
				setState(166); match(RBLOCK);
				}
				break;
			case 2:
				{
				_localctx = new ExprUpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); match(UP);
				setState(169); match(LPAR);
				setState(172);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(170); match(NUM);
					setState(171); match(COMMA);
					}
				}

				setState(174); match(ID);
				setState(175); match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176); match(NUM);
				}
				break;
			case 4:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177); bool();
				}
				break;
			case 5:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178); match(ID);
				setState(179); match(LPAR);
				setState(189);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << TRUE) | (1L << FALSE) | (1L << LBLOCK) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(180); expr(0);
							setState(181); match(COMMA);
							}
							} 
						}
						setState(187);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					setState(188); expr(0);
					}
				}

				setState(191); match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprNumOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196); numOp();
						setState(197); expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(200); boolOp();
						setState(201); expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(204); compOp();
						setState(205); expr(7);
						}
						break;
					}
					} 
				}
				setState(211);
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
		enterRule(_localctx, 14, RULE_numOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 16, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 18, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218); match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219); match(BOOLEAN);
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
		enterRule(_localctx, 22, RULE_bool);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(FALSE);
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
		case 6: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00e5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\5"+
		"\3%\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\6\5\6f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\6\5"+
		"\6\u0094\n\6\3\6\3\6\5\6\u0098\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00a4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\3"+
		"\b\5\b\u00c0\n\b\3\b\3\b\5\b\u00c4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00d2\n\b\f\b\16\b\u00d5\13\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\5\f\u00df\n\f\3\r\3\r\5\r\u00e3\n\r\3\r\2\3\16\16\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\2\5\3\2$\'\3\2()\3\2*/\u00fc\2\32\3\2\2\2\4$"+
		"\3\2\2\2\6&\3\2\2\2\bG\3\2\2\2\n\u0097\3\2\2\2\f\u00a3\3\2\2\2\16\u00c3"+
		"\3\2\2\2\20\u00d6\3\2\2\2\22\u00d8\3\2\2\2\24\u00da\3\2\2\2\26\u00de\3"+
		"\2\2\2\30\u00e2\3\2\2\2\32\33\7\3\2\2\33\37\7\60\2\2\34\36\5\4\3\2\35"+
		"\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2"+
		"\2\"%\5\6\4\2#%\5\n\6\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\16\2\2\'"+
		"(\7\60\2\2()\7\20\2\2)*\5\b\5\2*\67\7\35\2\2+,\5\26\f\2,-\7\60\2\2-.\7"+
		"!\2\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\64\65\5\26\f\2\65\66\7\60\2\2\668\3\2\2\2\67"+
		"\61\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\36\2\2:>\7\32\2\2;=\5\4\3\2<;\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\33\2\2B\7"+
		"\3\2\2\2CD\5\26\f\2DE\7\60\2\2EH\3\2\2\2FH\7\17\2\2GC\3\2\2\2GF\3\2\2"+
		"\2H\t\3\2\2\2I\u0098\5\f\7\2JK\7\60\2\2KL\7\4\2\2LM\5\16\b\2MN\7\34\2"+
		"\2N\u0098\3\2\2\2OP\7\5\2\2PQ\7\35\2\2QR\5\16\b\2RS\7\36\2\2ST\7\6\2\2"+
		"TX\7\32\2\2UW\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2"+
		"\2ZX\3\2\2\2[e\7\33\2\2\\]\7\7\2\2]a\7\32\2\2^`\5\4\3\2_^\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2df\7\33\2\2e\\\3\2\2\2e"+
		"f\3\2\2\2f\u0098\3\2\2\2gh\7\b\2\2hi\7\35\2\2ij\5\16\b\2jk\7\36\2\2kl"+
		"\7\r\2\2lp\7\32\2\2mo\5\4\3\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"qs\3\2\2\2rp\3\2\2\2st\7\33\2\2t\u0098\3\2\2\2uv\7\22\2\2vw\7\60\2\2w"+
		"\u0098\7\34\2\2xy\7\23\2\2yz\5\16\b\2z{\7\34\2\2{\u0098\3\2\2\2|}\7\t"+
		"\2\2}~\7\61\2\2~\u0098\7\34\2\2\177\u0080\7\n\2\2\u0080\u0081\7\61\2\2"+
		"\u0081\u0098\7\34\2\2\u0082\u0083\7\13\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\u0098\7\34\2\2\u0085\u0086\7\f\2\2\u0086\u0087\7\61\2\2\u0087\u0098\7"+
		"\34\2\2\u0088\u0089\7\60\2\2\u0089\u0093\7\30\2\2\u008a\u008b\5\16\b\2"+
		"\u008b\u008c\7!\2\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\5\16\b\2\u0093\u008f\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\31\2\2\u0096\u0098\7\34\2\2\u0097"+
		"I\3\2\2\2\u0097J\3\2\2\2\u0097O\3\2\2\2\u0097g\3\2\2\2\u0097u\3\2\2\2"+
		"\u0097x\3\2\2\2\u0097|\3\2\2\2\u0097\177\3\2\2\2\u0097\u0082\3\2\2\2\u0097"+
		"\u0085\3\2\2\2\u0097\u0088\3\2\2\2\u0098\13\3\2\2\2\u0099\u009a\5\26\f"+
		"\2\u009a\u009b\7\60\2\2\u009b\u009c\7\34\2\2\u009c\u00a4\3\2\2\2\u009d"+
		"\u009e\5\26\f\2\u009e\u009f\7\60\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5"+
		"\16\b\2\u00a1\u00a2\7\34\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\b\b\1\2\u00a6\u00a7\7\35\2"+
		"\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7\36\2\2\u00a9\u00c4\3\2\2\2\u00aa"+
		"\u00ab\7\21\2\2\u00ab\u00ae\7\30\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00af"+
		"\7!\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\60\2\2\u00b1\u00c4\7\31\2\2\u00b2\u00c4\7\61\2\2\u00b3\u00c4"+
		"\5\30\r\2\u00b4\u00b5\7\60\2\2\u00b5\u00bf\7\30\2\2\u00b6\u00b7\5\16\b"+
		"\2\u00b7\u00b8\7!\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c0\5\16\b\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\7\31\2\2\u00c2\u00c4\7\60\2\2\u00c3"+
		"\u00a5\3\2\2\2\u00c3\u00aa\3\2\2\2\u00c3\u00b2\3\2\2\2\u00c3\u00b3\3\2"+
		"\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00d3\3\2\2\2\u00c5"+
		"\u00c6\f\n\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\5\16\b\13\u00c8\u00d2"+
		"\3\2\2\2\u00c9\u00ca\f\t\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\5\16\b\n"+
		"\u00cc\u00d2\3\2\2\2\u00cd\u00ce\f\b\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0"+
		"\5\16\b\t\u00d0\u00d2\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9\3\2\2\2"+
		"\u00d1\u00cd\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\17\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7"+
		"\21\3\2\2\2\u00d8\u00d9\t\3\2\2\u00d9\23\3\2\2\2\u00da\u00db\t\4\2\2\u00db"+
		"\25\3\2\2\2\u00dc\u00df\7\24\2\2\u00dd\u00df\7\25\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00e3\7\26\2\2\u00e1\u00e3"+
		"\7\27\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\31\3\2\2\2\30"+
		"\37$\61\67>GXaep\u008f\u0093\u0097\u00a3\u00ae\u00bb\u00bf\u00c3\u00d1"+
		"\u00d3\u00de\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}