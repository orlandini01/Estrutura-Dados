package lista02;

public class ListaArray {
    // CONSTANTES
    final public static int TAMANHO_INICIAL = 3;
    final public static int FATOR_CRESCIMENTO = 5;
    final public static int NAO_ESTA_PRESENTE = -1;

    // ATRIBUTOS
    private Object[] arrayInterno;
    private int numElementos;

    // CONSTRUTOR
    public ListaArray() {
        this.numElementos = 0;
        this.arrayInterno = new Object[TAMANHO_INICIAL];
    }

    // Método para verificar necessidade de crescimento do array
    private void verificarNecessidadeDeCrescimento() {
        if (this.numElementos == this.arrayInterno.length) {
            Object[] novoArray = new Object[this.arrayInterno.length + FATOR_CRESCIMENTO];
            for (int i = 0; i < this.arrayInterno.length; i++) {
                novoArray[i] = this.arrayInterno[i];
            }
            this.arrayInterno = novoArray;
        }
    }

    // Método para adicionar um elemento no final da lista
    public boolean adicionar(Object elemento) {
        this.verificarNecessidadeDeCrescimento();
        this.arrayInterno[this.numElementos] = elemento;
        this.numElementos++;
        return true;
    }

    // Método para adicionar um elemento em uma posição específica
    public boolean adicionar(Object elemento, int posicao) {
        if (posicao < 0 || posicao > this.numElementos) {
            return false;
        }
        this.verificarNecessidadeDeCrescimento();
        for (int i = this.numElementos; i > posicao; i--) {
            this.arrayInterno[i] = this.arrayInterno[i - 1];
        }
        this.arrayInterno[posicao] = elemento;
        this.numElementos++;
        return true;
    }

    // Método para obter um elemento pela posição
    public Object obter(int posicao) {
        if (posicao < 0 || posicao >= this.numElementos) {
            return null;
        }
        return this.arrayInterno[posicao];
    }

    // Método para buscar a posição de um elemento
    public int posicaoDe(Object elemento) {
        for (int i = 0; i < this.numElementos; i++) {
            if (this.arrayInterno[i].equals(elemento)) {
                return i;
            }
        }
        return NAO_ESTA_PRESENTE;
    }

    // Método para remover um elemento pela posição
    public boolean remover(int posicao) {
        if (posicao < 0 || posicao >= this.numElementos) {
            return false;
        }
        for (int i = posicao; i < this.numElementos - 1; i++) {
            this.arrayInterno[i] = this.arrayInterno[i + 1];
        }
        this.arrayInterno[this.numElementos - 1] = null;
        this.numElementos--;
        return true;
    }

    // Método para remover um elemento pelo valor
    public boolean remover(Object elemento) {
        int posicao = this.posicaoDe(elemento);
        if (posicao == NAO_ESTA_PRESENTE) {
            return false;
        }
        return this.remover(posicao);
    }

    // Método para obter o número de elementos na lista
    public int obterNumElementos() {
        return this.numElementos;
    }
}
