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
public class Exercicio5 {
    public static void main(String[] args) {
        /*5. Escreva um programa que lê três inteiros a partir do teclado
        e imprime a soma, a média, o produto, o menor e o maior desses números.*/
        
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Digite o Segundo numero");
        num2 = sc.nextInt();
        System.out.println("Digite o Terceiro numero");
        num3 = sc.nextInt();
        int somanum = num1+ num2 + num3;
        int produtonum = num1 * num2 * num3;
        
        System.out.println("Soma: " + somanum +
                "\nMédia: " + (somanum/3) +
                "\nProduto: " + produtonum);
        if (num1 < num2 && num1 < num3)
        {
            System.out.println("Menor: " + num1);
        }
        else if(num2 < num1 && num2 < num3)
        {
            System.out.println("Menor: " + num2 );
        }
        else 
        {
            System.out.println("Menor: " + num3);
        }
        
        if (num1 > num2 && num1 > num3)
        {
            System.out.println("Maior: " + num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("Maior: " + num2 );
        }
        else 
        {
            System.out.println("Maior: " + num3);
        }
    }
}
