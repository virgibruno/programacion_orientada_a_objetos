package com.company;

public class FechaExcepcion extends Exception{
    public FechaExcepcion() {
        super();
    }

    public FechaExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString (){
        return this.getMessage();
    }
}
