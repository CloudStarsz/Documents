/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoexercicios;

import java.util.Scanner;

/**
 *
 * @author 819222396
 */
public class Exercicio1 {

    public static void main(String[] args) {
        int numInt;
        double numReal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero Inteiro:");
        numInt = sc.nextInt();
        System.out.println("Digite o Numero Real:");
        numReal = sc.nextDouble();
        
        if (numInt < numReal)
        {
            System.out.println("O numero Inteiro " + numInt + " é menor que o "
                    + "numero real: " + numReal + " que foi digitado") ;
        }
       
               
        
    }
}
