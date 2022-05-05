/*O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo; */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de fábrica do carro");
        float valorFabrica = leitor.nextFloat();

        float valorComImposto = (float) (valorFabrica + (valorFabrica * 0.45));
        float valorFinal = (float) (valorComImposto + (valorComImposto*0.28));

        System.out.println("Valor final do carro: R$" + valorFinal);
    }
}
