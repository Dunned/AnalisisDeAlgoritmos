package Codigo;

import java.io.Serializable;

public class PlantaOxigeno implements Serializable {

    private String nombre;
    private String rutaImagen;
    private String Distrito;
    private String Direccion1;
    private String Direccion2;
    private String numeroTelefono;
    private String descripcion;

    public PlantaOxigeno(String nombre, String rutaImagen) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }

    public PlantaOxigeno(String nombre, String rutaImagen, String Distrito, String Direccion1, String Direccion2, String numeroTelefono, String descripcion) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.Distrito = Distrito;
        this.Direccion1 = Direccion1;
        this.Direccion2 = Direccion2;
        this.numeroTelefono = numeroTelefono;
        this.descripcion = descripcion;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getDireccion1() {
        return Direccion1;
    }

    public void setDireccion1(String Direccion1) {
        this.Direccion1 = Direccion1;
    }

    public String getDireccion2() {
        return Direccion2;
    }

    public void setDireccion2(String Direccion2) {
        this.Direccion2 = Direccion2;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

}
