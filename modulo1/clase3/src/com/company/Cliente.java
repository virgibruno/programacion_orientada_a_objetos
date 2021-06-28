package com.company;

public class Cliente {

    //Atributos
    private String nombre;
    private String apellido;


    //Constructor
    public Cliente(String nombreCliente, String apellidoCliente){
        nombre = nombreCliente;
        apellido = apellidoCliente;
    }


    //Métodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
