public class MainCarrito {
    public static void main(String[] args) {

        Carrito producto=new Carrito();
        producto.añadirProducto("arroz",23);
        producto.añadirProducto("ternera",15);
        producto.añadirProducto("aceite",10);
        System.out.println(" el total es:  " + producto.getTotal());


        producto.descuento();
        System.out.println(" el total con descuento es:  " + producto.getTotal());

    }

}
