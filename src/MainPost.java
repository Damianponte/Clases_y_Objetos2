public class MainPost {
    public static void main(String[] args) {
        //Crea una clase Post con los atributos título, número de likes y número de dislikes.
        //Añade métodos para dar like, dar dislike y un método que devuelva la popularidad del post (likes menos dislikes).
        //Desde el main, simula varias interacciones y muestra la popularidad.


        Post like=new Post("A Coruña");
        like.likes(5);
        like.dislikes(10);

        System.out.println("el post " + like.getTitulo() + " tiene " + like.getNumeroDeLikes() + " likes y " + like.getNumeroDeDislikes() + " de dislike");

        like.likes(150);
        like.dislikes(20);
        System.out.println("el post " + like.getTitulo() + " tiene " + like.getNumeroDeLikes() + " likes y " + like.getNumeroDeDislikes() + " de dislike");


        System.out.println("el post " + like.getTitulo() + " tiene " + like.popularidad());
    }
}
