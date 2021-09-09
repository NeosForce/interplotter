package model;

public class Receta {
    //Parámetros
    private Receta receta;
    private Pocion pocion;
    private Ingredientes ingrediente;//Lo puedo usar así porque está en el mismo paquete.
 
  
  //Constructor

    public Receta(Receta receta, Pocion pocion, Ingredientes ingrediente) {
        this.receta = receta;
        this.pocion = pocion;
        this.ingrediente = ingrediente;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Pocion getPocion() {
        return pocion;
    }

    public void setPocion(Pocion pocion) {
        this.pocion = pocion;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }
    
}
