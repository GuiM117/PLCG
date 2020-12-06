grammar aprendizagem;

// ------------------------------------------ PARSER ---------------------------------------

main: alunos recursos conceitos
    ;

alunos: ALUNOS
    listaAlunos
    PONTO
    ;
recursos: RECURSOS
    listaRecursos
    PONTO
    ;
conceitos: conceito*;

listaRecursos:
    recurso
    (PONTOVIRGULA recurso)*
    ;
recurso: idRecurso nomeRecurso descr idadeIdeal caracteristicas {/* recurso ter um intervalo de idade e não idadeIdeal ou intervalo acima da idadeIdeal*/}
    ;
listaAlunos:
    aluno
    (PONTOVIRGULA aluno)*
    ;
aluno: nomeAluno numero idadeAluno caracteristicas
    {
     System.out.println("Aluno: " + $nomeAluno.text);
     System.out.println("numero: " + $numero.text);
     System.out.println("Idade: " + $idadeAluno.text);
     System.out.println("------------");
    }
    ;
caracteristicas returns [ArrayList<String> listaCarateristicasAluno = new ArrayList<String>();]: LPAREN
     caracteristica {System.out.println("Caracteristica: " + $caracteristica.text);}
     (VIRGULA caracteristica)* { if($listaCarateristicasAluno.contains($caracteristica.text) System.out.println("Característica já existente.");
                                else System.out.println("Caracteristica: " + $caracteristica.text);}
     RPAREN
     ;
conceito: idConceito nomeConceito curso
    ;

temRecurso: numero idRecurso
          ;

temConceito: idRecurso idConceito
           ;

idadeAluno: NUM
     ;
idadeIdeal: NUM
     ;
caracteristica: PALAVRA
     ;
nomeAluno: PALAVRA
    ;
idConceito: NUM
          ;
nomeConceito: PALAVRA
    ;
descr: PALAVRA+
    ;
idRecurso: NUM
    ;

nomeRecurso: PALAVRA
           ;

curso: PALAVRA+;

numero: NUMEROALUNO
       ;


// ------------------------------------------ LEXER ---------------------------------------
ALUNOS: [aA][lL][uU][nN][oO][sS];
RECURSOS: [rR][eE][cC][uU][rR][sS][oO][sS];
VIRGULA: ',';
PONTOVIRGULA: ';';
PONTO: '.';
LPAREN: '[';
RPAREN: ']';
NUM: ('0'..'9')+ //[0-9]+
   ;
NUMEROALUNO: ('A')[0-9]+
    ;

PALAVRA: [a-zA-Z][a-zA-Z0-9]*
       ;

WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;