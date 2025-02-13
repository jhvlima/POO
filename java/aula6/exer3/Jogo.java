public class Jogo extends Produto {
    private String nome;
    private float preco;
    private int idadeMinima;

    public Jogo(String nome, float preco, int idadeMinima) {
        super(nome, preco); // Chama o construtor da classe Produto
        this.idadeMinima = idadeMinima;
    }

    @Override
    public String toString() {
        return super.toString() + ", Idade mínima: " + idadeMinima + " anos";
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }
}
