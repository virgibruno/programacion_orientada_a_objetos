package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Instanciar perros

        Perro maia = new Perro("Maia", "boxer", 2012, 10.0, false, false);

        Perro blas = new Perro("Blas", 8.0, true);

        Perro tuchi = new Perro("Tuchi", 2, false);

        System.out.println(maia.getNombre() + " puede perderse: " +maia.puedePerderse());
        System.out.println(blas.getNombre() + " puede perderse: " +blas.puedePerderse());

        System.out.println("Blas puede adoptarse: " + blas.isEnAdopcion());

        System.out.println("Ingrese si Blas está lastimado");
        blas.setEstaLastimado(s.nextBoolean());

        System.out.println("Blas ahora puede adoptarse: " + blas.isEnAdopcion());

    }
}
