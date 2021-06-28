package com.company;

public class UsuarioJuego {

        // 1. Crear variables

        private String nombre;
        private String clave;
        private Double puntaje;
        private int nivel;

        // 2. Crear constructor
        public UsuarioJuego( String nombre, String clave ) {
            this.nombre = nombre;
            this.clave = clave;
            puntaje = 0.0;
            nivel = 1;
        }

        // 3. Crear Getters
        public String getNombre() {
            return nombre;
        }

        public String getClave() {
            return clave;
        }

        public Double getPuntaje() {
            return puntaje;
        }

        public int getNivel() {
            return nivel;
        }

        // 4. Crear Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        // 5. Crear funciones requeridas por el diagrama
        public void aumentarPuntaje( ) {
            puntaje++;
        }

        public void subirNivel( ) {
            nivel++;
        }

        public void bonus( int valor ) {
            puntaje += valor;
        }

}
