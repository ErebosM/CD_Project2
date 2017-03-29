// Generated from Javali.g4 by ANTLR 4.4

	// Java header
	package cd.frontend.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaliParser}.
 */
public interface JavaliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(@NotNull JavaliParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(@NotNull JavaliParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BRACKETS}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBRACKETS(@NotNull JavaliParser.BRACKETSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BRACKETS}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBRACKETS(@NotNull JavaliParser.BRACKETSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD(@NotNull JavaliParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD(@NotNull JavaliParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRIM}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPRIM(@NotNull JavaliParser.PRIMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRIM}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPRIM(@NotNull JavaliParser.PRIMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(@NotNull JavaliParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(@NotNull JavaliParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(@NotNull JavaliParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(@NotNull JavaliParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull JavaliParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull JavaliParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LITBOOL}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLITBOOL(@NotNull JavaliParser.LITBOOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITBOOL}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLITBOOL(@NotNull JavaliParser.LITBOOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCOMP(@NotNull JavaliParser.COMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCOMP(@NotNull JavaliParser.COMPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#methodCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(@NotNull JavaliParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#methodCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(@NotNull JavaliParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LITNULL}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLITNULL(@NotNull JavaliParser.LITNULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITNULL}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLITNULL(@NotNull JavaliParser.LITNULLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaliParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaliParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(@NotNull JavaliParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(@NotNull JavaliParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#actualParamList}.
	 * @param ctx the parse tree
	 */
	void enterActualParamList(@NotNull JavaliParser.ActualParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#actualParamList}.
	 * @param ctx the parse tree
	 */
	void exitActualParamList(@NotNull JavaliParser.ActualParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNARY}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUNARY(@NotNull JavaliParser.UNARYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNARY}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUNARY(@NotNull JavaliParser.UNARYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTACC}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIDENTACC(@NotNull JavaliParser.IDENTACCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTACC}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIDENTACC(@NotNull JavaliParser.IDENTACCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCAST(@NotNull JavaliParser.CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCAST(@NotNull JavaliParser.CASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull JavaliParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull JavaliParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#memberlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberlist(@NotNull JavaliParser.MemberlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#memberlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberlist(@NotNull JavaliParser.MemberlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(@NotNull JavaliParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(@NotNull JavaliParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOR(@NotNull JavaliParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOR(@NotNull JavaliParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LITINT}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLITINT(@NotNull JavaliParser.LITINTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITINT}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLITINT(@NotNull JavaliParser.LITINTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMUL(@NotNull JavaliParser.MULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMUL(@NotNull JavaliParser.MULContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull JavaliParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull JavaliParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(@NotNull JavaliParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(@NotNull JavaliParser.ReadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQU}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEQU(@NotNull JavaliParser.EQUContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQU}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEQU(@NotNull JavaliParser.EQUContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentAccess(@NotNull JavaliParser.IdentAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentAccess(@NotNull JavaliParser.IdentAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(@NotNull JavaliParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(@NotNull JavaliParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(@NotNull JavaliParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(@NotNull JavaliParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#methodCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStmt(@NotNull JavaliParser.MethodCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#methodCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStmt(@NotNull JavaliParser.MethodCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(@NotNull JavaliParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(@NotNull JavaliParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REF}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void enterREF(@NotNull JavaliParser.REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REF}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void exitREF(@NotNull JavaliParser.REFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(@NotNull JavaliParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(@NotNull JavaliParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(@NotNull JavaliParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(@NotNull JavaliParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LIT}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLIT(@NotNull JavaliParser.LITContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LIT}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLIT(@NotNull JavaliParser.LITContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAND(@NotNull JavaliParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAND(@NotNull JavaliParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull JavaliParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull JavaliParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull JavaliParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull JavaliParser.StmtContext ctx);
}