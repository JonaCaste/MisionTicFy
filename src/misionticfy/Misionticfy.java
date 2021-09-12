package misionticfy;

import controlador.Conector;
import vista.CancionVista;

public class Misionticfy {

    public static void main(String[] args) {
        // conectando la base datos
        Conector.conectar();
        
        //abrir la vista principal
        CancionVista vista = new CancionVista();
        vista.setVisible(true);
    }
    
}
