package cd.backend.codegen;

import cd.ToDoException;
import cd.backend.codegen.RegisterManager.Register;
import cd.ir.Ast;
import cd.ir.Ast.Assign;
import cd.ir.Ast.BuiltInWrite;
import cd.ir.Ast.BuiltInWriteln;
import cd.ir.Ast.IfElse;
import cd.ir.Ast.MethodCall;
import cd.ir.Ast.MethodDecl;
import cd.ir.Ast.Var;
import cd.ir.Ast.WhileLoop;
import cd.ir.AstVisitor;
import cd.util.debug.AstOneLine;

/**
 * Generates code to process statements and declarations.
 */
class StmtGenerator extends AstVisitor<Register, Void> {
	protected final AstCodeGenerator cg;

	StmtGenerator(AstCodeGenerator astCodeGenerator) {
		cg = astCodeGenerator;
	}

	public void gen(Ast ast) {
		visit(ast, null);
	}

	@Override
	public Register visit(Ast ast, Void arg) {
		try {
			cg.emit.increaseIndent("Emitting " + AstOneLine.toString(ast));
			return super.visit(ast, arg);
		} finally {
			cg.emit.decreaseIndent();
		}
	}

	@Override
	public Register methodCall(MethodCall ast, Void dummy) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register methodDecl(MethodDecl ast, Void arg) {
		{
			// Because we only handle very simple programs in HW1,
			// you can just emit the prologue here!
		
			cg.rm.initRegisters();
			cg.emit.emitRaw(".section .rodata");
			
			cg.emit.emitLabel(".LC0");
			cg.emit.emitRaw(".string \"%d\"");
			cg.emit.emitRaw(".text");
			cg.emit.emit(".globl", ast.name);
			cg.emit.emitRaw(".type " + ast.name + ", @function");
			
			cg.emit.emitRaw(".data");
			cg.emit.emitLabel("scan");
			cg.emit.emitRaw(".int 0");			
	

			visit(ast.decls(), arg);
			
			cg.emit.emitLabel(ast.name);
			cg.emit.emit("push", Register.EBP);
			cg.emit.emit("mov", Register.ESP, Register.EBP);
			visit(ast.body(), arg);
			cg.emit.emit("movl", 0, Register.EAX);
			cg.emit.emitRaw("leave");
			cg.emit.emitRaw("ret");
			return Register.EAX;
		}
	}
	
	@Override
	public Register varDecl(Ast.VarDecl ast, Void arg) {
		{
			cg.emit.emitRaw(".data");
			cg.emit.emitLabel(ast.name);
			cg.emit.emitRaw(".int 0");			
			return null;
		}
	}

	@Override
	public Register ifElse(IfElse ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register whileLoop(WhileLoop ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register assign(Assign ast, Void arg) {
		{
			// Because we only handle very simple programs in HW1,
			// you can just emit the prologue here!
			
			Register reg = cg.eg.visit(ast.right(), arg);
			String var = ((Var) ast.left()).name;
			cg.emit.emit("movl", reg, var);
			cg.rm.releaseRegister(reg);
			return null;
		}
	}

	@Override
	public Register builtInWrite(BuiltInWrite ast, Void arg) {
		{			
			Register reg = cg.eg.visit(ast.arg(), arg);
			cg.emit.emit("push", reg);
			cg.emit.emit("push", "$.LC0");
			cg.emit.emit("call", "printf");
			cg.rm.releaseRegister(reg);
			return null;
		}
	}

	@Override
	public Register builtInWriteln(BuiltInWriteln ast, Void arg) {
		{
			cg.emit.emit("push", 10);
			cg.emit.emit("call", "putchar");
			return null;
		}
	}

}
