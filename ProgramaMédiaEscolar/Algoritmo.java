 
 import java.util.Scanner;

     // PROGRAMA MÉDIA ESCOLAR

public class TiposPrimitivos {

       public static void main(String[] args) {

           Scanner entrada = new Scanner (System.in);

                    System.out.println("===== PROGRAMA MÉDIA ESCOLAR 2021 ===== \n");
                      System.out.println("Digite o nome do Aluno: ");
                         String nome = entrada.nextLine();
                       float nome1 = entrada.nextFloat();
           if (nome1 < 100) {
               System.out.println("CARACTER INVALIDO ! \n");
               // System.out.println("");
           }
           System.out.println("Nota Final do 1 Bimestre: \n");
                float nota1 = entrada.nextFloat();
                    if(nota1 > 10){
                          System.out.println("NOTA DO ALUNO INVALIDA \n ");
                            System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10! \n");
                                System.exit(0);
                          }
                                if(nota1 < 0){
                                    System.out.println("NOTA DO ALUNO INVALIDA \n");
                                       System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10 ! \n");
                                            System.exit(0);
                                         }

            System.out.println("Nota Final do 2 Bimestre: \n");
                   float nota2 = entrada.nextFloat();
                         if(nota2 > 10){
                             System.out.println("NOTA DO ALUNO INVALIDA \n ");
                               System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10! \n");
                                   System.exit(0);
                       }
                           if(nota2 < 0){
                        System.out.println("NOTA DO ALUNO INVALIDA \n");
                           System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10 ! \n");
                         System.exit(0);
           }

           System.out.println("Nota Final do 3 Bimestre: \n");
                    float nota3 = entrada.nextFloat();

                        if(nota3 > 10){
                            System.out.println("NOTA DO ALUNO INVALIDA \n ");
                              System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10! \n");
                                System.exit(0);
                                    }
                           if(nota3 < 0){
                               System.out.println("NOTA DO ALUNO INVALIDA \n");
                                  System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10 ! \n");
                                     System.exit(0);
                                   }

           System.out.println("Nota Final do 4 Bimestre: \n ");
                float nota4 = entrada.nextFloat();

                      if(nota4 > 10){
                          System.out.println("NOTA DO ALUNO INVALIDA \n ");
                            System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10! \n");
                               System.exit(0);
                               }
                                 if(nota4< 0){
                                      System.out.println("NOTA DO ALUNO INVALIDA \n");
                                        System.out.println("DIGITE A NOTA CORRETA ENTRE 0 A 10 ! \n");
                                        System.exit(0);
                                              }

             float resultado = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("A MÉDIA FINAL DO ALUNO "  + nome + " " + "É " + resultado );

                  if(resultado >= 7){
                      System.out.println("ALUNO " + nome + " " +  "ESTÁ APROVADO ! \n");
                                }
                              else{
                                       System.out.println("ALUNO " + nome + " " +  "ESTÁ REPROVADO ! \n" );
                                            }

                     }


           }

