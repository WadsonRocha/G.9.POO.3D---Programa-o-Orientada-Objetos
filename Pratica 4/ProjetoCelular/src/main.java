public class main {
    public static void main(String[] args) {
        fabricante fa = new fabricante();
        fa.setRadio(true);
        fa.setPreco(6800);
        fa.setTv(false);
        fa.setEmail(true);
        fa.setMensagem(true);
        fa.setArquivo(true);
        fa.setInternet(true);
        fa.especificações();

        fabricante fb = new fabricante();
        fb.setRadio(false);
        fb.setPreco(5200);
        fb.setTv(true);
        fb.setEmail(true);
        fb.setMensagem(true);
        fb.setArquivo(true);
        fb.setInternet(true);
        fb.especificações();

    }
}
