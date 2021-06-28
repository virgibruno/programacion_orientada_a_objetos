package com.company;

import java.util.Scanner;


public class Ejercicio2 {

    static Integer maximo(Integer num1, Integer num2, Integer num3) {
        if (num1.compareTo(num2)<0) {
            if (num2.compareTo(num3) < 0) {
                return num3;
            } else {
                return num2;
            }
        }
        else if (num1.compareTo(num3)<0) {
            return num3;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n1;
        Integer n2;
        Integer n3;

        System.out.println("Ingresar el primer número");
        n1 = scanner.nextInt();
        System.out.println("Ingresar el segundo número");
        n2 = scanner.nextInt();
        System.out.println("Ingresar el tercer número");
        n3 = scanner.nextInt();

        System.out.println("El número más grande es: "+ maximo(n1, n2, n3));

    }

}
