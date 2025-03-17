package gerenciador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Buscar por Código");
            System.out.println("4 - Buscar por Nome");
            System.out.println("5 - Listar Produtos");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 
                    gerenciador.adicionarProduto(new Produto(codigo, nome, quantidade));
                    System.out.println("Produto adicionado!");
                    break;
                case 2:
                    System.out.print("Código do produto a remover: ");
                    int codigoRemover = scanner.nextInt();
                    scanner.nextLine(); 
                    if (gerenciador.removerProduto(codigoRemover)) {
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Código do produto: ");
                    int codigoBuscar = scanner.nextInt();
                    scanner.nextLine(); 
                    Produto p1 = gerenciador.buscarPorCodigo(codigoBuscar);
                    System.out.println(p1 != null ? p1 : "Produto não encontrado.");
                    break;
                case 4:
                    System.out.print("Nome do produto: ");
                    String nomeBuscar = scanner.nextLine();
                    Produto p2 = gerenciador.buscarPorNome(nomeBuscar);
                    System.out.println(p2 != null ? p2 : "Produto não encontrado.");
                    break;
                case 5:
                    gerenciador.listarProdutos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
