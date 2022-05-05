/*Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, amédia de preço de custo e do preço de venda; */

import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        String nomeProduto;
        float valorCusto;
        float valorVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        
        for(i = 0; i < 40; i++){
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.next();
            System.out.println("Digite o valor do custo do produto");
            valorCusto = leitor.nextFloat();
            System.out.println("Digite o valor de venda do produto");
            valorVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + valorCusto;
            totalVenda = totalVenda + valorVenda;
            
            if(valorVenda > valorCusto){
                System.out.println("Houve lucro.");
            }else if(valorVenda == valorCusto){
                System.out.println("Não houve lucro nem prejuízo.");;
            }else{
                System.out.println("Houve prejuízo.");
            }
            System.out.println(nomeProduto + ": Preço de custo= R$" +valorCusto+ " e Preço de venda= R$" +valorVenda);
        }
    
        System.out.println("A média do preço de custo é R$" + (totalCusto/i));
        System.out.println("A média do preço de venda é R$" + (totalVenda/i));
    }
}
