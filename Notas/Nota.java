package trabalhofinal.sistemauniversidade.Notas;

import trabalhofinal.sistemauniversidade.pessoas.Aluno;

// classe que armazena as notas de cada aluno
public class Nota {
    private Aluno aluno;
    private double nota;

    // construtor
    public Nota(Aluno aluno, double nota) {
        this.aluno = aluno;
        this.nota = nota;
    }

    // getters and setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
