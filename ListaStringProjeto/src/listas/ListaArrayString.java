package listas;

public class ListaArrayString {
    private String[] array;
    private int tamanho;

    // Construtor da classe
    public ListaArrayString(int capacidade) {
        this.array = new String[capacidade];
        this.tamanho = 0;
    }

    // Adiciona um nome ao final da lista
    public void adicionar(String nome) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = nome;
    }

    // Remove um nome pela posição (índice)
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

    // Imprime todos os nomes na lista
    public void imprimirLista() {
        System.out.print("Lista de Nomes: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Busca um nome na lista e retorna o índice
    public int buscar(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i].equals(nome)) {
                return i; // Retorna o índice do nome encontrado
            }
        }
        return -1; // Retorna -1 se o nome não for encontrado
    }
}
