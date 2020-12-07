grammar aprendizagem;

// ------------------------------------------ PARSER ---------------------------------------

cNe: alunos recursos conceitos
    ;

alunos: ALUNOS
    listaAlunos
    PONTO
    ;
recursos: RECURSOS
    listaRecursos
    PONTO
    ;
conceitos: CONCEITOS
    listaConceitos
    PONTO
    ;

listaRecursos:
    rA
    (PONTOVIRGULA rA)*
    ;
listaAlunos:
    aL
    (PONTOVIRGULA aL)*
    ;
listaConceitos:
    conceito
    (PONTOVIRGULA conceito)*
    ;
rA: idRecurso nomeRecurso descr idadeIdeal caracteristicas
    {
    /* recurso ter um intervalo de idade e não idadeIdeal ou intervalo acima da idadeIdeal*/
    System.out.println("ID: " + $idRecurso.text);
    System.out.println("Recurso: " + $nomeRecurso.text);
    System.out.println("Descrição: " + $descr.text);
    System.out.println("Idade Ideal: " + $idadeIdeal.text);
    System.out.println("------------");
    }
    ;
aL: nomeAluno numero idadeAluno caracteristicas
    {
     System.out.println("Aluno: " + $nomeAluno.text);
     System.out.println("numero: " + $numero.text);
     System.out.println("Idade: " + $idadeAluno.text);
     System.out.println("------------");
    }
    ;
conceito: idConceito nomeConceito curso
    {
    System.out.println("ID: " + $idConceito.text);
    System.out.println("Conceito: " + $nomeConceito.text);
    System.out.println("Curso: " + $curso.text);
    System.out.println("------------");
    }
    ;
caracteristicas returns [ArrayList<String> listaCarateristicasAluno = new ArrayList<String>();]: LPAREN
     caracteristica {System.out.println("Caracteristica: " + $caracteristica.text);}
     (VIRGULA caracteristica)* { if($listaCarateristicasAluno.contains($caracteristica.text)) System.out.println("Característica já existente.");
                                else System.out.println("Caracteristica: " + $caracteristica.text);}
     RPAREN
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
idConceito: IDCONCEITO
          ;
nomeConceito: PALAVRA
    ;
descr: PALAVRA+
    ;
idRecurso: IDRECURSO
    ;

nomeRecurso: PALAVRA
           ;

curso: PALAVRA+;

numero: NUMEROALUNO
       ;


// ------------------------------------------ LEXER ---------------------------------------
ALUNOS: [aA][lL][uU][nN][oO][sS];
RECURSOS: [rR][eE][cC][uU][rR][sS][oO][sS];
CONCEITOS: [cC][oO][nN][cC][eE][iI][tT][oO][sS];
VIRGULA: ',';
PONTOVIRGULA: ';';
PONTO: '.';
LPAREN: '[';
RPAREN: ']';
NUM: ('0'..'9')+ //[0-9]+
   ;
NUMEROALUNO: ('A'|'PG')[0-9]+
    ;
CONCEITO: [a-zA-Z]('+'|'#')*
    ;
IDRECURSO: ('rA')[0-9]+
    ;
IDCONCEITO: ('cPrg')[0-9]+
    ;
PALAVRA: [a-zA-Z][a-zA-Z0-9]*
       ;
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;