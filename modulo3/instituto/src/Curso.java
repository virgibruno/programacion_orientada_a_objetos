public class Curso extends OfertaAcademica{
    private int cargaHorariaMensual;
    private double valorHora;
    private int cantMeses;

    public Curso() {

    }

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual * valorHora * cantMeses;
    }

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    @Override
    public String toString (){
        return getNombre();
    }
}
