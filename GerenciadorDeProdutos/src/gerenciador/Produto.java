package gerenciador;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade;
    }
}

