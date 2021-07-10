package sistemaReservasTren;

public class EstacionInexistente extends Exception{
    // Constructor
    public EstacionInexistente (){
        super();
    }

    // Mensaje de error

    @Override
    public String toString() {
        return "La estación no existe";
    }
}
