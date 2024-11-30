package trabalhofinal.sistemauniversidade.disciplinas;

import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
// https://chatgpt.com/c/674524be-d488-8002-a5f3-b8b9110edccd

public class DisciplinaEletiva extends Disciplina {
    private String area;

    public DisciplinaEletiva(String nome, String curso, String professor, String area, ArrayList<Aluno> alunos) {
        super(nome, curso, professor, alunos);
        this.area = area;
    }
    
    @Override
    public String getPeriodoAula(){
        return "10/12/2024 à 10/03/2025";
    }

    // getters and setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
