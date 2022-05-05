//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
  

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = lScanner.nextInt();
        
        System.out.println("Digite o segundo número");
        int num2 = lScanner.nextInt();

        int soma = num1 + num2;
        int subtração = num1 - num2;
        int multiplicação = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("A soma dos números é: " + soma );
        System.out.println("A subtração dos números é: " + subtração);
        System.out.println("A multiplicação dos números é: " + multiplicação);
        System.out.println("A divisão dos números é: " + divisao);

    }
}
