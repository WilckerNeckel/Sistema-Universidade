package trabalhofinal.sistemauniversidade.disciplinas;
import trabalhofinal.sistemauniversidade.Curso.Curso;

// classe disciplina eletiva que herda de disciplina e acrescent um atributo area
public class DisciplinaEletiva extends Disciplina {
    private String area;

    // construtor disciplina eletiva
    public DisciplinaEletiva(String nome, Curso curso, String area) {
        super(nome, curso);
        this.area = area;
    }

    // métodos

    // retorna o período da aula da disciplina eletiva
    @Override
    public String getPeriodoAula() {
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
