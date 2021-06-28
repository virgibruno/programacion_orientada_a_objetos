package com.company;

public class Main {

    public static void main(String[] args) {
        String nombrePerro = "Manchitas";
        String nombrePez = "Nemo";
        String nombreGato ="Silvestre";
        String nombreTortuga = "Manuelita";
        String nombrePajaro = "Gardel";

        int edadPerro = 2;
        int edadPez = 1;
        int edadGato = 3;
        int edadTortuga = 12;
        int edadPajaro = 1;

        double cantComidaPerro = 1.5;
        double cantComidaPez = 0.14;
        double cantComidaGato = 0.5;
        double cantComidaTortuga = 0.3;
        double cantComidaPajaro = 0.35;

        String sonidoPerro = "guau";
        String sonidoPez = "plop";
        String sonidoGato = "miau";
        String hogarTortuga = "Pehuajó";
        String sonidoPajaro = "pío pío";

        System.out.println(nombrePerro+ " tiene " + edadPerro + " años.");
        System.out.println(nombrePez+ " tiene " + edadPez + " año.");
        System.out.println(nombreGato+ " tiene " + edadGato + " años.");
        System.out.println(nombreTortuga+ " tiene " + edadTortuga + " años.");
        System.out.println(nombrePajaro+ " tiene " + edadPajaro + " año.");

        System.out.println(nombrePerro + " come " + cantComidaPerro + "kg. y hace " + sonidoPerro);
        System.out.println(nombrePez + " come " + cantComidaPez + "kg. y hace " + sonidoPez);
        System.out.println(nombreGato + " come " + cantComidaGato + "kg. y hace " + sonidoGato);
        System.out.println(nombreTortuga + " come " + cantComidaTortuga + "kg. y vive en " + hogarTortuga);
        System.out.println(nombrePajaro + " come " + cantComidaPajaro + "kg. y hace " + sonidoPajaro);
    }
}
