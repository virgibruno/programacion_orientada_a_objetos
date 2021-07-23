import java.util.ArrayList;

public class Carrito {
    //Atributos
    private EstadoCarrito estado;
    private ArrayList<Producto> productos;

    // Constructor
    public Carrito() {
        this.setEstado(new Vacio(this));
        this.productos = new ArrayList<>();
    }

    // Métodos que cambian según estado del carrito
    public void agregarProducto(Producto p){
        this.getEstado().agregarProducto(p);
    }

    public void cancelarCarrito(){
        this.getEstado().cancelarCarrito();
    };

    public void volverAlPuntoAnterior(){
        this.getEstado().volverAlPuntoAnterior();
    };

    public void pasarAlSgteEstado(){
        this.getEstado().pasarAlSgteEstado();
    };

    // Getters y setters
    public EstadoCarrito getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

}
