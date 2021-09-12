package modelo;

public class Autor {
    
    //atributos
    private static int id;
    private String nombre;
    private String nacionalidad;
    private String tipo;
    
    //constructor
    public Autor(int id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public static int getId(){
        return id;
    }
}
