public class Conductor {
    // Atributos
    private String nombre;
    private String apellido;
    private int DNI;
    private String fechaNacimiento;

    // Constructor
    public Conductor(String nombre, String apellido, int DNI, String fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        fechaNacimiento = fechaNac;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
