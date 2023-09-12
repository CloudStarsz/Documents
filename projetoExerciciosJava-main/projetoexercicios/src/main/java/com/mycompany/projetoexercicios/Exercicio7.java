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
public class Exercicio7 {
    public static void main(String[] args) {
        double valorPeca;
        int opt;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da peça de roupa");
        valorPeca = sc.nextDouble();
        System.out.println("Escolha uma das seguintes opções:\n"
                + "[0] - Compra a vista.\n"
                + "[1] - Compra parcelado no cartão.\n"
                + "[2] - Crediario.");
        opt = sc.nextInt();
        
        if (opt == 0){
            System.out.println("A peça recebeu 10% de desconto.\n"
                    + "Valor final = "+(valorPeca-(valorPeca*0.1)));
        }
        else if(opt == 1){
            System.out.println("Quantas parcelas deseja?");
            int parc = sc.nextInt();
            System.out.println("Valor das Parcelas = "
                    + parc + " vezes de " + valorPeca / parc);
        }
        else if (opt == 2){
            System.out.println("Quantas parcelas deseja?");
            int parc = sc.nextInt();
            System.out.println("Valor das Parcelas = "
                    + parc + " vezes de " + (valorPeca + (valorPeca*0.1)));
            
        } else {System.out.println("Opção Inválida");}
    }
}
