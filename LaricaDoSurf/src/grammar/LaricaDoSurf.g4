grammar LaricaDoSurf;

prog : definicao;
    

definicao  : (tipagem VARIAVEL (ATRIBUICAO id)? TERMINAL)+ expressao*
   	   ;

expressao :  id operador id ((operador id)+)? TERMINAL
          |  VARIAVEL ATRIBUICAO id ((operador id)+)? TERMINAL  
          |  expressao_condicional   
          |  funcao_print
          |  estrutura_repeticao  
          |  definicao_funcao
          |  chamada_funcao   
          ;
definicao_funcao: DEF_FUNCAO LPAR parametros_formal RPAR LCOL corpo RCOL;

chamada_funcao: NOME_FUNCAO LPAR parametros_real RPAR TERMINAL;

corpo: definicao
     | expressao
    ;

parametros_formal: tipagem VARIAVEL (VIRGULA tipagem VARIAVEL)*;
parametros_real:  id (VIRGULA  id)*;

funcao_print:  PRINT LPAR id RPAR TERMINAL  
            ;
                
expressao_condicional :  IF LPAR condicao RPAR LCOL expressao+ RCOL (ELSE LCOL expressao+ RCOL)?;

estrutura_repeticao : WHILE  LPAR condicao RPAR LCOL expressao+ RCOL ;

id : VARIAVEL
   | valor
  ;

condicao : (VARIAVEL operadorcomparacao valor)
         ;


operadorcomparacao : IGUAL
                   | DIFERENTE
                   | MAIOR
                   | MENOR
                   | MENORIGUAL
                   | MAIORIGUAL
                   ;


operador : SOMA
         | SUB
         | DIV
         | MULT
         ;

tipagem : TipoInteger
        | TipoString
        | TipoFloat
        | TipoBoolean  
        ;  

valor : INT
     | STRING
     | FLOAT
     | BOOLEAN
     ; 
    


    
TipoInteger : 'Integer';
TipoString  : 'String';
TipoFloat   : 'Float' ; 
TipoBoolean : 'Boolean';

fragment
NUMERO : [0-9]  ;

fragment
LETRAS :[A-Za-z] ;

fragment
CARACTERES: [A-Za-z0-9_];    

INT    : NUMERO+             ;
FLOAT  : (NUMERO)+.(NUMERO)+ ;
BOOLEAN : ('True'|'False')   ;
ATRIBUICAO : 'larica'	     ;
IGUAL : '==' ;
MENORIGUAL : '<=' ;
MAIORIGUAL : '>=' ;
DIFERENTE : '!=' ;
MAIOR : '>' ;
MENOR : '<' ;
TERMINAL : ';' ;
LPAR : '(' ;
RPAR : ')' ;
LCOL : '[' ;
RCOL : ']' ;
SOMA : '+';
SUB : '-' ;
DIV : '\\' ;
MULT : '*' ;
ASP : '"' ;
IF : 'dropa';
ELSE: 'vaca';
WHILE: 'caldo';
PRINT : 'aloha' ;
VARIAVEL: (LETRAS+)(NUMERO+)? ;
STRING : ASP CARACTERES+ ASP ;
DEF_FUNCAO: 'def ' CARACTERES+;
NOME_FUNCAO: 'call ' CARACTERES+;  
VIRGULA : ',';
WS : [ \t\r\n]+ -> skip;