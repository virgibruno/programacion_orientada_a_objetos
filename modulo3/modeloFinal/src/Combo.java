import java.util.ArrayList;

public class Combo extends Servicio{

    // Atributos

    private double descuento;
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();

    // Constructor

    private Combo () {}

    // Métodos

    @Override
    public double precio() {
        double p =0;
        for(Servicio s: servicios) {
            p += s.precio();
        }
        return p;
    }

    public void agregar (Servicio s){
        servicios.add(s);
    }

    // Getters y setters

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
}
