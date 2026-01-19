public class Carrito {
    //Crea una clase Carrito con un atributo total.
    //Añade un método para añadir un producto al carrito y otro para aplicar un descuento porcentual.
    //Desde la clase principal, añade varios productos y aplica un descuento al total.

    private double getTotal;


    public Carrito() {
        this.getTotal = 0;
    }

    public void añadirProducto(String producto,double precio){
        if (precio>=0){
            getTotal=getTotal+precio;
            System.out.println("el producto: " + producto + " cuesta " + precio + " Euros");

        }else{
            System.out.println("precio no valido");
        }

    }

    public void descuento() {
        if (getTotal >= 30 && getTotal <= 60) {
            getTotal *= 0.80;
        } else if (getTotal > 60 && getTotal < 100) {
            getTotal *= 0.68;
        } else if (getTotal >= 100) {
            getTotal *= 0.50;
        }

    }


    public double getTotal() {
        return getTotal;
    }

}


