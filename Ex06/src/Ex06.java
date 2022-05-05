/* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
trocados; */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = leitor.nextInt();
        System.out.println("Digite o valor de B:");
        int b = leitor.nextInt();

         int c = b;
         b = a;
         a = c;

        System.out.println("Os valores trocados são: " + a + " e " + b);
    }
}
