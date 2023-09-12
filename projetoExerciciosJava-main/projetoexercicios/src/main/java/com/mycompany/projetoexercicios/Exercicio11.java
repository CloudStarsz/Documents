package com.mycompany.projetoexercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int codState;
        double valorIniCarga;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial da carga:");
        valorIniCarga=sc.nextDouble();
        System.out.println("Digite o código de estado");
        codState=sc.nextInt();

        if (codState < 1 || codState > 5){
            System.out.println("Valor inválido");
        }
        else if (codState == 2 || codState == 5){
            System.out.println("O valor final da carga é "+ (valorIniCarga - (valorIniCarga * 0.12)) );
        }
        else{ 
            System.out.println("O valor final da carga é "+ (valorIniCarga - (valorIniCarga * 0.15)) );
        }

    }
}
