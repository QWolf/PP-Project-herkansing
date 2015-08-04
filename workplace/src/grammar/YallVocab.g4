lexer grammar YallVocab;

@header{package grammar;}

YALL: 'YALL';

//Keywords
IS:		'is';
IF: 	'if';
THEN: 	'then';
ELSE: 	'else';
WHILE: 	'while';
LOCK: 	'lock';
UNLOCK: 'unlock';
FORK:	'fork';
JOIN:	'join';
DO:		'do';
NONE: 	'none';
UP: 	'up';
INPUT: 	'input';
OUTPUT:	'output';

//Types
INTEGER: 	'integer';
BOOLEAN:	'boolean';
TRUE: 		'true';
FALSE: 		'false';

//Punctuation
LPAR: 	'(';
RPAR:	')';
LBRACE:	'{';
RBRACE:	'}';
SEMI:	';';
LBLOCK:	'[';
RBLOCK:	']';
QUOTE:	'\'';
DQUOTE: '"';
COMMA:	',';
EXCL: 	'!';
AT:		'@';

//Numerical operators
PLUS: 	'plus';
MINUS: 	'minus';
TIMES: 	'times';
DIVIDE: 'div';

//Boolean operators
AND: 	'and';
OR: 	'or';

//Compare
GT: 	'>>';
LT:		'<<';
GE:		'>=';
LE: 	'=<';
EQ: 	'==';
NE: 	'//';



ID: UPPERCASE (LETTER | DIGIT)*;
NUM: DIGIT (DIGIT)*;





//Skipped token types
WS: [ \t\r\n]+ -> skip;


fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];