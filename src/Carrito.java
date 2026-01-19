public class Carrito {
    //Crea una clase Carrito con un atributo total.
    //Añade un método para añadir un producto al carrito y otro para aplicar un descuento porcentual.
    //Desde la clase principal, añade varios productos y aplica un descuento al total.

    private double total;


    public Carrito (int total){
        this.total=total;
    }

    public void añadirProducto(String producto,double precio){
        if (precio>=0){
            total=total+precio;
            System.out.println("el producto: " + producto + " cuesta " + precio + " Euros");

        }else{
            System.out.println("precio no valido");
        }

    }

    public void descuento(double total){
        if ( total>=30 && total<=60){
            total=total - (total*0.20);
        }else if ( total>60 && total<100){
            total=total- (total*0.32);

        }else{
            total=total- (total*0.50);
        }

    }



}


