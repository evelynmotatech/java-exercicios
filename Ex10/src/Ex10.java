/* A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;*/
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da compra a ser parcelada:");
        float valorTotal = leitor.nextFloat();
        
        float valorParcelado = valorTotal / 5;

        System.out.println("Valor total da compra é R$" +valorTotal+ " e o valor parcelado (sem juros) é 5x R$" + valorParcelado);
    }
}
