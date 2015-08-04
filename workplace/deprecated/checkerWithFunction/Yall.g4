/*
 * Yet Another Language Mk II
 * By Peter Schroten
 */
 
grammar Yall;
 
 
import YallVocab;
 
//Full Program, ID is program name
program 	: 	YALL ID stat*
 			;
 
//Program Blocks, either a function or a single statement			
//block		: 	stat		#blockStatement
//			|	function	#blockFunction
// 			;
//Functions 
//function	: 	FUNCTION ID INTO funcreturn  LBLOCK ((type ID COMMA)* type ID )? RBLOCK LBRACE block* RBRACE
//			;
 			
funcreturn	:	type ID
			|	NONE
			;

//Statement	
stat		: 	decl						#statDeclare
 			| 	ID IS expr SEMI				#statAssign
 			|	IF LBLOCK expr RBLOCK THEN LBRACE stat* RBRACE (ELSE LBRACE stat* RBRACE)? #statIf
 			|	WHILE LBLOCK expr RBLOCK DO LBRACE stat* RBRACE 					#statWhile
// 			|	FOR LBLOCK ID SEMI expr SEMI stat RBLOCK LBRACE block* RBRACE		#statFor
			|	INPUT ID SEMI				#statInput
			|	OUTPUT expr SEMI			#statOutput
			|	LOCK NUM SEMI				#statLock
			|	UNLOCK NUM SEMI				#statUnlock
			|	FORK NUM SEMI				#statFork
			|	JOIN NUM SEMI				#statJoin
//			|	ID LPAR ((expr COMMA)* expr)? RPAR SEMI #statFunction
 			;
 			
//Declaration, either with or without an initial value			
decl		:	type ID SEMI			#declDecl
 			|	type ID IS expr SEMI	#declAssign
 			;

			
 			
//Expressions / value
expr		:	LBLOCK expr RBLOCK	#exprBlock
			|	expr numOp expr		#exprNumOp
			|	expr boolOp expr	#exprBoolOp
			|	expr compOp expr	#exprCompOp
			|	UP LPAR (NUM COMMA)? ID RPAR		#exprUp
			|	NUM					#exprNum
			|	bool				#exprBool
			| 	ID LPAR ((expr COMMA)* expr)? RPAR 	#functionExpr
			|	ID					#exprID
			;

// Numerical Operators
numOp	:	PLUS				
		|	MINUS				
		| 	TIMES				
		|	DIVIDE				
		;
		
// Boolean Operators
boolOp	:	AND					
		|	OR					
		;
		
// Comparison Operators
compOp	:	GT						// Greater Than
		|	LT						// Less Than
		|	GE						// GreaterEqual
		|	LE						// LessEqual
		|	NE						// NotEqual
		|	EQ						// Equal
		;

//Types
type		:	INTEGER		#typeInt
			|	BOOLEAN		#typeBool
			;
			
//Boolean			
bool		: 	TRUE		#boolTrue
			| 	FALSE 		#boolFalse
			;