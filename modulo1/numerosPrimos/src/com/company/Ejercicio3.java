package com.company;

import java.util.Scanner;

public class Ejercicio3 {

    static boolean  cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        if(unTextoA.equals(unTextoB)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textoA;
        String textoB;

        System.out.println("Ingresar su contraseña");
        textoA = scanner.nextLine();
        System.out.println("Ingresar su contraseña nuevamente");
        textoB = scanner.nextLine();


        System.out.println("Las contraseñas son distintas: " + cadenasDeTextoDistintas(textoA,textoB));

    }
}
