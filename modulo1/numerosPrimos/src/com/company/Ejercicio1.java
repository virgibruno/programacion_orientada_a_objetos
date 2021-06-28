package com.company;

import java.util.Scanner;

public class Ejercicio1 {
    static boolean esDivisible(int n, int divisor){
        if (n%divisor == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Ejercicio 1

        int n;
        boolean esPrimo = true;

        System.out.println("Ingresar número entero mayor o igual a 2");
        n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            if (esDivisible(n, i)) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }
}
