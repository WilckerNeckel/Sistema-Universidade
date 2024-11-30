package trabalhofinal.sistemauniversidade;

import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import java.util.ArrayList;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Matricula(Aluno aluno, Curso curso, Disciplina disciplinas) {
        this.aluno = aluno;
        this.curso = curso;
        this.disciplinas.add(disciplinas);
    }

    // methods

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public void removeDisciplina(String nome) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(nome)) {
                disciplinas.remove(disciplina);
                break;
            }
        }
    }

    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }

    public void printDisciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    // getters and setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
