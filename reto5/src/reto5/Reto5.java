
package reto5;

import view.Henry_Plotter;
import controllers.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Ingredientes;



public class Reto5 {

    
    public static void main(String[] args) throws SQLException {
        //Conexión
        Conector.conectar();
        //Abrir pantalla Henry_Plotter
        Henry_Plotter pantalla_henry_plotter = new Henry_Plotter();
        pantalla_henry_plotter.setVisible(true);              //Así:new Henry_Plotter().setVisible(true); se hace mas breve
        
        
        //query manual para lectura
    String query = "SELECT * FROM ingredientes";
    Statement statement = Conector.getConn().createStatement();
    ResultSet result = statement.executeQuery (query);
    int count = 0;
    while ( result.next ()){
        int id_ingredient = result.getInt (1);
        String nombr = result.getString(2);
        Double peso_promedi = result.getDouble (3);
        Double nivel_reaccio = result.getDouble (4);
        boolean en_bodeg = result.getBoolean (5);
        System.out.println ("ID : " + id_ingredient + " NOMBRE: " + nombr +" PESO PROMEDIO: " + peso_promedi + " NIVEL DE REACCION: " + nivel_reaccio + " STOCK: " + en_bodeg);
    }    
        
   
    }
    
}
