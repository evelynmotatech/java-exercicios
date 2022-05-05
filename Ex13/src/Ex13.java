/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10; */

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println(	"Digite um número");
        int num = leitor.nextInt();

        if(num > 10){
            System.out.println("Número maior que 10");
        }else{
            System.out.println("Número menor que 10");
        }
    }
}
