public class Aluno {
    private String nome;
    private double primeiraNota;
    private double segundaNota;

    // Construtor
    public Aluno(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    // Método toString reescrito
    @Override
    public String toString() {
        return "(" + nome + ", " + primeiraNota + ", " + segundaNota + ")";
    }
}
