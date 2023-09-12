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
public class Calcular_IMC {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        
        float peso, altura, IMC;
        
        System.out.println("Calculo do IMC");
        
        System.out.println("Informe seu peso");
        peso = entrada.nextFloat();
        
        System.out.println("Informe sua altura em metros");
        altura = entrada.nextFloat();
        
        IMC = peso/(altura * altura);
        
        System.out.println("Seu IMC é" + IMC);
        
    }
    
}
