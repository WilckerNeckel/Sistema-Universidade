package trabalhofinal.sistemauniversidade.disciplinas;

// import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.Curso.Curso;
// import trabalhofinal.sistemauniversidade.pessoas.Aluno;
// import trabalhofinal.sistemauniversidade.pessoas.Professor;
public class DisciplinaEletiva extends Disciplina {
    private String area;

    public DisciplinaEletiva(String nome, Curso curso, String area) {
        super(nome, curso);
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
