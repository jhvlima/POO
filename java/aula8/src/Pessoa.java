public class Pessoa{
    private String nome;
    private int cpf;
    private int nota;

    public Pessoa(int nextInt, String next, int nextInt2) {
        this.cpf = nextInt;
        this.nome = next;
        this.nota = nextInt2;
    }

    public String getNome(){
        return this.nome;
    }
    
    public int getCpf(){
        return this.cpf;
    }
    
    public int getNota(){
        return this.nota;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.cpf + " - " + this.nota;    
    }

}