package trabalhofinal.sistemauniversidade.Curso;

import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;

public class Curso {
    private String nome, coordenador, faculdade;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Matricula> matriculas;

    // construtores
    public Curso(String nome, String coordenador, String faculdade) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.faculdade = faculdade;
        this.disciplinas = new ArrayList<Disciplina>();
        this.matriculas = new ArrayList<Matricula>();
    }

    // métodos

    // adiciona disciplina ao curso
    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    // lista professores do curso
    public void professoresDisciplinas() {
        System.out.println("Professores do curso " + this.nome + ":\n");
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getProfessor() != null) {
                System.out.println(disciplina.getProfessor().getNome() + " - " + disciplina.getNome());
            }
        }
    }

    // lista disciplinas do curso
    public void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    // remove disciplina do curso
    public void removeMatricula(Matricula matricula) {
        this.matriculas.remove(matricula);
    }

    // getters and setters
    public String getNome() {
        return this.nome;
    }

    public ArrayList<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public String getCoordenador() {
        return this.coordenador;
    }

    public String getFaculdade() {
        return this.faculdade;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
