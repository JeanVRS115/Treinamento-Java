import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a nota 1 do aluno: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2 do aluno: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3 do aluno: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println(aluno.nome);

        double total = aluno.notaFinal();

        System.out.printf("Nota Final: %.2f%n", total);
        if (total >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
            System.out.printf("Faltando %.2f pontos %n", 60 - total);
        }

        sc.close();
    }
}