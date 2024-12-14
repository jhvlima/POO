package simulado_q3;

public class Banco {

    private String nomeBanco;
    private java.util.Set<Agencia> agencias = new java.util.HashSet<Agencia>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia novaAgencia = new Agencia(nomeAgencia);
        this.agencias.add(novaAgencia);
        return novaAgencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do Banco: ").append(this.nomeBanco).append("\n");
        for (Agencia agencia : this.agencias) {
            sb.append(agencia.toString()).append("\n");
        }
        return sb.toString();
    }

}
