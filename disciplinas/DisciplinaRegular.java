package trabalhofinal.sistemauniversidade.disciplinas;

import trabalhofinal.sistemauniversidade.Curso.Curso;

// classe disciplina regular que herda de disciplina
public class DisciplinaRegular extends Disciplina {

    // construtor disciplina regular 
    public DisciplinaRegular(String nome, Curso curso) {
        super(nome, curso);
    }

    // retorna o período da aula da disciplina regular
    @Override
    public String getPeriodoAula() {
        return "11/03/2025 à 11/07/2025";
    }
}
