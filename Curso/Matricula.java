package trabalhofinal.sistemauniversidade.Curso;

import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.disciplinas.DisciplinaEletiva;
import trabalhofinal.sistemauniversidade.disciplinas.DisciplinaRegular;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private int numero;

    // contrutor vazio
    public Matricula(int numero, Curso curso, ArrayList<Disciplina> disciplinas) {
        this.numero = numero;
        this.curso = curso;
        this.addDisciplinas(disciplinas);
    }

    // métodos

    // adiciona disciplinas à matrícula
    public void addDisciplinas(ArrayList<Disciplina> disciplinas) {
        int countDisciplinaRegular = 0;
        int countDisciplinaEletiva = 0;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina instanceof DisciplinaRegular) {
                countDisciplinaRegular++;
            } else if (disciplina instanceof DisciplinaEletiva) {
                countDisciplinaEletiva++;
            }
        }

        if (countDisciplinaRegular < 2 || countDisciplinaEletiva < 1) {
            throw new IllegalArgumentException(
                    "ATENÇÃO: A matrícula deve conter pelo menos 2 disciplinas regulares e 1 disciplina eletiva.\n");
        }

        this.disciplinas.addAll(disciplinas);
    }

    // remove disciplina da matrícula pelo objeto
    public void removeDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    // remove disciplina da matrícula pelo nome
    public void removeDisciplina(String nome) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(nome)) {
                disciplinas.remove(disciplina);
                break;
            }
        }
    }

    // remove disciplina da matrícula pelo índice
    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }

    // lista disciplinas da matrícula
    public void printDisciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    // getters and setters
    public Aluno getAluno() {
        return aluno;
    }

    public int getNumero() {
        return numero;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
