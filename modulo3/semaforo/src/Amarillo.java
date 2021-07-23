public class Amarillo implements StateSemaforo{
    private Semaforo v;

    public Amarillo(Semaforo v) {
        this.v = v;
    }

    public void mostrarAviso (){
        System.out.println("El semáforo está en amarillo");
    }

    public void cambiarEstado(){
        v.setEstado(new Rojo(v));
        System.out.println("El semáforo cambió a rojo!");
    }
}
