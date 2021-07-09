package embarcaciones;

public class Yate extends Embarcacion implements Comparable{
    // Atributos
    private int cantCamarotes;

    // Constructor
    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    // Implementacion interface
    public int compareTo (Object obj) {
        Yate aComparar = (Yate)obj;
        if (cantCamarotes > aComparar.cantCamarotes) {
            return 1;
        } else if (cantCamarotes < aComparar.cantCamarotes) {
            return -1;
        } else {
            return 0;
        }
    }

    // Getters y setters
    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
}
