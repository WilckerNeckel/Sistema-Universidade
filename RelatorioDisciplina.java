package trabalhofinal.sistemauniversidade;

import java.util.ArrayList;

import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

public class RelatorioDisciplina implements IRelatorio<Disciplina>{
    
    @Override
    public void informacoesBasicas(Disciplina disciplina){
        System.out.println("Disciplina: " +disciplina.getNome());
        System.out.println("Curso: " +disciplina.getCurso());
        System.out.println("Professor: " +disciplina.getCurso());
    }

    public void alunosMatriculados(ArrayList<Aluno> alunos){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }
    }

    public void notas(ArrayList<Nota> notas){
        for (Nota nota : notas) {
            System.out.println(nota.getAluno().getNome() + " - " + nota.getNota());
        }
    }

    private double mediaNotas(double nota1, double nota2, double nota3){
        return ((nota1 + nota2 + nota3) / 3);
    }

    public void situacaoAlunos(Disciplina disciplina){
        for (Aluno aluno : disciplina.getAlunos()) {
            double media = mediaNotas(nota.getNota1(), nota.getNota2(), nota.getNota3());
            if(media >= 7){
                System.out.println(nota.getAluno().getNome() + " - Aprovado");
            }else if(media >= 4){
                System.out.println(nota.getAluno().getNome() + " - Prova Final");
            }else{
                System.out.println(nota.getAluno().getNome() + " - Reprovado");
            }
        }
    }


    
}
