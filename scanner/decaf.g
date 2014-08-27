lexer grammar decaf;

@header{
  package scanner.decaf;

  
}

fragment DECIMAL : ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9');
fragment LHEX: ('A'|'B' |'C'|'D'|'E'|'F');

fragment LETRA: ('A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z'| 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z');

CLASS: 'class';
PROGRAM:'Program';
VOID: 'void';
IF:'if';
ELSE:'else';
FOR:'for';
RETURN: 'return';
BREAK:'break' ;
CONTINUE: 'continue' ;

MASIGUAL:'+=';

COMA: (',') ;
DOSPUNTOS:(':');
LLAVES_A: ('{') ;
LLAVES_C: ('}') ;
CORCHETES_A:('[');
CORCHETES_C: (']');
STRING : '"' (~('\"'|'\n'|'\r'|'\t'))* '"' ;
INT: (DECIMAL)+ ; 
PARENTESIS_A:'('; 
PARENTESIS_C:')'; 


CALLOUT:'callout';
SUMA:'+';
RESTA:'-';
MULT:'*';
DIV:'/';
PROSENTAJE:'%';
MENOR:'<';
MAYOR:'>' ;
MENOROIGUAL:'<=';
MAYOROIGUAL:'>=';
IGUALIGUAL:'==';
 NOTIGUAL:'!=';
AND: '&&';
OR: '||';
LITERAL :INT | CHAR | BOOLEAN; 
ALPHANUMERICO: DECIMAL| LETRA;

BOOLEAN:TRUE|FALSE;

ENTERO: ('int' ) + ;
BOOL: ('boolean') + ;
FLOAT:( DECIMAL* '.' DECIMAL* ) + ;
HEX: ('O'('X'|'x')( DECIMAL|LHEX)*) + ;
TRUE: ('true');
FALSE: ('false'); 
VAR:LETRA(LETRA | DECIMAL)+ ; 
ESPACIOS: ('\t' | ' ' | '\r' | '\n'  ) + { skip();};
CHAR: '’'LETRA'’';
