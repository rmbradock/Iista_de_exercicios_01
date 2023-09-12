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
public class N_Calcule_fatorial {
        public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calculo de fatorial");
        System.out.println("Digite o número que deseja realizar o calculo");
        
        float numero, resultado = 0;
        
        numero = entrada.nextFloat();
        
        while (numero >= 1){
            System.out.println(numero);
            
            numero = numero * (numero-1);
                        
            resultado = numero;
        
            System.out.println(resultado);
        }
    
        
    }
}
