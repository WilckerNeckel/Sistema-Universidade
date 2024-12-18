package trabalhofinal.sistemauniversidade.Relatorios;

import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

// classe relatório aluno que herda de relatório e implementa os métodos abstratos e adiciona métodos específicos para aluno
public class RelatorioAluno extends Relatorio<Aluno> {

    // aplica polimorfismo para imprimir as informações básicas do aluno
    @Override
    public void informacoesBasicas(Aluno aluno) {
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }

    // métodos específicos para aluno

    // imprime as disciplinas matriculadas do aluno
    public void disciplinasMatriculadas(Aluno aluno) {
        System.out.println("Disciplinas matriculadas:");
        for (Disciplina disciplina : aluno.getMatricula().getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }
    }

    // imprime as notas do aluno
    public void notasDisciplinas(Aluno aluno) {
        System.out.println("Notas:");
        for (Disciplina disciplina : aluno.getMatricula().getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Nota 1 unidade: " + disciplina.getNotas().notaAluno1Un(aluno));
            System.out.println("Nota 2 unidade: " + disciplina.getNotas().notaAluno2Un(aluno));
            System.out.println("Nota 3 unidade: " + disciplina.getNotas().notaAluno3Un(aluno));
        }
    }

    // imprime o relatório final do aluno
    public void relatorioFinalDisciplinas(Aluno aluno) {
        System.out.println("Relatório final:");
        for (Disciplina disciplina : aluno.getMatricula().getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Nota 1 unidade: " + disciplina.getNotas().notaAluno1Un(aluno));
            System.out.println("Nota 2 unidade: " + disciplina.getNotas().notaAluno2Un(aluno));
            System.out.println("Nota 3 unidade: " + disciplina.getNotas().notaAluno3Un(aluno));
            System.out.println("Média: " + disciplina.getNotas().mediaGeral(aluno));
            System.out
                    .println("Situação: " + (disciplina.getNotas().mediaGeral(aluno) >= 7 ? "Aprovado" : "Reprovado"));
        }
    }
}
