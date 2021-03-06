grammar LaricaDoSurf;

@header {
package antlr;

import java.util.LinkedList;
import ast.*;
}

prog  
    : bloco
    ;
    

bloco returns [Bloco result]
    @init {
           ArrayList<Definicao> def = new ArrayList<>();
           ArrayList<Expr> exp = new ArrayList<>();
    }
    
    : (d=definicao{def.add($d.result);})+  (e=expressao{exp.add($e.result);})* {$result = new Bloco(def,exp);}
    ;

definicao returns [Definicao result] 
        :  (t = tipagem var=VARIAVEL TERMINAL) {$result = new Definicao($t.result,$var.text);} 
        |  (t = tipagem var=VARIAVEL ATRIBUICAO value = id TERMINAL) {$result = new Definicao($t.result,$var.text,$id.result);}   
          ;
 

expressao returns [Expr result]
          : ec= expressao_condicional {$result = $ec.result;}   
          | p = funcao_print {$result = $p.result;}
          | er = estrutura_repeticao {$result = $er.result;}
          | d = definicao_funcao {$result = $d.result;}
          | c = chamada_funcao {$result = $c.result;}
          | e = expressao_simples {$result = $e.result;}
          | a = atribuicao_valor  {$result = $a.result;}
          ;


operacoes returns [Operacoes result]:op = operador v= id {$result = new Operacoes($op.result,$v.result);}
                                    ;
                                     

expressao_simples returns [ExprSmp result]
    @init {
           ArrayList<Operacoes> sttList = new ArrayList<>();
    }
                  : i = id (op = operacoes{sttList.add($op.result);})+ TERMINAL {$result = new ExprSmp($i.result,sttList);} 
                  ;

atribuicao_valor returns [AtribuicaoValor result]
           : var = VARIAVEL ATRIBUICAO val=id TERMINAL {$result = new AtribuicaoValor($var.text,$val.result);} 
           | var = VARIAVEL ATRIBUICAO exp = expressao_simples {$result = new AtribuicaoValor($var.text,$exp.result);}  
           ;
             
definicao_funcao returns [DefFunc result]
                 : DEF_FUNCAO n = NOME_FUNCAO LPAR p=parametros_formal RPAR LCOL b=bloco RCOL {$result = new DefFunc($n.text, $p.args, $b.result);}
                 ;

chamada_funcao returns [ChamadaFuncao result]
               : CHAMADA_FUNCAO n = NOME_FUNCAO LPAR p=parametros_real RPAR TERMINAL {$result = new ChamadaFuncao($n.text, $p.args);};


parametro_funcao returns [Definicao result]
                : t = tipagem var = VARIAVEL {$result = new Definicao($t.result, $var.text);} 
                ;

parametros_formal returns [List<Definicao> args]
@init {
    $args = new LinkedList<Definicao>();
}
                  : (parametro_funcao {$args.add($parametro_funcao.result);}
                    (VIRGULA parametro_funcao {$args.add($parametro_funcao.result);})*
                    )?
                  ;


parametros_real returns [List<Id> args]
@init {
    $args = new LinkedList<Id>();
}
                :  (id {$args.add($id.result);}
                    ( VIRGULA id {$args.add($id.result);})*
                   )?
                ;

funcao_print returns [FuncaoPrint result]
             :  PRINT LPAR i=id RPAR TERMINAL {$result = new FuncaoPrint($i.result);}  
             ;
                
expressao_condicional returns [If result]
    @init {
           ArrayList<Expr> If = new ArrayList<>();
           ArrayList<Expr> Else = new ArrayList<>();
    }
      :  IF LPAR c=condicao RPAR LCOL (i=expressao{If.add($i.result);})+ RCOL (ELSE LCOL (e=expressao{Else.add($e.result);})+ RCOL)? {$result = new If($c.result, If, Else);}
      ;

estrutura_repeticao returns [While result]
    @init {
           ArrayList<Expr> expr = new ArrayList<>();
    }
                   : WHILE  LPAR c=condicao RPAR LCOL (e=expressao{expr.add($e.result);})+ RCOL {$result = new While($c.result, expr);}
                   ;

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
DEF_FUNCAO: 'def ';
CHAMADA_FUNCAO: 'call ';
NOME_FUNCAO: '<'CARACTERES+'>';
VIRGULA : ',';
WS : [ \t\r\n]+ -> skip;