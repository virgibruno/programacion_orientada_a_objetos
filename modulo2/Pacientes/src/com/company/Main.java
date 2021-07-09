package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    try {
            Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(2021-1900, 5, 23));
            paciente.darAlta(new Date(2021-1900, 5, 2));
	    }
	    catch (FechaExcepcion e) {
            System.err.println(e.toString());
        }
    }
}
