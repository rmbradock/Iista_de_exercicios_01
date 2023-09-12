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
public class Media_de_tres_numeros {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        
        float num1, num2, num3, resultado;
        
        System.out.println("Calculo de média de três números");
        
        System.out.println("Informe o primeiro número");
        num1 = entrada.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = entrada.nextFloat();
        
        System.out.println("Informe o terceiro número");
        num3 = entrada.nextFloat();
        
        resultado = (num1 + num2 + num3)/3;
        
        System.out.println("A média entre: " + num1 + "," + num2 + " e " + num3 + " é: " + resultado);
    }
    
}
