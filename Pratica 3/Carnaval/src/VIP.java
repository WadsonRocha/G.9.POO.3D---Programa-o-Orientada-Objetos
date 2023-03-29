public class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public void imprimirValor() {
        double valorTotal = super.getValor() + adicional;
        System.out.println("Ingresso VIP: R$ " + valorTotal);
    }
}