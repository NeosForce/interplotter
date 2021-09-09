package model;

public class Pocion {//Parámetros
    private int id_pocion;
    private String nombre;
    private double litros_realizados;
    private int veces_utilizadas;
    private Escuela escuela;//Lo puedo usar por que está en el mismo paquete
    
    // Constructor

    public Pocion(int id_pocion, String nombre, double litros_realizados, int veces_utilizadas, Escuela escuela) {
        this.id_pocion = id_pocion;
        this.nombre = nombre;
        this.litros_realizados = litros_realizados;
        this.veces_utilizadas = veces_utilizadas;
        this.escuela = escuela;
    }

    public Pocion() {
        this.id_pocion = 0;
        this.nombre = null;
        this.litros_realizados = 0.0;
        this.veces_utilizadas = 0;
        
    }
    

    public int getId_pocion() {
        return id_pocion;
    }

    public void setId_pocion(int id_pocion) {
        this.id_pocion = id_pocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros_realizados() {
        return litros_realizados;
    }

    public void setLitros_realizados(double litros_realizados) {
        this.litros_realizados = litros_realizados;
    }

    public int getVeces_utilizadas() {
        return veces_utilizadas;
    }

    public void setVeces_utilizadas(int veces_utilizadas) {
        this.veces_utilizadas = veces_utilizadas;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
    
    
}
