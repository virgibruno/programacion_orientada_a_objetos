import java.util.ArrayList;

public class Empresa {

    // Atributos

    private String nombre;
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();

    // Constructor

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    // Métodos

    public void agregar (Servicio s) {
        servicios.add(s);
    }

    public void mostrarServicios () {
        for (Servicio s: servicios){
            System.out.println(s.getNombre() + "----> $" + s.precio() + "\n" + s.getDescripcion() +"\n");
        }
    }
}
