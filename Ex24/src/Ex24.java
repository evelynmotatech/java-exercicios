/**. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número; */
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        char repetir = 's';

        while(repetir =='s' || repetir == 'S'){
            System.out.println("Digite um número");
            int num = leitor.nextInt();
            if(num > 0){
                System.out.println(num + ": Positivo");
            }else if(num < 0){
                System.out.println(num + ": Negativo");
            }else{
                System.out.println(num);
            }

            System.out.println("Deseja repetir? S - Sim | N - Não");
            repetir = leitor.next().charAt(0);
        }

    }
}
