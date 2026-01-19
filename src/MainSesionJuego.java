public class MainSesionJuego {
    public static void main(String[] args) {
        //Crea una clase SesionJuego con los atributos nombre del juego y minutos jugados.
        //Añade un método jugar(int minutos) que acumule tiempo y un método horasJugadas() que devuelva las horas jugadas como número decimal.
        //Desde la clase principal, simula varias sesiones de juego.

            SesionJuego[] partida=new SesionJuego[3];
            partida[0] = new SesionJuego("Minecraft");
            partida[1] = new SesionJuego("FIFA");
            partida[2] = new SesionJuego("Zelda");

            partida[0].jugar(35);
            partida[0].jugar(45);

            partida[1].jugar(13);
            partida[1].jugar(59);

            partida[2].jugar(47);
            partida[2].jugar(89);



            for(int i=0;i< partida.length;i++){

                System.out.println(" la partida " + partida[i].getNombre() + " ha jugado " + partida[i].getMinutos() + " minutos") ;
                System.out.println(" la partida " + partida[i].getNombre() + " ha jugado " + partida[i].horasJugadas() + " horas.") ;
            }
                 SesionJuego max = partida[0];
                for(int i=0;i< partida.length;i++){
                    if (partida[i].getMinutos()>max.getMinutos()){
                        max=partida[i];

            }


        }
        System.out.println("La partida con más tiempo jugado es: "
                + max.getNombre() + " con " + max.getMinutos() + " minutos");
    }
}
