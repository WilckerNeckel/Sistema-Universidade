package trabalhofinal.sistemauniversidade;

import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;

public class RelatorioDisciplina implements IRelatorio<Disciplina>{
    
    @Override
    public void informacoesBasicas(Disciplina disciplina){
        System.out.println("Disciplina: " +disciplina.getNome());
        System.out.println("Curso: " +disciplina.getCurso());
        System.out.println("Professor: " +disciplina.getCurso());
    }

    
}
