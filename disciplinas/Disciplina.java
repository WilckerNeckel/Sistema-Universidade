package trabalhofinal.sistemauniversidade.disciplinas;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.Curso;
import trabalhofinal.sistemauniversidade.Nota;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.pessoas.Professor;

public abstract class Disciplina {
    private String nome;
    Curso curso;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
    private ArrayList<Nota> notas1Unidade;
    private ArrayList<Nota> notas2Unidade;
    private ArrayList<Nota> notas3Unidade;

    public Disciplina(String nome, Curso curso, Professor professor, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.curso = curso;
        this.professor = professor;
        this.alunosMatriculados = alunos;
    }

    public void darNota(Aluno aluno, Disciplina disciplina, double nota, int unidade) {
        if (!this.getAlunos().contains(aluno)) {
            System.out.println("Aluno não está matriculado na disciplina");
            return;
        }

        Nota notaObj = new Nota(aluno, disciplina, nota);
        if (this.getNotas1Unidade().contains(notaObj) || this.getNotas2Unidade().contains(notaObj) || notas3Unidade.contains(notaObj)) {
            System.out.println("Nota já cadastrada");
            return;
        }

        switch (unidade) {
            case 1:
                this.notas1Unidade.add(notaObj);
                break;
            case 2:
                this.notas2Unidade.add(notaObj);
                break;
            case 3:
                this.notas3Unidade.add(notaObj);
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
        this.alunosMatriculados.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        this.alunosMatriculados.remove(aluno);
    }

    public void removeAluno(String nome) {
        for (Aluno aluno : alunosMatriculados) {
            if (aluno.getNome().equals(nome)) {
                alunosMatriculados.remove(aluno);
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

    public ArrayList<Aluno> getAlunosMatriculados() {
        return this.alunosMatriculados;
    }

    public ArrayList<Nota> getNotas1Unidade() {
        return this.notas1Unidade;
    }

    public ArrayList<Nota> getNotas2Unidade() {
        return this.notas2Unidade;
    }

    public ArrayList<Nota> getNotas3Unidade() {
        return this.notas3Unidade;
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

    public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setNotas1Unidade(ArrayList<Nota> notas1Unidade) {
        this.notas1Unidade = notas1Unidade;
    }

    public void setNotas2Unidade(ArrayList<Nota> notas2Unidade) {
        this.notas2Unidade = notas2Unidade;
    }

    public void setNotas3Unidade(ArrayList<Nota> notas3Unidade) {
        this.notas3Unidade = notas3Unidade;
    }


}
