public class fabricante extends recursos implements Celular {
    public fabricante(boolean mensagem, boolean internet, boolean email, boolean radio, boolean tv, boolean arquivo, float preco) {
        super(mensagem, internet, email, radio, tv, arquivo, preco);
    }

    public fabricante() {
    }

    @Override
    public boolean ligar() {
            return true;

    }

    @Override
    public boolean desligar() {
        return false;

    }

    @Override
    public boolean Cameraligada() {
        return true;
    }

    @Override
    public boolean Cameradesligada() {
        return false;
    }

    @Override
    public boolean foneligado() {
        return true;
    }

    @Override
    public boolean fonedesligado() {
        return false;
    }

    @Override
    public void Controlevolume() {

    }
    public  void especificações(){
        System.out.println("o telefone possui mensagem: "+this.getMensagem()+"\n", "O telefone possui internet: "+this.getInternet()+"\n", "O telefone possui email? "+this.getEmail()+"\n" ,"o telefone possui radio? "+this.getRadio()+"\n", "o telefone possui tv? " +this.getTv()+"\n"," o telefone possui arquivo ? "+this.getArquivo()+"\n" "Qual preco do telefone "+this.getPreco());
    }
}