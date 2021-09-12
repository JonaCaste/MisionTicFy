package modelo;

public class Album extends Producto{
    
    //atributos
    private int id;
    private int numero_canciones;
    private float rating;

    //constructor

    public Album(int id, Autor autor, String nombre, int precio, String genero, int id_album, int numero_canciones, float rating) {
        super(id, autor, nombre, precio, genero);
        this.id = id_album;
        this.numero_canciones = numero_canciones;
        this.rating = rating;
    }
    

   
}
