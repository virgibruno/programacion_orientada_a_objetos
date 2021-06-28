package bancoClase11;

public class Main {
    public static void main(String[] args) {
        Cliente virgi = new Cliente(1, "Bruno", 38897951, 273);

        CuentaCorriente miCuenta = new CuentaCorriente(virgi, 200, 1000);

        CajaDeAhorro miOtraCuenta = new CajaDeAhorro(virgi, 2000);

        Cuenta miTercerCuenta = new CuentaComitente(virgi, 2000, "vi2");



    }
}
