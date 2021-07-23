package sistemaReservasTren;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Estacion BSAS = new Estacion("Buenos Aires", 0);
        Estacion LUJ = new Estacion("Lujan", 1);
        Estacion MER = new Estacion("Mercedes", 2);
        Estacion BRA = new Estacion("Bragado", 3);

        Reserva res1 = new Reserva(1, BSAS, BRA, 2);

        Estacion SUI = new Estacion("Suipacha",3);

        Reserva res2 = new Reserva(2, BSAS, BRA, 2);

        System.out.println(recaudacionTotal());

        System.out.println(estaciones);

        try {
            System.out.println(cantVecesRecorrida("Suipacha"));
        } catch (EstacionInexistente error) {
            System.err.println(error);
        }
    }



    static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    static ArrayList<Estacion> estaciones = new ArrayList<Estacion>();

    // Metodos
    public static double recaudacionTotal(){
        double recaudacion = 0;
        for(Reserva reserva : reservas) {
            recaudacion += reserva.calcularCosto();
        }
        return recaudacion;
    }

    public static int buscarIndiceEstacion (String estacion) {
        for (int i=0; i<estaciones.size(); i++) {
            if ((estaciones.get(i).equals(estacion))){
                return i;
            }
        }
        return -1;
    }

    public static int cantVecesRecorrida(String nombreEstacion) throws EstacionInexistente{
        int cant = 0;
        int indice = buscarIndiceEstacion(nombreEstacion);
        if (indice == -1) {
            throw new EstacionInexistente();
        }
        for (Reserva reserva : reservas) {
            int nEstacionPartida = buscarIndiceEstacion(reserva.getEstacionPartida().toString());
            int nEstacionDestino = buscarIndiceEstacion(reserva.getEstacionDestino().toString());
            if( nEstacionPartida <= indice && indice <= nEstacionDestino){
                cant ++;
            }
        }
        return cant;
    }
}
