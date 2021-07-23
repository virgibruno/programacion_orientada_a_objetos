public class Verde implements StateSemaforo{

    private Semaforo v;

    public Verde(Semaforo v) {
        this.v = v;
    }

    public void mostrarAviso (){
        System.out.println("El semáforo está en verde");
    }

    public void cambiarEstado(){
        v.setEstado(new Amarillo(v));
        System.out.println("El semáforo cambió a amarillo!");
    }
}
