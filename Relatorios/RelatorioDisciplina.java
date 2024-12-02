package trabalhofinal.sistemauniversidade.Relatorios;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.Curso.Curso;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

// classe relatório de disciplina que herda de relatório
public class RelatorioDisciplina extends Relatorio<Disciplina> {

    // aplica o polimorfismo para imprimir as informações básicas da disciplina
    @Override
    public void informacoesBasicas(Disciplina disciplina) {
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Curso: " + disciplina.getCurso());
        System.out.println("Professor: " + disciplina.getCurso());
    }

    // métodos específicos para disciplina
    public static void todasDisciplinas(ArrayList<Curso> cursos) {
        System.out.println("\nTodas as disciplinas cadastradas:\n");
        for (Curso curso : cursos) {
            for (Disciplina disciplina : curso.getDisciplinas()) {
                System.out.println(disciplina.getNome() + " - " + curso.getNome());
            }
        }
        System.out.println();
    }

    // método que imprime os alunos matriculados na disciplina
    public static void alunosMatriculados(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }
    }

    // método que imprime as notas dos alunos
    public static void relatorioParcial(Disciplina disciplina) {
        if (disciplina.getAlunos().size() == 0) {
            System.out.println("Nenhum aluno matriculado na disciplina");
            return;
        }
        if (disciplina.getNotas().getNotas1Unidade().size() == 0 && disciplina.getNotas().getNotas2Unidade().size() == 0
                && disciplina.getNotas().getNotas3Unidade().size() == 0) {
            System.out.println("Não há notas cadastradas para a disciplina");
            return;
        }
        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("\n");
            System.out.println("Matricula: " + aluno.getMatricula().getNumero());
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota 1 unidade: " + (disciplina.getNotas().notaAluno1Un(aluno) != null
                    ? disciplina.getNotas().notaAluno1Un(aluno).getNota()
                    : "Não cadastrada"));
            System.out.println("Nota 2 unidade: " + (disciplina.getNotas().notaAluno2Un(aluno) != null
                    ? disciplina.getNotas().notaAluno2Un(aluno).getNota()
                    : "Não cadastrada"));
            System.out.println("Nota 3 unidade: " + (disciplina.getNotas().notaAluno3Un(aluno) != null
                    ? disciplina.getNotas().notaAluno3Un(aluno).getNota()
                    : "Não cadastrada"));
            System.out.println("\n");
        }
    }

    // método que imprime o relatório final dos alunos
    public static void relatorioFinal(Disciplina disciplina) {
        if (disciplina.getAlunos().size() == 0) {
            System.out.println("Nenhum aluno matriculado na disciplina");
            return;
        }
        if (disciplina.getNotas().getNotas1Unidade().size() == 0 && disciplina.getNotas().getNotas2Unidade().size() == 0
                && disciplina.getNotas().getNotas3Unidade().size() == 0) {
            System.out.println("Não há notas cadastradas para a disciplina");
            return;
        }

        for (Aluno aluno : disciplina.getAlunos()) {
            if (disciplina.getNotas().notaAluno1Un(aluno) == null || disciplina.getNotas().notaAluno2Un(aluno) == null
                    || disciplina.getNotas().notaAluno3Un(aluno) == null) {
                System.out.println("\nFaltam notas para o aluno " + aluno.getNome() + "!\n");
                continue;
            }
            System.out.println("\n");
            System.out.println("Matricula: " + aluno.getMatricula().getNumero());
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota 1 unidade: " + disciplina.getNotas().notaAluno1Un(aluno).getNota());
            System.out.println("Nota 2 unidade: " + disciplina.getNotas().notaAluno2Un(aluno).getNota());
            System.out.println("Nota 3 unidade: " + disciplina.getNotas().notaAluno3Un(aluno).getNota());
            System.out.println("Média: " + String.format("%.2f", disciplina.getNotas().mediaGeral(aluno)));
            System.out
                    .println("Situação: " + (disciplina.getNotas().mediaGeral(aluno) >= 7 ? "Aprovado" : "Reprovado"));

        }
    }

}
