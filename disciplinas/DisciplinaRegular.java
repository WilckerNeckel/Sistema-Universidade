package trabalhofinal.sistemauniversidade.disciplinas;

import trabalhofinal.sistemauniversidade.Curso.Curso;

public class DisciplinaRegular extends Disciplina {

    public DisciplinaRegular(String nome, Curso curso) {
        super(nome, curso);
    }

    @Override
    public String getPeriodoAula() {
        return "11/03/2025 à 11/07/2025";
    }
}
