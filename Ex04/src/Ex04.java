/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor");
        String nomeVendedor = leitorScanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor");
        float salarioFixo = leitorScanner.nextFloat();

        System.out.println("Digite o total de vendas do vendedor");
        float vendasMes = leitorScanner.nextFloat();

        float salarioFinal = (float) (vendasMes * 0.15);

        System.out.println("Vendedor(a): " + nomeVendedor);
        System.out.println("Salário fixo: " + salarioFixo);
        System.out.println("Salário Final: " + salarioFinal);
    }
}
