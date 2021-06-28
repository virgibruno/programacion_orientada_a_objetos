package com.company;

import java.util.Scanner;

public class Ejercicio4 {

    static double calcularSueldo (double sueldoPorHora, int horasSemanalesTrabajadas, int horasSemanalesMaximas) {
        if (horasSemanalesTrabajadas > horasSemanalesMaximas) {
            return sueldoPorHora * horasSemanalesTrabajadas + (horasSemanalesTrabajadas - horasSemanalesMaximas) * sueldoPorHora * 0.5;
        }
        else {
            return sueldoPorHora * horasSemanalesTrabajadas;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int horasMax = 40;
        int horasTrabajadas;
        float sueldo = 875;
        String nombre = "Julieta";

        System.out.println("Indica la cantidad de horas trabajadas por " + nombre);
        horasTrabajadas = s.nextInt();

        System.out.println("El sueldo semanal de "+ nombre +" es de "+ calcularSueldo(sueldo, horasTrabajadas, horasMax));

    }
}
