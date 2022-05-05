/**Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9); */

import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nomeAluno = leitor.nextLine();

        System.out.println("Digite a primeira nota");
        float nota1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota");
        float nota2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota");
        float nota3 = leitor.nextFloat();

        float media = (float) (nota1+nota2+nota3)/3;

        if(media >= 7){
            System.out.println("Aluno: " +nomeAluno+ ". Situação: Aprovado");
        }else if (media <=5){
            System.out.println("Aluno: " +nomeAluno+ ". Situação: Reprovado");
        }else{
            System.out.println("Aluno: " +nomeAluno+ ". Situação: Recuperação");
        }
    }
}
