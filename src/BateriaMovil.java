public class BateriaMovil {

    //Crea una clase BateriaMovil con un atributo porcentaje.
    //Añade un método usar(int minutos) que reduzca el porcentaje de batería y un método cargar(int minutos)
    // que aumente el porcentaje sin superar el 100.
    //Desde la clase principal, simula el uso del móvil jugando y después la carga.
    public int porcentaje;


    public BateriaMovil(int porcentaje) {
        this.porcentaje = porcentaje;

    }


    public void usar(int minutos){
        porcentaje=porcentaje-minutos;
        if (porcentaje<0){
            porcentaje=0;
        }
        }

    public void cargar(int minutos) {
        porcentaje=porcentaje + minutos;

        if (porcentaje > 100) {
            porcentaje = 100;
        }
    }


    public int getPorcentaje() {
        return this.porcentaje;
    }

}
