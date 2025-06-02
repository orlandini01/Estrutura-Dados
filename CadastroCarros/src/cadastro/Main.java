package cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroAutomovel cadastro = new CadastroAutomovel();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Incluir automóvel");
            System.out.println("2 - Remover automóvel");
            System.out.println("3 - Alterar dados de automóvel");
            System.out.println("4 - Consultar automóvel por placa");
            System.out.println("5 - Listar automóveis (ordenado)");
            System.out.println("6 - Salvar e sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    cadastro.inserirAutomovel(new Automovel(placa, modelo, marca, ano, valor));
                }
                case 2 -> {
                    System.out.print("Placa a remover: ");
                    String placa = sc.nextLine();
                    cadastro.removerAutomovel(placa);
                }
                case 3 -> {
                    System.out.print("Placa a alterar: ");
                    String placa = sc.nextLine();
                    System.out.print("Novo Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Nova Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Novo Ano: ");
                    int ano = sc.nextInt();
                    System.out.print("Novo Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    cadastro.alterarAutomovel(placa, new Automovel(placa, modelo, marca, ano, valor));
                }
                case 4 -> {
                    System.out.print("Placa a consultar: ");
                    String placa = sc.nextLine();
                    Automovel a = cadastro.buscarPorPlaca(placa);
                    if (a != null) System.out.println(a.formatado());
                    else System.out.println("Automóvel não encontrado.");
                }
                case 5 -> {
                    System.out.print("Ordenar por (placa/modelo/marca): ");
                    String criterio = sc.nextLine();
                    cadastro.listarOrdenado(criterio);
                }
                case 6 -> {
                    cadastro.salvarArquivo();
                    System.out.println("Encerrando...");
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        sc.close();
    }
}
