grammar Huga;

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
	| '(' forward=expression ')' #parenthesis
	;

NUMBER
	: [1-9][0-9]*
	;