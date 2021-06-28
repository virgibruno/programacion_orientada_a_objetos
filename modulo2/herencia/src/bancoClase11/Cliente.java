package bancoClase11;

import java.math.BigInteger;

public class Cliente {
    // Atributos
    private int nCliente;
    private String apellido;
    private int DNI;
    private long CUIT;

    // Constructor
    public Cliente(int nCliente, String apellido, int DNI, long CUIT) {
        this.nCliente = nCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    // Getters y setters

    public int getnCliente() {
        return nCliente;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
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

    public long getCUIT() {
        return CUIT;
    }

    public void setCUIT(long CUIT) {
        this.CUIT = CUIT;
    }
}
