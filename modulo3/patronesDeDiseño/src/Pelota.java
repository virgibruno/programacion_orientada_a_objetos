public class Pelota extends Producto{
    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    public double calcularEspacio() {
        return 4*Math.PI*(radio*radio*radio)/3;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
