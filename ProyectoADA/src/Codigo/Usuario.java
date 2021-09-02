package Codigo;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {

    private String dni;
    private String numeroCelular;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String rutaFoto;
    private ArrayList<PlantaOxigeno> plantasFavoritas;
    
    public Usuario(String dni, String numeroCelular, String nombre, String apellido, String contraseña, String ruta,ArrayList<PlantaOxigeno> plantasFavoritas) {
        this.dni = dni;
        this.numeroCelular = numeroCelular;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.rutaFoto = ruta;
        this.plantasFavoritas=plantasFavoritas;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public ArrayList<PlantaOxigeno> getPlantasFavoritas() {
        return plantasFavoritas;
    }

    public void setPlantasFavoritas(ArrayList<PlantaOxigeno> plantasFavoritas) {
        this.plantasFavoritas = plantasFavoritas;
    }

    public String getDni() {
        return dni;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getFoto() {
        return rutaFoto;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFoto(String ruta) {
        this.rutaFoto = ruta;
    }

}