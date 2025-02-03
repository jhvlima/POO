package q3;

public class Universidade {
    private String nome;
    private java.util.Set<Curso> cursos = new java.util.HashSet<>();

    public Universidade(String nomeUniversidade) {
        this.nome = nomeUniversidade;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso novoCurso = new Curso();
        this.cursos.add(novoCurso);
        return novoCurso;
    }

}
