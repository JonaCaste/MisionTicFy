package modelo;

import controlador.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cancion extends Producto{
    
    //atributos
    private int id;
    private int duracion;
    private int tiene_colaboracion;
    
    //objeto para devolver al leer
    private static Cancion x;

    
    //constructor
    public Cancion(int id, Autor autor, String nombre, int precio, String genero, int id_cancion, int duracion, int tiene_colaboracion) {
        super(id, autor, nombre, precio, genero);
        this.id = id_cancion;
        this.duracion = duracion;
        this.tiene_colaboracion = tiene_colaboracion;
    }
    
    public void crearCancion(){
        
        //insertamos datos del producto
        //INSERT INTO producto(nombre, precio, genero, autor_id) VALUES ("Honey, no estás", 1500, "Pop", 1);
        String query_producto = "INSERT INTO producto(nombre, precio, genero, autor_id) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query_producto);
            statement.setString(1, nombre);
            statement.setInt(2, precio);
            statement.setString(3, genero);
            statement.setInt(4, autor.getId());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se creó el producto");
            }
            System.out.println("Dato guardado");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Error al guardar los datos");
        }
        
        //insertamos datos de la cancion
        //INSERT INTO cancion(producto_id, duracion, tiene_colaboracion) VALUES (1, 270, 0);
        String query_cancion = "INSERT INTO cancion(producto_id, duracion, tiene_colaboracion) VALUES (?,?,?)";
        
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query_cancion);
            statement.setInt(1, this.id);
            statement.setInt(2, duracion);
            statement.setInt(3, tiene_colaboracion);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se creó la cancion");
            }
            System.out.println("Dato guardado");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Error al guardar los datos");
        }
    }

    
    public static Cancion leerCancion(int id_recibido){
        
        String query = "SELECT cancion.producto_id, producto.nombre, producto.precio, producto.genero, duracion, tiene_colaboracion, autor.id FROM cancion JOIN producto on producto_id = producto.id JOIN autor on producto.autor_id = autor.id WHERE producto_id =" + id_recibido +";";
        try{
            Statement statement = Conector.getConn().createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id_cancion = result.getInt(1);
                String nombre = result.getString(2);
                int precio = result.getInt(3);
                String genero = result.getString(4);
                int duracion = result.getInt(5);
                int tiene_colaboracion = result.getInt(6);
                int id_autor = result.getInt(7);
                
                Autor autor = new Autor(id_autor, "", "");
                
                Cancion cancion_leida = new Cancion(0, autor, nombre, precio, genero, id_cancion, duracion, tiene_colaboracion);
                
                x = cancion_leida;
                
                System.out.println("cancion leida");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }     
        
        return x;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public int getTieneColaboracion(){
        return tiene_colaboracion;
    }
    
    public int getIdAutor(){
        return autor.getId();
    }
    
    
    
    public void actualizarCancion(){
        
        
        //actualizamos datos del producto
        String query_producto = "UPDATE producto SET precio = ?, genero = ? WHERE id = ? ";
        
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query_producto);
            statement.setInt(1, precio);
            statement.setString(2, genero);
            statement.setInt(3, this.id);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se actualizo el producto");
            }
            System.out.println("Dato guardado");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Error al guardar los datos");
        }
        
        //actualizamos datos de la cancion
        String query_cancion = "UPDATE cancion SET duracion = ?, tiene_colaboracion = ? WHERE producto_id = ? ";
        
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query_cancion);
            statement.setInt(1, duracion);
            statement.setInt(2, tiene_colaboracion);
            statement.setInt(3, this.id);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se actualizo la cancion");
            }
            System.out.println("Dato guardado");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Error al guardar los datos");
        }
    }
    
    
    public static void eliminarCancion(int id_producto){
        
        //cancion
        String query_cancion = "DELETE FROM cancion WHERE producto_id = ?";
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query_cancion);
            statement.setInt(1, id_producto);
            int rowsInserted = statement.executeUpdate();
            System.out.println("Se eliminaron " + rowsInserted + " líneas de cancion");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        //producto
        String query_producto = "DELETE FROM producto WHERE id = ?";
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query_producto);
            statement.setInt(1, id_producto);
            int rowsInserted = statement.executeUpdate();
            System.out.println("Se eliminaron " + rowsInserted + " líneas de producto");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
}
