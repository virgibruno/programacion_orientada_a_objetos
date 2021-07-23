public class Rojo implements StateSemaforo{
    private Semaforo v;

    public Rojo(Semaforo v) {
        this.v = v;
    }

    public void mostrarAviso (){
        System.out.println("El semáforo está en rojo");
    }

    public void cambiarEstado(){
        v.setEstado(new Verde(v));
        System.out.println("El semáforo cambió a verde!");
    }
}
