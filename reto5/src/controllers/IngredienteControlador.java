package controllers;
import model.Ingredientes;
import java.util.ArrayList;

public class IngredienteControlador {
    
    public static ArrayList<Ingredientes> ingredientes = new ArrayList<>();
   
    
    public static Ingredientes crear_ingrediente(int id_ingrediente, String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega){
        Ingredientes nuevo_ingredientes = new Ingredientes(id_ingrediente,nombre,peso_promedio,nivel_reaccion,en_bodega);
        ingredientes.add(nuevo_ingredientes);
        return nuevo_ingredientes;
   
    }
    public static Ingredientes crear_ingrediente(String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega){
        Ingredientes nuevo_ingredientes = new Ingredientes(nombre,peso_promedio,nivel_reaccion,en_bodega);
        ingredientes.add(nuevo_ingredientes);
        return nuevo_ingredientes;

    }
    
    public static Ingredientes actualizarIngrediente(String nombre, double peso_promedio, double nivel_reaccion, boolean en_bodega, int id_ingrediente ){
        Ingredientes actualizarIngrediente = new Ingredientes(nombre, peso_promedio, nivel_reaccion, en_bodega,id_ingrediente);
        ingredientes.add(actualizarIngrediente);
        return actualizarIngrediente;
    }
    
    
}
