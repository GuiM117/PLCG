grammar aprendizagem;

@header{
        import java.util.*;
}

@members{
         
         //RECURSO---
         public class Recurso{
            String id;
            String nome;
            String descricao;
            String idadeIdeal;
            List<Caracteristica> caracteristicas;
         
            public Recurso(String id, String nome, String descricao, String idadeIdeal){
               this.id = id;
               this.nome = nome;
               this.descricao = descricao;
               this.idadeIdeal = idadeIdeal;
            }

            public Recurso(String id, String nome, String descricao, String idadeIdeal, List<Caracteristica> caracteristicas){
                this.id = id;
                this.nome = nome;
                this.descricao = descricao;
                this.idadeIdeal = idadeIdeal;
                this.caracteristicas = new ArrayList<Caracteristica>();//is there anyway I can do this here instead of 6 lines up?
                this.caracteristicas = caracteristicas;
            }
        
         }
         
         //ALUNO---
         public class Aluno{
            String nomeAluno;
            String numero;
            String idadeAluno;
            List<Caracteristica> caracteristicas = new ArrayList<Caracteristica>();
            
            public Aluno(String nomeAluno, String numero, String idadeAluno, List<Caracteristica> caracteristicas){   
                this.nomeAluno = nomeAluno;                                                                                           
                this.numero = numero;
                this.idadeAluno = idadeAluno;
                this.caracteristicas = caracteristicas;
            }
         }
        //CONCEITO---
         public class Conceito{
            String idConceito;
            String nomeConceito;
            String curso;
            List<String> ensina = new ArrayList<String>();
            
            public Conceito(String idConceito, String nomeConceito, String curso, List<String> ensina){   
                this.idConceito = idConceito;                                                                                           
                this.nomeConceito = nomeConceito;
                this.curso = curso;
                this.ensina = ensina;
            }
        }
         
        public class Caracteristica{
            String nomeCar;
            String escala;
            
            public Caracteristica(String nomeCar, String escala){
                this.nomeCar = nomeCar;
                this.escala = escala;
            }
        }
    } 


// ------------------------------------------ PARSER ---------------------------------------


cNe: alunos recursos conceitos questao[$alunos.alunosHash, $recursos.recursosHash, $conceitos.conceitosHash]
    ;


questao [HashMap<String, Aluno> alunosHash, HashMap<String, Recurso> recursosHash, HashMap<String, Conceito> conceitosHash]
@after{

}
       : 'QUESTAO' 
            //podia ficar numeroAluno nomeConceito subConceito
            numeroAluno nomeConceito {
                                      
                                     }
       ;


//alunos------------------------------------------------------------------------------------
alunos
       returns[HashMap<String, Aluno> alunosHash]
@init  {
        HashMap<String, Aluno> aux = new HashMap<String, Aluno>(); 
       }  
@after {
        System.out.print("-----HASHMAP ALUNOS PRODUCAO TOP---");
        $al.auxOut.forEach((k,v) -> {
            System.out.println("HMAA KEY: " + k + " VALUE: [ NOME: "+v.nomeAluno+" NUMERO: "+v.numero+" IDADE: "+v.idadeAluno+"]");
            for(int i = 0; i < v.caracteristicas.size(); i++) {   
                //System.out.print("CARACTERISTICA-A{"+v.caracteristicas.get(i)+"}");
                Caracteristica c = v.caracteristicas.get(i);
                System.out.print("CARACTERISTICA-A{"+c.nomeCar+"|"+c.escala+"}");
           }
        });
       }
    : ALUNOS
        al = listaAlunos[aux] {
                                $alunos.alunosHash = $al.auxOut; //mesmo que estar no after
                              }
    ;

listaAlunos [HashMap<String, Aluno> auxIn]
            returns[HashMap<String, Aluno> auxOut]
@after {
        $listaAlunos.auxOut=$listaAlunos.auxIn;
        //Imprime HashMap de Alunos
        $listaAlunos.auxOut.forEach((k,v) -> {
            System.out.println("HMA KEY: " + k + " VALUE: [ "+v.nomeAluno+v.numero+v.idadeAluno+"]");
            for(int i = 0; i < v.caracteristicas.size(); i++) {   
                //System.out.print("CARACTERISTICA-A{"+v.caracteristicas.get(i)+"}");
                Caracteristica c = v.caracteristicas.get(i);
                System.out.print("CARACTERISTICA-A{"+c.nomeCar+"|"+c.escala+"}");
           }
        });
       }
        
        : a1 = aluno[$listaAlunos.auxIn]{
                $listaAlunos.auxIn=$a1.alunosHashOut;
               } 
     (';' a2 = aluno[auxIn]{
                $listaAlunos.auxIn=$a2.alunosHashOut;
               })*
 
;
aluno [HashMap<String,Aluno> alunosHashIn]
      returns[ String num, HashMap<String,Aluno> alunosHashOut]  
@after {
        $aluno.alunosHashOut = $aluno.alunosHashIn;
       }
    : nomeAluno numeroAluno idadeAluno caracteristicas
    {
     Aluno a = new Aluno($nomeAluno.text, $numeroAluno.text, $idadeAluno.text, $caracteristicas.caracteristicasOut);
     //adicionar Aluno ao HashMap
     $aluno.alunosHashIn.put($numeroAluno.text,a);

     System.out.println("------------");
     System.out.println("Aluno: " + $nomeAluno.text);
     System.out.println("Numero: " + $numeroAluno.text);
     System.out.println("Idade: " + $idadeAluno.text);
     System.out.println("Características: " + $caracteristicas.text);     
     System.out.println("------------");
    
    }
    ;

//recursos------------------------------------------------------------------------------------

recursos
        returns [HashMap<String, Recurso> recursosHash]
@init  {
        HashMap<String, Recurso> aux = new HashMap<String, Recurso>(); 
       }
@after {
        //Imprime HashMap de Recursos
        $recursos.recursosHash = aux;
        aux.forEach((k,v) -> {
            System.out.println("HMR KEY: " + k + " VALUE: [ "+v.id+v.nome+v.descricao+v.idadeIdeal+"]");
            for(int i = 0; i < v.caracteristicas.size(); i++) {   
                //System.out.print("CARACTERISTICA-R{"+v.caracteristicas.get(i)+"}");
                Caracteristica c = v.caracteristicas.get(i);
                System.out.print("CARACTERISTICA-R{"+c.nomeCar+"|"+c.escala+"}");
           }
        });
       }  
    
      : RECURSOS
          
         r1 = rA[aux]{
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


conceitos
         returns[HashMap<String, Conceito> conceitosHash]
@init  {
        HashMap<String, Conceito> aux = new HashMap<String, Conceito>(); 
       }
@after {
        $conceitos.conceitosHash = aux;
        //Imprime HashMap de Conceitos
        aux.forEach((k,v) -> {
            System.out.println("HMC KEY: " + k + " VALUE: [ "+v.idConceito+v.nomeConceito+v.curso+"]");
            for(int i = 0; i < v.ensina.size(); i++) {   
                //System.out.print("CARACTERISTICA-R{"+v.caracteristicas.get(i)+"}");
                System.out.print("IDS RECURSOS{"+v.ensina.get(i)+"}");
           }
        });
       }  
    
      : CONCEITOS
        
        c1 = cProg[aux] {
                aux=$c1.conceitoHashOut;
             }
   (';' c2 = cProg[aux]{
                aux=$c2.conceitoHashOut;
             })*
    ;

cProg[HashMap<String,Conceito> conceitoHashIn]
      returns[HashMap<String,Conceito> conceitoHashOut] 
@after{
        $cProg.conceitoHashOut=$cProg.conceitoHashIn;
      }
    
    : ensina nomeConceito curso listaSubConceitos
    {
     Conceito c = new Conceito($ensina.idCon, $nomeConceito.text, $curso.text, $ensina.listaIdRec);
     
     //adicionar Conceito ao HashMap
     $cProg.conceitoHashIn.put($ensina.idCon,c);

     System.out.println("------------");
     //System.out.println("ID: " + $ensina.idCon);
     System.out.println("ID: " + $ensina.idCon);
     System.out.println("Conceito: " + $nomeConceito.text);
     System.out.println("Curso: " + $curso.text);
     System.out.println("------------");
    }
    ;

ensina 
        returns[String idCon, ArrayList<String> listaIdRec]
@init    {
          ArrayList<String> aux = new ArrayList<String>();
         }
    : LPAREN 
        idConceito ':' lIds = listaIdRecurso[aux] {     
                                $ensina.idCon = $idConceito.text;
                                $ensina.listaIdRec = $lIds.listaIdRecOut;
                              }
      RPAREN 

       ;

listaIdRecurso [ArrayList<String> listaIdRecIn]
        returns [ArrayList<String> listaIdRecOut]
@after { 
         $listaIdRecurso.listaIdRecOut =  $listaIdRecurso.listaIdRecIn;
       } 
        :   idRecurso{
                      $listaIdRecurso.listaIdRecIn.add($idRecurso.text);
                     }
     
       (',' idRecurso{
                      $listaIdRecurso.listaIdRecIn.add($idRecurso.text);
                     })*

;

listaSubConceitos
    :LPAREN
            subConceito
     
       (',' subConceito)*
    RPAREN
    ;

subConceito: PALAVRA
    ;

//caracteristicas------------------------------------------------------------------------------

caracteristicas returns [ArrayList<Caracteristica> caracteristicasOut]
@init    {
          ArrayList<Caracteristica> aux = new ArrayList<Caracteristica>();
         }
@after { 
         $caracteristicas.caracteristicasOut = aux;
       }    
    : LPAREN 
           caracteristica {
                           System.out.print("<c1 "+$caracteristica.car+"="+$caracteristica.escal+ "c1>");
                           Caracteristica c1 = new Caracteristica($caracteristica.car, $caracteristica.escal);
                           aux.add(c1);
                          } 
      (',' caracteristica {
                           System.out.print("<c2 "+$caracteristica.car+"="+$caracteristica.escal+ " c2>");
                           Caracteristica c2 = new Caracteristica($caracteristica.car, $caracteristica.escal);
                           aux.add(c2);
                          })*
      RPAREN
     ;

caracteristica returns[String car, String escal]
    : '(' PALAVRA ',' escala ')' { 
                                  $caracteristica.car = $PALAVRA.text;
                                  $caracteristica.escal = $escala.esc; //acho que dá para fazer só $escala.text
                                 }
    ;

escala  returns[String esc]
    : NUM {
            $escala.esc = $NUM.text;
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
numeroAluno: NUMEROALUNO
    ;



// ------------------------------------------ LEXER ---------------------------------------
ALUNOS: [aA][lL][uU][nN][oO][sS];
RECURSOS: [rR][eE][cC][uU][rR][sS][oO][sS];
CONCEITOS: [cC][oO][nN][cC][eE][iI][tT][oO][sS];
//QUESTAO: [qQ][eE][sS][tT][aA][oO];
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