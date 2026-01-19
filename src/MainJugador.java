public class MainJugador {
    public static void main(String[] args) {
        //Crea una clase Personaje con los atributos nombre, vida y ataque.
        //Añade métodos para recibir daño, curarse y comprobar si el personaje sigue vivo. La vida no debe bajar de cero ni superar 100.
        //Desde el main, simula un pequeño combate.
        Personaje jugador=new Personaje ("Damian","lanzallamas",100,20);

        System.out.println("el jugador llamado " + jugador.getNombre() + " tiene una vida de : " + jugador.getVida() + " de vida " );

        System.out.println("han atacado a " + jugador.getNombre() + " con un  " + jugador.getNombreAtaque());


        jugador.daño(75);
        System.out.println("a  " + jugador.getNombre() + " le queda : " + jugador.getVida() + " de vida " );
        System.out.println(jugador.getNombre() + " ha usado una pocion ");
        jugador.curarse(50);
        System.out.println(jugador.getNombre() + " se ha curado con una pocion y ahora le queda " + jugador.getVida() + " de vida " );


    }
}
