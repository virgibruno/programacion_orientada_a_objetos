public class ProductoFactory {
    private static ProductoFactory instancia;

    private ProductoFactory () {};

    public static ProductoFactory getInstance() {
        if (instancia == null) {
            instancia = new ProductoFactory();
        }
        return instancia;
    }

    public static Producto construir(String tipo){
        switch (tipo){
            case "CAJA10X10":
                return new Caja(10,10,10);
            case "PELOTAFUTBOL":
                return new Pelota(11);
            case "PELOTATENIS":
                return new Pelota(0.32);
            default:
                System.out.println("No encontramos ese objeto! Ingrese CAJA10X10, PELOTAFUTBOL o PELOTATENIS");
                return null;
        }
    }

}
