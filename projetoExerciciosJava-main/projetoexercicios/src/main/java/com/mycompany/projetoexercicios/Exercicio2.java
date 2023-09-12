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
public class Exercicio2 {
    public static void main(String[] args) {
        double num1, num2;       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextDouble();
        
        if (num1 == num2){
            System.out.println("Os numero digitados são iguais!!!");
        }
    }
}
