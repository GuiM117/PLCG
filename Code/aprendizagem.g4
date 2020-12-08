grammar aprendizagem;

@header{
        import java.util.*;
}

@members{
         public class Aluno{
                     String numero;
                     String nomeAluno;
                     String idadeAluno;
                     List<String> caracteristicas = new ArrayList<>();
         
         //contrutor Aluno
         /*
         public Aluno(String num, String nome, String i){
            this.numero=num;
            this.nomeAluno=nome;
            this.idadeAluno=i;
         }
         */
           public String toString(){
                 StringBuffer sb = new StringBuffer();
                 sb.append(this.numero+"; ");
                 sb.append(this.nomeAluno+"; ");
                 sb.append(this.idadeAluno+". ");
                 return sb.toString();
                 }
           }
}
         


// ------------------------------------------ PARSER ---------------------------------------


cNe: alunos recursos conceitos
    ;
//alunos------------------------------------------------------------------------------------
alunos: ALUNOS
    listaAlunos {
                    System.out.print("Processar ALUNOS");
                   //falta passar o HashMap com os alunos para aqui
                }
    ;

listaAlunos 
            returns[int contaAlunos, HashMap<String, Aluno> aux]
@init  {
        HashMap<String, Aluno> aux = new HashMap<String, Aluno>(); 
       }
@after {
        System.out.print("Numero de Alunos: "+$listaAlunos.contaAlunos);
        //Imprime HashMap de Alunos
        aux.forEach((k,v) -> {
            System.out.println(" KEY: "+k + " VALUE: [" + v + v.caracteristicas+"]");
        });
       }
        
        : a1 = aluno[aux]{
                $listaAlunos.contaAlunos=1;
                aux=$a1.alunosHashOut;
               } 
     (';' a2 = aluno[aux]{
                $listaAlunos.contaAlunos++;
                aux=$a2.alunosHashOut;
               })*
 
;
aluno [HashMap<String,Aluno> alunosHashIn]
      returns[ String num, HashMap<String,Aluno> alunosHashOut]  
@after {
        $aluno.alunosHashOut = $aluno.alunosHashIn;
       }
    : nomeAluno numero idadeAluno c=caracteristicas
    {
     //Usar contrutor Aluno a = new Aluno($numero.text, $nomeAluno.text, $idadeAluno.text);
     Aluno a = new Aluno();
     a.numero=$numero.text;
     a.nomeAluno=$nomeAluno.text;
     a.idadeAluno=$idadeAluno.text;
     //importante
     a.caracteristicas=$caracteristicas.caracteristicasOut;
     //Imprime ArrayList características do aluno
     for(int i = 0; i < a.caracteristicas.size(); i++) {   
            System.out.print("{"+a.caracteristicas.get(i)+"}");
     }
     //adicionar Aluno ao HashMap
     $aluno.alunosHashIn.put($numero.text,a);

     System.out.println("Aluno: " + $nomeAluno.text);
     System.out.println("numero: " + $numero.text);
     System.out.println("Idade: " + $idadeAluno.text);
     System.out.println("Características: " + $caracteristicas.text);     
     System.out.println("------------");
    
    }
    ;

//recursos------------------------------------------------------------------------------------
recursos: RECURSOS
    listaRecursos {
                    System.out.print("Processar RECURSOS");
                  }
   ;

listaRecursos:
    rA
    (PONTOVIRGULA rA)*
    ;

rA: idRecurso nomeRecurso descr idadeIdeal caracteristicas
    {
    System.out.println("ID: " + $idRecurso.text);
    System.out.println("Recurso: " + $nomeRecurso.text);
    System.out.println("Descrição: " + $descr.text);
    System.out.println("Idade Ideal: " + $idadeIdeal.text);
    System.out.println("Caracteristicas: " + $caracteristicas.text);
    System.out.println("------------");
    }
  ;

//conceitos------------------------------------------------------------------------------------
conceitos: CONCEITOS
    listaConceitos{
                    System.out.print("Processar CONCEITOS");
                   }
    ;

listaConceitos:
    cProg
    (';' cProg)*
    ;

cProg: idConceito nomeConceito curso
    {
    System.out.println("ID: " + $idConceito.text);
    System.out.println("Conceito: " + $nomeConceito.text);
    System.out.println("Curso: " + $curso.text);
    System.out.println("------------");
    }
    ;

//caracteristicas------------------------------------------------------------------------------
caracteristicas returns [ArrayList<String> caracteristicasOut]
@init    {
          System.out.println("INIT");
          ArrayList<String> aux = new ArrayList<String>(); 
         }
@after { 
         $caracteristicas.caracteristicasOut = aux;
       }    
    : LPAREN 
           caracteristica {
                           System.out.print("<c1 "+$caracteristica.car+" c1>");
                           aux.add($caracteristica.car);
                          } 
      (',' caracteristica {
                           System.out.print("<c2 "+$caracteristica.car+" c2>");
                           aux.add($caracteristica.car);
                          })*
      RPAREN
     ;

caracteristica returns[String car]
    : PALAVRA { $caracteristica.car = $PALAVRA.text;}
    ;

//--------------------------------------------------------------------------------------------
idadeAluno: NUM
     ;
idadeIdeal: NUM
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
curso: PALAVRA
    ;
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

IDRECURSO: ('rA')[0-9]+
    ;
IDCONCEITO: ('cPrg')[0-9]+
    ;
PALAVRA: [a-zA-Z][a-zA-Z0-9]*('+'|'#')*
       ;
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip; 
