package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FechaExcepcion
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        else
            throw new FechaExcepcion("La fecha no puede ser posterior al día de hoy");
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws FechaExcepcion
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            throw new FechaExcepcion("La fecha de alta no puede ser anterior a la fecha de internación");
    }



}
