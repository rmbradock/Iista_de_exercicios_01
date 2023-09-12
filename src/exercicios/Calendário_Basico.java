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
public class Calendário_Basico {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        
        int JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ, opcao;
              
        JAN = 31;
        FEV = 28;
        MAR = 31;
        ABR = 30;
        MAI = 31;
        JUN = 30;
        JUL = 31;
        AGO = 31;
        SET = 30;
        OUT = 31;
        NOV = 30;
        DEZ = 31;
        
            System.out.println("Calendário");
            System.out.println(" ");
            System.out.println("Digite um mês");
            System.out.println("1 - JANEIRO");
            System.out.println("2 - FEVEREIRO");
            System.out.println("3 - MARÇO");
            System.out.println("4 - ABRIL");
            System.out.println("5 - MAIO");
            System.out.println("6 - JUNHO");
            System.out.println("7 - JULHO");
            System.out.println("8 - AGOSTO");
            System.out.println("9 - SETEMBRO");
            System.out.println("10 - OUTUBRO");
            System.out.println("11 - NOVEMBR");
            System.out.println("12 - DEZEMBRO");
            
            opcao = (int) entrada.nextFloat();
            
            if (opcao == 1){
                System.out.println("O Mês de Janeiro tem " + JAN + " dias");
            
            }else if(opcao == 2){
                System.out.println("O Mês de Fevereiro tem " + FEV + " dias");
            
            }else if(opcao == 3){
                System.out.println("O Mês de Março tem " + MAR + " dias");
                
            }else if(opcao == 4){
                System.out.println("O Mês de Abril tem " + ABR + " dias");    
            
            }else if(opcao == 5){
                System.out.println("O Mês de Maio tem " + MAI + " dias");
            
            }else if(opcao == 6){
                System.out.println("O Mês de Junho tem " + JUN + " dias");
                
            }else if(opcao == 7){
                System.out.println("O Mês de JuLho tem " + JUL + " dias");
            
            }else if(opcao == 8){
                System.out.println("O Mês de Agosto tem " + AGO + " dias");
                
            }else if(opcao == 9){
                System.out.println("O Mês de Setembro tem " + SET + " dias");    
            
            }else if(opcao ==10){
                System.out.println("O Mês de Outubro tem " + OUT + " dias");
            
            }else if(opcao == 11){
                System.out.println("O Mês de Novembro tem " + NOV + " dias");
                
            }else if(opcao == 12){
                System.out.println("O Mês de Desembro tem " + DEZ + " dias");
            }
        }
    }

