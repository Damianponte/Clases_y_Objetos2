public class MainEntradaCine {
    public static void main(String[] args) {

        EntradaCine[] entrada=new EntradaCine[3];
        entrada[0]=new EntradaCine("Alejo","La Ira",7.15,true);
        entrada[1]=new EntradaCine("Lucia","Los vengadores",7.15,false);
        entrada[2]=new EntradaCine("Damian","Detective Conan",6.15,true);

        for (int i=0;i< entrada.length;i++){
            System.out.println(entrada[i].getNombrePersona() + " compró la entrada de : " + entrada[i].getNombre()
                    + "que cuesta " + entrada[i].precioFinal() );

        }



    }

}
