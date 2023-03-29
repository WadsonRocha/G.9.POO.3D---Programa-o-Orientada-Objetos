import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a matrícula do funcionário:");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o tipo do funcionário: 1 - Padrão, 2 - Comissionado, 3 - Produtividade");
        int tipo = scanner.nextInt();
    }
}