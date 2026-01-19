public class MainBateriaMovil {
    public static void main(String[] args) {

        //Crea una clase BateriaMovil con un atributo porcentaje.
        //Añade un método usar(int minutos) que reduzca el porcentaje de batería y un método cargar(int minutos)
        // que aumente el porcentaje sin superar el 100.
        //Desde la clase principal, simula el uso del móvil jugando y después la carga.

        BateriaMovil movil=new BateriaMovil(100);

        System.out.println("comienza el juego!!!");
        System.out.println("tienes " + movil.getPorcentaje() + " de bateria ");
        System.out.println(" has usado el movil durante 2 horas ");
        movil.usar(30);
        System.out.println(" tu bateria ha bajado a : " +movil.getPorcentaje() );
        movil.usar(45);
        System.out.println(" tu bateria ha bajado a : " +movil.getPorcentaje() );

        movil.cargar(74);
        System.out.println(" tu bateria ha subido a : " +movil.getPorcentaje() );

    }
}
