package com.mycompany.projetoexercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        System.out.println("Escolha uma das seguintes opções:"
        + "\n1 - Misto quente R$5,50"
        + "\n2 - Salada chinesa R$10,20"
        + "\n3 - Suco de laranja R$4,00"
        + "\n4 - Suco de manga R$3,50");

        choice = sc.nextInt();

        if (choice < 1 || choice > 4){
            System.out.println("Erro");
        }
        else if (choice == 3 || choice == 4){
            System.out.print("tenha um excelente drink, vai lhe custar: ");
            if(choice == 3){
                System.out.println("R$4,00");
            }
            else{System.out.println("R$3,50");}
        }
        else {
            System.out.print("Bom apetite, vai lhe custar: ");
            if(choice == 1){
                System.out.println("R$5,50");
            }
            else{System.out.println("R$10,20");}
        }
    }
}
