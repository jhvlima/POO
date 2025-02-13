
public class Loja {
    private String nome;
    private java.util.Set<Produto> produtos = new java.util.HashSet<Produto>();

    public Loja(String string) {
        this.nome = string;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.util.Set getProdutos() {
        return produtos;
    }

    public void exibirProdutos() {
        System.out.println("Produtos da loja " + nome + ":");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    public void addProduto(Produto produto)
    {
        this.produtos.add(produto);
    }

}
