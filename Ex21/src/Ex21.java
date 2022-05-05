/**Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        String nome;
        char sexo;
        int idade;
        char saude;

        char repetir = 's';

        int aptos = 0;
        int inaptos = 0;
        int opcional = 0;

        while(repetir == 's' || repetir == 'S'){
            System.out.println("Digite o nome do canditado:");
            nome = leitor.next();
            System.out.println("Digite o sexo do canditado: F - Feminino | M - Masculino");
            sexo = leitor.next().charAt(0);;
            System.out.println("Digite a idade do canditado:");
            idade = leitor.nextInt();
            System.out.println("Digite a saúde do canditado: A - Apta | I - Inapta");
            saude = leitor.next().charAt(0);

            if(idade >= 18 && (saude == 'A' || saude == 'a') && (sexo == 'M' || sexo == 'm')){
               aptos++;
               System.out.println("Canditato apto para o serviço militar");

            }else if (idade >= 18 && (saude == 'A' || saude == 'a') && (sexo == 'F' || sexo == 'f')){
                opcional++;
                System.out.println("Canditato apto para o serviço militar. Alistamento não obrigatório.");
            }else{
                inaptos++;
                System.out.println("Candidato não apto para o serviço militar.");
            }

            System.out.println("Deseja fazer mais cadastro? S: Sim | N: Não");
            repetir = leitor.next().charAt(0);
        }

        System.out.println("Total de aptos para cumprir o serviço militar: " +aptos);
        System.out.println("Total de aptos para cumprir o serviço militar. Não obrigatório. : " +opcional);
        System.out.println("Total de não aptos para cumprir o serviço militar: " +inaptos);
    
    }
    
}
