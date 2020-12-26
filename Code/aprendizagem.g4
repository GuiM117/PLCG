grammar aprendizagem;

@header{
        import java.util.*;
}

@members{
         public class Recurso{
            String id;
            String nome;
            String descricao;
            String idadeIdeal;
            List<String> caracteristicas;
         
            public Recurso(String id, String nome, String descricao, String idadeIdeal){
               this.id = id;
               this.nome = nome;
               this.descricao = descricao;
               this.idadeIdeal = idadeIdeal;
            }

            public Recurso(String id, String nome, String descricao, String idadeIdeal, List<String> caracteristicas){
                this.id = id;
                this.nome = nome;
                this.descricao = descricao;
                this.idadeIdeal = idadeIdeal;
                this.caracteristicas = new ArrayList<String>();//is there anyway I can do this here instead of 6 lines up?
                this.caracteristicas = caracteristicas;
            }
        
        }
         
        public class Aluno{
            String nomeAluno;
            String numero;
            String idadeAluno;
            List<String> caracteristicas = new ArrayList<String>();
            
            public Aluno(String nomeAluno, String numero, String idadeAluno, List<String> caracteristicas){   
                this.nomeAluno = nomeAluno;                                                                                           
                this.numero = numero;
                this.idadeAluno = idadeAluno;
                this.caracteristicas = caracteristicas;
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
        //Imprime HashMap de Alunos
        aux.forEach((k,v) -> {
            System.out.println("HMA KEY: " + k + " VALUE: [ "+v.nomeAluno+v.numero+v.idadeAluno+"]");
            for(int i = 0; i < v.caracteristicas.size(); i++) {   
                System.out.print("CARACTERISTICA-A{"+v.caracteristicas.get(i)+"}");
           }
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
    : nomeAluno numero idadeAluno caracteristicas
    {
     Aluno a = new Aluno($nomeAluno.text, $numero.text, $idadeAluno.text, $caracteristicas.caracteristicasOut);
     //adicionar Aluno ao HashMap
     $aluno.alunosHashIn.put($numero.text,a);

     System.out.println("------------");
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

listaRecursos
@init  {
        HashMap<String, Recurso> aux = new HashMap<String, Recurso>(); 
       }
@after {
        //Imprime HashMap de Recursos
        aux.forEach((k,v) -> {
            System.out.println("HMR KEY: " + k + " VALUE: [ "+v.id+v.nome+v.descricao+v.idadeIdeal+"]");
            for(int i = 0; i < v.caracteristicas.size(); i++) {   
                System.out.print("CARACTERISTICA-R{"+v.caracteristicas.get(i)+"}");
           }
        });
       }  
    
      : r1 = rA[aux] {
                aux=$r1.recursoHashOut;
             }
   (';' r2 = rA[aux]{
                aux=$r2.recursoHashOut;
             })*
    ;

rA  [HashMap<String,Recurso> recursoHashIn]
      returns[HashMap<String,Recurso> recursoHashOut] 
@after{
        $rA.recursoHashOut=$rA.recursoHashIn;
      }
    : idRecurso nomeRecurso descr idadeIdeal caracteristicas
    {
    Recurso r = new Recurso($idRecurso.text, $nomeRecurso.text, $descr.text, $idadeIdeal.text, $caracteristicas.caracteristicasOut);
    //adicionar Recurso ao HashMap
    $rA.recursoHashIn.put($idRecurso.text,r);

    System.out.println("------------");
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
                   // System.out.print("Processar CONCEITOS");
                  }
    ;
//Recurso ensina um conceito de Programacao
listaConceitos:
    cProg
    (';' cProg)*
    ;

cProg: idConceito nomeConceito curso
    {
    System.out.println("------------");
    System.out.println("ID: " + $idConceito.text);
    System.out.println("Conceito: " + $nomeConceito.text);
    System.out.println("Curso: " + $curso.text);
    System.out.println("------------");
    }
    ;

//caracteristicas------------------------------------------------------------------------------
//IMPORTANTE- ao adicionar o range (pode ser de 0-10/100) tem de se criar o objeto caracterista, e fica ArrayList<Caracteristica> aux

caracteristicas returns [ArrayList<String> caracteristicasOut]
@init    {
          ArrayList<String> aux = new ArrayList<String>(); 
         }
@after { 
         $caracteristicas.caracteristicasOut = aux;
       }    
    : LPAREN 
           caracteristica {
                           System.out.print("<c1 "+$caracteristica.car+"="+$caracteristica.ran+ "c1>");
                           //Caracteristica
                           aux.add($caracteristica.car);
                          } 
      (',' caracteristica {
                           System.out.print("<c2 "+$caracteristica.car+"="+$caracteristica.ran+ " c2>");
                           aux.add($caracteristica.car);
                          })*
      RPAREN
     ;

//IMPORTANTE - está caracteristica=range para testar, (caracteristica,range) 
caracteristica returns[String car, String ran]
    : PALAVRA '=' range{ 
                        $caracteristica.car = $PALAVRA.text;
                        $caracteristica.ran = $PALAVRA.text;
                       }
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
range: NUM
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