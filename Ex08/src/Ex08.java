/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
disponíveis com ousuário;*/

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em dolar a ser convertido para reais:");
        float valorDolar = leitor.nextFloat();

        System.out.println("Digite o valor da cotação do dolar:");
        float cotacaoDolar = leitor.nextFloat();

        float conversaoReal = valorDolar * cotacaoDolar;
        System.out.println("O valor da conversão, em Reais, é: R$" + conversaoReal);
    }
}
