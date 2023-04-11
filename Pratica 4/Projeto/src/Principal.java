import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("<1> Cadastrar projeto distribuir alimentos\n<2> Cadastra projeto trabalho voluntario VIP\n<3> Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    DistribuicaoAlimento D = new DistribuicaoAlimento();
                    D.setDescAlimento("banana");
                    D.setQtde(3);
                    D.setDatafim("14/04/2021");
                    D.setDatainicio("13/03/1993");
                    D.setEndereco("Rua quinze de abril");
                    D.setNomeProjeto("alimentando");
                    D.setDescricao("Salvando vidas");
                    D.validaProjeto();
                    D.imprimeProjeto();
                    break;
                case 2:
                    TrabalhoVoluntario T = new TrabalhoVoluntario();
                    T.setNomeProjeto("Voluntariando");
                    T.setDescricao("Ajudando");
                    T.setDatainicio("04-02-2022");
                    T.setDatafim("05-05-2025");
                    T.setDuracaoTrabalho(3);
                    T.setTipoTrabalho("Pedreiro");
                    T.setEndereco("Rua matilde");
                     T.validaProjeto();
                    T.imprimeProjeto();
                    break;
                case 3:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 3);
    }
}
