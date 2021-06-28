package bancoClase11;

public class CuentaCorriente extends Cuenta{
    // Atributos
    private double giroEnDescubierto;

    // Constructor

    public CuentaCorriente(Cliente clienteAsociado, double saldoInicial, double giroEnDescubierto) {
        super(clienteAsociado, saldoInicial);
        this.giroEnDescubierto = giroEnDescubierto;
    }

    // Getters y setters

    public double getGiroEnDescubierto() {
        return giroEnDescubierto;
    }

    public void setGiroEnDescubierto(double giroEnDescubierto) {
        this.giroEnDescubierto = giroEnDescubierto;
    }

    // Métodos por contrato
    public void extraerEfectivo (double monto) {
        if (monto <= (getSaldo()+giroEnDescubierto)) {
            setSaldo(getSaldo()-monto);
        }
    }

    // Otros métodos
    public void depositarCheques (double monto) {
        setSaldo(getSaldo()+monto);
    }
}
