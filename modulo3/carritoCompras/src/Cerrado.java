public class Cerrado implements EstadoCarrito{
    private Carrito c;

    public Cerrado(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se pueden agregar más productos!");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No se pueden cancelar el carrito! Ya está comprado");
    }

    @Override
    public void volverAlPuntoAnterior() {

    }

    @Override
    public void pasarAlSgteEstado() {
        c.getProductos().clear();
        c.setEstado(new Vacio(c));
    }

    @Override
    public String toString() {
        return "El carrito está cerrado";
    }
}
