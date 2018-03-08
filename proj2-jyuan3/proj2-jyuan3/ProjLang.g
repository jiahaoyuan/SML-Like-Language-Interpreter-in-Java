grammar ProjLang;

fragment LETTER	
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	
	:	'0'..'9';
NUM	:	DIGIT+;
IF	:	'if';
THEN	: 	'then';
ELSE	:	'else';
LET	:	'let';
VAL	:	'val';
EQUAL	:	'=';
IN	:	'in';
END	: 	'end';
FUNCTION:	'fun';
LPAR	:	'(';
RPAR	:	')';
WHILE	:	'while';
DO	:	'do';
LBRA	:	'{';
RBRA	:	'}';
SCOLON	:	';';
ASSIGN	:	':=';
LESSTHAN	: '<' ;
ADDOP	:	('+' | '-' | '|');
MULOP	:	('*' | '/' | '&');
TRUE	:	'true';
FALSE	:	'false';
FOR	:	'for';
NOT	:	'!';
ID	:	LETTER (LETTER | DIGIT)*;
//BINARYOPS
	//:	RELOP 
	//|	ADDOP
	//|	MULOP;

input	returns [Expr value]: e=expr SCOLON EOF {$value = $e.value;} ;

expr	returns [Expr value]:	IF e1=expr THEN e2=expr ELSE e3=expr {$value= new IfExpr($e1.value, $e2.value, $e3.value);}
	|	LET VAL ID EQUAL e2=expr IN e3=expr END {$value = new LetValExp($ID.text, $e2.value, $e3.value);}
	|	LET FUNCTION t1=ID LPAR t2=ID RPAR EQUAL e3=expr IN e4=expr END {$value = new LetFunExp($t1.text,$t2.text,$e3.value, $e4.value );}
	|	WHILE e1=expr DO e2=expr {$value = new WhileExp($e1.value, $e2.value);}
	|	LBRA e1=expr{$value=$e1.value;} (SCOLON e2=expr{$value = new SeqExp($value, $e2.value);})* RBRA 
	|	NOT e1=expr {$value= new NotExp($e1.value);}
	|	t3=ID ASSIGN e2=expr {$value = new AssnExp($t3.text, $e2.value);}
	|	e1=relexpr {$value = $e1.value;};
	
//FOR LPAR e1=relexpr SCOLON e2=relexpr SCOLON e3=expr RPAR DO e4=expr {$value= }
	
relexpr	returns [Expr value]:	e1=arithexpr {$value = $e1.value;} (LESSTHAN e2=arithexpr {$value= new BinExp(BinOp.LT, $value, $e2.value);} | EQUAL e3=arithexpr{$value = new BinExp(BinOp.EQ, $value, $e3.value);})?;

arithexpr returns [Expr value]:	e1=term {$value = $e1.value;}(ADDOP e2=term {$value = new BinExp(BinOp.PLUS, $value, $e2.value);})*;
	

term returns [Expr value]:e1=factor {$value = $e1.value;}(MULOP e2=factor {$value = new BinExp(BinOp.TIMES, $value, $e2.value);})*;
	
factor returns [Expr value]	:	NUM{$value = new IntConst(Integer.parseInt($NUM.text));}
	|	TRUE {$value = new BoolConst(true);}
	|	FALSE {$value = new BoolConst(false);}
	|	ID {$value = new VarExp($ID.text);}
	|	ID LPAR e1=expr RPAR {$value = new AppExp($ID.text, $e1.value);}
	|	LPAR e1=expr{$value=$e1.value;} RPAR;





	