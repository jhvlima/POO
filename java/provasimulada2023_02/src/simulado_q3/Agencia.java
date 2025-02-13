package simulado_q3;

public class Agencia {

    private String nomeAgencia;
    private java.util.Set<Conta> contas = new java.util.HashSet<Conta>(); 

    public Agencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }

    public float media()
    {
        float total = 0, pessoas = 0;
        for (Conta conta : this.contas) {
            total += conta.getsaldo();
            pessoas++;
        }
        if (total == 0|| pessoas == 0) {
            return 0;
        }
        return total/pessoas;
    }

    @Override
    public String toString() {
        return "Agência: " + this.getNomeAgencia() + ", saldo sédio: " + this.media();
    }
    
    
}
