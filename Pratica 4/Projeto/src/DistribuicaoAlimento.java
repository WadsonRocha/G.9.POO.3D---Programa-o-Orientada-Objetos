public class DistribuicaoAlimento extends Projeto {

    private String descAlimento;
    private int qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public DistribuicaoAlimento() {
        super();
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        if (getDatafim() == null) {
            return true;

        }else {
            return false;
        }

        }

    @Override
    public void imprimeProjeto() {
        System.out.println(this.getNomeProjeto()+ "\n" +this.getDatainicio()+ "\n"+this.getDescricao()+ "\n" +this.getDatafim()+ "\n" +this.descAlimento);


    }
}
