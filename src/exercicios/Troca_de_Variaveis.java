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
public class Troca_de_Variaveis {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        
        float num1, num2, temp;
        
    System.out.println("Troca de variáveis");
    
    System.out.println("Informe a primeira variável");
    num1 = scanner.nextFloat();
    
    System.out.println("informe a segunda variável");
    num2 = scanner.nextFloat();
    
        System.out.println("A Primeira variável é: " + num1 + " e a Segunda variável é: " + num2);
    
    temp = num1;
    
    num1 = num2;
    
    num2 = temp;
    
    
    
        System.out.println("A Segunda variável é: " + num1 + " e a Primeira variável é: " + num2);
    }
}