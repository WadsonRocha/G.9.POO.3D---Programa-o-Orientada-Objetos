import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner Sc = new Scanner (System.in);

        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Ingresso Normal");
        System.out.println("2 - Ingresso VIP");
        System.out.println("3 - Ingresso Camarote");

        int opcao = Sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do ingresso:");
                double valorNormal = Sc.nextDouble();
                Normal normal = new Normal(valorNormal);
                normal.imprimirValor();
                break;

            case 2:
                System.out.println("Digite o valor do ingresso:");
                double valorVIP = Sc.nextDouble();
                System.out.println("Digite o valor adicional do ingresso VIP:");
                double adicionalVIP = Sc.nextDouble();
                VIP vip = new VIP(valorVIP, adicionalVIP);
                vip.imprimirValor();
                break;

            case 3:
                System.out.println("Digite o valor do ingresso:");
                double valorCamarote = Sc.nextDouble();
                System.out.println("Digite o valor adicional do ingresso Camarote:");
                double adicionalCamarote = Sc.nextDouble();
                System.out.println("Digite a localização do camarote:");
                String localizacaoCamarote = Sc.next();
                Camarote camarote = new Camarote(valorCamarote, adicionalCamarote, localizacaoCamarote);
                camarote.imprimirValor();
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        Sc.close();
    }
}