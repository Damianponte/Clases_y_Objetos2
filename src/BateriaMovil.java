public class BateriaMovil {

    //Crea una clase BateriaMovil con un atributo porcentaje.
    //Añade un método usar(int minutos) que reduzca el porcentaje de batería y un método cargar(int minutos)
    // que aumente el porcentaje sin superar el 100.
    //Desde la clase principal, simula el uso del móvil jugando y después la carga.
    private int porcentajeInicial;
    private int porcentajeFinal;

    public BateriaMovil(int porcentajeInicial, int porcentajeFinal) {
        this.porcentajeInicial = porcentajeInicial;
        this.porcentajeFinal = porcentajeFinal;
    }

    public int usar(){
        return usar();
    }
    public int cargar(){
        return cargar();
    }

    public int getPorcentajeInicial() {
        return porcentajeInicial;
    }

    public int getPorcentajeFinal() {
        return porcentajeFinal;
    }

    public void setPorcentajeInicial(int porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    public void setPorcentajeFinal(int porcentajeFinal) {
        this.porcentajeFinal = porcentajeFinal;
    }
}
