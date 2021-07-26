public class ServicioFactory {
    private static ServicioFactory instancia = new ServicioFactory();

    public static ServicioFactory getInstance() {
        return instancia;
    }

    public Servicio crearServicio(String tipo) {
        switch (tipo){
            case "Simple":
                return new ServicioSimple();
            case "Combo":
                return new Combo();
            default:
                return null;
        }
    }
}
