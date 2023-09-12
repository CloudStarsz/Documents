package com.mycompany.projetoexercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double altura, peso;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        peso=sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura=sc.nextDouble();
        double imc = peso/altura;
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso ideal.");
        }
        else if (imc <= 24.9){
            System.out.println("Peso ideal, muito bem.");
        }
        else if (imc <= 29.9){
            System.out.println("Sobrepeso, uma leve DIETA pode ajudar.");
        }
        else if (imc <= 34.9){
            System.out.println("Obesidade leve.");
        }
        else if (imc <=39.9){
            System.out.println("Obesidade moderada.");
        }
        else {System.out.println("Obesidade mórbida.");}
    }
}
