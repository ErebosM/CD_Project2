package cd.backend.codegen;

import cd.ToDoException;
import cd.backend.codegen.RegisterManager.Register;
import cd.ir.Ast.BinaryOp;
import cd.ir.Ast.BooleanConst;
import cd.ir.Ast.BuiltInRead;
import cd.ir.Ast.Cast;
import cd.ir.Ast.Expr;
import cd.ir.Ast.Field;
import cd.ir.Ast.Index;
import cd.ir.Ast.IntConst;
import cd.ir.Ast.NewArray;
import cd.ir.Ast.NewObject;
import cd.ir.Ast.NullConst;
import cd.ir.Ast.ThisRef;
import cd.ir.Ast.UnaryOp;
import cd.ir.Ast.Var;
import cd.ir.ExprVisitor;
import cd.util.debug.AstOneLine;

/**
 * Generates code to evaluate expressions. After emitting the code, returns a
 * String which indicates the register where the result can be found.
 */
class ExprGenerator extends ExprVisitor<Register, Void> {
	protected final AstCodeGenerator cg;

	ExprGenerator(AstCodeGenerator astCodeGenerator) {
		cg = astCodeGenerator;
	}

	public Register gen(Expr ast) {
		return visit(ast, null);
	}

	@Override
	public Register visit(Expr ast, Void arg) {
		try {
			cg.emit.increaseIndent("Emitting " + AstOneLine.toString(ast));
			return super.visit(ast, null);
		} finally {
			cg.emit.decreaseIndent();
		}

	}

	@Override
	public Register binaryOp(BinaryOp ast, Void arg) {
		{
			if (ast.operator.repr == "+") {
				Register reg1, reg2;
				if (ast.left().children().size() >= ast.right().children().size()) {
					reg1 = cg.eg.visit(ast.left(), arg);
					reg2 = cg.eg.visit(ast.right(), arg);
				} else {
					reg2 = cg.eg.visit(ast.right(), arg);
					reg1 = cg.eg.visit(ast.left(), arg);
				}
				cg.emit.emit("addl", reg1, reg2);
				cg.rm.releaseRegister(reg1);
				return reg2;
			} else if (ast.operator.repr == "*") {
				Register reg1, reg2;
				if (ast.left().children().size() >= ast.right().children().size()) {
					reg2 = cg.eg.visit(ast.left(), arg);
					reg1 = cg.eg.visit(ast.right(), arg);
				} else {
					reg1 = cg.eg.visit(ast.right(), arg);
					reg2 = cg.eg.visit(ast.left(), arg);
				}
				cg.emit.emit("imul", reg1, reg2);
				cg.rm.releaseRegister(reg1);
				return reg2;
			} else if (ast.operator.repr == "-") {
				Register reg1, reg2;
				if (ast.left().children().size() >= ast.right().children().size()) {
					reg2 = cg.eg.visit(ast.left(), arg);
					reg1 = cg.eg.visit(ast.right(), arg);
				} else {
					reg1 = cg.eg.visit(ast.right(), arg);
					reg2 = cg.eg.visit(ast.left(), arg);
				}
				cg.emit.emit("sub", reg1, reg2);
				cg.rm.releaseRegister(reg1);
				return reg2;
			} else if (ast.operator.repr == "/") {
				Register reg1, reg2;
				if (ast.left().children().size() >= ast.right().children().size()) {
					reg1 = cg.eg.visit(ast.left(), arg);
					reg2 = cg.eg.visit(ast.right(), arg);
				} else {
					reg2 = cg.eg.visit(ast.right(), arg);
					reg1 = cg.eg.visit(ast.left(), arg);
				}
				cg.emit.emit("push", Register.EAX);
				cg.emit.emit("movl", reg1, Register.EAX);
				cg.rm.releaseRegister(reg1);
				cg.emit.emit("push", Register.EDX);
				cg.emit.emit("xor", Register.EDX, Register.EDX);
				cg.emit.emit("movl", Register.EAX, Register.EDX);
				cg.emit.emit("sar", 31, Register.EDX);
				cg.emit.emit("idiv", reg2);
				cg.emit.emit("movl", Register.EAX, reg2);
				cg.emit.emit("pop", Register.EDX);
				cg.emit.emit("pop", Register.EAX);
				return reg2;
			}
			return null;
		}
	}

	@Override
	public Register booleanConst(BooleanConst ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register builtInRead(BuiltInRead ast, Void arg) {
		{
		
			
			cg.emit.emitRaw("push $scan");
			cg.emit.emit("push", "$.LC0");
			cg.emit.emit("call", "scanf");
	
			Register reg = cg.rm.getRegister();
			cg.emit.emit("movl", "scan", reg);
			return reg;
		}
	}

	@Override
	public Register cast(Cast ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register index(Index ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register intConst(IntConst ast, Void arg) {
		{
			Register reg = cg.rm.getRegister();
			cg.emit.emit("movl", ast.value, reg);
			return reg;
		}
	}

	@Override
	public Register field(Field ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register newArray(NewArray ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register newObject(NewObject ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register nullConst(NullConst ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register thisRef(ThisRef ast, Void arg) {
		{
			throw new RuntimeException("Not required");
		}
	}

	@Override
	public Register unaryOp(UnaryOp ast, Void arg) {
		{
			if (ast.operator.repr == "+") {
				Register reg = cg.eg.visit(ast.arg(), arg);
				return reg;
			} else if (ast.operator.repr == "-") {
				Register reg = cg.eg.visit(ast.arg(), arg);
				cg.emit.emit("imul", -1, reg);
				return reg;
			}
			return null;
		}
	}
	
	@Override
	public Register var(Var ast, Void arg) {
		{
			Register reg = cg.rm.getRegister();
			cg.emit.emit("movl", ast.name, reg);
			return reg;
		}
	}

}
