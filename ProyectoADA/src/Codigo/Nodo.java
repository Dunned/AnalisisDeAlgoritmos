package Codigo;

import java.awt.Point;
import java.util.HashMap;

public class Nodo {

    private String id; //Identificador A,B,C...
    private PlantaOxigeno plantaOxigeno;
    private HashMap<Nodo, Arista> nodosAdyacentes;
    private Point coordenada;
    private Circulo circulo;
    /**
     * DESCRIPCION: METODO CONSTRUCTOR DEL OBJETO NODO.
     * @param id : PARAMETRO QUE CONTIENE EL ID DEL NODO.
     * @param po : PARAMETRO QUE CONTIENE LA PLANTA DE OXIGENO DEL NODO.
     * @param coordenada : PARAMETRO QUE CONTIENE LA COORDENADA DEL NODO.
     */
    public Nodo(String id, PlantaOxigeno po, Point coordenada) {
        this.id = id;
        this.plantaOxigeno = po;
        nodosAdyacentes = new HashMap<Nodo, Arista>();
        this.coordenada = coordenada;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER LA PLANTA DE OXIGENO DEL NODO.
     * @param plantaOxigeno : PARAMETRO QUE CONTIENE LA PLANTA DE OXIGENO DEL NODO.
     */
    public void setPlantaOxigeno(PlantaOxigeno plantaOxigeno) {
        this.plantaOxigeno = plantaOxigeno;
        this.circulo.setEtiqueta(this.plantaOxigeno.getNombre());
        this.circulo.setIzquierda(18);
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LA PLANTA DE OXIGENO DEL NODO.
     * @return : RETORNA LA PLANTA DE OXIGENO DEL NODO.
     */
    public PlantaOxigeno getPlantaOxigeno() {
        return plantaOxigeno;
    }
    /**
     * DESCRIPCION: METODO CONSTRUCTOR DEL OBJETO NODO.
     * @param id : PARAMETRO QUE CONTIENE EL ID DEL NODO.
     * @param coordenada : PARAMETRO QUE CONTIENE LA COORDENADA DEL NODO.
     */
    public Nodo(String id, Point coordenada) {
        this.id = id;
        this.coordenada = coordenada;
        nodosAdyacentes = new HashMap<Nodo, Arista>();
        this.plantaOxigeno = null;
        this.circulo = new Circulo(this.coordenada, this.id);
    }
    /**
     * DESCRIPCION: METODO PARA INSERTAR UN NODO ADYACENTE AL NODO.
     * @param adyacente : PARAMETRO QUE CONTIENE EL NODO ADYACENTE.
     * @param valor : PARAMETRO QUE CONTIENE EL VALOR DEL NODO.
     */
    public void insertarNodoAdyacente(Nodo adyacente, int valor) {
        Arista arista = new Arista(valor, this.coordenada, adyacente.coordenada);
        nodosAdyacentes.put(adyacente, arista);
        adyacente.insertarNodoAdyacente(this, valor, true);
    }
    /**
     * DESCRIPCION: METODO PARA INSERTAR UN NODO ADYACENTE AL NODO.
     * @param adyacente : PARAMETRO QUE CONTIENE EL NODO ADYACENTE.
     * @param valor : PARAMETRO QUE CONTIENE EL VALOR DEL NODO.
     * @param devuelta : PARAMETRO QUE CONTIENE EL VALOR DE DEVUELTA.
     */
    public void insertarNodoAdyacente(Nodo adyacente, int valor, boolean devuelta) {
        Arista arista = new Arista(valor, this.coordenada, adyacente.coordenada);
        this.nodosAdyacentes.put(adyacente, arista);
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LOS NODOS ADYACENTES AL NODO.
     * @return : RETORNA LOS NODOS ADYACENTES AL NODO.
     */
    public HashMap<Nodo, Arista> obtenerNodosAdyacentes() {
        return nodosAdyacentes;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL ID DEL NODO.
     * @return : RETORNA EL ID DEL NODO.
     */
    public String getId() {
        return id;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL CIRCULO DEL NODO.
     * @return : RETORNA EL CIRCULO DEL NODO.
     */
    public Circulo getCirculo() {
        return circulo;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LA COORDENADA DEL NODO.
     * @return : RETORNA LA COORDENADA DEL NODO.
     */
    public Point getCoordenada() {
        return coordenada;
    }
}
