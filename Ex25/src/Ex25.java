/**. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes; */

import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número");
        int num2 = leitor.nextInt();


        if(num1 == num2){
            System.out.println("Números iguais");
        }else if(num1 > num2){
            System.out.println("Números diferentes. " +num1+ " é maior.");
        }else{
            System.out.println("Números diferentes. " +num2+ " é maior.");
        }
    }
}
