import java.util.ArrayList;

public class Carrera extends OfertaAcademica{
    // Atributos
    private ArrayList<OfertaAcademica> materias;
    private double precioBase;

    // Constructor
    public Carrera () {
        materias = new ArrayList<OfertaAcademica>();
    }

    // Métodos
    @Override
    public double calcularPrecio() {
        double precio = precioBase;
        for(OfertaAcademica materia : materias){
            precio += materia.calcularPrecio();
        }
        return precio;
    }

    public void agregarMateria(OfertaAcademica materia) {
        if ((materia instanceof Curso && ((Curso) materia).getCargaHorariaMensual() >= 10) || materia instanceof Taller) {
            materias.add(materia);
        } else {
            System.err.println("No se puede agregar: "+ materia);
        }
    }

    // Getters y setters
    public ArrayList<OfertaAcademica> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<OfertaAcademica> materias) {
        this.materias = materias;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
