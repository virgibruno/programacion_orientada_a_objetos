package clase10;

public class Objeto {

    // Atributos
    private int posx;
    private int posy;
    private char direccion;

    // Constructor
    public Objeto(int x, int y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    // Getters y setters
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    // Métodos
    public void irA(int x, int y, char direccion) {
        // Se sobreescribe en cada subclase
    }
}
