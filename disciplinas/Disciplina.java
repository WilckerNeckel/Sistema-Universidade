package trabalhofinal.sistemauniversidade.disciplinas;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.Notas.Notas;
import trabalhofinal.sistemauniversidade.Curso.Curso;
import trabalhofinal.sistemauniversidade.Notas.Nota;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.pessoas.Professor;

// classe abstrata Disciplina que contém os atributos e métodos comuns entre DisciplinaRegular e DisciplinaEletiva
public abstract class Disciplina {
    private String nome;
    Curso curso;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Notas notas;

    // construtor disciplina
    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
        this.notas = new Notas();
        this.alunos = new ArrayList<Aluno>();
    }

    // methods

    // dar nota ao aluno
    public void darNota(Aluno aluno, double nota, int unidade) {
        // verifica se aluno está matriculado na disciplina
        if (!this.getAlunos().contains(aluno)) {
            System.out.println("Aluno não está matriculado na disciplina");
            return;
        }

        Nota notaObj = new Nota(aluno, nota);

        switch (unidade) {
            // verifica se a nota já foi cadastrada e adiciona a nota da 1 unidade
            case 1:
                if (this.notas.getNotas1Unidade().contains(notaObj)) {
                    System.out.println("Nota já cadastrada para essa unidade");
                    return;
                }
                this.notas.addNota1Unidade(notaObj);
                break;

            // verifica se a nota já foi cadastrada e adiciona a nota da 2 unidade
            case 2:
                if (this.notas.getNotas2Unidade().contains(notaObj)) {
                    System.out.println("Nota já cadastrada para essa unidade");
                    return;
                }
                this.notas.addNota2Unidade(notaObj);
                break;
            
            // verifica se a nota já foi cadastrada e adiciona a nota da 3 unidade
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

        System.out.println("Nota cadastrada com sucesso!");
    }

    // abstract methods

    // retorna o período da aula da disciplina
    public abstract String getPeriodoAula();

    // methods

    // adiciona aluno à disciplina
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // remove aluno da disciplina pelo objeto
    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    // remove aluno da disciplina pelo nome
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
