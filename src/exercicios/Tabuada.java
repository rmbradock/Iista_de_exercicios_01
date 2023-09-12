package exercicios;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batista.4995
 */
public class Tabuada {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int multiplicador = 1;
        int resultado = 0;

    System.out.println("CALCULO DE TABOADA");
    System.out.println("INFORME UM NÚMERO");
    numero = scanner.nextInt();
    
    //enquanto multiplicador for menor ou = 10
    while (multiplicador <=10){
        resultado = numero * multiplicador;
        
        System.out.println(numero + " X " + multiplicador + " é: " + resultado);
        
        //Condição para sair do laço é verificar se multiplicador é maior que 10.
        multiplicador = multiplicador + 1;
        }
        
    }   
}
