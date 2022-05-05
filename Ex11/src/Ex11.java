/*Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário; */
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de custo do produto");
        float valorCusto = leitor.nextFloat();

        System.out.println("Digite o percentual a ser aplicado no produto");
        float porcentagemVenda = leitor.nextFloat();
    
        float valorVenda = valorCusto + ( valorCusto * (porcentagemVenda / 100));

        System.out.println("Valor de venda do produto: R$" + valorVenda);
    }
}
