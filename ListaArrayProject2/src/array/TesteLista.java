package array;

import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaArray lista = new ListaArray(5);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar elemento");
            System.out.println("2 - Adicionar em posição específica");
            System.out.println("3 - Remover elemento");
            System.out.println("4 - Imprimir lista");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para adicionar: ");
                    int numero = scanner.nextInt();
                    lista.adicionar(numero);
                    break;
                    
                case 2:
                    System.out.print("Digite o número para adicionar: ");
                    int num = scanner.nextInt();
                    System.out.print("Digite a posição: ");
                    int posicao = scanner.nextInt();
                    lista.adicionarNaPosicao(num, posicao);
                    break;

                case 3:
                    System.out.print("Digite a posição do número a remover: ");
                    int posRemover = scanner.nextInt();
                    lista.remover(posRemover);
                    break;
                    
                case 4:
                    lista.imprimirLista();
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
