package cadastro;

import java.io.*;
import java.util.*;

public class CadastroAutomovel {
    private List<Automovel> lista = new ArrayList<>();
    private final String arquivo = "automoveis.txt";

    public CadastroAutomovel() {
        carregarArquivo();
    }

    public void inserirAutomovel(Automovel a) {
        if (buscarPorPlaca(a.getPlaca()) != null) {
            System.out.println("Erro: Placa já cadastrada.");
            return;
        }
        lista.add(a);
        System.out.println("Automóvel adicionado com sucesso.");
    }

    public void removerAutomovel(String placa) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            lista.remove(a);
            System.out.println("Automóvel removido.");
        } else {
            System.out.println("Automóvel não encontrado.");
        }
    }

    public void alterarAutomovel(String placa, Automovel novo) {
        Automovel antigo = buscarPorPlaca(placa);
        if (antigo != null) {
            antigo.setModelo(novo.getModelo());
            antigo.setMarca(novo.getMarca());
            antigo.setAno(novo.getAno());
            antigo.setValor(novo.getValor());
            System.out.println("Dados alterados com sucesso.");
        } else {
            System.out.println("Automóvel não encontrado.");
        }
    }

    public Automovel buscarPorPlaca(String placa) {
        for (Automovel a : lista) {
            if (a.getPlaca().equalsIgnoreCase(placa)) {
                return a;
            }
        }
        return null;
    }

    public void listarOrdenado(String criterio) {
        Comparator<Automovel> comp = switch (criterio.toLowerCase()) {
            case "modelo" -> Comparator.comparing(Automovel::getModelo);
            case "marca" -> Comparator.comparing(Automovel::getMarca);
            default -> Comparator.comparing(Automovel::getPlaca);
        };
        lista.stream()
            .sorted(comp)
            .forEach(a -> System.out.println(a.formatado()));
    }

    public void salvarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Automovel a : lista) {
                bw.write(a.toString());
                bw.newLine();
            }
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    private void carregarArquivo() {
        File f = new File(arquivo);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 5) {
                    String placa = partes[0];
                    String modelo = partes[1];
                    String marca = partes[2];
                    int ano = Integer.parseInt(partes[3]);
                    double valor = Double.parseDouble(partes[4]);
                    lista.add(new Automovel(placa, modelo, marca, ano, valor));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
    }
}
