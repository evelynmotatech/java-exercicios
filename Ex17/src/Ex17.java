/**Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive); */
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        int numIntervalo = 0;

        for(i = 0; i < 80; i++){
            System.out.println("Digite um número");
            int num = leitor.nextInt();

            if(num >= 10 && num <=150){
                numIntervalo++;                
            }          
        }
        System.out.println("Números no intervalo:" +numIntervalo);
    }
}
