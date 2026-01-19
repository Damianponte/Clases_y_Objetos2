public class Personaje {
//Crea una clase Personaje con los atributos nombre, vida y ataque.
//Añade métodos para recibir daño, curarse y comprobar si el personaje sigue vivo. La vida no debe bajar de cero ni superar 100.
//Desde el main, simula un pequeño combate.

    private String nombre;
    private int vida;
    private int ataque;
    private String nombreAtaque;


    public Personaje(String nombre,String nombreAtaque,int vida,int ataque){
        this.ataque=ataque;
        this.vida=vida;
        this.nombre=nombre;
        this.nombreAtaque=nombreAtaque;
    }

    public void daño(int ataque){
        vida=vida-ataque;

        if (vida<0){
            vida=0;
        }

    }

    public void curarse(int objeto){
        vida=vida+ objeto;
        if (vida>100) {
            vida = 100;
        }
    }

    public int getAtaque() {
        return this.ataque;
    }
    public int getVida() {
        return this.vida;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getNombreAtaque() {
        return this.nombreAtaque;
    }
}
