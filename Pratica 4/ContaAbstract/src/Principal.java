public class Principal {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2121.00);
        cp.imprimeExtrato();
    }
}
