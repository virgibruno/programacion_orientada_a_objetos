public class LicenciaAuto extends Licencia {
    // Atributos
    private boolean puedeManejarCamionetas;

    // Constructor
    public LicenciaAuto(Conductor conductor, String fechaInicioVigencia, String fechaCaducidad, boolean esPrincipiante, boolean puedeManejarCamionetas) {
        super(conductor, fechaInicioVigencia, fechaCaducidad, esPrincipiante);
        this.puedeManejarCamionetas = puedeManejarCamionetas;
    }

    // Getters y setters
    public boolean isPuedeManejarCamionetas() {
        return puedeManejarCamionetas;
    }

    public void setPuedeManejarCamionetas(boolean puedeManejarCamionetas) {
        this.puedeManejarCamionetas = puedeManejarCamionetas;
    }
}
