package produtosordenados;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Produto " + (i + 1));
            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Valor: R$ ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); 

            produtos[i] = new Produto(codigo, nome, valor);
        }

        Produto[] porCodigo = Arrays.copyOf(produtos, produtos.length);
        Arrays.sort(porCodigo, Comparator.comparingInt(Produto::getCodigo));

        Produto[] porValor = Arrays.copyOf(produtos, produtos.length);
        Arrays.sort(porValor, Comparator.comparingDouble(Produto::getValor));

        System.out.println("\nProdutos ordenados por CÓDIGO:");
        for (Produto p : porCodigo) {
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por VALOR:");
        for (Produto p : porValor) {
            System.out.println(p);
        }
    }
}
