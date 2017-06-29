grammar LaricaDoSurf;

@header {
package antlr;

import ast.*;
}

prog : bloco;
    

bloco : definicao+  expressao*
      ;

definicao :  (tipagem VARIAVEL (ATRIBUICAO id)? TERMINAL)         
          ;
 

expressao    
          : expressao_condicional   
          | funcao_print
          | estrutura_repeticao  
          | definicao_funcao
          | chamada_funcao   
          | expressao_simples
          | atribuicao
          ;

expressao_simples 
                  : id (operador id)+ TERMINAL
                  ;

atribuicao 
           : VARIAVEL ATRIBUICAO id ((operador id)+)? TERMINAL
           ;
             
definicao_funcao
                 : DEF_FUNCAO LPAR parametros_formal RPAR LCOL bloco RCOL;

chamada_funcao
               : NOME_FUNCAO LPAR parametros_real RPAR TERMINAL;

parametros_formal
                  : tipagem VARIAVEL (VIRGULA tipagem VARIAVEL)*;

parametros_real
                :  id (VIRGULA  id)*;

funcao_print returns [FuncaoPrint result]
             :  PRINT LPAR i=id RPAR TERMINAL {$result = new FuncaoPrint($i.result);}  
             ;
                
expressao_condicional 
                      :  IF LPAR condicao RPAR LCOL expressao+ RCOL (ELSE LCOL expressao+ RCOL)?;

estrutura_repeticao 
                   : WHILE  LPAR condicao RPAR LCOL expressao+ RCOL ;

id returns [Id result]
   : VARIAVEL {$result=new Id ($VARIAVEL.text);}
   | valor {$result=new Id ($valor.result);}
   ;

condicao returns [Condicao result]
         : (var =VARIAVEL opc=operadorcomparacao val= valor){$result =  new Condicao($var.text, $opc.result, $val.result);}
         ;


operadorcomparacao returns [OperadorComparacao result]
                   : i = IGUAL {$result = new OperadorComparacao($i.text);}
                   | d = DIFERENTE {$result = new OperadorComparacao($d.text);}
                   | maior = MAIOR {$result = new OperadorComparacao($maior.text);}
                   | menor = MENOR {$result = new OperadorComparacao($menor.text);}
                   | menorIgual = MENORIGUAL {$result = new OperadorComparacao($menorIgual.text);}
                   | maiorIgual = MAIORIGUAL {$result = new OperadorComparacao($maiorIgual.text);}
                   ;


operador returns [Operador result]
         : s = SOMA {$result = new Operador($s.text);}
         | sub = SUB {$result = new Operador($sub.text);}
         | d = DIV {$result = new Operador($d.text);}
         | m = MULT {$result = new Operador($m.text);}
         ;

tipagem returns [Tipagem result]
        : tipo_integer = TipoInteger {$result = new Tipagem($tipo_integer.text);}
        | tipo_string = TipoString {$result = new Tipagem($tipo_string.text);}
        | tipo_float = TipoFloat {$result = new Tipagem($tipo_float.text);}
        | tipo_boolean = TipoBoolean  {$result = new Tipagem($tipo_boolean.text);}
        ;  

valor returns [Valor result]
     : i = INT {$result = new Valor(Integer.parseInt($i.text));}
     | s = STRING {$result = new Valor($s.text);}
     | f = FLOAT {$result = new Valor(Float.parseFloat($f.text));}
     | b = BOOLEAN  {$result = new Valor(Boolean.parseBoolean($b.text));}
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
DIV : '/' ;
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