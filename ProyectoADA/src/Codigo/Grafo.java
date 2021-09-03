package Codigo;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Grafo {

    public HashMap<Nodo, HashMap<Nodo, Arista>> mapa;
    int cantidadNodos = 0;
    /**
     * DESCRIPCION: METODO CONSTRUCTOR DEL OBJETO GRAFO.
     * @param grafo : PARAMETRO QUE CONTIENE EL GRAFO.
     */
    public Grafo(HashMap<Nodo, HashMap<Nodo, Arista>> grafo) {
        this.mapa = grafo;
    }
    /**
     * DESCRIPCION: METODO CONSTRUCTOR DEL OBJETO GRAFO.
     */
    public Grafo() {
        this.mapa = new HashMap<Nodo, HashMap<Nodo, Arista>>();
    }
    /**
     * DESCRIPCION: METODO PARA INSERTAR UN NODO AL GRAFO.
     * @param p : PARAMETRO QUE CONTIENE EL NODO.
     */
    public void insertarNodo(Nodo p) {
        mapa.put(p, p.obtenerNodosAdyacentes());
        cantidadNodos++;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER LA MATRIZ ADYACENTE.
     * @return : RETORNA LA MATRIZ ADYACENTE.
     */
    public int[][] obtenerMatrizAdyacencia() {
        int[][] matriz = new int[cantidadNodos][cantidadNodos];
        for (int i = 0; i < cantidadNodos; i++) {
            for (int j = 0; j < cantidadNodos; j++) {
                matriz[i][j] = Convertidor.infinito;
            }
        }

        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            int indice = Convertidor.letraANumero(entry.getKey().getId());
            for (Map.Entry<Nodo, Arista> relacion : entry.getKey().obtenerNodosAdyacentes().entrySet()) {
                int columna = Convertidor.letraANumero(relacion.getKey().getId());
                matriz[indice][columna] = relacion.getValue().getValor();
            }
        }
        return matriz;
    }
    /**
     * DESCRIPCION: METODO PARA COMPROBAR LA EXISTENCIA DE UN NODO EN EL GRAFO MEDIANTE SU ID.
     * @param id : PARAMETRO QUE CONTIENE EL ID DEL NODO.
     * @return : RETORNA UN VERDADERO O FALSO DEPENDIENDO DE LA EXISTENCIA DEL NODO EN EL GRAFO.
     */
    public boolean existeNodo(String id) {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            if (entry.getKey().getId() == id) {
                return true;
            }
        }
        return false;
    }
    /**
     * DESCRIPCION: METODO PARA COMPROBAR LA EXISTENCIA DE UN NODO EN EL GRAFO MEDIANTE SUS COORDENADAS.
     * @param x: PARAMETRO QUE CONTIENE LA COODENADA X DEL NODO.
     * @param y: PARAMETRO QUE CONTIENE LA COORDENADA Y DEL NODO.
     * @return : RETORNA VERDADERO O FALSO DEPENDIENDO DE LA EXISTENCIA DEL NODO EN EL GRAFO.
     */
    public boolean existeNodo(int x, int y) {
        boolean existe = false;
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            int xNodo = entry.getKey().getCoordenada().x;
            int yNodo = entry.getKey().getCoordenada().y;
            if (x > xNodo && x < (xNodo + entry.getKey().getCirculo().getDiametro())) {
                if (y > yNodo && y < (yNodo + entry.getKey().getCirculo().getDiametro())) {
                    existe = true;
                    break;
                }
            }
        }
        return existe;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER UN NODO MEDIANTE SU ID.
     * @param id: PARAMETRO QUE CONTIENE EL ID DEL NODO.
     * @return : RETORNA EL NODO O NADA DEPENDIENDO DE SI EL NODO EXISTE O NO.
     */
    public Nodo obtenerNodo(String id) {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            if (entry.getKey().getId() == id) {
                return entry.getKey();
            }
        }
        return null;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER UN NODO MEDIANTE SUS COORDENADAS.
     * @param x: PARAMETRO QUE CONTIENE LA COODENADA X DEL NODO.
     * @param y: PARAMETRO QUE CONTIENE LA COODENADA Y DEL NODO.
     * @return : RETORNA EL NODO AUXILIAR.
     */
    public Nodo obtenerNodo(int x, int y) {
        Nodo nodoAuxiliar = null;
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            int xNodo = entry.getKey().getCoordenada().x;
            int yNodo = entry.getKey().getCoordenada().y;
            if (x > xNodo && x < (xNodo + entry.getKey().getCirculo().getDiametro())) {
                if (y > yNodo && y < (yNodo + entry.getKey().getCirculo().getDiametro())) {
                    nodoAuxiliar = entry.getKey();
                    break;
                }
            }
        }
        return nodoAuxiliar;
    }
    /**
     * DESCRIPCION: METODO PARA IMPRIMIR LA MATRIZ.
     * @param matriz : PARAMETRO QUE CONTIENE LA MATRIZ.
     */
    public void imprimirMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    /**
     * DESCRIPCION: METODO PARA REINICIAR LOS COLORES DEL GRAFO.
     */
    public void reiniciarColores() {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            if (entry.getKey().getPlantaOxigeno() != null) { //Si ese nodo contiene una planta de Oxigeno
                entry.getKey().getCirculo().setColor(Convertidor.colorNodoPlanta);
            } else { //Si no contiene Planta Oxigeno
                entry.getKey().getCirculo().setColor(Convertidor.colorNodoNormal);
            }
            for (Map.Entry<Nodo, Arista> relacion : entry.getKey().obtenerNodosAdyacentes().entrySet()) {
                relacion.getValue().setColor(Convertidor.colorLineaDefecto);
            }
        }
    }
}
