import java.util.Scanner;

public class MainCancionStats {
    public static void main(String[] args) {

       CancionStats[]  canciones= {
               new CancionStats("Otra Noche"),
               new CancionStats("llovera"),
               new CancionStats("alosque")

       };
        Scanner entrada=new Scanner(System.in);

       int opcion=-1;

       while(opcion!=0){

           System.out.println("elije una opcion");
           System.out.println("Opcion1. Otra Noche");
           System.out.println("Opcion2. LLovera");
           System.out.println("Opcion3. Alosque");
           System.out.println("Opcion4. Salir");

           opcion = entrada.nextInt();

           if (opcion >= 1 && opcion <= 3) {
               canciones[opcion - 1].reproducir();
               System.out.println("Reproduciendo: " + canciones[opcion - 1].getTitulo());
           } else if (opcion != 0) {
               System.out.println("Opción no válida");
           }
       }

        System.out.println("estas son las estadisticas de repeticion de las canciones");

       for (int i =0;i< canciones.length;i++){

           System.out.println(canciones[i].getTitulo() + " - Reproducciones: " + canciones[i].getReproducciones());
       }

    }
}