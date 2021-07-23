public interface EstadoCarrito {
    public void agregarProducto(Producto producto);
    public void cancelarCarrito();
    public void volverAlPuntoAnterior();
    public void pasarAlSgteEstado();
}
