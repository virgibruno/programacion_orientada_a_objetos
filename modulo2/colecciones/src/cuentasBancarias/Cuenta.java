package cuentasBancarias;

public class Cuenta implements Comparable{
    // Atributos
    private int nroCuenta;
    private double saldo;

    // Constructor
    public Cuenta (int nroCuenta, double saldoInicial) {
        this.nroCuenta = nroCuenta;
        saldo = saldoInicial;
    }

    // Implementacion interface comparable
    public int compareTo(Object o){
        Cuenta aComparar = (Cuenta) o;
        if (this.nroCuenta > aComparar.nroCuenta) {
            return 1;
        } else if (this.nroCuenta < aComparar.nroCuenta) {
            return -1;
        } else {
            return 0;
        }
    }

    // Getters and Setters

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
