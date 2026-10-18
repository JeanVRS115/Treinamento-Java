import java.util.Locale;
import java.util.Scanner;

public class Program  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da largura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Digite o valor da altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.println();
        System.out.printf("Área: %.2f%n", retangulo.area());
        System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());

        sc.close();
    }
}