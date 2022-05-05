/*Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, amédia de preço de custo e do preço de venda; */

import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        float valorCusto;
        float valorVenda;
        float mediaCustoVenda;

        
        for(i = 0; i < 40; i++){
            System.out.println("Digite o valor do custo do produto");
            valorCusto = leitor.nextFloat();
            System.out.println("Digite o valor de venda do produto");
            valorVenda = leitor.nextFloat();
            
            mediaCustoVenda = ((valorCusto+valorVenda)/2);
            if(valorVenda > valorCusto){
                System.out.println("Houve lucro.");
            }else if(valorVenda == valorCusto){
                System.out.println("Não houve lucro nem prejuízo.");;
            }else{
                System.out.println("Houve prejuízo.");
            }
            System.out.println("Preço de custo: " +valorCusto);
            System.out.println("Preço de venda: " +valorVenda);
            System.out.println("Média de custo e venda: " + mediaCustoVenda);
        }
    
    }
}
