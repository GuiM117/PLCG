grammar aprendizagem;

@header{
        import java.util.*;
        import java.lang.*;
}

@members{
         public class Questao{ 
           
           public double adequa(int idadeA, int idadeR, List<Caracteristica> caracteristicasA, List<Caracteristica> caracteristicasR){
                int difIdades = Math.abs(idadeA-idadeR);
                double total = 0.0;
                double difEscala;
                int max;
                if(caracteristicasA.size()>caracteristicasR.size()){
                    max=caracteristicasA.size();
                }else{
                    max=caracteristicasR.size();
                }
                //verficar se a idade do recurso se adequa à idade do aluno
                if(difIdades<=6){
                    //verficar se as caracteristicas do recurso se adequam às caracteristicas do aluno
                    for(Caracteristica cR : caracteristicasR){
                        for(Caracteristica cA : caracteristicasA){
                            if(cR.nomeCar.equals(cA.nomeCar)){
                                difEscala = Math.abs(cR.escala-cA.escala);
                                total+=(10-difEscala)/max;
                            }
                        }  
                    }
                    return total;
                }else{
                    System.out.print("A idade do Recurso não se adequa ao Aluno\n");
                    return total;
                }
           }
           
           public void listarAlunos(HashMap<String,Aluno> alunos){
            alunos.forEach( (k,a) -> {
                    System.out.println("--------------------");
                    System.out.println("ID Aluno:"+a.numero);
                    System.out.println("Nome: "+a.nomeAluno);
                    System.out.println("Idade: " + a.idadeAluno);
                    System.out.println("Caracteristicas: ");
                    System.out.println("[");
                    a.caracteristicas.forEach(value -> System.out.print(" ("+value.nomeCar+","+value.escala+") "));
                    System.out.println("]\n");
                });
           }
           
           public void listarRecursos(HashMap<String,Recurso> recursos){
            recursos.forEach( (k,r) -> {
                    System.out.println("--------------------");
                    System.out.println("ID Recurso:"+r.id);
                    System.out.println("Nome: "+r.nome);
                    System.out.println("Descrição: "+r.descricao);
                    System.out.println("Idade Ideal: " + r.idadeIdeal);
                    System.out.println("Caracteristicas: ");
                    System.out.println("[");
                    r.caracteristicas.forEach(value -> System.out.print(" ("+value.nomeCar+","+value.escala+") "));
                    System.out.println("]\n");
                });
            }
           
           public void listarConceitos(HashMap<String,Conceito> conceitos){       
                conceitos.forEach( (k,c) -> {
                    System.out.println("--------------------");
                    System.out.println("ID Conceito:"+c.idConceito);
                    System.out.println("Nome : "+c.nomeConceito);
                    System.out.println("SubConceito: "+c.subConceito);
                    System.out.println("Curso: " + c.curso);
                    System.out.println("IDs Recurso: ");
                    System.out.println("[");
                    c.idsRecurso.forEach(value -> System.out.print(" " +value+" "));
                    System.out.println("]\n");
                });
           }
           
           public void interativo(){
                //Não implementado
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
        //CARACTERISTICA --
        public class Caracteristica{
            String nomeCar;
            int escala;
            
            public Caracteristica(String nomeCar, int escala){
                this.nomeCar = nomeCar;
                this.escala = escala;
            }
        }
    } 


// ------------------------------------------ PARSER ---------------------------------------


cNe: alunos recursos conceitos questoes[$alunos.alunosHash, $recursos.recursosHash, $conceitos.conceitosHash]
    ;


questoes [HashMap<String, Aluno> alunosHash, HashMap<String, Recurso> recursosHash, HashMap<String, Conceito> conceitosHash]

        : 'QUESTAO' 
            questao[$questoes.alunosHash, $questoes.recursosHash, $questoes.conceitosHash]
            
       (',' questao[$questoes.alunosHash, $questoes.recursosHash, $questoes.conceitosHash])*
    
        ;
    
questao [HashMap<String, Aluno> alunosHash, HashMap<String, Recurso> recursosHash, HashMap<String, Conceito> conceitosHash]
        
    : command [$questao.alunosHash, $questao.recursosHash, $questao.conceitosHash]
    
    | numeroAluno idConceito   
      {
        //Consultar caracteristicas do aluno
        Aluno a = $questao.alunosHash.get($numeroAluno.text);
        if(a!=null){
            List<Caracteristica> caracteristicasA = a.caracteristicas;
            //Consultar o conceito 
            if($questao.conceitosHash.containsKey($idConceito.text)){
                Conceito c = $questao.conceitosHash.get($idConceito.text);
                System.out.print("----------------------------------------------------------------------------------\n");
                System.out.print("Ensinar "+$idConceito.text+": "+c.nomeConceito+","+c.subConceito+" ao Aluno "+$numeroAluno.text+": "+a.nomeAluno+"\n");
                c.idsRecurso.forEach(value -> {
                    //consultar recurso
                    Recurso r = $questao.recursosHash.get(value);
                    if(r!=null){
                        Questao q = new Questao();
                        double total = q.adequa(a.idadeAluno,r.idadeIdeal, caracteristicasA, r.caracteristicas);
                        System.out.print("Classificação "+total+" ID: "+r.id+" Nome: "+r.nome+" Descricao: "+r.descricao+"\n");
                    }else{
                        System.out.print("O Recurso "+value+" não existe\n");
                    }
                });
            }else{
                System.out.print("O Conceito "+$idConceito.text+" não existe\n");
            }
        }else{
            System.out.print("O Aluno "+$numeroAluno.text+" não existe\n");
        }
       }
           
    ;

command [HashMap<String, Aluno> alunosHash, HashMap<String, Recurso> recursosHash, HashMap<String, Conceito> conceitosHash]
      : commandListar commandType
          {
            Questao q = new Questao();

            if($commandType.text.equals("a")){
                q.listarAlunos($command.alunosHash);              
            }else if($commandType.text.equals("r")){
                q.listarRecursos($command.recursosHash);
            }else if($commandType.text.equals("c")){
                q.listarConceitos($command.conceitosHash);
            }else{
                System.out.println("Argumento do comando inválido\n");
            }
          }
      | commandInterativo
        {
            System.out.println("Comando Interativo\n");
        }
        ;

//alunos------------------------------------------------------------------------------------
alunos
       returns[HashMap<String, Aluno> alunosHash]
@init  {
        HashMap<String, Aluno> aux = new HashMap<String, Aluno>(); 
       }  

    : ALUNOS
        al = listaAlunos[aux] {
                                $alunos.alunosHash = $al.auxOut;
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
        //System.out.println("Nova Key - Conceito inserido "+c.idConceito);
     }
          
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
@init {
        ArrayList<Caracteristica> aux = new ArrayList<Caracteristica>();
      }
@after { 
         $caracteristicas.caracteristicasOut = aux;
       }    
    : LPAREN 
           caracteristica {
                           int escalac1 = Integer.parseInt($caracteristica.escal);
                           Caracteristica c1 = new Caracteristica($caracteristica.car, escalac1);
                           aux.add(c1);
                          } 
      (',' caracteristica {
                           int escalac2 = Integer.parseInt($caracteristica.escal);
                           Caracteristica c2 = new Caracteristica($caracteristica.car, escalac2);
                           aux.add(c2);
                          })*
      RPAREN
     ;

caracteristica returns[String car, String escal]
    : '(' PALAVRA ',' escala ')' { 
                                  $caracteristica.car = $PALAVRA.text;
                                  $caracteristica.escal = $escala.text;
                                 }
    ;


//--------------------------------------------------------------------------------------------
escala: NUM
      ;
commandInterativo: COMMANDI
    ;
commandType: COMMANDTYPE
           ;
commandListar: COMMANDL
    ;
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
COMMANDL: 'listar'
      ;
COMMANDI: 'interativo'
      ;
COMMANDTYPE: [a|r|c]
      ;
ALUNOS: [aA][lL][uU][nN][oO][sS]
      ;
RECURSOS: [rR][eE][cC][uU][rR][sS][oO][sS]
      ;
CONCEITOS: [cC][oO][nN][cC][eE][iI][tT][oO][sS]
      ;
VIRGULA: ','
      ;
PONTOVIRGULA: ';'
      ;
PONTO: '.'
      ;
LPAREN: '['
      ;
RPAREN: ']'
      ;
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
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip
      ; 