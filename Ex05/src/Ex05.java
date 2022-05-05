/*Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética); */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nomeAluno = leitor.nextLine();

        System.out.println("Digite a primeira nota do aluno:");
        float nota1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota do aluno:");
        float nota2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota do aluno:");
        float nota3 = leitor.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média do aluno: " + media);

    }
}
