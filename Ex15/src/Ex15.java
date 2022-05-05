/**Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200; */

import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = leitor.nextInt();

        if(num >= 100 && num <=200){
            System.out.println("O número está no intervalo entre 100 e 200");
        }else{
            System.out.println("O número não está no intervalo entre 100 e 200");
        }
    }
}
