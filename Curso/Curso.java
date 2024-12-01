package trabalhofinal.sistemauniversidade.Curso;

import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
public class Curso {
    private String nome, coordenador, faculdade;
    private ArrayList<Disciplina> disciplinas;
    
    public Curso(String nome, String coordenador, String faculdade, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.faculdade = faculdade;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    // getters and setters
    public String getNome() {
        return this.nome;
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
