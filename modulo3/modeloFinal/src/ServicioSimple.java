public class ServicioSimple extends Servicio{

    // Atributos

    private double precioBase;

    // Métodos

    @Override
    public double precio() {
        if (this.getNombre() == "Colocación")
            return precioBase * 1.1;
        else
            return precioBase;
    }

    // Getters y setters

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
