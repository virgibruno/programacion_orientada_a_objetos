public class Main {
    public static void main(String[] args) {
        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");

        frontEnd.setNombre("Front End");
        frontEnd.setDescripcion("En este curso se aprenderá todo sobre Fronty");
        ((Curso)frontEnd).setCantMeses(2);
        ((Curso)frontEnd).setCargaHorariaMensual(16);
        ((Curso)frontEnd).setValorHora(1000);

        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");

        backEnd.setNombre("Back End");
        backEnd.setDescripcion("En este curso se aprenderá todo sobre backk");
        ((Curso)backEnd).setCantMeses(2);
        ((Curso)backEnd).setCargaHorariaMensual(2);
        ((Curso)backEnd).setValorHora(900);

        OfertaAcademica fullStack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");

        fullStack.setNombre("Full Stack");
        fullStack.setDescripcion("En este curso se aprenderá todo sobre fronty y backk");
        ((ProgramaIntensivo)fullStack).setBonificacion(0.2);
        ((ProgramaIntensivo)fullStack).agregarOferta(frontEnd);
        ((ProgramaIntensivo)fullStack).agregarOferta(backEnd);

        Instituto DH = new Instituto("Digital House");
        DH.agregar(frontEnd);
        DH.agregar(backEnd);
        DH.agregar(fullStack);

        OfertaAcademica ctd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Carrera");

        ((Carrera)ctd).setPrecioBase(5);
        ((Carrera)ctd).setNombre("Certified Tech Developer");

        ((Carrera)ctd).agregarMateria(frontEnd);
        ((Carrera)ctd).agregarMateria(backEnd);
        ((Carrera)ctd).agregarMateria(fullStack);

        DH.agregar(ctd);

        DH.generarInforme();
    }
}
