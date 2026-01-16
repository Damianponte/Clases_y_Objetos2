public class CancionStats {
    //Crea una clase CancionStats con los atributos título y número de reproducciones.
    //Añade un método reproducir() que incremente en uno el número de reproducciones.
    //Desde la clase con main,
    // simula varias reproducciones de una canción en un bucle con dicha función, y muestra el total usando el getter del objeto.

        private String titulo;
        private int reproducciones;

    // Constructor
    public CancionStats(String titulo) {
        this.titulo = titulo;
        this.reproducciones = 0;
    }

    // Método que incrementa el número de reproducciones
    public void reproducir() {
        reproducciones++;
    }

    //getters

    public String getTitulo(){
        return titulo;
    }

    public int getReproducciones(){
        return reproducciones;
    }


}
