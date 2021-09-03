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
    /**
     * DESCRIPCION: METODO CONSTRUCTOR PARA EL OBJETO PLANTAOXIGENO.
     * @param nombre : PARAMETRO QUE CONTIENE EL NOMBRE DE LA PLANTA DE OXIGENO.
     * @param rutaImagen : PARAMETRO QUE CONTIENE LA RUTA DE LA IMAGEN DE LA PLANTA DE OXIGENO.
     */
    public PlantaOxigeno(String nombre, String rutaImagen) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }
    /**
     * DESCRIPCION: METODO CONSTRUCTOR PARA EL OBJETO PLANTAOXIGENO.
     * @param nombre : PARAMETRO QUE CONTIENE EL NOMBRE DE LA PLANTA DE OXIGENO.
     * @param rutaImagen : PARAMETRO QUE CONTIENE LA RUTA DE LA IMAGEN DE LA PLANTA DE OXIGENO.
     * @param Distrito : PARAMETRO QUE CONTIENE EL DISTRITO DE LA PLANTA DE OXIGENO.
     * @param Direccion1 : PARAMETRO QUE CONTIENE UNA DIRECCION DE LA PLANTA DE OXIGENO.
     * @param Direccion2 : PARAMETRO QUE CONTIENE OTRA DIRECCION DE LA PLANTA DE OXIGENO.
     * @param numeroTelefono : PARAMETRO QUE CONTIENE EL NUMERO TELEFONICO DE LA PLANTA DE OXIGENO.
     * @param descripcion  : PARAMETRO QUE CONTIENE LA DESCRIPCION DE LA PLANTA DE OXIGENO.
     */
    public PlantaOxigeno(String nombre, String rutaImagen, String Distrito, String Direccion1, String Direccion2, String numeroTelefono, String descripcion) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.Distrito = Distrito;
        this.Direccion1 = Direccion1;
        this.Direccion2 = Direccion2;
        this.numeroTelefono = numeroTelefono;
        this.descripcion = descripcion;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER EL DISTRITO DE LA PLANTA DE OXIGENO.
     * @return : RETORNA EL DISTRITO DEL USUARIO.
     */
    public String getDistrito() {
        return Distrito;
    }
    /**
     * DESCRIPCION : METODO PARA ESTABLECER EL DISTRITO DE LA PLANTA DE OXIGENO.
     * @param Distrito : PARAMETRO QUE CONTIENE EL DISTRITO DE LA PLANTA DE OXIGENO.
     */
    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER LA DIRECCION DE LA PLANTA DE OXIGENO.
     * @return : RETORNA LA DIRECCION DE LA PLANTA DE OXIGENO.
     */
    public String getDireccion1() {
        return Direccion1;
    }
    /**
     * DESCRIPCION : METODO PARA ESTABLECER LA DIRECCION DE LA PLANTA DE OXIGENO.
     * @param Direccion1 : PARAMETRO QUE CONTIENE LA DIRECCION DE LA PLANTA DE OXIGENO.
     */
    public void setDireccion1(String Direccion1) {
        this.Direccion1 = Direccion1;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER LA DIRECCION 2 DE LA PLANTA DE OXIGENO.
     * @return : RETORNA LA DIRECCION 2 DE LA PLANTA DE OXIGENO.
     */
    public String getDireccion2() {
        return Direccion2;
    }
    /**
     * DESCRIPCION : METODO PARA ESTABLECER LA DIRECCION 2 DE LA PLANTA DE OXIGENO.
     * @param Direccion2 : PARAMETRO QUE CONTIENE LA DIRECCION 2 DE LA PLANTA DE OXIGENO.
     */
    public void setDireccion2(String Direccion2) {
        this.Direccion2 = Direccion2;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER EL NUMERO TELEFONICO DE LA PLANTA DE OXIGENO.
     * @return : RETORNA EL NUMERO TELEFONICO DE LA PLANTA DE OXIGENO.
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    /**
     * DESCRIPCION : METODO PARA ESTABLECER EL NUMERO TELEFONICO DE LA PLANTA DE OXIGENO.
     * @param numeroTelefono : PARAMETRO QUE CONTIENE EL NUMERO TELEFONICO DE LA PLANTA DE OXIGENO.
     */
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER LA DESCRIPCION DE LA PLANTA DE OXIGENO.
     * @return : RETORNA LA DESCRIPCION DE LA PLANTA DE OXIGENO.
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * DESCRIPCION : METODO PARA ESTABLECER LA DESCRIPCION DE LA PLANTA DE OXIGENO.
     * @param descripcion : PARAMETRO QUE CONTIENE LA DESCRIPCION DE LA PLANTA DE OXIGENO.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER EL NOMBRE DE LA PLANTA DE OXIGENO.
     * @return : RETORNA EL NOMBRE DE LA PLANTA DE OXIGENO.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * DESCRIPCION : METODO PARA OBTENER LA RUTA DE LA FOTO DE LA PLANTA DE OXIGENO.
     * @return : RETORNA LA RUTA DE LA IMAGEN DE LA PLANTA DE OXIGENO.
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

}
