public abstract class recursos implements Celular  {
    private boolean mensagem;
    private boolean internet;
    private boolean email;
    private boolean radio;
    private boolean tv;
    private boolean arquivo;
    private float preco;

    public recursos(boolean mensagem, boolean internet, boolean email, boolean radio, boolean tv, boolean arquivo, float preco) {
        this.mensagem = mensagem;
        this.internet = internet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.arquivo = arquivo;
        this.preco = preco;
    }

    public recursos() {

    }

    public boolean getMensagem() {
        return mensagem;
    }

    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }

    public boolean getInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean getEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public boolean getRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean getArquivo() {
        return arquivo;
    }

    public void setArquivo(boolean arquivo) {
        this.arquivo = arquivo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}

