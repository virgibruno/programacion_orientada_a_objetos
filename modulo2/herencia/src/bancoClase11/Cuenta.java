package bancoClase11;

public abstract class Cuenta {

    // Atributos

    private Cliente clienteAsociado;
    private double saldo;

    // Constructor

    public Cuenta(Cliente clienteAsociado, double saldoInicial) {
        this.clienteAsociado = clienteAsociado;
        saldo = saldoInicial;
    }

    // Getters y setters

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   // Métodos

    public void depositar(double monto) {
        saldo += monto;
    }

    public String informarSaldo () {
        return "El saldo de la cuenta es: " +saldo;
    }

   //Métodos abstractos

    public abstract void extraerEfectivo (double monto);
}
