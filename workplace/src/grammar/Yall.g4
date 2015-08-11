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
// Toplevelblocks are only started by new Threads
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
			|	OUTPUTBOOL expr SEMI		#statOutputBool
			|	OUTPUTINT expr SEMI			#statOutputInt
			|	LOCK ID SEMI				#statLock
			|	UNLOCK ID SEMI				#statUnlock
 			;
 			
//Declaration, either with or without an initial value			
decl		:	type ID SEMI			#declDecl
 			|	type ID IS expr SEMI	#declAssign
 			;

			
 			
//Expressions / value
expr		:	LBLOCK expr RBLOCK	#exprBlock
			|	expr (numOp expr)+	#exprNumOp
			|	expr boolOp expr	#exprBoolOp
			|	NOT expr			#exprNot
			|	expr compOp expr	#exprCompOp
			|	expr compEqOp expr	#exprCompEqOp
			|	UP LBLOCK (NUM COMMA)? ID RBLOCK	#exprUp
//			|	GLOBAL ID
			|	ID					#exprID
			|	NUM					#exprNum
			|	bool				#exprBool
			;




// Numerical Operators
numOp	:	multOp
		|	addOp
		;



addOp	:	PLUS				
		|	MINUS	
		;

multOp	: 	TIMES				
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