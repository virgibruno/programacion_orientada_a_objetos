import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{
    private double bonificacion;
    private ArrayList<OfertaAcademica> cursos;

    public ProgramaIntensivo() {
        cursos = new ArrayList<OfertaAcademica>();
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        for(OfertaAcademica curso : cursos) {
            precioTotal += curso.calcularPrecio();
        }
        return precioTotal*(1-bonificacion);
    }

    public void agregarOferta(OfertaAcademica curso){
        cursos.add(curso);
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public ArrayList<OfertaAcademica> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<OfertaAcademica> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString (){
        return getNombre();
    }
}
