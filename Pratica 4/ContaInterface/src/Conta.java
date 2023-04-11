public interface Conta {

   default void depositar(double valor) {

    }

 public default void sacar(double valor) {

    }

    double getSaldo();


}
