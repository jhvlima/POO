public class ContaCorrenteEspecial extends ContaCorrente {
    private float taxa = 0.001f;

    public ContaCorrenteEspecial(String titular) {
        super(titular);
    }

    @Override
    public float saque(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }

        float valorComTaxa = valor * (1 + taxa);
        if (getSaldo() >= valorComTaxa) {
            // Atualiza o saldo reutilizando o método da classe pai
            super.deposito(-valorComTaxa);
            return valor; // Retorna o valor sacado sem a taxa
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
    }

    public float getTaxa() {
        return taxa;
    }

}
