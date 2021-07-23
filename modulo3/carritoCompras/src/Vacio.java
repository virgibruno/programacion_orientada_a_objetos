public class Vacio implements  EstadoCarrito{

    private Carrito c;

    public Vacio(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {
        c.getProductos().add(producto);
        c.setEstado(new Cargando(c));
    }

    @Override
    public void cancelarCarrito() {

    }

    @Override
    public void volverAlPuntoAnterior() {

    }

    @Override
    public void pasarAlSgteEstado() {

    }

    @Override
    public String toString() {
        return "El carrito está vacío";
    }
}
