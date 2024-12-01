package trabalhofinal.sistemauniversidade.pessoas;

import trabalhofinal.sistemauniversidade.Matricula;
import trabalhofinal.sistemauniversidade.Curso;

public class Aluno extends Pessoa {
    private Matricula matricula;
    private Curso curso;

    public Aluno(String nome, String cpf, String endereco, String telefone, Matricula matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    // getters and setters
    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
