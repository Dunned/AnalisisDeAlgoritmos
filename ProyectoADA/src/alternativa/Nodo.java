package alternativa;

import java.awt.Point;
import java.util.HashMap;

public class Nodo {

    private String id; //Identificador A,B,C...
    private PlantaOxigeno plantaOxigeno;
    private HashMap<Nodo, Arista> nodosAdyacentes;
    private Point coordenada;
    private Circulo circulo;

    public Nodo(String id, PlantaOxigeno po, Point coordenada) {
        this.id = id;
        this.plantaOxigeno = po;
        nodosAdyacentes = new HashMap<Nodo, Arista>();
        this.coordenada = coordenada;
    }

    public void setPlantaOxigeno(PlantaOxigeno plantaOxigeno) {
        this.plantaOxigeno = plantaOxigeno;
    }

    public PlantaOxigeno getPlantaOxigeno() {
        return plantaOxigeno;
    }

    public Nodo(String id, Point coordenada) {
        this.id = id;
        this.coordenada = coordenada;
        nodosAdyacentes = new HashMap<Nodo, Arista>();
        this.plantaOxigeno = null;
        this.circulo = new Circulo(this.coordenada, this.id);
    }

    public void insertarNodoAdyacente(Nodo adyacente, int valor) {
        Arista arista = new Arista(valor, this.coordenada, adyacente.coordenada);
        nodosAdyacentes.put(adyacente, arista);
        adyacente.insertarNodoAdyacente(this, valor, true);
    }

    public void insertarNodoAdyacente(Nodo adyacente, int valor, boolean devuelta) {
        Arista arista = new Arista(valor, this.coordenada, adyacente.coordenada);
        this.nodosAdyacentes.put(adyacente, arista);
    }

    public HashMap<Nodo, Arista> obtenerNodosAdyacentes() {
        return nodosAdyacentes;
    }

    public String getId() {
        return id;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public Point getCoordenada() {
        return coordenada;
    }
}
