package sistemaReservasTren;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    // Atributos
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private ArrayList<Estacion> estaciones = new ArrayList<Estacion>();

    //Constructor
    public Empresa() {
    }

    // Agregar reservas y estaciones
    public void nuevaEstacion (int posicion, Estacion estacion) {
        estaciones.add(posicion, estacion);
    }

    public void nuevaReserva (Reserva reserva) {
        reservas.add(reserva);
    }

    // Metodos
    public double recaudacionTotal(){
        double recaudacion = 0;
        for(Reserva reserva : reservas) {
            recaudacion += reserva.calcularCosto();
        }
        return recaudacion;
    }

    public int buscarIndiceEstacion (String estacion) {
        for (int i=0; i<estaciones.size(); i++) {
            if ((estaciones.get(i).equals(estacion))){
                return i;
            }
        }
        return -1;
    }

    public int cantVecesRecorrida(String nombreEstacion) throws EstacionInexistente{
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

    // Getters
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

}
