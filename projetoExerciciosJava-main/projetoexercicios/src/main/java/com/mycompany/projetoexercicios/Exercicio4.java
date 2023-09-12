/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoexercicios;

import java.util.Scanner;

/**
 *
 * @author 819222396
 */
public class Exercicio4 {
    public static void main(String[] args) {int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();
        
        if (num1 > num2){
            System.out.println(num1 +" é maior.");
        }
        else if (num2 > num1){
            System.out.println(num2 +" é maior.");
        }
        else {System.out.println("Os numeros são iguais");}
    }
    
}
