package ifma.lista01;

import java.util.Arrays;


public class Aluno {
    private int codigo;
    private String matricula;
    private String nome;

    public Aluno(int codigo, String matricula, String nome) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}


class CadastrarAlunos {
    private Aluno[] vetor;
    private int tamanho;
    private int contador;

    public CadastrarAlunos(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new Aluno[tamanho];
        this.contador = 0;
    }

    public void adicionarNoFinal(Aluno aluno) {
        if (contador < tamanho) {
            vetor[contador++] = aluno;
        } else {
            System.out.println("Erro: vetor cheio.");
        }
    }

    public void adicionarNoInicio(Aluno aluno) {
        if (contador < tamanho) {
            System.arraycopy(vetor, 0, vetor, 1, contador);
            vetor[0] = aluno;
            contador++;
        } else {
            System.out.println("Erro: vetor cheio.");
        }
    }

    public void removerNoFinal() {
        if (contador > 0) {
            vetor[--contador] = null;
        } else {
            System.out.println("Erro: vetor vazio.");
        }
    }

    public void removerNoInicio() {
        if (contador > 0) {
            System.arraycopy(vetor, 1, vetor, 0, contador - 1);
            vetor[--contador] = null;
        } else {
            System.out.println("Erro: vetor vazio.");
        }
    }

    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < contador && vetor[indice] != null;
    }

    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            throw new IllegalArgumentException("Erro: índice inválido ou posição vazia.");
        }

        String nomeRemovido = vetor[indice].getNome();

        if (indice == 0) {
            removerNoInicio();
        } else if (indice == contador - 1) {
            removerNoFinal();
        } else {
            System.arraycopy(vetor, indice + 1, vetor, indice, contador - indice - 1);
            vetor[--contador] = null;
        }

        return nomeRemovido;
    }

    public void ordenarVetor() {
        Arrays.sort(vetor, 0, contador, (a1, a2) -> Integer.compare(a1.getCodigo(), a2.getCodigo()));
    }

    public void exibirAlunos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(vetor[i]);
        }
    }
}

// Classe TestarAlunos
class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        Aluno a1 = new Aluno(3, "202301", "João");
        Aluno a2 = new Aluno(1, "202302", "Maria");
        Aluno a3 = new Aluno(2, "202303", "Carlos");

        cadastro.adicionarNoFinal(a1);
        cadastro.adicionarNoInicio(a2);
        cadastro.adicionarNoFinal(a3);

        System.out.println("Antes da ordenação:");
        cadastro.exibirAlunos();

        cadastro.ordenarVetor();
        System.out.println("\nApós a ordenação:");
        cadastro.exibirAlunos();

        cadastro.removerNoInicio();
        System.out.println("\nApós remover no início:");
        cadastro.exibirAlunos();

        cadastro.removerComIndice(1);
        System.out.println("\nApós remover no índice 1:");
        cadastro.exibirAlunos();
    }
}
