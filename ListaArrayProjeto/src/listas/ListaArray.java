package listas;

public class ListaArray {
    private int[] array;
    private int tamanho;

    // Construtor da classe
    public ListaArray(int capacidade) {
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    // Adiciona um elemento ao final da lista
    public void adicionar(int elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    // Adiciona um elemento em uma posição específica
    public void adicionarNaPosicao(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho || tamanho == array.length) {
            System.out.println("Erro: Posição inválida ou lista cheia!");
            return;
        }
        // Move os elementos para a direita para abrir espaço na posição desejada
        for (int i = tamanho; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        tamanho++;
    }

    // Remove um elemento de uma posição específica
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        // Move os elementos para a esquerda para preencher o espaço
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
    }

    // Imprime todos os elementos da lista
    public void imprimirLista() {
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
