package trabalhofinal.sistemauniversidade.pessoas;
import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;

public class Professor extends Pessoa {
    private ArrayList<Disciplina> disciplinas;
    private double salario;


    public Professor(String nome, String cpf, String telefone, double salario) {
        super(nome, cpf, telefone);
        this.salario = salario;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    // methods
    public void darNota(Aluno aluno, String nomeDisciplina, double nota, int unidade) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(nomeDisciplina)) {
                disciplina.darNota(aluno, nota, unidade);
                return;
            }
        }
        System.out.println("Disciplina não encontrada");
    }

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
