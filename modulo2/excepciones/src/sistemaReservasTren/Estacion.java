package sistemaReservasTren;

public class Estacion {
    // Atributos
    private String nombre;


    // Constructor
    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    // Getters and setters
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Equals
    public boolean equals(String nombreEstacion) {
        return nombre.equals(nombreEstacion);
    }

    // ToString
    @Override
    public String toString() {
        return nombre;
    }
}
