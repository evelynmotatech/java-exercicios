/**Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior; */

import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) throws Exception {
       Scanner leitor = new Scanner(System.in);

       System.out.println("Digite um número:");
       int num1 = leitor.nextInt();
       System.out.println("Digite outro número:");
       int num2 = leitor.nextInt();

       if(num1 > num2){
           System.out.println("O número " +num1+ " é maior que " +num2);
       }else{
        System.out.println("O número " +num2+ " é maior que " +num1);
       }
    }
}
