public class Livro extends Produto{
    private String nome;
    private float preco;
    private String autor;

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }

    public Livro(String nome, float preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}