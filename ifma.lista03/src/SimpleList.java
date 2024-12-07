class SimpleList {
    private Node head;

    public SimpleList() {
        this.head = null;
    }

    public void adicionarInicio(int valor) {
        Node novoNode = new Node(valor);
        novoNode.next = head;
        head = novoNode;
    }

    public void adicionarFim(int valor) {
        if (head == null) {
            adicionarInicio(valor);
        } else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = new Node(valor);
        }
    }

    public int removerComeco() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia. Não é possível remover.");
        }
        int valor = head.data;
        head = head.next;
        return valor;
    }

    public int removerFinal() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia. Não é possível remover.");
        }
        if (head.next == null) {
            return removerComeco();
        }
        Node atual = head;
        while (atual.next.next != null) {
            atual = atual.next;
        }
        int valor = atual.next.data;
        atual.next = null;
        return valor;
    }

    public int getMaiorValor() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia.");
        }
        int maior = head.data;
        Node atual = head.next;
        while (atual != null) {
            if (atual.data > maior) {
                maior = atual.data;
            }
            atual = atual.next;
        }
        return maior;
    }

    public int getMenorValor() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia.");
        }
        int menor = head.data;
        Node atual = head.next;
        while (atual != null) {
            if (atual.data < menor) {
                menor = atual.data;
            }
            atual = atual.next;
        }
        return menor;
    }

    public double getMediaValores() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia.");
        }
        int soma = 0, count = 0;
        Node atual = head;
        while (atual != null) {
            soma += atual.data;
            count++;
            atual = atual.next;
        }
        return (double) soma / count;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("[");
        Node atual = head;
        while (atual != null) {
            resultado.append(atual.data);
            if (atual.next != null) {
                resultado.append(", ");
            }
            atual = atual.next;
        }
        resultado.append("]");
        return resultado.toString();
    }
}
