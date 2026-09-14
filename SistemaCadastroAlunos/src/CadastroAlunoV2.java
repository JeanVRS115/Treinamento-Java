//Programa em Java que permita cadastrar informações
//de um aluno:
import java.util.Scanner;

public class CadastroAlunoV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuar;

        int contador = 0;

        do {

            //========== APRESENTAÇÃO DO CÓDIGO ==========

            System.out.println("======================================");
            System.out.println("=    SISTEMA DE CADASTRO DE ALUNO    =");
            System.out.println("======================================");
            System.out.println("Bem-vindo!");
            System.out.println("Vamos cadastrar as informações do aluno.");
            System.out.println();

            //========== ENTRADA DE DADOS ==========

            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite seu curso: ");
            String curso = scanner.nextLine();

            System.out.print("Digite sua Nota1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite sua Nota2: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            //========== CÁLCULOS ==========

            double media = (nota1 + nota2) / 2;

            //========== SITUAÇÃO DO ALUNO ==========

            String situacao;
            if (media >= 7) {
                situacao = "Aprovado!";
            } else if (media >= 5) {
                situacao = "Recuperação!";
            } else {
                situacao = "Reprovado!";
            }

            //========== EXIBIÇÃO DOS DADOS ==========

            System.out.println();
            System.out.println("=========================");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Curso: " + curso);
            System.out.println("Media: " + media);
            System.out.println("Situação: " + situacao);
            System.out.println("=========================");
            System.out.println();
            System.out.print("Deseja cadastrar outro Aluno? (S/N): ");
            continuar = scanner.nextLine();

            contador++;
        } while (continuar.equalsIgnoreCase("S"));
        System.out.println();
        System.out.print("Total de alunos cadastrados: " +contador);


    }
}