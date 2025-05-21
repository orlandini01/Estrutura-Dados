package Alunos;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Cadastro do aluno #" + (i + 1));
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Coeficiente de rendimento: ");
            double coeficiente = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, coeficiente);
            listaAlunos.add(aluno);
        }

        salvarAlunosEmArquivo(listaAlunos);
        System.out.println("Dados dos alunos salvos no arquivo alunos.txt!");
    }

    public static void salvarAlunosEmArquivo(ArrayList<Aluno> alunos) {
        try {
            FileWriter writer = new FileWriter("alunos.txt");
            for (Aluno a : alunos) {
                writer.write(a.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}
