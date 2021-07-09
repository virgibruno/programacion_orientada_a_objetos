package cuentasBancarias;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private List<Cuenta> cuentas = new ArrayList<>();

    // Constructor
    public Persona(String nombre, String apellido, int edad, Cuenta cuentaInicial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas.add(cuentaInicial);
    }

    // Metodos
    public String getNombreCompleto() {
        return nombre +" "+ apellido;
    }

    public boolean esMayorDeEdad(){
        if (edad > 60) {
            return true;
        } else
            return false;
    }

    public double getSaldoTotal(){
        double saldo = 0;
        for (Cuenta cuenta : cuentas) {
            saldo += cuenta.getSaldo();
        }
        return saldo;
    }

    public void mostrarCuentas(){
        cuentas.sort(null);
        for (Cuenta cuenta : cuentas) {
            System.out.println("La cuenta nº " + cuenta.getNroCuenta() + " tiene un saldo de: " + cuenta.getSaldo());
        }

    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
