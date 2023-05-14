grammar MyLanguage;

inicio   : comando+ funcion*
        | funcion+ comando*
        |
        ;

comando    : declarar
        | si
        | mientras
        | para
        | integrada
        | ir
        ;

declarar   : ID tipo
        ;

tipo    : matriz* TKN_EQUALS aritmetica1
        | TKN_COLON
        | TKN_LEFT_PAREN TKN_RIGHT_PAREN
        ;

matriz   : TKN_LEFT_BRAC logico1 TKN_RIGHT_BRAC
        ;

identificador    : ID matriz*
        ;

logico1    : logico2 logico1p
        ;
        
logico1p   : OR logico2 logico1p
         |
         ;

logico2    : logico3 logico2p
         ;
        
logico2p   : AND logico3 logico2p
         |
         ;

logico3    : aritmetica1 logico3p
         ;
           
logico3p    : operrel aritmetica1
        | 
        ;
        
operrel   : TKN_EQUALS
         | TKN_DIFF
         | TKN_GREATER
         | TKN_LESS
         | TKN_GEQ
         | TKN_LEQ
         ;

aritmetica1   : aritmetica2 aritmetica1p
         ;
         
aritmetica1p   : opsuma aritmetica2 aritmetica1p
        | 
        ;
        
opsuma   : TKN_PLUS
         | TKN_MINUS
         ;
         
aritmetica2   : aritmetica3 aritmetica2p
         ;
         
aritmetica2p   : opmultiplicar aritmetica3 aritmetica2p
        | 
        ;

opmultiplicar   : TKN_TIMES
         | TKN_DIV
         ;

aritmetica3  : TKN_MINUS aritmetica4
         | aritmetica4
         ;
         
aritmetica4  : valor 
        | integrada
        | identificador
        | TKN_LEFT_PAREN logico1 TKN_RIGHT_PAREN
        ;
        
valor   : TRUE
         | FALSE
         | TKN_NUMBER
         | TKN_TEXT
         ;

integrada : palabrasfuncionales TKN_PERIOD ID TKN_LEFT_PAREN parametros TKN_RIGHT_PAREN
          ;

palabrasfuncionales   : TEXTWINDOW
         | ARRAY
         | STACK
         | PROGRAM
         ;
         
parametros  : logico1 parametrosp
         |
         ;
         
parametrosp  : TKN_COMMA parametros
         |
         ;
                 
comandos  : comando comandos
         |
         ;   
         
si  : IF TKN_LEFT_PAREN logico1 TKN_RIGHT_PAREN THEN comandos sinosis sino ENDIF 
         ; 
         
sinosis  : ELSEIF TKN_LEFT_PAREN logico1 TKN_RIGHT_PAREN THEN comandos sinosis 
         |
         ;              
                  
sino  : ELSE comandos
        |
        ;
        
mientras  : WHILE TKN_LEFT_PAREN logico1 TKN_RIGHT_PAREN  comandos ENDWHILE
         ; 
         
para  : FOR identificador  TKN_EQUALS logico1 TO logico1 paso comandos ENDFOR 
         ;              
                  
paso  : STEP aritmetica1
        |
        ;
        
funcion   : SUB ID comandos ENDSUB
         ;

ir : GOTO ID
          ;


COMMENT       : '\'' ~[\r\n]* -> skip ;
WS    : [ \t\r\n]+ -> skip ;
TKN_EQUALS : '=';
TKN_COLON : ':';
TKN_LEFT_PAREN : '(';
TKN_RIGHT_PAREN : ')';
TKN_LEFT_BRAC : '[';
TKN_RIGHT_BRAC : ']';
OR : 'Or';
AND : 'And';
TKN_GEQ : '>=';
TKN_LEQ : '<=';
TKN_DIFF : '<>';
TKN_GREATER : '>';
TKN_LESS : '<';
TKN_PLUS : '+';
TKN_MINUS : '-';
TKN_TIMES : '*';
TKN_DIV : '/';
TRUE : '"'('T'|'t')('r'|'R')('u'|'U')('e'|'E') '"';
FALSE : '"'('F'|'f')('A'|'a')('L'|'l')('s'|'S')('e'|'E') '"';
TKN_PERIOD : '.';
TKN_COMMA : ',';
TEXTWINDOW : 'TextWindow';
ARRAY : 'Array';
STACK : 'Stack';
PROGRAM : 'Program';
IF : 'If';
THEN : 'Then';
ENDIF : 'EndIf';
ELSEIF : 'ElseIf';
ELSE : 'Else';
WHILE : 'While';
ENDWHILE : 'EndWhile';
FOR : 'For';
TO : 'To';
ENDFOR : 'EndFor';
STEP : 'Step';
SUB : 'Sub';
ENDSUB : 'EndSub';
GOTO : 'Goto';
TKN_NUMBER : [0-9]+('.'[0-9]*)?;
TKN_TEXT : ('"' (~[\\\r\n\f"])* '"');
ID: [a-zA-Z]+[a-zA-Z_0-9Ññç]*;  //^[a-zA-ZÑñçÀ-ÿ]\w*
