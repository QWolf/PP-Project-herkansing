/*
 * Yet Another Language Mk II
 * By Peter Schroten
 */
 
grammar Yall;
 
import YallVocab; 

 
//Full Program, ID is program name
program 	: 	YALL ID init? toplevelblock
 			;

// Amount of cores running and global variable initializations 			
init		:  GLOBAL decl* LOCAL
			;

//Program Blocks, single statements, every block has it's own scope level	
			
// The top level of the program is the only level where forks and joins are allowed
toplevelblock: 	toplevelblockPart*				#toplvlBlock
			;

toplevelblockPart: stat							#toplvlStat
			|	FORK ID LPAR toplevelblock RPAR	#toplvlFork
			|	JOIN ID SEMI					#toplvlJoin
			;
 	
//Blocks, as used by statements, do not allow for forks and joins
block		:	stat*		#blockStatement
			;

//Statement	
stat		: 	decl						#statDeclare
 			| 	ID IS expr SEMI				#statAssign
 			|	IF LBLOCK expr RBLOCK THEN LBRACE block RBRACE (ELSE LBRACE block RBRACE)? #statIf
 			|	WHILE LBLOCK expr RBLOCK DO LBRACE block RBRACE 					#statWhile
// 			|	FOR LBLOCK ID SEMI expr SEMI stat RBLOCK LBRACE block* RBRACE		#statFor
			|	INPUT ID SEMI				#statInput
			|	OUTPUT expr SEMI			#statOutput
			|	LOCK ID SEMI				#statLock
			|	UNLOCK ID SEMI				#statUnlock
			|	FORK ID SEMI				#statFork
			|	JOIN ID SEMI				#statJoin
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
			|	UP LBLOCK (NUM COMMA)? ID RBLOCK	#exprUp
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