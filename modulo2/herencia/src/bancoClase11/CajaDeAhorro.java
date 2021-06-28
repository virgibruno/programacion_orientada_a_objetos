package bancoClase11;

public class CajaDeAhorro extends Cuenta{

    // Constructor

    public CajaDeAhorro(Cliente clienteAsociado, double saldoInicial) {
        super(clienteAsociado, saldoInicial);
    }

    // Métodos por contrato

    public void extraerEfectivo (double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo()-monto);
        }
    }

    // Otros métodos

    public void cobrarInteres (double tasa){
        setSaldo(getSaldo()*(1+tasa));
    }
}
