package trabalhofinal.sistemauniversidade.pessoas;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;

public class Professor extends Pessoa {
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
        this.disciplinas = new ArrayList<Disciplina>();
    }

    // getters and setters
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

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
}
