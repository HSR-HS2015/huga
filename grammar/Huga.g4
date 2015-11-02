grammar Huga;

statement_list
	: forward=statement #forward_statement
	| left=statement_list right=statement #statement_list_loop
	;
	
statement
	: ';' #empty_statement
	| forward=expression ';' #forward_expression
	| forward=declaration ';' #forward_declaration
	| forward=assignment ';' #forward_assignment
	| forward=println ';' #forward_println
	;

declaration
	: 'VAR INT' identifier=IDENTIFIER #declaration_statement
	;
	
assignment
	: identifier=IDENTIFIER '=' expr=expression #assignment_statement
	;
	
println
	: 'println(' expr=expression ')' #println_statement
	;

expression
	: forward=additive_expression #forward_additive_expression
	;

additive_expression
	: forward=multiplicative_expression #forward_multiplicative_expression
	| left=additive_expression '+' right=multiplicative_expression #addition
	| left=additive_expression '-' right=multiplicative_expression #subtraction
	;

multiplicative_expression
	: forward=unary_expression #forward_unary_expression
	| left=multiplicative_expression '*' right=unary_expression #multiplication
	| left=multiplicative_expression '/' right=unary_expression #division
	;

unary_expression
	: forward=primary_expression #forward_primary_expression
	| '-' forward=primary_expression #negotiate
	;

primary_expression
	: forward=NUMBER #forward_number
	| identifier=IDENTIFIER #variable
	| '(' forward=expression ')' #parenthesis
	;

NUMBER
	: [1-9][0-9]*
	;
	
IDENTIFIER
	: [a-zA-Z][a-zA-Z0-9]*
	;
	
WHITESPACE
	: [ \t\n\r]+ -> skip
	;
