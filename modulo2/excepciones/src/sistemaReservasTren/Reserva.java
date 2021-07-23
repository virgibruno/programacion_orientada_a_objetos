package sistemaReservasTren;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    // Atributos
    private int codigo;
    private Estacion estacionPartida;
    private Estacion estacionDestino;
    private int cantPersonas;
    private double precioBoleto;

    // Constructor
    public Reserva(int codigo, Estacion estacionPartida, Estacion estacionDestino, int cantPersonas) {
        this.codigo = codigo;
        this.estacionPartida = estacionPartida;
        this.estacionDestino = estacionDestino;
        this.cantPersonas = cantPersonas;
        this.precioBoleto = 50.0;
        Main.reservas.add(this);
    }

    // Metodos

    public double calcularCosto() {
        int cantEstaciones = Main.estaciones.size();
        int estacionesRecorridas = Main.buscarIndiceEstacion(estacionDestino.toString()) - Main.buscarIndiceEstacion(estacionPartida.toString()+1);
        if (cantEstaciones == estacionesRecorridas) {
            return cantPersonas * precioBoleto * 0.8;
        } else return cantPersonas * precioBoleto;
    }

    @Override
    public String toString(){
        return "\nReserva nª " + codigo +"\nPartida: "+ estacionPartida +"\nDestino: " + estacionDestino +"\nPersonas: " + cantPersonas +"\nCosto $" +calcularCosto();
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estacion getEstacionPartida() {
        return estacionPartida;
    }

    public void setEstacionPartida(Estacion estacionPartida) {
        this.estacionPartida = estacionPartida;
    }

    public Estacion getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(Estacion estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }
}
