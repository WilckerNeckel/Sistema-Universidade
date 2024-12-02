package trabalhofinal.sistemauniversidade.Notas;

import java.util.ArrayList;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;

// classe que armazena as notas de cada aluno de todas as unidades, cada disciplina tem uma instância de Notas
public class Notas implements INotas{
    private ArrayList<Nota> notas1Unidade;
    private ArrayList<Nota> notas2Unidade;
    private ArrayList<Nota> notas3Unidade;

    // construtor
    public Notas() {
        this.notas1Unidade = new ArrayList<Nota>();
        this.notas2Unidade = new ArrayList<Nota>();
        this.notas3Unidade = new ArrayList<Nota>();
    }

    // methods
    public double mediaGeral(Aluno aluno) {
        Nota nota1 = notaAluno1Un(aluno);
        Nota nota2 = notaAluno2Un(aluno);
        Nota nota3 = notaAluno3Un(aluno);
        return ((nota1.getNota() + nota2.getNota() + nota3.getNota()) / 3);
    }

    // retorna a média da 1 unidade do aluno
    public Nota notaAluno1Un(Aluno aluno) {
        for (Nota nota : this.notas1Unidade) {
            if (nota.getAluno().equals(aluno)) {
                return nota;
            }
        }
        return null;
    }

    // retorna a média da 2 unidade do aluno
    public Nota notaAluno2Un(Aluno aluno) {
        for (Nota nota : this.notas2Unidade) {
            if (nota.getAluno().equals(aluno)) {
                return nota;
            }
        }
        return null;
    }

    // retorna a média da 3 unidade do aluno
    public Nota notaAluno3Un(Aluno aluno) {
        for (Nota nota : this.notas3Unidade) {
            if (nota.getAluno().equals(aluno)) {
                return nota;
            }
        }
        return null;
    }

    // getters and setters
    public ArrayList<Nota> getNotas1Unidade() {
        return notas1Unidade;
    }

    public ArrayList<Nota> getNotas2Unidade() {
        return notas2Unidade;
    }

    public ArrayList<Nota> getNotas3Unidade() {
        return notas3Unidade;
    }

    // adiciona nota da 1 unidade
    public void addNota1Unidade(Nota nota) {
        this.notas1Unidade.add(nota);
    }

    // adiciona nota da 2 unidade
    public void addNota2Unidade(Nota nota) {
        this.notas2Unidade.add(nota);
    }

    // adiciona nota da 3 unidade
    public void addNota3Unidade(Nota nota) {
        this.notas3Unidade.add(nota);
    }

    // remove nota da 1 unidade
    public void removeNota1Unidade(Aluno aluno) {
        this.notas1Unidade.removeIf(nota -> nota.getAluno().equals(aluno));
    }

    // remove nota da 2 unidade
    public void removeNota2Unidade(Aluno aluno) {
        this.notas2Unidade.removeIf(nota -> nota.getAluno().equals(aluno));
    }

    // remove nota da 3 unidade
    public void removeNota3Unidade(Aluno aluno) {
        this.notas3Unidade.removeIf(nota -> nota.getAluno().equals(aluno));
    }

}
