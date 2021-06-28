package bancoClase11;

public class CuentaComitente extends Cuenta{
    // Atributos

    private String CNV;

    // Constructor

    public CuentaComitente(Cliente clienteAsociado, double saldoInicial, String CNV) {
        super(clienteAsociado, saldoInicial);
        this.CNV = CNV;
    }

    // Getters y setters

    public String getCNV() {
        return CNV;
    }

    public void setCNV(String CNV) {
        this.CNV = CNV;
    }

    // Métodos

    @Override
    public void depositar (double monto) {
        setSaldo(getSaldo()+monto*.99);
    }

    public void extraerEfectivo(double monto){
        if (monto <= (getSaldo()/2)) {
            setSaldo(getSaldo()-monto);
        }
    }

    public void extraerEfectivo(double monto, String clave){
        if (monto <= getSaldo() && clave.equals(CNV)) {
            setSaldo(getSaldo()-monto);
        }
    }

}
