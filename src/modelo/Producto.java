package modelo;

public class Producto {
    
    //atributos
    protected int id;
    protected Autor autor;
    protected String nombre;
    protected int precio;
    protected String genero;
    
    //constructor
    public Producto(int id, Autor autor, String nombre, int precio, String genero) {
        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
    }
    
}
