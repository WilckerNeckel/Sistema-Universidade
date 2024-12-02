package trabalhofinal.sistemauniversidade.pessoas;
import trabalhofinal.sistemauniversidade.Curso.Matricula;

public class Aluno extends Pessoa {
    private Matricula matricula;

    public Aluno(String nome, String cpf, String telefone, Matricula matricula) {
        super(nome, cpf, telefone);
        this.matricula = matricula;
    }

    // getters and setters
    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

}
