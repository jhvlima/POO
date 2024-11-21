public class Departamento {
    private String nome;
    private java.util.HashSet<Funcionario> funcionarios = new java.util.HashSet<Funcionario>();

    public Departamento(String string) {
        this.nome = string;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public float getMediaSalarial() {
        float media = 0;
        for (Funcionario f : this.funcionarios) {
            media = media + f.getSalario();
        }
        if (media == 0) {
            return 0;
        }
        return media / this.funcionarios.size();
    }

    public java.util.Set<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
}
