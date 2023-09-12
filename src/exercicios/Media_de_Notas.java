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
public class Media_de_Notas {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        float pri, seg, ter, qua, media;
        
        System.out.println("Calculo da média de notas anual");
        
        System.out.println("Nota do Primeiro Bimestre");
        pri = entrada.nextFloat();
        
        System.out.println("Nota do Segundo Bimestre");
        seg = entrada.nextFloat();
        
        System.out.println("Nota do Terceiro Bimestre");
        ter = entrada.nextFloat();
        
        System.out.println("Nota do Quarto Bimestre");
        qua = entrada.nextFloat();
        
        media = (pri + seg + ter + qua)/4;
        
        if (media >= 70){
            System.out.println("A média é " + media + " Aluno aprovado");
        }else{
            System.out.println("A média é " + media + " Aluno não aprovado");
        }
    }
    
}
