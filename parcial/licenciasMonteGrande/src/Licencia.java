public abstract class Licencia {
    // Atributos
    private Conductor conductor;
    private String fechaInicioVigencia;
    private String fechaCaducidad;
    private boolean esPrincipiante;

    // Constructor
    public Licencia(Conductor conductor, String fechaInicioVigencia, String fechaCaducidad, boolean esPrincipiante) {
        this.conductor = conductor;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaCaducidad = fechaCaducidad;
        this.esPrincipiante = esPrincipiante;
    }

    // Métodos
    public boolean puedeConducirAutopista() {
        return !esPrincipiante;
    }

    // Getters y setters

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(String fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean isEsPrincipiante() {
        return esPrincipiante;
    }

    public void setEsPrincipiante(boolean esPrincipiante) {
        this.esPrincipiante = esPrincipiante;
    }
}
