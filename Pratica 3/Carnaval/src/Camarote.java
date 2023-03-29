public class Camarote extends Ingresso {
    private double adicional;
    private String localizacao;

    public Camarote(double valor, double adicional, String localizacao) {
        super(valor);
        this.adicional = adicional;
        this.localizacao = localizacao;
    }

    public void imprimirValor() {
        double valorTotal = super.getValor() + adicional;
        System.out.println("Ingresso Camarote: R$ " + valorTotal + " - Localização: " + localizacao);
    }
}