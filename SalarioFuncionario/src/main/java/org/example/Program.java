package org.example;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Locale.setDefault(Locale.US);

     Funcionario funcionario = new Funcionario();

     System.out.println("Dados do Funcionário");
     System.out.print("Digite o nome do funcionário: ");
     funcionario.nome = sc.nextLine();
     System.out.print("Digite o valor do salário: ");
     funcionario.salarioBruto = sc.nextDouble();
     System.out.print("Digite o valor da imposto: ");
     funcionario.imposto = sc.nextDouble();

     System.out.println();
     System.out.println("Dados do Funcionário: ");
     System.out.print("Funcionário: " +funcionario);

     System.out.println();
     System.out.print("Qual a porcentagem de aumento no salário?");
     int porcentagem = sc.nextInt();
     funcionario.aumentarSalarioBruto(porcentagem);

     System.out.println("Dados Atualizados do Funcionário: ");
     System.out.print("Funcionário: " +funcionario);

        sc.close();
    }
}