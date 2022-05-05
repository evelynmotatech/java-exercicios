//Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitorScanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = leitorScanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);

    }
}
