package clase10;

public class Asteroide extends Objeto{
    // Atributos
    private int lesion;

    // Constructor
    public Asteroide(int x, int y, char direccion, int lesion) {
        super(x, y, direccion);
        this.lesion = lesion;
    }

    // Getters y setters

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    // Métodos
    @Override
    public void irA (int x, int y, char direccion) {
        this.setPosx(x);
        this.setPosy(y);
        this.setDireccion(direccion);
    }
}
