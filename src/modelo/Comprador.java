package modelo;

public class Comprador {
    
    //atributos
    private int documento;
    private String tipo_documento;
    private String nombre;
    private String apellido;
    private double numero;
    private String correo;
    
    //constructor
    public Comprador(int documento, String tipo_documento, String nombre, String apellido, double numero, String correo) {
        this.documento = documento;
        this.tipo_documento = tipo_documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.correo = correo;
    }
    
}
