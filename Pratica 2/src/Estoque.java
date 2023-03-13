public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void darBaixa(int qtde) {
        int novaQtd = this.qtdAtual - qtde;
        if (novaQtd >= 0) {
            this.qtdAtual = novaQtd;
        } else {
            System.out.println("Não é Possível dar baixa em estoque abaixo de 0");
        }
    }

    public String mostra() {
        return "Nome: " + this.nome + "\nQuantidade mínima: " + this.qtdMinima + "\nQuantidade atual: " + this.qtdAtual;
    }

    public boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque("Sabão em pó", 10, 5);
        System.out.println(estoque.mostra());
        estoque.darBaixa(2);
        System.out.println(estoque.mostra());
        System.out.println("Precisa repor? " + estoque.precisaRepor());
    }

}