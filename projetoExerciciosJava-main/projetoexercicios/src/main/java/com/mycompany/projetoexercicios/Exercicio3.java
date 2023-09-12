package com.mycompany.projetoexercicios;

import java.util.Scanner;

/**
 *
 * @author 819222396
 */

/*3. 
*/
public class Exercicio3 {
    public static void main(String[] args) {int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();
        
        if (num1 > num2){
            System.out.println("primeiro maior do que o segundo");
        }
        else {
            System.out.println("segundo maior do que o primeiro");
        }
    }
}
