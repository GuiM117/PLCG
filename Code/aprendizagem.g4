grammar aprendizagem;

@header{
        import java.util.*;
}

@members{
         public class Questao{
            public boolean adequa(int idadeA, int idadeR, List<Caracteristica> caracteristicasA, List<Caracteristica> caracteristicasR){
                //verficar se a idade do recurso se adequa à idade do aluno
                if(idadeR-idadeA <= 6 | idadeR-idadeA >= -6){
                    //verficar se as caracteristicas do recurso se adequam às caracteristicas do aluno
                    int c=0;
                    for(Caracteristica cR : caracteristicasR){
                        for(Caracteristica cA : caracteristicasA){
                            if(cA.nomeCar.equals(cR.nomeCar)){
                                //System.out.print("=CARACTERISTICA ADEQUADA"+cA.nomeCar+cR.nomeCar+"=");
                                return true;
                            }else{
                                //System.out.print("=CARACTERISTICA DIFERENTE "+cA.nomeCar+cR.nomeCar+" =");                
                            }
                        }
                    }
                    return false;
                }else{
                    System.out.print("A IDADE DO RECURSO NAO SE ADEQUA AO ALUNO");
                    return false;
                }
            }                  
         }
         
         //RECURSO---
         public class Recurso{
            String id;
            String nome;
            String descricao;
            int idadeIdeal;
            List<Caracteristica> caracteristicas;
         
            public Recurso(String id, String nome, String descricao, int idadeIdeal){
               this.id = id;
               this.nome = nome;
               this.descricao = descricao;
               this.idadeIdeal = idadeIdeal;
            }

            public Recurso(String id, String nome, String descricao, int idadeIdeal, List<Caracteristica> caracteristicas){
                this.id = id;
                this.nome = nome;
                this.descricao = descricao;
                this.idadeIdeal = idadeIdeal;
                this.caracteristicas = new ArrayList<Caracteristica>();
                this.caracteristicas = caracteristicas;
            }
        
         }
         
         //ALUNO---
         public class Aluno{
            String nomeAluno;
            String numero;
            int idadeAluno;
            List<Caracteristica> caracteristicas = new ArrayList<Caracteristica>();
            
            public Aluno(String nomeAluno, String numero, int idadeAluno, List<Caracteristica> caracteristicas){   
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
            String subConceito;
            String curso;
            List<String> idsRecurso;

            public Conceito(String idConceito, String nomeConceito, String subConceito, String curso, List<String> idsRecurso){   
                this.idConceito = idConceito;
                this.nomeConceito = nomeConceito;
                this.subConceito = subConceito;
                this.curso = curso;
                this.idsRecurso = idsRecurso;
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
    /*
    System.out.print("ESTRUTURAS DE DADOS");
    
    System.out.print("HASHMAP ALUNOS");
    $questao.alunosHash.forEach((k,v) -> {
        System.out.println("[KEY/ID: " + k + 
                           " NOME: "+v.nomeAluno+
                           " NUMERO: "+v.numero+
                           " IDADE: "+v.idadeAluno+
                           "]");
        for(int i = 0; i < v.caracteristicas.size(); i++) {   
            Caracteristica c = v.caracteristicas.get(i);
            System.out.print("CARACTERISTICA ALUNO("+c.nomeCar+" , "+c.escala+")");
        }
    });
    
    System.out.print("HASHMAP RECURSOS");
    $questao.recursosHash.forEach((k,v) -> {
        System.out.println("[KEY/ID: " + k + 
                           " NOME: "+v.nome+
                           " DESCRICAO"+v.descricao+
                           " IDADE IDEAL"+v.idadeIdeal+
                           "]");
        for(int i = 0; i < v.caracteristicas.size(); i++) {   
            Caracteristica c = v.caracteristicas.get(i);
            System.out.print("CARACTERISTICA RECURSO("+c.nomeCar+" , "+c.escala+")");
       }
    });    
    
    System.out.print("HASHMAP CONCEITOS");
    $questao.conceitosHash.forEach((k,v) -> {
        System.out.print("[KEY/ID: " + k +
                                " IDCONCEITO "+v.idConceito+
                                " NOMECONCEITO "+v.nomeConceito+
                                " SUBCONCEITO "+v.subConceito+
                                " CURSO "+v.curso);
        v.idsRecurso.forEach(value -> System.out.println(" IDSRECURSO "+value+" "));
        System.out.print("]");
    });    
    */

}
       : 'QUESTAO' 
            numeroAluno idConceito {

                                System.out.print("QUESTAO");
                                
                                //Consultar caracteristicas do aluno
                                Aluno a = $questao.alunosHash.get($numeroAluno.text);
                                
                                if(a!=null){
                                    List<Caracteristica> caracteristicasA = a.caracteristicas;

                                    //Consultar o conceito 
                                    if($questao.conceitosHash.containsKey($idConceito.text)){
                                        Conceito c = $questao.conceitosHash.get($idConceito.text);

                                        List<String> conceitos = c.idsRecurso; //lista ids Recurso
                                        List<String> adequados = new ArrayList<String>();
                                        conceitos.forEach(value -> {
                                            //consultar recurso
                                            Recurso r = $questao.recursosHash.get(value);
                                            if(r!=null){
                                                Questao q = new Questao();
                                                if(q.adequa(a.idadeAluno,r.idadeIdeal, caracteristicasA, r.caracteristicas)){
                                                    System.out.print("!ADEQUA-SE!");
                                                    //guardar na lista de recursos adequados
                                                    adequados.add(r.id);
                                                }else{
                                                    System.out.print("!NAO SE ADEQUA!");
                                                }

                                            }else{
                                                System.out.print("O RECURSO "+value+" NAO EXISTE");
                                            }
                                          
                                        });

                                        System.out.print("RETURN --><--");
                                        adequados.forEach(value -> System.out.print(value));
                                        System.out.print("<--");

                                    }else{
                                        System.out.print("O CONCEITO "+$idConceito.text+" NAO EXISTE");
                                    }
                                }else{
                                    System.out.print("O ALUNO "+$numeroAluno.text+" NAO EXISTE");

                                }
                                
                                System.out.print("QUETAO END");
                               }
       ;


//alunos------------------------------------------------------------------------------------
alunos
       returns[HashMap<String, Aluno> alunosHash]
@init  {
        HashMap<String, Aluno> aux = new HashMap<String, Aluno>(); 
       }  
@after {
      
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
     int idade = Integer.parseInt($idadeAluno.text);
     Aluno a = new Aluno($nomeAluno.text, $numeroAluno.text, idade, $caracteristicas.caracteristicasOut);
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
        $recursos.recursosHash = aux;
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
     int idade = Integer.parseInt($idadeIdeal.text);

     Recurso r = new Recurso($idRecurso.text, $nomeRecurso.text, $descr.text, idade, $caracteristicas.caracteristicasOut);
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
       }  
    
      : CONCEITOS
        
        c1 = cProg[aux] {
                aux=$c1.conceitoHashOut;
             }
   (';' c2 = cProg[aux]{
                aux=$c2.conceitoHashOut;
             })*
    ;


cProg[HashMap<String, Conceito> conceitoHashIn]
      returns[HashMap<String, Conceito> conceitoHashOut] 
@after{
        $cProg.conceitoHashOut=$cProg.conceitoHashIn;
      }
                                
    : idConceito nomeConceito subConceito curso listaIdRecurso
    {
     Conceito c = new Conceito($idConceito.text, $nomeConceito.text, $subConceito.text, $curso.text, $listaIdRecurso.listaIdRecOut);        

     if($cProg.conceitoHashIn.containsKey($idConceito.text)){
        System.out.println("Key existente - Não é possível inserir o conceito "+c.idConceito);
     }else{
        $cProg.conceitoHashIn.put($idConceito.text, c);
        System.out.println("Nova Key - Conceito inserido "+c.idConceito);
     }
     
     System.out.println("------------");
     System.out.println("ID CON: " + $idConceito.text);
     $listaIdRecurso.listaIdRecOut.forEach(value -> System.out.print("ID REC: " +value+" "));
     System.out.println("Conceito: " + $nomeConceito.text);
     System.out.println("Curso: " + $curso.text);
     System.out.println("SubConceito: " + $subConceito.text);
     System.out.println("------------");
     
    }
    ;


listaIdRecurso
        returns [ArrayList<String> listaIdRecOut]
@init {
        ArrayList<String> aux = new ArrayList<String>();
      }
@after { 
         $listaIdRecurso.listaIdRecOut = aux;
       } 
       : LPAREN
            idRecurso{
                      aux.add($idRecurso.text);
                     }
     
       (',' idRecurso{
                      aux.add($idRecurso.text);
                     })*
       RPAREN

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
                           Caracteristica c1 = new Caracteristica($caracteristica.car, $caracteristica.escal);
                           aux.add(c1);
                          } 
      (',' caracteristica {
                           Caracteristica c2 = new Caracteristica($caracteristica.car, $caracteristica.escal);
                           aux.add(c2);
                          })*
      RPAREN
     ;

caracteristica returns[String car, String escal]
    : '(' PALAVRA ',' escala ')' { 
                                  $caracteristica.car = $PALAVRA.text;
                                  $caracteristica.escal = $escala.esc;
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
subConceito: PALAVRA
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