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
public class N_Numeros_Primos {
    public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    
        float numero, base;
        
        System.out.println("Mostra numero primo");
        System.out.println("Digite o número a verificar");
        numero = entrada.nextFloat();
        
        base = (numero/numero);
        
        if (base % 2 == 0 & numero/numero == 1){
            System.out.println("o" + numero + " não é primo");
        }else{ 
            System.out.println("o " + numero + " é primo");
        }
    }
            
}