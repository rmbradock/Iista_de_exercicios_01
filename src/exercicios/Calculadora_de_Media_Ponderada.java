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
public class Calculadora_de_Media_Ponderada {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
     
        float media1, media2, media3, peso1, peso2, peso3, resultado, nota1, nota2, nota3;
        
        System.out.println("Calculo de média ponderada de notas");
                
        System.out.println("Insira a nota da prova 01");
        media1 = entrada.nextFloat();
        
        System.out.println("Insira o Peso da prova 01");
        peso1 = entrada.nextFloat();
        
        System.out.println("Insira a nota da prova 02");
        media2 = entrada.nextFloat();
        
        System.out.println("Insira o Peso da prova 02");
        peso2 = entrada.nextFloat();
        
        System.out.println("Insira a nota da prova 03");
        media3 = entrada.nextFloat();
        
        System.out.println("Insira o Peso da prova 03");
        peso3 = entrada.nextFloat();
        
        resultado = ((media1 * peso1) + (media2 * peso2) + (media3 * peso3))/(peso1 + peso2 +peso3);
        nota1 = media1*peso1;
        nota2= media2*peso2;
        nota3 = media3*peso3;
        
        System.out.println("Nota da prova 01: " + media1 + " X peso da prova: " + peso1 + " = " + nota1);
        System.out.println("Nota da prova 02: " + media2 + " X peso da prova: " + peso2 + " = " + nota2);
        System.out.println("Nota da prova 03: " + media3 + " X peso da prova: " + peso3 + " = " + nota3);
        System.out.println("A média ponderada é: " + resultado);
        
        
    }
}
