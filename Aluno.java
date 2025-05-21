package Alunos;

public class Aluno {
    private int matricula;
    private String nome;
    private double coeficiente;

    public Aluno(int matricula, String nome, double coeficiente) {
        this.matricula = matricula;
        this.nome = nome;
        this.coeficiente = coeficiente;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    @Override
    public String toString() {
        return matricula + "," + nome + "," + coeficiente;
    }
}
