/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    private static Connection conn;//conn es un atributo (tipo variable) de tipo connection 

                  
        public static void conectar(){
            String dbURL = "jdbc:mysql://localhost:3306/reto5";
            String username = "root";
            String password = "gaomon94";
            try{//POR SEGURIDAD EL TRY CATCH
                conn = DriverManager.getConnection(dbURL, username, password);
                if(conn != null){
                    System.out.println("Connect open");
                }
        }catch(SQLException ex){
            ex.printStackTrace();
            
        } 
            
    }

    public static Connection getConn() {
        return conn;
    }
    
}
