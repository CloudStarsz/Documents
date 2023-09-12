package com.mycompany.projetoexercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a Segunda nota:");
        nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;

        if(media < 2){
            System.out.println("Reprovado, nos vemos semestre que vem.");
        }
        else if (media < 6 ){
            System.out.println("Não está aprovado, mas pode fazer a segunda época");
        }
        else if (media < 7){
            System.out.println("Aprovado no limite, estude um pouco.");
        }
        else if (media < 9){
            System.out.println("Aprovado.");
        }
        else {System.out.println("parabéns, continue assim.");}
    }
}
