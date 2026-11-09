
import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double valorEstoque() {
        return preco * quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[10];
        int total = 0, opcao;

        do {
            System.out.println("\n=== GESTAO DE LOJA ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Realizar venda");
            System.out.println("4 - Valor total do estoque");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (total < produtos.length) {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine().trim();

                        System.out.print("Preco: ");
                        double preco = sc.nextDouble();

                        System.out.print("Quantidade: ");
                        int qtd = sc.nextInt();

                        if (nome.isEmpty() || preco <= 0 || qtd < 0) {
                            System.out.println("Dados invalidos!");
                        } else {
                            produtos[total] = new Produto(nome, preco, qtd);
                            total++;
                            System.out.println("Produto cadastrado!");
                        }
                    } else {
                        System.out.println("Cadastro cheio!");
                    }
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        for (int i = 0; i < total; i++) {
                            Produto p = produtos[i];

                            String status = p.quantidade > 0
                                    ? "Disponivel" : "Esgotado";

                            System.out.printf("%d - %s | R$ %.2f | Qtd: %d | %s%n",
                                    i + 1, p.nome.toUpperCase(),
                                    p.preco, p.quantidade, status);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Numero do produto: ");
                    int id = sc.nextInt();

                    if (id < 1 || id > total) {
                        System.out.println("Produto inexistente!");
                    } else {
                        Produto p = produtos[id - 1];

                        System.out.print("Quantidade da venda: ");
                        int venda = sc.nextInt();

                        if (venda <= 0) {
                            System.out.println("Quantidade invalida!");
                        } else if (venda > p.quantidade) {
                            System.out.println("Estoque insuficiente!");
                        } else {
                            p.quantidade -= venda;
                            double valor = venda * p.preco;
                            System.out.printf("Venda realizada: R$ %.2f%n", valor);
                        }
                    }
                    break;

                case 4:
                    double soma = 0;

                    for (int i = 0; i < total; i++) {
                        soma += produtos[i].valorEstoque();
                    }

                    System.out.printf("Valor total do estoque: R$ %.2f%n", soma);
                    break;

                case 0:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
