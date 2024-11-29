/**
 * Crie uma classe para representar uma conta corrente, com métodos para
 * depositar uma quantia, sacar uma quantia e
 * obter o saldo. Para cada saque será debitada também uma taxa de operação
 * equivalente à 0,5% do valor sacado. 
 * Crie, em seguida, uma subclasse desta classe anterior para representar uma conta
 * corrente de um cliente especial. Clientes
 * especiais pagam taxas de operação de apenas 0,1% do valor sacado.
 */

 public class App {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("João");
        ContaCorrente conta2 = new ContaCorrenteEspecial("Pedro");

        conta1.deposito(1000);
        conta2.deposito(1000);

        System.out.println("Saque conta1 (normal): " + conta1.saque(100)); // Saque normal
        System.out.println("Saque conta2 (especial): " + conta2.saque(100)); // Saque especial

        System.out.println("Saldo conta1: " + conta1.getSaldo());
        System.out.println("Saldo conta2: " + conta2.getSaldo());
    }
}