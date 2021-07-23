public class Main {
    public static void main(String[] args) {

        Producto pelota = new Producto("pelota");
        Producto juguete = new Producto("juguete");

        Carrito vir = new Carrito();

        System.out.println(vir.getProductos());
        System.out.println(vir.getEstado());

        vir.agregarProducto(pelota);

        System.out.println(vir.getProductos());
        System.out.println(vir.getEstado());

        vir.agregarProducto(juguete);

        System.out.println(vir.getProductos());
        System.out.println(vir.getEstado());

        vir.cancelarCarrito();

        System.out.println(vir.getProductos());
        System.out.println(vir.getEstado());

        vir.agregarProducto(juguete);
        vir.pasarAlSgteEstado();

        System.out.println(vir.getProductos());
        System.out.println(vir.getEstado());

        vir.agregarProducto(juguete);
        vir.pasarAlSgteEstado();

        System.out.println(vir.getProductos());
        System.out.println(vir.getEstado());

    }
}
