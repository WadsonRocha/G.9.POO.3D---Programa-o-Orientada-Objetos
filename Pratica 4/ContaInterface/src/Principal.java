public class Principal {
    public static void main(String[] args) {
ContaCorrente cc = new ContaCorrente();
cc.depositar(200.90);

ContaPoupanca cp = new ContaPoupanca();
cp.depositar(500.50);
cp.sacar(500.50);
GeradorExtratos gerador = new GeradorExtratos();
gerador.geradorConta(cc);
gerador.geradorConta(cp);
    }
}
