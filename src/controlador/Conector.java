package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    private static Connection conn;
    
    public static void conectar(){
        String dbURL = "jdbc:mysql://localhost:3306/...";
        String username = "...";
        String password = "...";
        try{
            conn = DriverManager.getConnection(dbURL, username, password);
            if(conn != null){
                System.out.println("CONECTADO");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } 
    }

    public static Connection getConn() {
        return conn;
    }
}
