package produtosordenados;

public class Produto {
    private int codigo;
    private String nome;
    private double valor;

    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Valor: R$" + valor;
    }
}
