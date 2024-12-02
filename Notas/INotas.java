package trabalhofinal.sistemauniversidade.Notas;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

// Interface INotas
public interface INotas {

    // métodos

    // retorna a média geral do aluno
    public double mediaGeral(Aluno aluno);

    // retorna a média da 1 unidade do aluno
    public Nota notaAluno1Un(Aluno aluno);

    // retorna a média da 2 unidade do aluno
    public Nota notaAluno2Un(Aluno aluno);

    // retorna a média da 3 unidade do aluno
    public Nota notaAluno3Un(Aluno aluno);

}
