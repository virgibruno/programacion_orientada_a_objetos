package cuentasBancarias;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1, 1000);
        Cuenta cuenta2 = new Cuenta(2, 2000);

        Persona persona1 = new Persona("Virginia", "Bruno", 25, cuenta2);

        System.out.println(persona1.getNombreCompleto());
        System.out.println(persona1.getSaldoTotal());

        persona1.getCuentas().add(cuenta1);

        persona1.mostrarCuentas();
    }
}
