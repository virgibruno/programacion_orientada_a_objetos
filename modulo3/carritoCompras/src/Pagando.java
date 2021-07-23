public class Pagando implements EstadoCarrito{
    private Carrito c;

    public Pagando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se pueden agregar más productos!");
    }

    @Override
    public void cancelarCarrito() {
        c.getProductos().clear();
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volverAlPuntoAnterior() {
        c.setEstado(new Cargando (c));
    }

    @Override
    public void pasarAlSgteEstado() {
        c.setEstado(new Cerrado(c));
    }

    @Override
    public String toString() {
        return "El carrito está en proceso de pago";
    }
}
