public class TesteDequeList {
    public static void main(String[] args) {

        DequeList lista = new DequeList();


        Aluno aluno1 = new Aluno("João", 8.5, 7.8);
        Aluno aluno2 = new Aluno("Maria", 7.1, 9.0);
        lista.addLast(aluno1);
        lista.addLast(aluno2);


        System.out.println("Lista de Alunos: " + lista);


        System.out.println("Primeiro aluno: " + lista.getFirst().aluno);
        System.out.println("Último aluno: " + lista.getLast().aluno);


        lista.removeFirst();
        System.out.println("Lista após remover o primeiro: " + lista);


        lista.removeLast();
        System.out.println("Lista após remover o último: " + lista);


        lista.addLast(aluno1);
        lista.addLast(aluno2);


        try {
            Node encontrado = lista.search("João");
            System.out.println("Aluno encontrado: " + encontrado.aluno);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
