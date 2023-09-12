/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author batista.4995
 */
public class Maior_e_Menor_Número {
    public static void main(String args []){
    Scanner entrada = new Scanner(System.in);
            
            float num1, num2;
            
            System.out.println("Informe o primeiro número");
            num1 = entrada.nextFloat();
            
            System.out.println("Informe o segundo número");
            num2 = entrada.nextFloat();
            
            if (num1 > num2){
                System.out.println("O número" + num1 + " é " + "maior que " + num2);
                
            }else if (num1 < num2){
                System.out.println("O número" + num1 + " é " + "menor que " + num2);
            }else{
                System.out.println("O número" + num1 + " é " + "igual a " + num2);
            }
            }
            
            }
    
