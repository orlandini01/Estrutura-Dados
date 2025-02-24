package pilha;

public class TestePilhaEncadeada {
    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.push(5);
        pilha.push(15);
        pilha.push(25);
        pilha.imprimirPilha();

        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Removendo: " + pilha.pop());
        pilha.imprimirPilha();
    }
}
