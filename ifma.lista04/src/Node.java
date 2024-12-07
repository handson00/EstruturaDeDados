public class Node {
    Aluno aluno;
    Node next;
    Node prev;

    // Construtor
    public Node(Aluno aluno) {
        this.aluno = aluno;
        this.next = null;
        this.prev = null;
    }
}
