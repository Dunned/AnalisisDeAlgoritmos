package alternativa;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Grafo {

    HashMap<Nodo, HashMap<Nodo, Arista>> mapa;
    int cantidadNodos = 0;

    public Grafo(HashMap<Nodo, HashMap<Nodo, Arista>> grafo) {
        this.mapa = grafo;
    }

    public Grafo() {
        this.mapa = new HashMap<Nodo, HashMap<Nodo, Arista>>();
    }

    public void insertarNodo(Nodo p) {
        mapa.put(p, p.obtenerNodosAdyacentes());
        cantidadNodos++;
    }

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

    public boolean existeNodo(String id) {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            if (entry.getKey().getId() == id) {
                return true;
            }
        }
        return false;
    }

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

    public Nodo obtenerNodo(String id) {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            if (entry.getKey().getId() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

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

    public void reiniciarColores() {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : mapa.entrySet()) {
            entry.getKey().getCirculo().setColor(Color.BLUE);
            for (Map.Entry<Nodo, Arista> relacion : entry.getKey().obtenerNodosAdyacentes().entrySet()) {
                relacion.getValue().setColor(Color.BLACK);
            }
        }
    }
}
