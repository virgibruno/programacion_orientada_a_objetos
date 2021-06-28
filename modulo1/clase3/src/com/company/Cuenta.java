package com.company;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta (int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito (double cantDinero) {
        saldo += cantDinero;
    }

    public void extraccion (double cantDinero) {
        if (saldo >= cantDinero) {
            saldo -= cantDinero;
        }
    }

}
