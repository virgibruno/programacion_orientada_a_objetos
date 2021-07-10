package sistemaReservasTren;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Estacion BSAS = new Estacion("Buenos Aires");
        Estacion LUJ = new Estacion("Lujan");
        Estacion MER = new Estacion("Mercedes");
        Estacion BRA = new Estacion("Bragado");

        empresa.nuevaEstacion(0, BSAS);
        empresa.nuevaEstacion(1, LUJ);
        empresa.nuevaEstacion(2, MER);
        empresa.nuevaEstacion(3, BRA);

        Reserva res1 = new Reserva(1, BSAS, LUJ, 1);
        Reserva res2 = new Reserva(2, BSAS, BRA, 1);

        empresa.nuevaReserva(res1);
        empresa.nuevaReserva(res2);

        try {
            System.out.println(empresa.cantVecesRecorrida("Bralkj"));
        } catch (EstacionInexistente error) {
            System.err.println(error);
        }
    }
}
