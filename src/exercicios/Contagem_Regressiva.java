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
public class Contagem_Regressiva {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Contagem regressiva.");  
         System.out.println("Digite um número");
        
        int numeroMostrar, numero = entrada.nextInt();
        
        numeroMostrar = numero;
                
        while (numero >= 0){
            System.out.println(numero);
            
            numero = numero -1;
        }
    System.out.println("Contagem regressiva a partir de " + numeroMostrar);
     }
}
    

