package com.company;

public class Main {

    public static void main(String[] args) {
	    Cliente virgi = new Cliente("Virgi", "Bruno");

        System.out.println("El nuevo cliente es " + virgi.getNombre() + " " + virgi.getApellido());

        Cuenta miCuenta = new Cuenta(1, 0);

        System.out.println(miCuenta.getSaldo());
        miCuenta.deposito(500);
        System.out.println(miCuenta.getSaldo());
        miCuenta.extraccion(100);
        System.out.println(miCuenta.getSaldo());
        miCuenta.extraccion(500);
        System.out.println(miCuenta.getSaldo());
        miCuenta.extraccion(400);
        System.out.println(miCuenta.getSaldo());
    }
}
