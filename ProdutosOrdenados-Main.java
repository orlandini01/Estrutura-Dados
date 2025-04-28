package Ordenando;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static class Produto {
        String nome;
        double preco;

        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            double preco = Double.parseDouble(scanner.nextLine());

            produtos[i] = new Produto(nome, preco);
        }

        Arrays.sort(produtos, Comparator.comparingDouble((Produto p) -> p.preco).reversed());

        System.out.println("\nProdutos ordenados do mais caro para o mais barato:");
        for (Produto p : produtos) {
            System.out.println(p.nome + " - R$ " + String.format("%.2f", p.preco));
        }

        try (FileWriter writer = new FileWriter("produtos_ordenados.txt")) {
            for (Produto p : produtos) {
                writer.write(p.nome + " - R$ " + String.format("%.2f", p.preco) + "\n");
            }
            System.out.println("\nArquivo 'produtos_ordenados.txt' exportado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}

