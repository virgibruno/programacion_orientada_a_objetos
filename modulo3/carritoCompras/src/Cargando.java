import java.util.ArrayList;

public class Cargando implements  EstadoCarrito{

    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {
        c.getProductos().add(producto);
    }

    @Override
    public void cancelarCarrito() {
        c.getProductos().clear();
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volverAlPuntoAnterior() {

    }

    @Override
    public void pasarAlSgteEstado() {
        c.setEstado(new Pagando(c));
    }

    @Override
    public String toString() {
        return "El carrito se está cargando";
    }
}
