package com.company;

public class Perro {

    // Atributos
    private String nombre;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean enAdopcion;
    private boolean tieneChip;
    private boolean estaLastimado;

    // Constructores

    public Perro(String nombre, String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estaLastimado) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        if (estaLastimado == false && peso >= 5 ) {
            enAdopcion = true;
        } else {
            enAdopcion = false;
        }
    }

    public Perro(String nombre, double peso, boolean estaLastimado) {
        this.nombre = nombre;
        this.peso = peso;
        this.estaLastimado = estaLastimado;
        if (estaLastimado == false && peso >= 5 ) {
            enAdopcion = true;
        } else {
            enAdopcion = false;
        }
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        if (peso <5) {
            enAdopcion = false;
        } else {
            if (estaLastimado == false) {
                enAdopcion = true;
            }
        }
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
        if (estaLastimado == true) {
            enAdopcion = false;
        } else {
            if (peso >= 5) {
                enAdopcion = true;
            }
        }
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    // Métodos

    public int preguntarEdad (int anioActual) {
        return anioActual - anioNacimiento;
    }

    public boolean puedePerderse () {
        if (tieneChip == true) {
            return false;
        } else {
            return true;
        }
    }


}
