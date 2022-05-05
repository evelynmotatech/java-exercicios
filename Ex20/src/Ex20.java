/**A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral; */

import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int anoFabricacao = 0;
        float valorVeiculo= 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorComDesconto = 0.0f;
        char repetir = 's';

        int carrosSemiNovos = 0;
        int carros = 0;

        while(repetir == 's' || repetir == 'S'){
            System.out.println("Digite o ano de fabricação do veículo:");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veículo:");
            valorVeiculo = leitor.nextInt();

            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
                valorDesconto = valorVeiculo *porcentagemDesconto;
                valorComDesconto = valorVeiculo - valorDesconto;
                System.out.println("Valor do carro: " + valorComDesconto +". Valor do desconto: R$" + valorDesconto);
            }else{
                porcentagemDesconto =0.07f;
                valorDesconto = valorVeiculo *porcentagemDesconto;
                valorComDesconto = valorVeiculo - valorDesconto;
                System.out.println("Valor do carro: " + valorComDesconto +". Valor do desconto: R$" + valorDesconto);
                carrosSemiNovos++;
            }

            carros++;

            System.out.println("Deseja fazer mais cadastro? S: Sim | N: Não");
            repetir = leitor.next().charAt(0);
        }

        System.out.println("Total de carros semi-novos: " +carrosSemiNovos);
        System.out.println("Total de carros: " +carros);
        
    }
}
