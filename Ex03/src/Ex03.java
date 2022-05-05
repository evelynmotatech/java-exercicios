//Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a distância percorrida pelo automóvel: ");
        float distancia = leitor.nextFloat();

        System.out.println("Digite o total de combustível gasto pelo automóvel: ");
        float combustivel = leitor.nextFloat();

        float consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio de combustível desse automóvel foi :" + consumoMedio + "km/l.");
    }
}
