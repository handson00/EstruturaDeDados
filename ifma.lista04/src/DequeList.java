public class DequeList {
    private Node primeiro;
    private Node ultimo;


    public DequeList() {
        this.primeiro = null;
        this.ultimo = null;
    }


    public void addLast(Aluno aluno) {
        Node novoNode = new Node(aluno);
        if (ultimo == null) {
            primeiro = novoNode;
            ultimo = novoNode;
        } else {
            ultimo.next = novoNode;
            novoNode.prev = ultimo;
            ultimo = novoNode;
        }
    }


    public Node getFirst() {
        if (primeiro == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        return primeiro;
    }


    public Node getLast() {
        if (ultimo == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        return ultimo;
    }


    public void removeFirst() {
        if (primeiro == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        Node removido = primeiro;
        primeiro = primeiro.next;
        if (primeiro != null) {
            primeiro.prev = null;
        } else {
            ultimo = null;
        }
    }


    public void removeLast() {
        if (ultimo == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        Node removido = ultimo;
        ultimo = ultimo.prev;
        if (ultimo != null) {
            ultimo.next = null;
        } else {
            primeiro = null;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node atual = primeiro;
        sb.append("[");
        while (atual != null) {
            sb.append(atual.aluno.toString());
            if (atual.next != null) {
                sb.append(", ");
            }
            atual = atual.next;
        }
        sb.append("]");
        return sb.toString();
    }


    public Node search(String nome) {
        Node atual = primeiro;
        while (atual != null) {
            if (atual.aluno.nome.equals(nome)) {
                return atual;
            }
            atual = atual.next;
        }
        throw new IllegalArgumentException("Aluno não encontrado");
    }
}