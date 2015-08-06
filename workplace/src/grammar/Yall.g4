/*
 * Yet Another Language Mk II
 * By Peter Schroten
 */
 
grammar Yall;
 
import YallVocab; 

 
//Full Program, ID is program name
program 	: 	YALL ID init? block
 			;

// Amount of cores running and global variable initializations 			
init		: 	SPIDS NUM GLOBAL decl* LOCAL
			;
			
//Program Blocks, either a function or a single statement			
block		: 	stat*		#blockStatement
 			;


//Statement	
stat		: 	decl						#statDeclare
 			| 	ID IS expr SEMI				#statAssign
 			|	IF LBLOCK expr RBLOCK THEN LBRACE block RBRACE (ELSE LBRACE block RBRACE)? #statIf
 			|	WHILE LBLOCK expr RBLOCK DO LBRACE block RBRACE 					#statWhile
// 			|	FOR LBLOCK ID SEMI expr SEMI stat RBLOCK LBRACE block* RBRACE		#statFor
			|	INPUT ID SEMI				#statInput
			|	OUTPUT expr SEMI			#statOutput
			|	LOCK NUM SEMI				#statLock
			|	UNLOCK NUM SEMI				#statUnlock
			|	FORK NUM SEMI				#statFork
			|	JOIN NUM SEMI				#statJoin
 			;
 			
//Declaration, either with or without an initial value			
decl		:	type ID SEMI			#declDecl
 			|	type ID IS expr SEMI	#declAssign
 			;

			
 			
//Expressions / value
expr		:	LBLOCK expr RBLOCK	#exprBlock
			|	expr numOp expr		#exprNumOp
			|	expr boolOp expr	#exprBoolOp
			|	NOT expr			#exprNot
			|	expr compOp expr	#exprCompOp
			|	expr compEqOp expr	#exprCompEqOp
			|	UP LPAR (NUM COMMA)? ID RPAR		#exprUp
			|	ID					#exprID
			|	NUM					#exprNum
			|	bool				#exprBool
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
		|	XOR				
		;
		
// Comparison Operators
compOp	:	GT						// Greater Than
		|	LT						// Less Than
		|	GE						// GreaterEqual
		|	LE						// LessEqual
		;
		
// Comparison if equal or not		
compEqOp	:	EQ
			|	NE
			;

//Types
type		:	INTEGER		#typeInt
			|	BOOLEAN		#typeBool
			;
			
//Boolean			
bool		: 	TRUE		#boolTrue
			| 	FALSE 		#boolFalse
			;