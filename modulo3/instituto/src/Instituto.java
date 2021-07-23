import java.util.ArrayList;

public class Instituto {
    // Atributos
    private String nombre;
    private ArrayList<OfertaAcademica> oferta;

    // Constructor
    public Instituto(String nombre) {
        this.nombre = nombre;
        oferta = new ArrayList<OfertaAcademica>();
    }

    // Métodos
    public void generarInforme() {
        for (OfertaAcademica o : oferta) {
            System.out.println(o.getNombre() + ": $" + o.calcularPrecio());
        }
    }

    public void agregar (OfertaAcademica o) {
        oferta.add(o);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<OfertaAcademica> getOferta() {
        return oferta;
    }

    public void setOferta(ArrayList<OfertaAcademica> oferta) {
        this.oferta = oferta;
    }
}
