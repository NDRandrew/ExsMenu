import java.io.*;
import java.util.Scanner;
// https://www.baeldung.com/java-download-file //
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("\n Bem vindo!\n");
    int i=0;
    do {
      System.out.println("\n Aqui voce encontrara diversas soluções de diversas listas de exercícios\n os exercicios estão separados por temas, como na lista abaixo: \n");
      System.out.println(" 1 - Operadores Aritimeticos \n 2 - Operadores Logicos e Logica Condicional \n 3 - Logica de laços de repeticao While \n 4 - Imprimir \n 5 - Sair \n");
      i = kb.nextInt();
      switch(i){
        case 1 :{
          while(i!=4){
            System.out.println("\n  ---------------- Operadores Aritimeticos ---------------- \n");
            System.out.println(" Você selecionou para ver os exercícios sobre Operadores Arítimeticos \n Veja a relação dos exercícios abaixo. \n");
            System.out.println(" 1 - Conversão de tipo de dado \n 2 - Cálculo de área de circunferência \n 3 - Veríficação do código de um caractere \n 4 - Voltar para o menu \n");
            System.out.println(" Selecione a Opção desejada: \n");
            i = kb.nextInt();
            if(i == 1){
              
              System.out.println("\n  ---------------- Conversão de tipo de dado ---------------- \n");
              System.out.println(" Faça um programa que converta um valor em double para inteiro e imprima-o : \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i = kb.nextInt();
              if(i == 1){
                System.out.println("\n  ---------------- Conversão de tipo de dado ---------------- \n");
                System.out.println(" Faça um programa que converta um valor em double para inteiro e imprima-o : \n\n Solução:\n ");
                System.out.println("   Scanner tc = new Scanner(System.in); \n\n   System.out.println(Insira um valor decimal: ); \n\n   double entrada = tc.nextDouble(); \n\n   int numero = int(entrada); \n\n   System.out.println(O valor inteiro é: + numero); \n\n   tc.close(); \n\n");
              }
              else if (i == 2){
                
              }
              else {System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i == 2){
              
              System.out.println("\n  ---------------- Cálculo de área de circunferência ---------------- \n");
              System.out.println(" Faça um programa que cálcule a área de uma circunferência com pelo menos 2 casas decimais de precisão: \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i = kb.nextInt();
              if(i == 1){
                System.out.println("\n  ---------------- Conversão de tipo de dado ---------------- \n");
                System.out.println(" Faça um programa que cálcule a área de uma circunferência com pelo menos 2 casas decimais de precisão: \n\n Solução: \n");
                System.out.println("   Scanner teclado = new Scanner(System.in); \n\n   float raio; \n\n   final double PI = Math.PI; \n\n   System.out.print(Entre com um raio: ); \n\n   raio = teclado.nextFloat(); \n\n   float area = (float) (PI * Math.pow(raio, 2)); \n\n   System.out.printf(The area is %.2f , area); \n\n   teclado.close(); \n\n");
              }
              else if(i==2){}
              else{System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i == 3){
              System.out.println("\n  ---------------- Veríficação do código de um caractere ---------------- \n");
              System.out.println(" Faca um programa que o usuario digita um caractere, e o programa retorna o numero correspondente do codigo UNICODE:  \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i = kb.nextInt();
              if(i==1){
                System.out.println("\n  ---------------- Veríficação do código de um caractere ---------------- \n");
                System.out.println(" Faca um programa que o usuario digita um caractere, e o programa retorna o numero correspondente do codigo UNICODE:  \n\n Solucao: \n");
                System.out.println("  Scanner teclado = new Scanner(System.in); \n\n  String entrada; \n\n  System.out.print(Digite uma letra: ); \n\n  entrada = teclado.next().trim(); \n\n  int numero = (int) entrada.charAt(0); \n\n  System.out.printf(O numero correspondente a %s: %d , entrada, numero); \n\n  teclado.close();");
              }
              else if(i==2){}
              else{System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i == 4){
              break;
            }
            else{
              System.out.println("\n Opção Invalida ------- \n");
            }
          }
          break;
        }
        case 2 :{
          while(i!=4){  
            System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
            System.out.println(" Você selecionou para ver os exercícios sobre Operadores Logicos e Logica Condicional \n Veja a relação dos exercícios abaixo. \n");
            System.out.println(" 1 - Verificacao da veracidade de condicoes \n 2 - Verificar se o numero e par/impar alem de positivo/negativo \n 3 - Indicar o peso ideal para homem e mulher \n 4 - Voltar para o menu \n");
            i = kb.nextInt();
            if(i==1){
              System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
              System.out.println(" Faça um programa onde a = 3, b = 7 e c = 4 e informe se as expressoes abaixo sao verdadeiras: \n\n | (a+c)>b \n | b>=(a+2) \n | c==(b-a) \n | (b+a)<=c \n | (c+a)>b \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i=kb.nextInt();
              if(i==1){
                System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
                System.out.println(" Faça um programa onde a = 3, b = 7 e c = 4 e informe se as expressoes abaixo sao verdadeiras: \n\n | (a+c)>b \n | b>=(a+2) \n | c==(b-a) \n | (b+a)<=c \n | (c+a)>b \n\n Solucao: ");
                System.out.println("  int a = 3, b = 7, c=4; \n\n  System.out.println((a+c)>b); \n\n  System.out.println(b>=(a+2)); \n\n  System.out.println(c==(b-a)); \n\n  System.out.println((b+a)<=c); \n\n  System.out.println((c+a)>b); \n\n");
                
              }
              else if(i==2){}
              else {System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i==2){
              System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
              System.out.println(" Faca um programa que leia um numero inteiro e retorna ao usuario uma mensagem informando se o numero e par ou impar e se e negativo ou positivo. \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i=kb.nextInt();
              if(i==1){
                System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
                System.out.println(" Faca um programa que leia um numero inteiro e retorna ao usuario uma mensagem informando se o numero e par ou impar e se e negativo ou positivo. \n\n Solucao: \n");
                System.out.println("  Scanner kb = new Scanner(System.in); \n\n  int i = kb.nextInt(); \n\n  int n = i%2; \n\n  if (n == 0){ \n\n  if(i>0){ \n\n  System.out.println(O numero e par e positivo); \n\n  } \n\n  else{System.out.println(O numero e par e negativo);} \n\n  } \n\n  else{ \n\n  if(i>0){ \n\n  System.out.println(O numero e impar e positivo); \n\n  } \n\n  else{System.out.println(O numero e impar e negativo);} \n\n  } \n\n  kb.close(); \n\n");
              }
              else if(i==2){}
              else{System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i==3){
              System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
              System.out.println(" Tendo como dados de entrada a altura e sexo de uma pessoa, construa um programa que calcule seu peso ideal utilizando as seguintes formulas \n  a.  Homens: Peso Ideal = (72.7*altura)-58 \n  b.  Mulheres: Peso Ideal = (62.1*altura)-44.7 \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i=kb.nextInt();
              if(i==1){
                System.out.println("\n  ---------------- Operadores Logicos e Logica Condicional ---------------- \n");
                System.out.println(" Tendo como dados de entrada a altura e sexo de uma pessoa, construa um programa que calcule seu peso ideal utilizando as seguintes formulas \n  a.  Homens: Peso Ideal = (72.7*altura)-58 \n  b.  Mulheres: Peso Ideal = (62.1*altura)-44.7 \n\n Solucao: \n");
                System.out.println("  Scanner kb = new Scanner(System.in); \n\n  System.out.println(  1 - homem /n  2 - mulher /n); \n\n  int sexo = kb.nextInt(); \n\n  System.out.println(Escreva sua altura em cm:/n); \n\n  double altura = kb.nextDouble(); \n\n  if(sexo == 1){ \n\n  System.out.printf(Seu peso ideal e: %.1f kg, ((72.7*altura)-58)); \n\n  } \n\n  else if (sexo == 2){ \n\n  System.out.printf(Seu peso ideal e: %.1f kg, ((62.1*altura)-44.7)); \n\n  } \n\n  else{System.out.println(Escolha uma opcao valida);} \n\n  kb.close();");
              }
              else if(i==2){}
              else{System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i==4){break;}
            else{System.out.println("\n Opção Invalida -------  \n");}
          }
        break;
        }
        case 3 :{
          while(i!=4){
            System.out.println("\n  ---------------- Logica de laços de repeticao While ---------------- \n");
            System.out.println(" Você selecionou para ver os exercícios sobre Operadores Arítimeticos \n Veja a relação dos exercícios abaixo. \n");
            System.out.println(" 1 - Imprimir um dado diversas vezes \n 2 - Imprimir numeros pares de 1 a 50 \n 3 - Programa com numero limitado de opcoes \n 4 - Voltar para o menu \n");
            System.out.println(" Selecione a Opção desejada: \n");
            i = kb.nextInt();
            if(i == 1){
              
              System.out.println("\n  ---------------- Imprimir um dado diversas vezes ---------------- \n");
              System.out.println(" Crie um programa que imprima - Hello world - 11 vezes, utilizando estrutura sequencial e uma estrutura de repeticao while : \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i = kb.nextInt();
              if(i == 1){
                System.out.println("\n  ---------------- Imprimir um dado diversas vezes ---------------- \n");
                System.out.println(" Crie um programa que imprima - Hello world - 11 vezes, utilizando estrutura sequencial e uma estrutura de repeticao while : \n\n Solução:\n ");
                System.out.println("   int i = 11; \n\n   while(i!=0){ \n\n   i--; \n\n   System.out.println(Hello world); \n\n   } \n\n");
              }
              else if (i == 2){}
              else {System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i == 2){
              System.out.println("\n  ---------------- Imprimir numeros pares de 1 a 50 ---------------- \n");
              System.out.println(" Crie um programa para exibir os numeros pares de 1 a 50 na tela : \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i = kb.nextInt();
              if(i == 1){
                System.out.println("\n  ---------------- Imprimir numeros pares de 1 a 50 ---------------- \n");
                System.out.println(" Crie um programa para exibir os numeros pares de 1 a 50 na tela : \n\n Solução:\n ");
                System.out.println("   int i = 0; \n\n   while(i!=50){ \n\n   i++; \n\n   if(i%2 == 0){ \n\n   System.out.println(i); \n\n   } \n\n   } \n\n");
              }
              else if (i == 2){}
              else {System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i == 3){
              System.out.println("\n  ---------------- Programa com numero limitado de opcoes ---------------- \n");
              System.out.println("Faca um programa que solicite um numero para o usuario um numero de 12 a 20. Se digitar um numero diferente, mostrar a mensagem `opcao invalida` e solicite novamente. Caso digite o numero correto, imprima-o na tela : \n");
              System.out.println("\n Gostaria de ver o resultado? [1/2] \n");
              i = kb.nextInt();
              if(i==1){
                System.out.println("\n  ---------------- Programa com numero limitado de opcoes ---------------- \n");
                System.out.println("Faca um programa que solicite um numero para o usuario um numero de 12 a 20. Se digitar um numero diferente, mostrar a mensagem `opcao invalida` e solicite novamente. Caso digite o numero \n correto, imprima-o na tela : \n\n Solução:\n ");
                System.out.println("   Scanner kb = new Scanner(System.in); \n\n   System.out.println(Escreva um numero entre 12 e 20: ); \n\n   int i = kb.nextInt(); \n\n   while(12>i || i>20){ \n\n   System.out.println(Por favor escreva uma opcao valida: ); \n\n   i= kb.nextInt(); \n\n   } \n\n   System.out.println(i); \n\n");
              }
              else if(i==2){}
              else{System.out.println("\n Opção Invalida -------  \n");}
            }
            else if(i==4){break;}
            else{System.out.println("\n Opção Invalida -------  \n");}
          }
        }
        case 4 :{
          System.out.println("\n  ---------------- Impressão dos Exercícios ---------------- \n");
          System.out.println("\n  Gostaria de fazer Download dos exercícios?");
          break;
        }
        case 5 :{
          System.out.println("\n Obrigado por usar o sistema ------- \n"); 
          break;
        }
        default :{
          System.out.println("\n Opção Invalida ------- \n");
        }
      }
    }
    while(i!=5);
  }
}