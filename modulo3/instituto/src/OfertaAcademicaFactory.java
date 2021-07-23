public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;

    private OfertaAcademicaFactory(){    }

    public static OfertaAcademicaFactory getInstance() {
        if (instancia == null)
            instancia = new OfertaAcademicaFactory();
        return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo){
        switch (tipo){
            case "Curso":
                return new Curso();
            case "ProgramaIntensivo":
                return new ProgramaIntensivo();
            case "Taller":
                return new Taller();
            case "Carrera":
                return new Carrera();
            default:
                return null;
        }
    }
}
