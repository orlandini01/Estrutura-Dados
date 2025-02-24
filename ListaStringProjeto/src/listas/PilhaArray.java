package listas;

public class PilhaArray {
    private String[] pilha;
    private int topo;

    // Construtor da pilha
    public PilhaArray(int capacidade) {
        pilha = new String[capacidade];
        topo = -1;
    }

    // Adiciona um elemento na pilha
    public void empilhar(String nome) {
        if (topo == pilha.length - 1) {
            System.out.println("Erro: Pilha cheia!");
            return;
        }
        pilha[++topo] = nome;
    }

    // Remove o elemento do topo da pilha
    public String desempilhar() {
        if (topo == -1) {
            System.out.println("Erro: Pilha vazia!");
            return null;
        }
        return pilha[topo--];
    }

    // Imprime os elementos da pilha
    public void imprimirPilha() {
        System.out.print("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
}
