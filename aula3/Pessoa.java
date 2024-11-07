public class Pessoa {

    private Pessoa pai, mae;
    private String nome;

    public Pessoa(String nome, Pessoa pai, Pessoa mae)
    {
        this.mae = mae;
        this.pai = pai;
        this.nome = nome;
    }
    
    public Pessoa(String nome)
    {
        this.nome = nome;
    }

    public Pessoa getMae() {
        return mae;
    }
    public String getNome() {
        return nome;
    }
    public Pessoa getPai() {
        return pai;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public Pessoa getAvoParteno()
    {
        return this.getPai().getPai();
    }
    public Pessoa getAvoMaterno()
    {
        return this.getMae().getPai();
    }
    public Pessoa getAvohParteno()
    {
        return this.getPai().getMae();
    }
    public Pessoa getAvohMaterno()
    {
        return this.getMae().getMae();
    }

    public java.util.Set<Pessoa> getAvos()
    {
        java.util.Set<Pessoa> pessoas = new java.util.HashSet<Pessoa>();
        if (this.getAvohMaterno() != null) pessoas.add(this.getAvohMaterno());
        if (this.getAvoMaterno() != null) pessoas.add(this.getAvoMaterno());
        if (this.getAvohParteno() != null) pessoas.add(this.getAvohParteno());
        if (this.getAvoParteno() != null) pessoas.add(this.getAvoParteno());
        return pessoas;
    }
}