package trabalhofinal.sistemauniversidade;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;


public class Nota {
    private Aluno aluno;
    private Disciplina disciplina;
    private double nota;
    
    public Nota(Aluno aluno, Disciplina disciplina, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
    }
    
    // getters and setters
    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
