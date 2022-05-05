/**Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
menor que 25 ou igual a 40; */

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = leitor.nextInt();
        
        if(num > 80){
            System.out.println("Número maior que 80");
        }
        if(num <25){
            System.out.println("Número menor que 25");
        }
        if(num == 40){
            System.out.println("Número igual a 40");
        }
    }
}
