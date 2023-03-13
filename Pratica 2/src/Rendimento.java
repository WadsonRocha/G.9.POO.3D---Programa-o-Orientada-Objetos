import java.util.Scanner;

public class Rendimento {
    private double investimentoInicial;
    private double taxaMensal;
    private int numeroMeses;

    public Rendimento(double investimentoInicial, double taxaMensal, int numeroMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal;
        this.numeroMeses = numeroMeses;
    }

    public double calcularRendimento() {
        double valorFinal = investimentoInicial * Math.pow((1 + taxaMensal / 100), numeroMeses);
        return valorFinal - investimentoInicial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Investimento inicial (R$): ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Taxa mensal do rendimento (%): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Número de meses: ");
        int numeroMeses = scanner.nextInt();

        Rendimento investimento = new Rendimento(investimentoInicial, taxaMensal, numeroMeses);
        double rendimento = investimento.calcularRendimento();

        System.out.println("O rendimento é de R$ " + String.format("%.2f", rendimento));
    }
}