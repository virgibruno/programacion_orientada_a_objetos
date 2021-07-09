public class LicenciaMoto extends Licencia implements Comparable{
    // Atributos
    private int cantMaxCilindradas;

    // Constructor
    public LicenciaMoto(Conductor conductor, String fechaInicioVigencia, String fechaCaducidad, boolean esPrincipiante, int cantMaxCilindradas) {
        super(conductor, fechaInicioVigencia, fechaCaducidad, esPrincipiante);
        this.cantMaxCilindradas = cantMaxCilindradas;
    }

    // Implementacion interface
    public int compareTo (Object o) {
        LicenciaMoto lic = (LicenciaMoto) o;
        if (this.cantMaxCilindradas > lic.cantMaxCilindradas) {
            return 1;
        } else if (this.cantMaxCilindradas < lic.cantMaxCilindradas) {
            return -1;
        } else {
            return 0;
        }
    }

    //Getters y setters
    public int getCantMaxCilindradas() {
        return cantMaxCilindradas;
    }

    public void setCantMaxCilindradas(int cantMaxCilindradas) {
        this.cantMaxCilindradas = cantMaxCilindradas;
    }
}
