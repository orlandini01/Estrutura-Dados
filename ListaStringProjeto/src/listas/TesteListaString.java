package listas;

public class TesteListaString {
    public static void main(String[] args) {
        // Criando a lista de nomes com capacidade para 4 elementos
        ListaArrayString lista = new ListaArrayString(4);
        
        // Adicionando nomes
        lista.adicionar("Ana");
        lista.adicionar("Bruno");
        lista.adicionar("Carlos");
        
        // Imprimindo a lista após adições
        lista.imprimirLista();
        
        // Removendo o nome na posição 1 (Bruno)
        lista.remover(1);
        lista.imprimirLista();
        
        // Buscando um nome na lista
        String nomeBusca = "Carlos";
        int posicao = lista.buscar(nomeBusca);
        if (posicao != -1) {
            System.out.println(nomeBusca + " encontrado na posição " + posicao);
        } else {
            System.out.println(nomeBusca + " não encontrado.");
        }
        
        // Adicionando mais um nome
        lista.adicionar("Daniela");
        lista.imprimirLista();
        
        // Buscando um nome não presente
        nomeBusca = "Felipe";
        posicao = lista.buscar(nomeBusca);
        if (posicao != -1) {
            System.out.println(nomeBusca + " encontrado na posição " + posicao);
        } else {
            System.out.println(nomeBusca + " não encontrado.");
        }
    }
}
