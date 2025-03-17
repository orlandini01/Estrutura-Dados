package estruturas;

import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(5);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Empilhar (Push)");
            System.out.println("2 - Desempilhar (Pop)");
            System.out.println("3 - Exibir topo da pilha (Peek)");
            System.out.println("4 - Verificar se a pilha está vazia");
            System.out.println("5 - Imprimir pilha");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para empilhar: ");
                    int numero = scanner.nextInt();
                    pilha.push(numero);
                    break;

                case 2:
                    int removido = pilha.pop();
                    if (removido != -1) {
                        System.out.println("Número removido: " + removido);
                    }
                    break;

                case 3:
                    int topo = pilha.peek();
                    if (topo != -1) {
                        System.out.println("Topo da pilha: " + topo);
                    }
                    break;

                case 4:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("A pilha NÃO está vazia.");
                    }
                    break;

                case 5:
                    pilha.imprimirPilha();
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
