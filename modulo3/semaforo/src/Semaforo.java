public class Semaforo {
    private StateSemaforo estado;

    public Semaforo() {
        this.setEstado(new Verde(this));
    }

    public void mostrarAviso(){
        this.getEstado().mostrarAviso();
    }

    public void cambiarEstado(){
        this.getEstado().cambiarEstado();
    }

    public StateSemaforo getEstado() {
        return estado;
    }

    public void setEstado(StateSemaforo estado) {
        this.estado = estado;
    }
}
