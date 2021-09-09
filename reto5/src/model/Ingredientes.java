package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import controllers.Conector;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ingredientes {
   //Parámetros
    private int id_ingrediente;
    private String nombre;
    private double peso_promedio;
    private double nivel_reaccion;
    private boolean en_bodega;//FALSO O VERDADERO
    // Constructor

    public Ingredientes(int id_ingrediente, String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega) {
        this.id_ingrediente = id_ingrediente;
        this.nombre = nombre;
        this.peso_promedio = peso_promedio;
        this.nivel_reaccion = nivel_reaccion;
        this.en_bodega = en_bodega;
        crear_ingrediente(id_ingrediente, nombre, peso_promedio, nivel_reaccion, en_bodega);
    }
    public Ingredientes(String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega) {
        this.nombre = nombre;
        this.peso_promedio = peso_promedio;
        this.nivel_reaccion = nivel_reaccion;
        this.en_bodega = en_bodega;
        crear_ingrediente(id_ingrediente, nombre, peso_promedio, nivel_reaccion, en_bodega);
    }

    public Ingredientes(String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega, int id_ingrediente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Create-Query para crear ingredientes
    public void crear_ingrediente(int id_ingrediente, String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega){
       String query = "INSERT INTO Ingredientes (id_ingrediente,nombre,peso_promedio,nivel_reaccion,en_bodega)VALUES(?,?,?,?,?)";
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query);
            statement.setInt(1, id_ingrediente);
            statement.setString(2, nombre);
            statement.setDouble(3, peso_promedio);
            statement.setDouble(4, nivel_reaccion);
            statement.setBoolean(5, en_bodega);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted != 0){
                System.out.println("Se creó un ingrediente");
            }
       }catch(SQLException ex){
            ex.printStackTrace();
                
        }
        
    }
public void crear_ingrediente(String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega){
       String query = "INSERT INTO Ingredientes (nombre,peso_promedio,nivel_reaccion,en_bodega)VALUES(?,?,?,?,?)";
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query);
            statement.setString(1, nombre);
            statement.setDouble(2, peso_promedio);
            statement.setDouble(3, nivel_reaccion);
            statement.setBoolean(4, en_bodega);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted != 0){
                System.out.println("Se creó un ingrediente");
            }
       }catch(SQLException ex){
            ex.printStackTrace();
            
                     
        }
        
    } 
//Read--Query para buscar ingredientes
public void leerIngrediente(int id_ingrediente, String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega) throws SQLException{
    String query = "SELECT * FROM ingredientes where id_ingredientes=? ";
    Statement statement = Conector.getConn().createStatement();
    ResultSet result = statement.executeQuery (query);
    int count = 0;

    while ( result.next ()){
        id_ingrediente = result.getInt (1);
        nombre = result.getString(2);
        peso_promedio = result.getDouble(3);
        nivel_reaccion = result.getDouble(4);
        en_bodega = result.getBoolean(5);
        System.out.println ("ID : " + id_ingrediente + "NOMBRE" + nombre +"PESO PROMEDIO" + peso_promedio + "NIVEL DE REACCION" + nivel_reaccion + "STOCK" + en_bodega);
    }
}

//Update--Query para actualizar ingredientes
       public void actualizarIngrediente(String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega, int id_ingrediente ){
       String query = "UPDATE Ingredientes SET nombre=? ,peso_promedio=? ,nivel_reaccion=? ,en_bodega=? WHERE id_ingrediente=? ";
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query);
            
            
            statement.setString(1, nombre);
            statement.setDouble(2, peso_promedio);
            statement.setDouble(3, nivel_reaccion);
            statement.setBoolean(4, en_bodega);
            statement.setInt(5, id_ingrediente);
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se a actualizado los datos de" + id_ingrediente );
            }
       }catch(SQLException ex){
            ex.printStackTrace();
                
        }
        
    }
//Delete--Query para eliminar ingredientes   
public void eliminarIngredientes(int id_ingrediente, String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega){
       String query = "DELETE FROM Ingredientes WHERE id_ingrediente=? ";
        try{
            PreparedStatement statement = Conector.getConn().prepareStatement(query);
            
            statement.setInt(1, id_ingrediente);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se a actualizado los datos de" + id_ingrediente );
            }
       }catch(SQLException ex){
            ex.printStackTrace();
                
        }
        
    }

    public int getId_ingrediente() {
        return id_ingrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso_promedio() {
        return peso_promedio;
    }

    public double getNivel_reaccion() {
        return nivel_reaccion;
    }

    public boolean isEn_bodega() {
        return en_bodega;
    }

    @Override
    public String toString() {
        return "Ingredientes{" + "id_ingrediente=" + id_ingrediente + ", nombre=" + nombre + ", peso_promedio=" + peso_promedio + ", nivel_reaccion=" + nivel_reaccion + ", en_bodega=" + en_bodega + '}';
    }


}

    