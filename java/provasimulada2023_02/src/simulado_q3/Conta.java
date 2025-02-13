package simulado_q3;

public class Conta {
    private String nomeCliente;
    private double saldo; 

    public Conta(String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public double getsaldo() {
        return saldo;
    }
}
