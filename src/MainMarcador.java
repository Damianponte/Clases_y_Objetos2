public class MainMarcador {
    public static void main(String[] args) {
        //Crea una clase Marcador con los atributos equipo local, equipo visitante, goles del local y goles del visitante.
        //Añade métodos golLocal() y golVisitante() que incrementen los goles correspondientes,
        // y un método resultado() que devuelva el resultado en formato “X - Y”.
        //Desde el main, simula un partido y muestra el resultado final.

        Marcador partido = new Marcador("Deportivo de la Coruña", "Real Madrid",0,0);



        System.out.println("comienza el partido!!!");
        System.out.println("El " + partido.getEquipoLocal() + " vs el " + partido.getEquipoLVisitante() );

        System.out.println("el " + partido.getEquipoLocal() + "ha marcado");
        partido.golLocal();
        System.out.println(partido.resultado());

        System.out.println("el " + partido.getEquipoLVisitante() + "ha marcado");

        partido.golVisitante();
        System.out.println(partido.resultado());

        System.out.println("el " + partido.getEquipoLVisitante() + "ha marcado");
        partido.golVisitante();
        System.out.println(partido.resultado());


        System.out.println("el " + partido.getEquipoLVisitante() + "ha marcado");

        partido.golLocal();
        System.out.println(partido.resultado());

        System.out.println("el " + partido.getEquipoLVisitante() + "ha marcado");
        partido.golLocal();

        System.out.println("hemos llegado al final de este emocionante partido!!!!!" );
        System.out.println("el resultado final es:" );
        System.out.println(partido.resultado());
        System.out.println("el ganador es el " + partido.getEquipoLocal() );



    }
}
