package com.mycompany.projetoexercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 819222396
 */
public class Exercicio6 {
    public static void main(String[] args) {
        double saldo, saque;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Valor em conta:");
        saldo = sc.nextDouble();
        System.out.println("Digite o valor a ser sacado:");
        saque = sc.nextDouble();
        
        if ((saldo - saque) > 0){
            System.out.println("Saldo restante: " + (saldo-saque));
        }
        else {System.out.println("Não foi possivel realizar saque\nValor ficaria negativo");}
    }
}
