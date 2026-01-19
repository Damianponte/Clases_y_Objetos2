public class EntradaCine {
//Crea una clase EntradaCine con los atributos nombre de la película, precio base y un boolean que indique si el cliente es estudiante.
//Añade un método precioFinal() que aplique un descuento si es estudiante.
//Desde el main, crea varias entradas y muestra su precio final.

    private String nombre;
    private double precio;
    private boolean estudiante;



    private String nombrePersona;

    public EntradaCine(String nombrePersona,String nombre, double precio, boolean estudiante) {
        this.nombre = nombre;
        this.precio = precio;
        this.estudiante = estudiante;
        this.nombrePersona = nombrePersona;
    }
    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean Estudiante() {
        return estudiante;
    }
    public double precioFinal() {
        if(estudiante) {
            return precio * 0.8; // 20% de descuento
        } else {
            return precio;
        }

    }
}
