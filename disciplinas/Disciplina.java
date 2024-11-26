package trabalhofinal.sistemauniversidade.disciplinas;
import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

public class Disciplina {
    private String nome, curso, professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, String curso, String professor, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.curso = curso;
        this.professor = professor;
        this.alunos = alunos;
    }

    // getters and setters
    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getProfessor() {
        return this.professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

}
