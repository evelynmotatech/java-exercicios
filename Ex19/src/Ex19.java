/*Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres; */
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        int totalHomem = 0;
        int totalMulher = 0;
        String homem = "Homem";
        String mulher = "Mulher";

        for(i = 0; i < 4; i++){
            System.out.println("Digite um nome ");
            String nome = leitor.nextLine();

            System.out.println("Digite seu sexo ");
            String genero = leitor.nextLine();

            if(genero.equals(homem)){
                System.out.println("Nome: " +nome+ ". Sexo: Masculino");
                totalHomem++;                
            }
            if(genero.equals(mulher)){
                System.out.println("Nome: " +nome+ ". Sexo: Feminino");
                totalMulher++; 
            }                
        }
        System.out.println("Total de homens: " +totalHomem+ ". Total de Mulheres: " +totalMulher);
        
    }
}
