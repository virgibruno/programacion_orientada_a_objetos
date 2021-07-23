public class Taller extends OfertaAcademica{
    // Atributos
    private int cantTrabajosPracticos;
    private double valorTrabajoPractico;

    //Constructor
    public Taller(){}

    //Métodos
    @Override
    public double calcularPrecio() {
        return cantTrabajosPracticos * valorTrabajoPractico;
    }

    // Getters y setters
    public int getCantTrabajosPracticos() {
        return cantTrabajosPracticos;
    }

    public void setCantTrabajosPracticos(int cantTrabajosPracticos) {
        this.cantTrabajosPracticos = cantTrabajosPracticos;
    }

    public double getValorTrabajoPractico() {
        return valorTrabajoPractico;
    }

    public void setValorTrabajoPractico(double valorTrabajoPractico) {
        this.valorTrabajoPractico = valorTrabajoPractico;
    }
}
