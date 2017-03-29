grammar Javali; // parser grammar, parses streams of tokens

@header {
	// Java header
	package cd.frontend.parser;
}



// PARSER RULES

//* // TODO: declare appropriate parser rules
//* // NOTE: Remove //* from the beginning of each line.
//* 

//types:
primitiveType
	: 'boolean'
	| 'int'
	;
	
type
	: primitiveType #PRIM
	| referenceType #REF
	;
	
referenceType
	: Identifier
	| arrayType
	;
	
arrayType
	: Identifier '[' ']'
	| primitiveType '[' ']'
	;
	

//program structure:
unit
 	: classDecl+ EOF
 	;

classDecl
	: 'class' Identifier ('extends' Identifier)? '{' memberlist '}'
	;
	
memberlist
	: (varDecl | methodDecl)*
	;

varDecl
	: type Identifier (',' Identifier)* ';'
	;

methodDecl
	: (type | 'void') Identifier '(' (formalParamList)? ')' '{' varDecl* stmt* '}'
	;
	
formalParamList
	: type Identifier (',' type Identifier)*
	;
	
//statements:
stmt
	: assignmentStmt
	| methodCallStmt
	| ifStmt
	| whileStmt
	| returnStmt
	| writeStmt
	;	

stmtBlock
	: '{' stmt* '}'
	;
	
methodCallStmt
	: methodCallExpr ';'
	;
	
assignmentStmt
	: identAccess '=' (expr | newExpr | readExpr) ';'
	;
	
ifStmt
	: 'if' '(' expr ')' stmtBlock ('else' stmtBlock)?
	;
	
whileStmt
	: 'while' '(' expr ')' stmtBlock
	;
	
returnStmt
	: 'return' (expr)? ';'
	;
	
writeStmt
	: ('write' '(' expr ')' | 'writeln' '(' ')') ';'
	;
	
//expressions:
newExpr
	: 'new' (Identifier '(' ')' | Identifier '[' expr ']' | primitiveType '[' expr ']')
	;
	
readExpr
	: 'read' '(' ')' 
	;
	
methodCallExpr
	: Identifier '(' (actualParamList)? ')'
	| identAccess '.' Identifier '(' (actualParamList)? ')'
	;
	
actualParamList
	: expr (',' expr)*
	;
	
identAccess
	: Identifier
	| 'this'
	| identAccess '.' Identifier
	| identAccess '[' expr ']'
	| Identifier '(' (actualParamList)? ')'
	| identAccess '.' Identifier '(' (actualParamList)? ')'
	;
	
expr
	: literal #LIT
	| identAccess #IDENTACC
	| '(' expr ')' #BRACKETS
	| ('+' | '-' | '!') expr #UNARY
	| '(' referenceType ')' expr #CAST
	| expr ('*' | '/' | '%') expr #MUL
	| expr ('+' | '-') expr #ADD
	| expr ('<' | '<=' | '>' | '>=') expr #COMP
	| expr ('==' | '!=') expr #EQU
	| expr '&&' expr #AND
	| expr '||' expr #OR
	;
	

// LEXER RULES
// TODO: provide appropriate lexer rules for numbers and boolean literals

//literals:
Bool
	: 'true'
	| 'false'
	;
	
Integer
	: Hex
	| Decimal
	;

literal
	: Integer #LITINT
	| Bool #LITBOOL
	| 'null' #LITNULL
	;

// Java(li) identifiers:
Identifier 
	: Letter (Letter|Digit)*
	;

fragment
Letter
	: 'A'..'Z'
	| 'a'..'z'
	;
	
fragment
Digit
	: '0'..'9'
	;
	
fragment
HexDigit
	: Digit
	| 'a'..'f'
	| 'A'..'F'
	;

fragment	
Decimal
	: '0'
	| '1'..'9' Digit*
	;

fragment
Hex
	: ('0x' | '0X') HexDigit+
	;

// comments and white space does not produce tokens:
COMMENT
	: '/*' .*? '*/' -> skip
	;

LINE_COMMENT
	: '//' ~('\n'|'\r')* -> skip
	;

WS
	: (' '|'\r'|'\t'|'\n') -> skip
	;
