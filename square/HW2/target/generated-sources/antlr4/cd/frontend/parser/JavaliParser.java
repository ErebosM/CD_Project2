// Generated from Javali.g4 by ANTLR 4.4

	// Java header
	package cd.frontend.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		Bool=40, Integer=41, Identifier=42, COMMENT=43, LINE_COMMENT=44, WS=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'new'", "'return'", "'!='", "'class'", "'||'", "'while'", 
		"'void'", "';'", "'{'", "'&&'", "'='", "'}'", "'extends'", "'if'", "'<='", 
		"'int'", "'null'", "'('", "'*'", "'this'", "','", "'.'", "'boolean'", 
		"'write'", "'>='", "'writeln'", "'['", "'=='", "'<'", "']'", "'>'", "'!'", 
		"'%'", "'read'", "'else'", "')'", "'+'", "'-'", "Bool", "Integer", "Identifier", 
		"COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_primitiveType = 0, RULE_type = 1, RULE_referenceType = 2, RULE_arrayType = 3, 
		RULE_unit = 4, RULE_classDecl = 5, RULE_memberlist = 6, RULE_varDecl = 7, 
		RULE_methodDecl = 8, RULE_formalParamList = 9, RULE_stmt = 10, RULE_stmtBlock = 11, 
		RULE_methodCallStmt = 12, RULE_assignmentStmt = 13, RULE_ifStmt = 14, 
		RULE_whileStmt = 15, RULE_returnStmt = 16, RULE_writeStmt = 17, RULE_newExpr = 18, 
		RULE_readExpr = 19, RULE_methodCallExpr = 20, RULE_actualParamList = 21, 
		RULE_identAccess = 22, RULE_expr = 23, RULE_literal = 24;
	public static final String[] ruleNames = {
		"primitiveType", "type", "referenceType", "arrayType", "unit", "classDecl", 
		"memberlist", "varDecl", "methodDecl", "formalParamList", "stmt", "stmtBlock", 
		"methodCallStmt", "assignmentStmt", "ifStmt", "whileStmt", "returnStmt", 
		"writeStmt", "newExpr", "readExpr", "methodCallExpr", "actualParamList", 
		"identAccess", "expr", "literal"
	};

	@Override
	public String getGrammarFileName() { return "Javali.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__15) ) {
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
	public static class REFContext extends TypeContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public REFContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterREF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitREF(this);
		}
	}
	public static class PRIMContext extends TypeContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PRIMContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterPRIM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitPRIM(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PRIMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52); primitiveType();
				}
				break;
			case 2:
				_localctx = new REFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53); referenceType();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaliParser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_referenceType);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); arrayType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaliParser.Identifier, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); match(Identifier);
				setState(61); match(T__11);
				setState(62); match(T__8);
				}
				break;
			case T__22:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); primitiveType();
				setState(64); match(T__11);
				setState(65); match(T__8);
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

	public static class UnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaliParser.EOF, 0); }
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69); classDecl();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__34 );
			setState(74); match(EOF);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaliParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaliParser.Identifier, i);
		}
		public MemberlistContext memberlist() {
			return getRuleContext(MemberlistContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(T__34);
			setState(77); match(Identifier);
			setState(80);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(78); match(T__25);
				setState(79); match(Identifier);
				}
			}

			setState(82); match(T__29);
			setState(83); memberlist();
			setState(84); match(T__26);
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

	public static class MemberlistContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public MemberlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMemberlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMemberlist(this);
		}
	}

	public final MemberlistContext memberlist() throws RecognitionException {
		MemberlistContext _localctx = new MemberlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__22) | (1L << T__15) | (1L << Identifier))) != 0)) {
				{
				setState(88);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(86); varDecl();
					}
					break;
				case 2:
					{
					setState(87); methodDecl();
					}
					break;
				}
				}
				setState(92);
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

	public static class VarDeclContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaliParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaliParser.Identifier, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); type();
			setState(94); match(Identifier);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(95); match(T__17);
				setState(96); match(Identifier);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(T__30);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaliParser.Identifier, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			switch (_input.LA(1)) {
			case T__22:
			case T__15:
			case Identifier:
				{
				setState(104); type();
				}
				break;
			case T__31:
				{
				setState(105); match(T__31);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108); match(Identifier);
			setState(109); match(T__20);
			setState(111);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__15) | (1L << Identifier))) != 0)) {
				{
				setState(110); formalParamList();
				}
			}

			setState(113); match(T__2);
			setState(114); match(T__29);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115); varDecl();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__32) | (1L << T__24) | (1L << T__18) | (1L << T__14) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				{
				setState(121); stmt();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); match(T__26);
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

	public static class FormalParamListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaliParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaliParser.Identifier, i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public FormalParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterFormalParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitFormalParamList(this);
		}
	}

	public final FormalParamListContext formalParamList() throws RecognitionException {
		FormalParamListContext _localctx = new FormalParamListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); type();
			setState(130); match(Identifier);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(131); match(T__17);
				setState(132); type();
				setState(133); match(Identifier);
				}
				}
				setState(139);
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

	public static class StmtContext extends ParserRuleContext {
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public MethodCallStmtContext methodCallStmt() {
			return getRuleContext(MethodCallStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); methodCallStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144); returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145); writeStmt();
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

	public static class StmtBlockContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitStmtBlock(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__29);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__32) | (1L << T__24) | (1L << T__18) | (1L << T__14) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				{
				setState(149); stmt();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155); match(T__26);
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public MethodCallExprContext methodCallExpr() {
			return getRuleContext(MethodCallExprContext.class,0);
		}
		public MethodCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMethodCallStmt(this);
		}
	}

	public final MethodCallStmtContext methodCallStmt() throws RecognitionException {
		MethodCallStmtContext _localctx = new MethodCallStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); methodCallExpr();
			setState(158); match(T__30);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public IdentAccessContext identAccess() {
			return getRuleContext(IdentAccessContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitAssignmentStmt(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); identAccess(0);
			setState(161); match(T__27);
			setState(165);
			switch (_input.LA(1)) {
			case T__21:
			case T__20:
			case T__18:
			case T__6:
			case T__1:
			case T__0:
			case Bool:
			case Integer:
			case Identifier:
				{
				setState(162); expr(0);
				}
				break;
			case T__37:
				{
				setState(163); newExpr();
				}
				break;
			case T__4:
				{
				setState(164); readExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167); match(T__30);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtBlockContext> stmtBlock() {
			return getRuleContexts(StmtBlockContext.class);
		}
		public StmtBlockContext stmtBlock(int i) {
			return getRuleContext(StmtBlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(T__24);
			setState(170); match(T__20);
			setState(171); expr(0);
			setState(172); match(T__2);
			setState(173); stmtBlock();
			setState(176);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(174); match(T__3);
				setState(175); stmtBlock();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(T__32);
			setState(179); match(T__20);
			setState(180); expr(0);
			setState(181); match(T__2);
			setState(182); stmtBlock();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(T__36);
			setState(186);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Bool) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				setState(185); expr(0);
				}
			}

			setState(188); match(T__30);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitWriteStmt(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(190); match(T__14);
				setState(191); match(T__20);
				setState(192); expr(0);
				setState(193); match(T__2);
				}
				break;
			case T__12:
				{
				setState(195); match(T__12);
				setState(196); match(T__20);
				setState(197); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200); match(T__30);
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

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaliParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitNewExpr(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(T__37);
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(203); match(Identifier);
				setState(204); match(T__20);
				setState(205); match(T__2);
				}
				break;
			case 2:
				{
				setState(206); match(Identifier);
				setState(207); match(T__11);
				setState(208); expr(0);
				setState(209); match(T__8);
				}
				break;
			case 3:
				{
				setState(211); primitiveType();
				setState(212); match(T__11);
				setState(213); expr(0);
				setState(214); match(T__8);
				}
				break;
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

	public static class ReadExprContext extends ParserRuleContext {
		public ReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitReadExpr(this);
		}
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(T__4);
			setState(219); match(T__20);
			setState(220); match(T__2);
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

	public static class MethodCallExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaliParser.Identifier, 0); }
		public ActualParamListContext actualParamList() {
			return getRuleContext(ActualParamListContext.class,0);
		}
		public IdentAccessContext identAccess() {
			return getRuleContext(IdentAccessContext.class,0);
		}
		public MethodCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMethodCallExpr(this);
		}
	}

	public final MethodCallExprContext methodCallExpr() throws RecognitionException {
		MethodCallExprContext _localctx = new MethodCallExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodCallExpr);
		int _la;
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); match(Identifier);
				setState(223); match(T__20);
				setState(225);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Bool) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(224); actualParamList();
					}
				}

				setState(227); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); identAccess(0);
				setState(229); match(T__16);
				setState(230); match(Identifier);
				setState(231); match(T__20);
				setState(233);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Bool) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(232); actualParamList();
					}
				}

				setState(235); match(T__2);
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

	public static class ActualParamListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ActualParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterActualParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitActualParamList(this);
		}
	}

	public final ActualParamListContext actualParamList() throws RecognitionException {
		ActualParamListContext _localctx = new ActualParamListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_actualParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); expr(0);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(240); match(T__17);
				setState(241); expr(0);
				}
				}
				setState(246);
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

	public static class IdentAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaliParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActualParamListContext actualParamList() {
			return getRuleContext(ActualParamListContext.class,0);
		}
		public IdentAccessContext identAccess() {
			return getRuleContext(IdentAccessContext.class,0);
		}
		public IdentAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterIdentAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitIdentAccess(this);
		}
	}

	public final IdentAccessContext identAccess() throws RecognitionException {
		return identAccess(0);
	}

	private IdentAccessContext identAccess(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentAccessContext _localctx = new IdentAccessContext(_ctx, _parentState);
		IdentAccessContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_identAccess, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(248); match(Identifier);
				}
				break;
			case 2:
				{
				setState(249); match(T__18);
				}
				break;
			case 3:
				{
				setState(250); match(Identifier);
				setState(251); match(T__20);
				setState(253);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Bool) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(252); actualParamList();
					}
				}

				setState(255); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new IdentAccessContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identAccess);
						setState(258);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(259); match(T__16);
						setState(260); match(Identifier);
						}
						break;
					case 2:
						{
						_localctx = new IdentAccessContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identAccess);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262); match(T__11);
						setState(263); expr(0);
						setState(264); match(T__8);
						}
						break;
					case 3:
						{
						_localctx = new IdentAccessContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identAccess);
						setState(266);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(267); match(T__16);
						setState(268); match(Identifier);
						setState(269); match(T__20);
						setState(271);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Bool) | (1L << Integer) | (1L << Identifier))) != 0)) {
							{
							setState(270); actualParamList();
							}
						}

						setState(273); match(T__2);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class CASTContext extends ExprContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CASTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitCAST(this);
		}
	}
	public static class COMPContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public COMPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterCOMP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitCOMP(this);
		}
	}
	public static class BRACKETSContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BRACKETSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterBRACKETS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitBRACKETS(this);
		}
	}
	public static class ADDContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ADDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitADD(this);
		}
	}
	public static class ORContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitOR(this);
		}
	}
	public static class MULContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MULContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMUL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMUL(this);
		}
	}
	public static class LITContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LITContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterLIT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitLIT(this);
		}
	}
	public static class ANDContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ANDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitAND(this);
		}
	}
	public static class EQUContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EQUContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterEQU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitEQU(this);
		}
	}
	public static class UNARYContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UNARYContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterUNARY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitUNARY(this);
		}
	}
	public static class IDENTACCContext extends ExprContext {
		public IdentAccessContext identAccess() {
			return getRuleContext(IdentAccessContext.class,0);
		}
		public IDENTACCContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterIDENTACC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitIDENTACC(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new UNARYContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__1) | (1L << T__0))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(281); expr(8);
				}
				break;
			case 2:
				{
				_localctx = new CASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282); match(T__20);
				setState(283); referenceType();
				setState(284); match(T__2);
				setState(285); expr(7);
				}
				break;
			case 3:
				{
				_localctx = new LITContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287); literal();
				}
				break;
			case 4:
				{
				_localctx = new IDENTACCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); identAccess(0);
				}
				break;
			case 5:
				{
				_localctx = new BRACKETSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289); match(T__20);
				setState(290); expr(0);
				setState(291); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MULContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(296);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__19) | (1L << T__5))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(297); expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(299);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(300); expr(6);
						}
						break;
					case 3:
						{
						_localctx = new COMPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(302);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__13) | (1L << T__9) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(303); expr(5);
						}
						break;
					case 4:
						{
						_localctx = new EQUContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(305);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(306); expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ANDContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(308); match(T__28);
						setState(309); expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(311); match(T__33);
						setState(312); expr(2);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LITNULLContext extends LiteralContext {
		public LITNULLContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterLITNULL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitLITNULL(this);
		}
	}
	public static class LITINTContext extends LiteralContext {
		public TerminalNode Integer() { return getToken(JavaliParser.Integer, 0); }
		public LITINTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterLITINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitLITINT(this);
		}
	}
	public static class LITBOOLContext extends LiteralContext {
		public TerminalNode Bool() { return getToken(JavaliParser.Bool, 0); }
		public LITBOOLContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterLITBOOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitLITBOOL(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new LITINTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(Integer);
				}
				break;
			case Bool:
				_localctx = new LITBOOLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(Bool);
				}
				break;
			case T__21:
				_localctx = new LITNULLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320); match(T__21);
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
		case 22: return identAccess_sempred((IdentAccessContext)_localctx, predIndex);
		case 23: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean identAccess_sempred(IdentAccessContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 3);
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 6);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		case 8: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\5\39\n\3\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5F\n\5\3\6\6\6I\n\6\r\6\16\6J\3\6\3\6\3\7\3\7\3\7\3\7\5\7"+
		"S\n\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\t\3\t\3\t\3\t"+
		"\7\td\n\t\f\t\16\tg\13\t\3\t\3\t\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\5\nr\n\n"+
		"\3\n\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3\r\3\r\7\r\u0099\n\r\f\r"+
		"\16\r\u009c\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00a8\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b3\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00bd\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00db\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00e4\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u00ec\n\26\3\26\3\26\5\26\u00f0\n\26\3\27"+
		"\3\27\3\27\7\27\u00f5\n\27\f\27\16\27\u00f8\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0100\n\30\3\30\5\30\u0103\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0112\n\30\3\30\7\30"+
		"\u0115\n\30\f\30\16\30\u0118\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0128\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u013c\n\31\f\31\16\31\u013f\13\31\3\32\3\32\3\32\5\32\u0144\n\32"+
		"\3\32\2\4.\60\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\b\4\2\23\23\32\32\4\2##()\5\2\3\3\26\26$$\3\2()\6\2\22\22\34\34  \""+
		"\"\4\2\6\6\37\37\u015d\2\64\3\2\2\2\48\3\2\2\2\6<\3\2\2\2\bE\3\2\2\2\n"+
		"H\3\2\2\2\fN\3\2\2\2\16\\\3\2\2\2\20_\3\2\2\2\22l\3\2\2\2\24\u0083\3\2"+
		"\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u009f\3\2\2\2\34\u00a2\3\2\2"+
		"\2\36\u00ab\3\2\2\2 \u00b4\3\2\2\2\"\u00ba\3\2\2\2$\u00c8\3\2\2\2&\u00cc"+
		"\3\2\2\2(\u00dc\3\2\2\2*\u00ef\3\2\2\2,\u00f1\3\2\2\2.\u0102\3\2\2\2\60"+
		"\u0127\3\2\2\2\62\u0143\3\2\2\2\64\65\t\2\2\2\65\3\3\2\2\2\669\5\2\2\2"+
		"\679\5\6\4\28\66\3\2\2\28\67\3\2\2\29\5\3\2\2\2:=\7,\2\2;=\5\b\5\2<:\3"+
		"\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7,\2\2?@\7\36\2\2@F\7!\2\2AB\5\2\2\2BC\7"+
		"\36\2\2CD\7!\2\2DF\3\2\2\2E>\3\2\2\2EA\3\2\2\2F\t\3\2\2\2GI\5\f\7\2HG"+
		"\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\2\2\3M\13\3\2\2\2"+
		"NO\7\7\2\2OR\7,\2\2PQ\7\20\2\2QS\7,\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2"+
		"TU\7\f\2\2UV\5\16\b\2VW\7\17\2\2W\r\3\2\2\2X[\5\20\t\2Y[\5\22\n\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\17\3\2\2\2^\\\3\2\2"+
		"\2_`\5\4\3\2`e\7,\2\2ab\7\30\2\2bd\7,\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\13\2\2i\21\3\2\2\2jm\5\4\3\2km\7"+
		"\n\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\7,\2\2oq\7\25\2\2pr\5\24\13\2q"+
		"p\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\'\2\2tx\7\f\2\2uw\5\20\t\2vu\3\2\2\2"+
		"wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y~\3\2\2\2zx\3\2\2\2{}\5\26\f\2|{\3\2\2"+
		"\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2"+
		"\2\2\u0081\u0082\7\17\2\2\u0082\23\3\2\2\2\u0083\u0084\5\4\3\2\u0084\u008b"+
		"\7,\2\2\u0085\u0086\7\30\2\2\u0086\u0087\5\4\3\2\u0087\u0088\7,\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0095"+
		"\5\34\17\2\u008f\u0095\5\32\16\2\u0090\u0095\5\36\20\2\u0091\u0095\5 "+
		"\21\2\u0092\u0095\5\"\22\2\u0093\u0095\5$\23\2\u0094\u008e\3\2\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\27\3\2\2\2\u0096\u009a\7\f\2\2\u0097\u0099"+
		"\5\26\f\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\7\17\2\2\u009e\31\3\2\2\2\u009f\u00a0\5*\26\2\u00a0\u00a1\7\13\2\2\u00a1"+
		"\33\3\2\2\2\u00a2\u00a3\5.\30\2\u00a3\u00a7\7\16\2\2\u00a4\u00a8\5\60"+
		"\31\2\u00a5\u00a8\5&\24\2\u00a6\u00a8\5(\25\2\u00a7\u00a4\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\13"+
		"\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad\7\25\2\2\u00ad"+
		"\u00ae\5\60\31\2\u00ae\u00af\7\'\2\2\u00af\u00b2\5\30\r\2\u00b0\u00b1"+
		"\7&\2\2\u00b1\u00b3\5\30\r\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\37\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00b7\5\60"+
		"\31\2\u00b7\u00b8\7\'\2\2\u00b8\u00b9\5\30\r\2\u00b9!\3\2\2\2\u00ba\u00bc"+
		"\7\5\2\2\u00bb\u00bd\5\60\31\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\7\13\2\2\u00bf#\3\2\2\2\u00c0\u00c1\7"+
		"\33\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\5\60\31\2\u00c3\u00c4\7\'\2\2"+
		"\u00c4\u00c9\3\2\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c9"+
		"\7\'\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\13\2\2\u00cb%\3\2\2\2\u00cc\u00da\7\4\2\2\u00cd\u00ce\7,\2\2"+
		"\u00ce\u00cf\7\25\2\2\u00cf\u00db\7\'\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2"+
		"\7\36\2\2\u00d2\u00d3\5\60\31\2\u00d3\u00d4\7!\2\2\u00d4\u00db\3\2\2\2"+
		"\u00d5\u00d6\5\2\2\2\u00d6\u00d7\7\36\2\2\u00d7\u00d8\5\60\31\2\u00d8"+
		"\u00d9\7!\2\2\u00d9\u00db\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00d0\3\2"+
		"\2\2\u00da\u00d5\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00dd\7%\2\2\u00dd\u00de"+
		"\7\25\2\2\u00de\u00df\7\'\2\2\u00df)\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1"+
		"\u00e3\7\25\2\2\u00e2\u00e4\5,\27\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f0\7\'\2\2\u00e6\u00e7\5.\30\2\u00e7"+
		"\u00e8\7\31\2\2\u00e8\u00e9\7,\2\2\u00e9\u00eb\7\25\2\2\u00ea\u00ec\5"+
		",\27\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\7\'\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e6\3\2"+
		"\2\2\u00f0+\3\2\2\2\u00f1\u00f6\5\60\31\2\u00f2\u00f3\7\30\2\2\u00f3\u00f5"+
		"\5\60\31\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7-\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b"+
		"\30\1\2\u00fa\u0103\7,\2\2\u00fb\u0103\7\27\2\2\u00fc\u00fd\7,\2\2\u00fd"+
		"\u00ff\7\25\2\2\u00fe\u0100\5,\27\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\'\2\2\u0102\u00f9\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0103\u0116\3\2\2\2\u0104\u0105\f\6"+
		"\2\2\u0105\u0106\7\31\2\2\u0106\u0115\7,\2\2\u0107\u0108\f\5\2\2\u0108"+
		"\u0109\7\36\2\2\u0109\u010a\5\60\31\2\u010a\u010b\7!\2\2\u010b\u0115\3"+
		"\2\2\2\u010c\u010d\f\3\2\2\u010d\u010e\7\31\2\2\u010e\u010f\7,\2\2\u010f"+
		"\u0111\7\25\2\2\u0110\u0112\5,\27\2\u0111\u0110\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\'\2\2\u0114\u0104\3\2\2\2\u0114"+
		"\u0107\3\2\2\2\u0114\u010c\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117/\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a"+
		"\b\31\1\2\u011a\u011b\t\3\2\2\u011b\u0128\5\60\31\n\u011c\u011d\7\25\2"+
		"\2\u011d\u011e\5\6\4\2\u011e\u011f\7\'\2\2\u011f\u0120\5\60\31\t\u0120"+
		"\u0128\3\2\2\2\u0121\u0128\5\62\32\2\u0122\u0128\5.\30\2\u0123\u0124\7"+
		"\25\2\2\u0124\u0125\5\60\31\2\u0125\u0126\7\'\2\2\u0126\u0128\3\2\2\2"+
		"\u0127\u0119\3\2\2\2\u0127\u011c\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0122"+
		"\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u013d\3\2\2\2\u0129\u012a\f\b\2\2\u012a"+
		"\u012b\t\4\2\2\u012b\u013c\5\60\31\t\u012c\u012d\f\7\2\2\u012d\u012e\t"+
		"\5\2\2\u012e\u013c\5\60\31\b\u012f\u0130\f\6\2\2\u0130\u0131\t\6\2\2\u0131"+
		"\u013c\5\60\31\7\u0132\u0133\f\5\2\2\u0133\u0134\t\7\2\2\u0134\u013c\5"+
		"\60\31\6\u0135\u0136\f\4\2\2\u0136\u0137\7\r\2\2\u0137\u013c\5\60\31\5"+
		"\u0138\u0139\f\3\2\2\u0139\u013a\7\b\2\2\u013a\u013c\5\60\31\4\u013b\u0129"+
		"\3\2\2\2\u013b\u012c\3\2\2\2\u013b\u012f\3\2\2\2\u013b\u0132\3\2\2\2\u013b"+
		"\u0135\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\61\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144"+
		"\7+\2\2\u0141\u0144\7*\2\2\u0142\u0144\7\24\2\2\u0143\u0140\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\63\3\2\2\2#8<EJRZ\\elqx~\u008b"+
		"\u0094\u009a\u00a7\u00b2\u00bc\u00c8\u00da\u00e3\u00eb\u00ef\u00f6\u00ff"+
		"\u0102\u0111\u0114\u0116\u0127\u013b\u013d\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}