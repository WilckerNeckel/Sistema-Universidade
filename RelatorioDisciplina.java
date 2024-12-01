package trabalhofinal.sistemauniversidade;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

public class RelatorioDisciplina implements IRelatorio<Disciplina> {

    @Override
    public void informacoesBasicas(Disciplina disciplina) {
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Curso: " + disciplina.getCurso());
        System.out.println("Professor: " + disciplina.getCurso());
    }

    public void alunosMatriculados(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }
    }

    public void notas(Disciplina disciplina) {
        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota 1 unidade: " + disciplina.getNotas().notaAluno1Un(aluno));
            System.out.println("Nota 2 unidade: " + disciplina.getNotas().notaAluno2Un(aluno));
            System.out.println("Nota 3 unidade: " + disciplina.getNotas().notaAluno3Un(aluno));
        }
    }

    public void relatorioFinal(Disciplina disciplina) {
        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("Matricula: " + aluno.getMatricula().getNumero());
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota 1 unidade: " + disciplina.getNotas().notaAluno1Un(aluno));
            System.out.println("Nota 2 unidade: " + disciplina.getNotas().notaAluno2Un(aluno));
            System.out.println("Nota 3 unidade: " + disciplina.getNotas().notaAluno3Un(aluno));
            System.out.println("Média: " + disciplina.getNotas().mediaGeral(aluno));
            System.out
                    .println("Situação: " + (disciplina.getNotas().mediaGeral(aluno) >= 7 ? "Aprovado" : "Reprovado"));

        }
    }

}
