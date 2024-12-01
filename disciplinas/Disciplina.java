package trabalhofinal.sistemauniversidade.disciplinas;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.Curso;
import trabalhofinal.sistemauniversidade.Nota;
import trabalhofinal.sistemauniversidade.Notas;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.pessoas.Professor;

public abstract class Disciplina {
    private String nome;
    Curso curso;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Notas notas;

    public Disciplina(String nome, Curso curso, Professor professor, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.curso = curso;
        this.professor = professor;
        this.alunos = alunos;
        this.notas = new Notas();
    }

    public void darNota(Aluno aluno, double nota, int unidade) {
        if (!this.getAlunos().contains(aluno)) {
            System.out.println("Aluno não está matriculado na disciplina");
            return;
        }

        Nota notaObj = new Nota(aluno, nota);

        switch (unidade) {
            case 1:
                if (this.notas.getNotas1Unidade().contains(notaObj)) {
                    System.out.println("Nota já cadastrada para essa unidade");
                    return;
                }
                this.notas.addNota1Unidade(notaObj);
                break;
            case 2:
                if (this.notas.getNotas2Unidade().contains(notaObj)) {
                    System.out.println("Nota já cadastrada para essa unidade");
                    return;
                }
                this.notas.addNota2Unidade(notaObj);
                break;
            case 3:
                if (this.notas.getNotas3Unidade().contains(notaObj)) {
                    System.out.println("Nota já cadastrada para essa unidade");
                    return;
                }
                this.notas.addNota3Unidade(notaObj);;
                break;
            default:
                System.out.println("Unidade inválida");
                break;
        }

        System.out.println("Nota cadastrada com sucesso");
    }

    // abstract methods
    public abstract String getPeriodoAula();

    // methods

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void removeAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    // getters and setters
    public String getNome() {
        return this.nome;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public Notas getNotas() {
        return this.notas;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setalunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
