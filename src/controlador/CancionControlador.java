package controlador;

import modelo.Autor;
import modelo.Cancion;

public class CancionControlador {
    
    public static Cancion crearCancion(int id,  Autor autor, String nombre, int precio, String genero, int id_cancion, int duracion, int tiene_colaboracion){
        
        Cancion cancion = new Cancion(id, autor, nombre, precio, genero, id_cancion, duracion, tiene_colaboracion);
        cancion.crearCancion();
        
        return cancion;
    }
    
    public static Cancion leerCancion (int id_recibido){
        
        Cancion cancion = Cancion.leerCancion(id_recibido);
        
        return cancion;
    }
    
    public static Cancion actualizarCancion(int id,  Autor autor, String nombre, int precio, String genero, int id_cancion, int duracion, int tiene_colaboracion){
        
        Cancion cancion = new Cancion(id, autor, nombre, precio, genero, id_cancion, duracion, tiene_colaboracion);
        cancion.actualizarCancion();
        
        return cancion;
    }
    
    
    public static void eliminarCancion(int id_producto){
        Cancion.eliminarCancion(id_producto);
    }
    
}
