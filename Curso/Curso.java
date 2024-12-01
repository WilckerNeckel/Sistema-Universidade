package trabalhofinal.sistemauniversidade.Curso;

public class Curso {
    private String nome, coordenador, faculdade;
    
    public Curso(String nome, String coordenador, String faculdade) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.faculdade = faculdade;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

}
