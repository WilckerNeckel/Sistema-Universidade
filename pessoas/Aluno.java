package trabalhofinal.sistemauniversidade.pessoas;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String endereco, String telefone, String matricula) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
    }

    // getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
