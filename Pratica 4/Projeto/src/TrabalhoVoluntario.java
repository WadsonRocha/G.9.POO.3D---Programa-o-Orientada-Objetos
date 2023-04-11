public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public TrabalhoVoluntario() {
        super();
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
      if (getDatafim() == null){
            return true;
      }else{
          return false;
      }


    }

    @Override
    public void imprimeProjeto() {
        System.out.println(this.getNomeProjeto()+ "\n" +this.getDatainicio()+ "\n" +this.getDescricao()+ "\n" +this.getDatafim()+ "\n" +this.tipoTrabalho+ "\n" +this.duracaoTrabalho + "\n" +this.getEndereco());
    }
}
