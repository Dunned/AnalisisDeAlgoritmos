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
    /**
     * DESCRIPCION: METODO CONSTRUCTOR PARA UN OBJETO USUARIO
     * @param dni : PARAMETRO STRING PARA REGISTRAR EL DNI DEL USUARIO.
     * @param numeroCelular: PARAMETRO STRING PARA REGISTRAR EL NUMERO DE CELULAR DEL USUARIO.
     * @param nombre: PARAMETRO STRING PARA REGISTRAR EL NOMBRE DEL USUARIO.
     * @param apellido: PARAMETRO STRING PARA REGISTRAR EL APELLIDO DEL USUARIO.
     * @param contraseña: PARAMETRO STRING PARA REGISTRAR LA CONTRASEÑA DEL USUARIO.
     * @param ruta: PARAMETRO STRING PARA REGISTAR LA RUTA DEL USUARIO. 
     * @param plantasFavoritas: PARAMETRO ARRAYLIST PARA REGISTRAR LAS PLANTAS FAVORITAS DEL USUARIO.
     */
    public Usuario(String dni, String numeroCelular, String nombre, String apellido, String contraseña, String ruta,ArrayList<PlantaOxigeno> plantasFavoritas) {
        this.dni = dni;
        this.numeroCelular = numeroCelular;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.rutaFoto = ruta;
        this.plantasFavoritas=plantasFavoritas;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LA RUTA DE LA FOTO DEL USUARIO.
     * @return : RETORNA LA RUTA DE LA FOTO DEL USUARIO.
     */
    public String getRutaFoto() {
        return rutaFoto;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER LA RUTA DE LA FOTO DEL USUARIO.
     * @param rutaFoto : PARAMETRO QUE CONTIENE LA RUTA DE LA FOTO DEL USUARIO.
     */
    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LAS PLANTAS FAVORITAS DEL USUARIO
     * @return : RETONA LAS PLANTAS FAVORITAS DEL USUARIO CONTENIDAD EN EL ARRAYLIST PLANTASFAVORITAS.
     */
    public ArrayList<PlantaOxigeno> getPlantasFavoritas() {
        return plantasFavoritas;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER LAS PLANTAS FAVORITAS DEL USUARIO.
     * @param plantasFavoritas : PARAMETRO QUE CONTIENE LAS PLANTAS FAVORITAS DEL USUARIO.
     */
    public void setPlantasFavoritas(ArrayList<PlantaOxigeno> plantasFavoritas) {
        this.plantasFavoritas = plantasFavoritas;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL DNI DEL USUARIO.
     * @return : RETORNA EL DNI DEL USUARIO.
     */
    public String getDni() {
        return dni;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL NUMERO DE CELULAR DEL USUARIO.
     * @return : RETORNA EL NUMERO CELULAR DEL USUARIO.
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL NOMBRE DEL USUARIO.
     * @return : RETORNA EL NOMBRE DEL USUARIO.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL APELLIDO DEL USUARIO.
     * @return : RETORNA EL APELLIDO DEL USUARIO.
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LA CONTRASEÑA DEL USUARIO.
     * @return : RETORNA LA CONTRASEÑA DEL USUARIO.
     */
    public String getContraseña() {
        return contraseña;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LA FOTO DEL USUARIO.
     * @return : RETORNA LA FOTO DEL USUARIO.
     */
    public String getFoto() {
        return rutaFoto;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER EL DNI DEL USUARIO.
     * @param dni : PARAMETRO QUE CONTIENE EL DNI DEL USUARIO.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER EL NUMERO CELULAR DEL USUARIO.
     * @param numeroCelular : PARAMETRO QUE CONTIENE EL NUMERO CELULAR DEL USUARIO.
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER EL NOMBRE DEL USUARIO.
     * @param nombre : PARAMETRO PARA ESTABLECER EL NOMBRE DEL USUARIO.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER EL APELLIDO DEL USUARIO.
     * @param apellido : PARAMETRO QUE CONTIENE EL APELLIDO DEL USUARIO.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER LA CONTRASEÑA DEL USUARIO.
     * @param contraseña : PARAMETRO QUE CONTIENE LA CONTRASEÑA DEL USUARIO.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER LA RUTA DE LA FOTO DEL USUARIO.
     * @param ruta : PARAMETRO QUE CONTIENE LA RUTA DE LA FOTO DEL USUARIO.
     */
    public void setFoto(String ruta) {
        this.rutaFoto = ruta;
    }

}
