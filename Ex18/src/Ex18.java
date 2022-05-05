/**Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int i = 0;

        for(i = 0; i < 75; i++){
            System.out.println("Digite uma idade ");
            int num = leitor.nextInt();

            if(num >= 18){
                System.out.println("Maior de idade");                
            }else{
                System.out.println("Menor de idade"); 
            }          
        }
        
    }
}
