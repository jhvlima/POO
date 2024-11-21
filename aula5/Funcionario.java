public abstract class Funcionario {
    private String nome;
    private float salario;

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public float getSalario() {
        return this.salario;
    }
}
