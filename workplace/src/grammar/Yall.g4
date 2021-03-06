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
 			|	IF LBLOCK boolExpr RBLOCK THEN LBRACE block RBRACE (ELSE LBRACE block RBRACE)? #statIf
 			|	WHILE LBLOCK boolExpr RBLOCK DO LBRACE block RBRACE 					#statWhile
// 			|	FOR LBLOCK ID SEMI expr SEMI stat RBLOCK LBRACE block* RBRACE		#statFor
//			|	INPUT ID SEMI				#statInput
			|	OUTPUTBOOL boolExpr SEMI	#statOutputBool
//			|	OUTPUTINT addExpr SEMI		#statOutputInt
			|	LOCK ID SEMI				#statLock
			|	UNLOCK ID SEMI				#statUnlock
 			;
 			
//Declaration, either with or without an initial value			
decl		:	type ID SEMI			#declDecl
 			|	type ID IS expr SEMI	#declAssign
 			;
		
//Expressions / value
expr		:	addExpr				#exprNumExpr
			| 	boolExpr			#exprBoolExpr
			;

//Expressions with an Boolean as outcome
boolExpr	:	LPAR boolExpr RPAR			#boolParanteses
			|	boolExpr boolOp boolExpr	#boolExprBoolOp
			|	NOT boolExpr				#boolExprNot
			|	addExpr compOp addExpr 		#boolExprCompOp
			//TODO better solution for compEqOp if both expressions are Variables and booleans(now uses number path)
			|	addExpr compEqOp addExpr	#boolExprCompEqOpAdd
			|	boolExpr compEqOp boolExpr	#boolExprCompEqOpBool
			|	idExpr						#boolExprIDExpr
			|	bool						#boolExprBool
			;

//Expressions with an Integer as outcome	
addExpr		:	addExpr addOp addExpr		#addExprAddOp
			|	multExpr					#addExprMultExpr
			;

multExpr	:	multExpr multOp multExpr	#multExprMultOp
			|	LPAR addExpr RPAR			#multExprParenteses
			|	intExpr						#multExprIntExpr
			;
	
intExpr		:	NUM									#intExprNum
			|	intExpr (ADD)+						#intExprAdd
			|	intExpr (SUB)+						#intExprSub	
			|	idExpr								#intExprIDExpr
			;

			
//Building bits that actually represent a single (static) value
idExpr		:	ID									#idExprID
//			|	GLOBAL ID							#idExprGlobalID
			|	UP LBLOCK (NUM COMMA)? ID RBLOCK	#idExprUp
			|	LBLOCK expr RBLOCK					#idExprBlock
			;


addOp	:	PLUS				
		|	MINUS	
		;

multOp	: 	TIMES				
		|	DIVIDE
		|	MODULO				
		;
		
		
		
// Boolean Operators
boolOp	:	AND					
		|	OR	
		|	XOR				
		;
		
// Comparison Operators(numbers)
compOp	:	GT						// Greater Than
		|	LT						// Less Than
		|	GE						// GreaterEqual
		|	LE						// LessEqual
		;
		
// Equality operators (booleans and numbers)		
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