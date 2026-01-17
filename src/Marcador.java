public class Marcador {
    //Crea una clase Marcador con los atributos equipo local, equipo visitante, goles del local y goles del visitante.
    //Añade métodos golLocal() y golVisitante() que incrementen los goles correspondientes,
    // y un método resultado() que devuelva el resultado en formato “X - Y”.
    //Desde el main, simula un partido y muestra el resultado final.

    private String equipoLocal;
    private String equipoLVisitante;
    private int golLocal;
    private int golVisitante;

    public Marcador(String equipoLocal, String equipoLVisitante, int golLocal, int golVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoLVisitante = equipoLVisitante;
        this.golLocal = 0;
        this.golVisitante = 0;

    }
    public void golLocal() {
        golLocal++;
    }
    public void golVisitante(){
        golVisitante++;

    }
    public String resultado(){
        return golLocal + " - " + golVisitante;
    }

    //get

    private String getEquipoLocal(){
        return equipoLocal;
    }
    private String getEquipoLVisitante(){
        return equipoLVisitante;
    }

    private int getGolLocal() {
        return golLocal;
    }
    private int getGolVisitante() {
        return golVisitante;
    }


}
