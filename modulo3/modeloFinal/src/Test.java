public class Test {

    public static void main(String[] args) {
        // Creacion servicios
        Servicio vtaAA = ServicioFactory.getInstance().crearServicio("Simple");
        vtaAA.setNombre("venta de aire acondicionado");
        vtaAA.setDescripcion("esta es una venta de un aire acondicionado nuevo a $65.000");
        ((ServicioSimple)vtaAA).setPrecioBase(65000);

        Servicio colocacion = ServicioFactory.getInstance().crearServicio("Simple");
        colocacion.setNombre("Colocación");
        colocacion.setDescripcion("Colocación de aire acondicionado con precio base de $10000");
        ((ServicioSimple)colocacion).setPrecioBase(10000);

        Servicio aa = ServicioFactory.getInstance().crearServicio("Combo");
        aa.setNombre("Combo de aire acondicionado");
        aa.setDescripcion("Este combo incluye la venta de un aire acondicionado nuevo y la colocación del mismo, con un descuento del 10%");
        ((Combo)aa).agregar(vtaAA);
        ((Combo)aa).agregar(colocacion);
        ((Combo)aa).setDescuento(0.1);

        // Creacion empresa, agregado de servicios y mostrar los servicios
        Empresa ficticia = new Empresa("empresaFicticia");
        ficticia.agregar(vtaAA);
        ficticia.agregar(colocacion);
        ficticia.agregar(aa);
        ficticia.mostrarServicios();
    }
}
