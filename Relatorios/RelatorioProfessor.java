package trabalhofinal.sistemauniversidade.Relatorios;
import trabalhofinal.sistemauniversidade.Curso.Curso;
import java.util.ArrayList;

public class RelatorioProfessor {
    public static void todosProfessores(ArrayList<Curso> cursos) {
        System.out.println("Relatório de todos os professores cadastrados");
        if (cursos.size() == 0) {
            System.out.println("Nenhum curso cadastrado");
            return;
        }
        
        for (Curso curso : cursos) {
            curso.professoresDisciplinas();
        }
    }
}
