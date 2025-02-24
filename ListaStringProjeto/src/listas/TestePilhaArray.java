package listas;

public class TestePilhaArray {
    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(3);
        
        pilha.empilhar("Ana");
        pilha.empilhar("Bruno");
        pilha.empilhar("Carlos");
        
        pilha.imprimirPilha();
        
        pilha.desempilhar();
        pilha.imprimirPilha();
    }
}
