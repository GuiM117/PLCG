grammar aprendizagem;

@members{

     /* Definir objectos...

     public class aluno(){
        private String nome;
        private int numero;
        private int idade;
        private List<String> caracteristicas;
        ...
     }
     public class recurso(){
        private int id;
        private String nome;
        private String descricao;
        private List<String> caracteristicasR;
        ...
     }
     public class conceito(){
        private int id;
        private String nome;
        private String descricao;
        ...
     }*/
}

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
recurso: id descr idadeIdeal caracteristicas {/* recurso ter um intervalo de idade e não idadeIdeal ou intervalo acima da idadeIdeal*/}
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
caracteristicas: LPAREN
     caracteristica {System.out.println("Caracteristica: " + $caracteristica.text);}
     (VIRGULA caracteristica)* {System.out.println("Caracteristica: " + $caracteristica.text);}
     RPAREN
     ;
conceito: nomeConceito curso
    ;
idadeAluno: NUM
     ;
idadeIdeal: NUM
     ;
caracteristica: PALAVRA
     ;
nomeAluno: PALAVRA
    ;
nomeConceito: PALAVRA
    ;
descr: PALAVRA+
    ;
id: NUM
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
LPAREN: '(';
RPAREN: ')';
NUM: ('0'..'9')+ //[0-9]+
   ;
NUMEROALUNO: ('A')[0-9]+
    ;

PALAVRA: [a-zA-Z][a-zA-Z0-9]*
       ;

WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;