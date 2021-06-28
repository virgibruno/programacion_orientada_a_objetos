package clase5;

public class Main {
    public static void main(String[] args) {

        // 6. Instanciamos los objetos dentro del main
        UsuarioJuego usuarioUno = new UsuarioJuego( "Virgi", "Pepita" );
        UsuarioJuego usuarioDos = new UsuarioJuego( "Pauli", "Pepita2" );
        UsuarioJuego usuarioTres = new UsuarioJuego( "Lu", "Pepita3" );
        UsuarioJuego usuarioCuatro = new UsuarioJuego( "Santi", "ElPaisa" );

        // 7. Consologueamos - imprimimos en el caso de JAVA - los resultados necesarios
        usuarioUno.aumentarPuntaje( );
        System.out.println( "Aumentamos el puntaje: " + usuarioUno.getPuntaje( ) );

        usuarioDos.subirNivel( );
        System.out.println( "Aumentamos el nivel: " + usuarioDos.getNivel( ) );

        usuarioTres.bonus( 4 );
        System.out.println( "Aumentamos el puntaje con un bonus: " + usuarioTres.getPuntaje( ) );

        // 8. También podemos settear los datos del usuario
        System.out.println( "Sin aumento de puntaje: " + usuarioCuatro.getPuntaje( ) );
        usuarioCuatro.setClave( "NoSoyRolo" );
        System.out.println( "Nueva clave: " + usuarioCuatro.getClave( ) );
    }
}