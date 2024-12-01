package trabalhofinal.sistemauniversidade.Relatorios;
import trabalhofinal.sistemauniversidade.Curso.Curso;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
public class RelatorioCurso implements IRelatorio<Curso> {

    @Override
    public void informacoesBasicas(Curso curso) {
        System.out.println("Nome do curso: " + curso.getNome());
        System.out.println("Coordenador: " + curso.getCoordenador());
        System.out.println("Faculdade: " + curso.getFaculdade());
    }

    public void disciplinasCurso(Curso curso) {
        System.out.println("Disciplinas do curso:");
        for (Disciplina disciplina : curso.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }
    }
    
}
