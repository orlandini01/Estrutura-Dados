package pilha;

public class PilhaEncadeada {
    private Nodo topo;

    public PilhaEncadeada() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        novoNodo.proximo = topo;
        topo = novoNodo;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        int valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        return topo.dado;
    }

    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        Nodo temp = topo;
        System.out.print("Pilha: ");
        while (temp != null) {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }
}

