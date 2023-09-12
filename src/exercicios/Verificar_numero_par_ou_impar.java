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
public class Verificar_numero_par_ou_impar {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        float num, resultado;
        
        System.out.println("informe um número para verificar se é par:");
               
        num = entrada.nextFloat();
        
        resultado = num % 2;
        
        if (resultado == 0) {
            System.out.println(" o número " + num + " é par");
        }else{
            System.out.println("O número " + num + " é impar");
        }
    }
    
}