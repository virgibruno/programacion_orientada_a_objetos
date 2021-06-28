package com.company;

import java.util.Scanner;

public class Main {

    static boolean esDivisible(int n, int divisor){
        if (n%divisor == 0) {
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {
        // write your code here

        System.out.println(esDivisible(6, 3));


        /*

        int num = 10;

        System.out.println("Mi primer Programa");
        System.out.println("El valor es " + num);

        int numeroEntero = 5;
        double numeroConComa = 5.5;
        String nombre = "Virgi";

        System.out.println(numeroEntero + numeroConComa + nombre);


        int num1 = 10;
        int num2 = 5;

        if (num1%num2 == 0) {
            System.out.println( num1 +" es divisible por "+ num2);
        }
        else {
            System.out.println(num1 +" no es divisible por "+ num2);
        }


        String nombre1 = "Virgi";
        String nombre2 = "Luqui";

        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");
        }
        else {
            System.out.println("Los nombres son distintos");
        }

        Integer num1 = 5;
        Integer num2 = 2;
        Integer comparacion = num1.compareTo(num2);

        if (comparacion > 0) {
            System.out.println("El mayor es " + num1);
        }
        else if(comparacion.equals(0)) {
            System.out.println("Los números son iguales");
        }
        else {
            System.out.println ("El mayor es " + num2);
        }




        Scanner lector = new Scanner(System.in);

        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;
        int iniciales;

        System.out.println("Ingrese su nombre");
        nombre = lector.nextLine();
        inicialNombre = nombre.toUpperCase().charAt(0);
        System.out.println("Ingrese su apellido");
        apellido = lector.nextLine();
        inicialApellido = apellido.toUpperCase().charAt(0);

        iniciales = nombre.toUpperCase().charAt(0) + apellido.toUpperCase().charAt(0);



        System.out.println("Las iniciales son: " + inicialNombre + inicialApellido);

         */


    }




}
