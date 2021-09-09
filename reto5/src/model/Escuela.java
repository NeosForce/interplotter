package model;

public class Escuela {
    private int id_escuela;
    private String nombre;
    private String habilidad_principal;
    private int anios_de_servicio;
    private String creador;
    private String fecha_creacion;
    
    //Contructor

    public Escuela(int id_escuela, String nombre, String habilidad_principal, int anios_de_servicio, String creador, String fecha_creacion) {
        this.id_escuela = id_escuela;
        this.nombre = nombre;
        this.habilidad_principal = habilidad_principal;
        this.anios_de_servicio = anios_de_servicio;
        this.creador = creador;
        this.fecha_creacion = fecha_creacion;
    }

    public Escuela() { //CREO CONSTRUCTO
        this.id_escuela = 0;
        this.nombre = null;
        this.habilidad_principal = null;
        this.anios_de_servicio = 0;
        this.creador = null;
        this.fecha_creacion = null;
        
    }
    
        
    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad_principal() {
        return habilidad_principal;
    }

    public void setHabilidad_principal(String habilidad_principal) {
        this.habilidad_principal = habilidad_principal;
    }

    public int getAnios_de_servicio() {
        return anios_de_servicio;
    }

    public void setAnios_de_servicio(int anios_de_servicio) {
        this.anios_de_servicio = anios_de_servicio;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
}
