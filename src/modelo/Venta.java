package modelo;

public class Venta {
    
    //atributos
    private int id;
    private Comprador comprador;
    private Producto producto;
    private String fecha;
    
    //constructor
    public Venta(int id, Comprador comprador, Producto producto, String fecha) {
        this.id = id;
        this.comprador = comprador;
        this.producto = producto;
        this.fecha = fecha;
    }
    
}
