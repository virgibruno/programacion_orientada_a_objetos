package embarcaciones;

public class Velero extends Embarcacion{
    // Atributos
    private int cantMastiles;

    // Constructor
    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    // Métodos
    public boolean esGrande () {
        return cantMastiles > 4;
    }

    // Getters y setters
    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}
