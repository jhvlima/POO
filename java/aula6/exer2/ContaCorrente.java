public class ContaCorrente {
    private String titular;
    private float taxa = 0.005f;
    private float saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
    }

    public float saque(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }

        float valorComTaxa = valor * (1 + this.taxa);
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            return valor; // Retorna o valor sacado (sem a taxa).
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
    }

    public void deposito(float valor) {
        this.saldo += valor;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
