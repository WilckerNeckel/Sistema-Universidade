package trabalhofinal.sistemauniversidade.disciplinas;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.Curso.Curso;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.pessoas.Professor;

public class DisciplinaRegular extends Disciplina{

    public DisciplinaRegular(String nome, Curso curso, Professor professor, String area, ArrayList<Aluno> alunos) {
        super(nome, curso, professor, alunos);
    }
    
    @Override
    public String getPeriodoAula(){
        return "11/03/2025 à 11/07/2025";
    } 
}
