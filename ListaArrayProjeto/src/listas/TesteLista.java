package listas;

public class TesteLista {
    public static void main(String[] args) {
        // Testando a ListaArray
        ListaArray lista = new ListaArray(5);
        
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimirLista();
        
        // Teste da remoção
        lista.remover(1);
        lista.imprimirLista();
        
        // Teste de adição em posição específica
        lista.adicionarNaPosicao(25, 1);
        lista.imprimirLista();
        
        lista.adicionarNaPosicao(40, 3); // Tentando adicionar em posição válida
        lista.imprimirLista();
        
        lista.adicionarNaPosicao(50, 5); // Tentando adicionar em posição inválida
    }
}
