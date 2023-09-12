/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author batista.4995
 */
public class Soma_de_dois_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String args []) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        float num1, num2, resultado;
        
        System.out.println("Soma de dois números");
        
        System.out.println("Informe o primeiro número");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = scanner.nextFloat();
        
        resultado = num1 + num2;
        
        System.out.println("Resultado da soma entre: " + num1 + " e " + num2 + " é: " + resultado);
        
    }
    
}
