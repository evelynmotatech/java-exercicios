/**Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m; */
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor depositado:");
        double valorDeposito = leitor. nextDouble();

        double valorRendimento = (valorDeposito * 0.0007) + valorDeposito;

        System.out.println("O valor depositado com rendimento da poupança é: R$" + valorRendimento);
    }
}
