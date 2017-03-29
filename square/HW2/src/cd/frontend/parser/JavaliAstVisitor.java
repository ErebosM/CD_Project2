package cd.frontend.parser;

import java.util.ArrayList;
import java.util.List;

import cd.ToDoException;
import cd.frontend.parser.JavaliParser.*;
import cd.frontend.parser.JavaliParser.ADDContext;
import cd.frontend.parser.JavaliParser.ANDContext;
import cd.frontend.parser.JavaliParser.ActualParamListContext;
import cd.frontend.parser.JavaliParser.ArrayTypeContext;
import cd.frontend.parser.JavaliParser.AssignmentStmtContext;
import cd.frontend.parser.JavaliParser.BRACKETSContext;
import cd.frontend.parser.JavaliParser.CASTContext;
import cd.frontend.parser.JavaliParser.COMPContext;
import cd.frontend.parser.JavaliParser.ClassDeclContext;
import cd.frontend.parser.JavaliParser.EQUContext;
import cd.frontend.parser.JavaliParser.FormalParamListContext;
import cd.frontend.parser.JavaliParser.IDENTACCContext;
import cd.frontend.parser.JavaliParser.IdentAccessContext;
import cd.frontend.parser.JavaliParser.IfStmtContext;
import cd.frontend.parser.JavaliParser.LITContext;
import cd.frontend.parser.JavaliParser.MULContext;
import cd.frontend.parser.JavaliParser.MemberlistContext;
import cd.frontend.parser.JavaliParser.MethodCallExprContext;
import cd.frontend.parser.JavaliParser.MethodCallStmtContext;
import cd.frontend.parser.JavaliParser.MethodDeclContext;
import cd.frontend.parser.JavaliParser.NewExprContext;
import cd.frontend.parser.JavaliParser.ORContext;
import cd.frontend.parser.JavaliParser.PrimitiveTypeContext;
import cd.frontend.parser.JavaliParser.ReadExprContext;
import cd.frontend.parser.JavaliParser.ReferenceTypeContext;
import cd.frontend.parser.JavaliParser.ReturnStmtContext;
import cd.frontend.parser.JavaliParser.StmtBlockContext;
import cd.frontend.parser.JavaliParser.StmtContext;
import cd.frontend.parser.JavaliParser.TypeContext;
import cd.frontend.parser.JavaliParser.UNARYContext;
import cd.frontend.parser.JavaliParser.UnitContext;
import cd.frontend.parser.JavaliParser.VarDeclContext;
import cd.frontend.parser.JavaliParser.WhileStmtContext;
import cd.frontend.parser.JavaliParser.WriteStmtContext;
import cd.frontend.parser.JavaliParser.LiteralContext;
import cd.ir.Ast.*;
import cd.ir.Ast.BinaryOp.BOp;
import cd.ir.Ast;
import cd.ir.Ast.ClassDecl;
import cd.ir.Ast.Seq;
import cd.util.Pair;

public final class JavaliAstVisitor extends JavaliBaseVisitor<Void> {
	
	List<Ast> list = new ArrayList<>();
	List<Ast> list2 = new ArrayList<>();
	
	public List<ClassDecl> classDecls = new ArrayList<>();
	@Override
	public Void visitClassDecl(ClassDeclContext ctx) {
		ctx.getChild(3).accept(this);
		String name = ctx.children.get(1).getText();
		String superClass = "Object";
		ClassDecl classdecl = new ClassDecl(name, superClass, list);
		classDecls.add(classdecl);
		return null;
	}
	@Override
	public Void visitNewExpr(NewExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNewExpr(ctx);
	}
	@Override
	public Void visitBRACKETS(BRACKETSContext ctx) {
		ctx.getChild(1).accept(this);
		return null;
	}
	@Override
	public Void visitADD(ADDContext ctx) {
		ctx.getChild(0).accept(this);
		ctx.getChild(2).accept(this);
		
		Expr left = (Expr) list.get(0);
		Expr right = (Expr) list.get(0);
		BOp op = null;
		if (ctx.getChild(1).getText().equals("+")) {
			op = BOp.B_PLUS;
		} else if (ctx.getChild(1).getText().equals("-")) {
			op = BOp.B_MINUS;
		}
		
		BinaryOp binaryop = new BinaryOp(left, op, right);
		
		list.remove(0);
		list.remove(0);
		list.add(binaryop);
		
		return null;
	}
	@Override
	public Void visitFormalParamList(FormalParamListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFormalParamList(ctx);
	}
	@Override
	public Void visitReferenceType(ReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReferenceType(ctx);
	}
	@Override
	public Void visitMethodDecl(MethodDeclContext ctx) {
		ctx.getChild(5).accept(this);
		if(ctx.getChildCount() == 8) {
			ctx.getChild(6).accept(this);
		}
		String returnType = ctx.children.get(0).getText();
		String name = ctx.children.get(1).getText();
		List<String> argumentTypes = new ArrayList<>();
		List<String> argumentNames = new ArrayList<>();
		Seq decls = new Seq(list2);
		Seq body = new Seq(list);
		MethodDecl methoddecl = new MethodDecl(returnType, name, argumentTypes, argumentNames, decls, body);
		
		if (list.size() > 0) {
			list.remove(0);
		}
		if (list2.size() > 0) {
			list2.remove(0);
		}
		
		list.add(methoddecl);
		return null;
	}
	@Override
	public Void visitPRIM(PRIMContext ctx) {
		ctx.getChild(0).accept(this);
		return null;
	}
	@Override
	public Void visitREF(REFContext ctx) {
		// TODO Auto-generated method stub
		return super.visitREF(ctx);
	}
	@Override
	public Void visitCOMP(COMPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCOMP(ctx);
	}
	@Override
	public Void visitMethodCallExpr(MethodCallExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethodCallExpr(ctx);
	}
	@Override
	public Void visitPrimitiveType(PrimitiveTypeContext ctx) {
		ctx.getChild(0).accept(this);
	
		String type = ctx.getText();
		NewObject object = new NewObject(type);
		
		list.add(object);
		return null;
	}
	@Override
	public Void visitAssignmentStmt(AssignmentStmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignmentStmt(ctx);
	}
	@Override
	public Void visitActualParamList(ActualParamListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActualParamList(ctx);
	}
	@Override
	public Void visitUNARY(UNARYContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUNARY(ctx);
	}
	@Override
	public Void visitIDENTACC(IDENTACCContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIDENTACC(ctx);
	}
	@Override
	public Void visitCAST(CASTContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCAST(ctx);
	}
	@Override
	public Void visitArrayType(ArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArrayType(ctx);
	}
	@Override
	public Void visitMemberlist(MemberlistContext ctx) {
		ctx.getChild(0).accept(this);
		return null;
	}
	@Override
	public Void visitWhileStmt(WhileStmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWhileStmt(ctx);
	}
	@Override
	public Void visitOR(ORContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOR(ctx);
	}
	@Override
	public Void visitMUL(MULContext ctx) {
		ctx.getChild(0).accept(this);
		ctx.getChild(2).accept(this);
		
		Expr left = (Expr) list.get(0);
		Expr right = (Expr) list.get(0);
		BOp op = null;
		if (ctx.getChild(1).getText().equals("*")) {
			op = BOp.B_TIMES;
		} else if (ctx.getChild(1).getText().equals("/")) {
			op = BOp.B_DIV;
		}
		
		BinaryOp binaryop = new BinaryOp(left, op, right);
		
		list.remove(0);
		list.remove(0);
		list.add(binaryop);
		
		return null;
	}
	@Override
	public Void visitReadExpr(ReadExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReadExpr(ctx);
	}
	@Override
	public Void visitEQU(EQUContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEQU(ctx);
	}
	@Override
	public Void visitIdentAccess(IdentAccessContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdentAccess(ctx);
	}
	@Override
	public Void visitReturnStmt(ReturnStmtContext ctx) {
		ReturnStmt returnstmt;
		if (ctx.getChildCount() == 3) {
			ctx.getChild(1).accept(this);
			returnstmt = new ReturnStmt((Expr) list.get(0));
		} else {
			returnstmt = new ReturnStmt(null);
		}
		list.remove(0);
		list.add(returnstmt);
		return null;
	}
	@Override
	public Void visitWriteStmt(WriteStmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWriteStmt(ctx);
	}
	@Override
	public Void visitMethodCallStmt(MethodCallStmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethodCallStmt(ctx);
	}
	@Override
	public Void visitStmtBlock(StmtBlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtBlock(ctx);
	}
	@Override
	public Void visitUnit(UnitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnit(ctx);
	}
	@Override
	public Void visitIfStmt(IfStmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfStmt(ctx);
	}
	@Override
	public Void visitLIT(LITContext ctx) {
		ctx.getChild(0).accept(this);
		return null;
	}
	@Override
	public Void visitAND(ANDContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAND(ctx);
	}
	@Override
	public Void visitVarDecl(VarDeclContext ctx) {
		ctx.getChild(0).accept(this);
		String type = ((NewObject) list.get(0)).typeName;
		String name = ctx.getChild(1).getText();
		VarDecl vardecl = new VarDecl(type,name);
		
		list.remove(0);
		list2.add(vardecl);
		
		return null;
	}
	@Override
	public Void visitStmt(StmtContext ctx) {
		ctx.getChild(0).accept(this);
		return null;
	}
	@Override
	public Void visitLITINT(LITINTContext ctx) {
		IntConst intconst = new IntConst(Integer.parseInt(ctx.Integer().getText()));
		list.add(intconst);
		return null;
	}
	@Override
	public Void visitLITBOOL(LITBOOLContext ctx) {
		boolean bool;
		if (ctx.Bool().getText().equals("true")) {
			bool = true;
		} else {
			bool = false;
		}
		BooleanConst booleanconst = new BooleanConst(bool);
		list.add(booleanconst);
		return null;
	}
	@Override
	public Void visitLITNULL(LITNULLContext ctx) {
		NullConst nullconst = new NullConst();
		list.add(nullconst);
		return null;
	}
}
