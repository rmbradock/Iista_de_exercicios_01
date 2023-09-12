package exercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batista.4995
 */
public class Calculadora_simples {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        float num1 = 0, num2 = 0, resultado = 0;
        
        Boolean continuar = true;
        
        String opcaoEscolha;
        
        while (continuar){
            System.out.println("Calculadora simples");
            System.out.println("                   ");
            System.out.println("Selecione uma opção");
            System.out.println("                   ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("                   ");
            
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Primeiro número");
                num1 = entrada.nextFloat();
                
                System.out.println("Segundo número");
                num2 = entrada.nextFloat();
                
                resultado = num1 + num2;
                
                System.out.println("Resultado da Soma");
                System.out.println( resultado);
                
            }else if(opcao == 2){
                System.out.println("Primeiro número");
                num1 = entrada.nextFloat();
                
                System.out.println("Segundo número");
                num2 = entrada.nextFloat();
                
                resultado = num1 - num2;
                
                System.out.println("Resultado da Subtração");
                System.out.println( resultado);
                
            }else if(opcao == 3){
                System.out.println("Primeiro número");
                num1 = entrada.nextFloat();
                
                System.out.println("Segundo número");
                num2 = entrada.nextFloat();
                
                resultado = num1 * num2;
                
                System.out.println("Resultado da Multiplicação");
                System.out.println( resultado);
           
            }else if(opcao == 4){
                System.out.println("Primeiro número");
                num1 = entrada.nextFloat();
                
                System.out.println("Segundo número");
                num2 = entrada.nextFloat();
                
                resultado = num1 / num2;
                
                System.out.println("Resultado da Divisão");
                System.out.println( resultado);
                
            }else{
                System.err.println("Opção Inesistente");
            }
            System.out.println("Deseja realizar outra operação? S/N");
            opcaoEscolha = entrada.next();
            
            if (opcaoEscolha.equals("S") || opcaoEscolha.equals("s")){
                continuar = true;
            }else{
                continuar = false;
                }
            
            }
        }
    }
    

