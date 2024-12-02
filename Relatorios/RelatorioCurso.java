package trabalhofinal.sistemauniversidade.Relatorios;
import trabalhofinal.sistemauniversidade.Curso.Curso;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import java.util.ArrayList;

public class RelatorioCurso extends Relatorio<Curso> {

    @Override
    public void informacoesBasicas(Curso curso) {
        System.out.println("Nome do curso: " + curso.getNome());
        System.out.println("Coordenador: " + curso.getCoordenador());
        System.out.println("Faculdade: " + curso.getFaculdade());
    }

    public static void todosCursos(ArrayList<Curso> cursos) {
        System.out.println("\nTodos os cursos cadastrados:\n");
        for (Curso curso : cursos) {
            System.out.println("* " + curso.getNome());
        }
        System.out.println();
    }

    public void disciplinasCurso(Curso curso) {
        System.out.println("Disciplinas do curso:");
        for (Disciplina disciplina : curso.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }
    }
    
}
