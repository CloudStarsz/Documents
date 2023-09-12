package com.mycompany.projetoexercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int dig1, dig2, dig3, dig4;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quatro digitos para sua senha:"
        + "\n(A senha deve possuir as seguintes características:)"
        + "\n(O primeiro digito deve ser 8 ou 5)" 
        + "\n(O ultimo digito deve ser 5 ou 1)"
        + "\n(A soma do segundo e do terceiro digito tem que ser 3 caso o quarto digito seja 5)"
        + "\n(Ou 0, caso seja 1)");
        dig1 = sc.nextInt();
        dig2 = sc.nextInt();
        dig3 = sc.nextInt();
        dig4 = sc.nextInt();

        if (dig1 != 8 && dig1 != 5 ){
            System.out.println("Digito 1 invalido");
        }
        else if (dig4 != 5 && dig4 != 1){
            System.out.println("Digito 4 invalido");
        }
        else if((dig4 == 5 && (dig2 + dig3) != 3) || (dig4 == 1 && (dig2 + dig3) != 0)){
            System.out.println("Digito 2 e 3 são inválidos.");
        }
        else {System.out.println("Senha válida");}
        
        
    }
}
