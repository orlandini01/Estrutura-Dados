package array;

import java.util.Scanner;

public class TesteListaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaArrayString lista = new ListaArrayString(5);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome por índice");
            System.out.println("3 - Imprimir lista");
            System.out.println("4 - Buscar nome");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome para adicionar: ");
                    String nome = scanner.nextLine();
                    lista.adicionar(nome);
                    break;

                case 2:
                    System.out.print("Digite o índice do nome a remover: ");
                    int indice = scanner.nextInt();
                    lista.remover(indice);
                    break;

                case 3:
                    lista.imprimirLista();
                    break;

                case 4:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    int posicao = lista.buscar(nomeBuscar);
                    if (posicao != -1) {
                        System.out.println("Nome encontrado na posição " + posicao);
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
