import java.text.SimpleDateFormat;
import java.util.Date;
public class ContaPoupanca extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("###Extrato da conta###");


        SimpleDateFormat sdf = new SimpleDateFormat("03/03/2022 01:22:33' ");
        Date date = new Date();
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Data:" + sdf.format(date));
    }
}
