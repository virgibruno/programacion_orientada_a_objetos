package clase10;

import java.util.Objects;

public class Nave extends Objeto{

    // Atributos
    private double velocidad;
    private int vida;

    // Constructor
    public Nave(int x, int y, char direccion, double velocidad, int vida) {
        super(x, y, direccion); // atributos heredados de la superclase
        this.velocidad = velocidad;
        this.vida = vida;
    }

    // Getters y setters
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    // Métodos
    public void girar (char direccion) {
        setDireccion(direccion);
    }

    @Override
    public void irA (int x, int y, char direccion) {
        if (this.getDireccion() != direccion) {
            girar(direccion);
        }
        this.setPosx(x);
        this.setPosy(y);
    }

    public void restaVida ( int valor) {
        if (this.vida > valor) {
            this.vida -= valor;
        } else {
            System.out.println("Game over");
        }
    }

    // Sobreescribir toString, hashCode y equals

    @Override
    public String toString() {
        return "Vida: " + vida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Nave)) {
            return false;
        } else {
            Nave objetoAux = (Nave) o;
            return (this.getPosx() == objetoAux.getPosx() && this.getPosy() == objetoAux.getPosy());
        }
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash = hash * vida ;
        return hash;
    }
}
