public class Empresa {
    private String nome;
    private java.util.HashSet<Departamento> departamentos = new java.util.HashSet<Departamento>();

    public Empresa(String string) {
        this.nome = string;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public java.util.HashSet<Departamento> getDepartamentos() {
        return this.departamentos;
    }
}
