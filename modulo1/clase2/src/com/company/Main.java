package com.company;

import java.util.Scanner;

public class Main {

    static String fechaNac (String dia, String mes, String anio) {
        return dia+"/"+mes+"/"+anio;
    }


    public static void main(String[] args) {
        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;
        Scanner scanner = new Scanner(System.in);
        String d;
        String m;
        String a;

        System.out.print("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido");
        apellido = scanner.nextLine();
        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);
        System.out.print("Ingrese su día de nacimiento");
        d = scanner.nextLine();
        System.out.print("Ingrese su mes de nacimiento");
        m = scanner.nextLine();
        System.out.print("Ingrese su año de nacimiento");
        a = scanner.nextLine();

        System.out.println(nombre + apellido + inicialNombre + inicialApellido + fechaNac(d, m, a));
    }
}
