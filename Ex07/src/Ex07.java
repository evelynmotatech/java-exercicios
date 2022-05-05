/*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;  */
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);


    System.out.println("Digite a temperatura em Celsius a ser convertida para Fahrenheit:");
    float tempCelsius = leitor.nextFloat();

    float tempFahrenheit = (9 * tempCelsius + 160) / 5;

    System.out.println("Temperatura convertida para Fahrenheit: " + tempFahrenheit+ "ºF.");
    }
}
