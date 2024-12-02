package trabalhofinal.sistemauniversidade.pessoas;

import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;

// classe professor que herda de pessoa e acrescenta um atributo salario e disciplinas
public class Professor extends Pessoa {
    private ArrayList<Disciplina> disciplinas;
    private double salario;

    public Professor(String nome, String cpf, String telefone, double salario) {
        super(nome, cpf, telefone);
        this.salario = salario;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    // methods

    // método que dá nota para um aluno em uma disciplina
    public void darNota(Aluno aluno, String nomeDisciplina, double nota, int unidade) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(nomeDisciplina)) {
                disciplina.darNota(aluno, nota, unidade);
                return;
            }
        }
        System.out.println("Disciplina não encontrada");
    }

    // método que adiciona uma disciplina ao professor
    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    // método que remove uma disciplina do professor
    public void removeDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    // método que remove uma disciplina do professor pelo nome
    public void removeDisciplina(String nome) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(nome)) {
                disciplinas.remove(disciplina);
                break;
            }
        }
    }

    // método que remove uma disciplina do professor pelo índice
    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }

    // método que imprime as disciplinas do professor
    public void printDisciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    // getters and setters
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


}
