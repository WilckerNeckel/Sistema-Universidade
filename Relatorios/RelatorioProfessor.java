package trabalhofinal.sistemauniversidade.Relatorios;
import trabalhofinal.sistemauniversidade.Curso.Curso;
import java.util.ArrayList;

public class RelatorioProfessor {
    public static void todosProfessores(ArrayList<Curso> cursos) {
        System.out.println("Relatório de todos os professores cadastrados");
        for (Curso curso : cursos) {
            curso.professoresDisciplinas();
        }
    }
}
