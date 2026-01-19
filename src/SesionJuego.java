public class SesionJuego {
    //Crea una clase SesionJuego con los atributos nombre del juego y minutos jugados.
    //Añade un método jugar(int minutos) que acumule tiempo y un método horasJugadas() que devuelva las horas jugadas como número decimal.
    //Desde la clase principal, simula varias sesiones de juego.

    private String nombre;
    private int minutos;


    public SesionJuego(int minutos, String nombre) {
        this.minutos = minutos;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public void jugar(int minutosJugados){
        if(minutosJugados>0){
            minutos=minutos+minutosJugados;
        }
    }

    public double horasJugadas(){
        return (double) minutos/60;
    }
}