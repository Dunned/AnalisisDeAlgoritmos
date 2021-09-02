package Codigo;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dijkstra {

    private int[][] matrizAdyacencia;
    //Para cada vertice 
    private int[] ultimo;
    private int[] costoMinimo;
    private boolean[] visitados;
    //
    private int idNodoInicio,idNofoFin, cantidadNodos;
    private ArrayList<Integer> caminoRecuperado;

    public Dijkstra(int[][] matrizAdyacencia, int idNodoInicio, int idNofoFin) {
        this.matrizAdyacencia = matrizAdyacencia;
        this.cantidadNodos = matrizAdyacencia.length;
        this.idNodoInicio = idNodoInicio;
        this.idNofoFin = idNofoFin;
        this.ultimo = new int[cantidadNodos];
        this.costoMinimo = new int[cantidadNodos];
        this.visitados = new boolean[cantidadNodos];
        this.caminoRecuperado = new ArrayList<Integer>();
    }

    public Resultado caminoMinimos() {
        
        for (int i = 0; i < cantidadNodos; i++) {
            visitados[i] = false;
            costoMinimo[i] = matrizAdyacencia[idNodoInicio][i];
            ultimo[i] = idNodoInicio;
        }
        visitados[idNodoInicio] = true;
        costoMinimo[idNodoInicio] = 0;
        // Pasos para marcar los cantidadNodos-1 vértices
        for (int i = 0; i < cantidadNodos; i++) {
            int v = minimo();
            /* selecciona vértice no marcadode menor distancia */
            visitados[v] = true;// actualiza distancia de vértices no marcados
            for (int w = 0; w < cantidadNodos; w++) {
                if (!visitados[w]) {
                    if ((costoMinimo[v] + matrizAdyacencia[v][w]) < costoMinimo[w]) {
                        costoMinimo[w] = costoMinimo[v] + matrizAdyacencia[v][w];
                        ultimo[w] = v;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(costoMinimo));
        int caminoMinimo = costoMinimo[idNofoFin];
        recuperaCamino(idNofoFin);
        Resultado resultado=new Resultado(caminoMinimo,caminoRecuperado);
        System.out.println(caminoRecuperado.toString());
        return resultado;
    }

    private int minimo() {
        int mx = Convertidor.infinito; //999
        int v = 0;
        for (int j = 0; j < cantidadNodos; j++) {
            if (!visitados[j] && (costoMinimo[j] <= mx)) {
                mx = costoMinimo[j];
                v = j;
            }
        }
        return v;
    }

    public void recuperaCamino(int v) {
        int anterior = ultimo[v];
        if (v != idNodoInicio) {
            recuperaCamino(anterior); // vuelve al último del último
            caminoRecuperado.add(v);
        } else {
            caminoRecuperado.add(v);
        }
    }
    
    public static void imprimirMatriz(int[][] matriz) {
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
    
    public static void main(String[] args) {
        Grafo grafo=new Grafo();
        Nodo p1 = new Nodo("A", new Point(136, 427));
        Nodo p2 = new Nodo("B", new Point(373, 327));
        Nodo p3 = new Nodo("C", new Point(725, 303));
        Nodo p4 = new Nodo("D", new Point(494, 498));
        grafo.insertarNodo(p1);
        grafo.insertarNodo(p2);
        grafo.insertarNodo(p3);
        grafo.insertarNodo(p4);
        p1.insertarNodoAdyacente(p2, 3);
        p1.insertarNodoAdyacente(p4, 7);
        p2.insertarNodoAdyacente(p4, 2);
        p2.insertarNodoAdyacente(p3, 4);
        p3.insertarNodoAdyacente(p4, 5);
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : grafo.mapa.entrySet()) {
            System.out.print(entry.getKey().getId() + ": ");
            for (Map.Entry<Nodo, Arista> relacion : entry.getKey().obtenerNodosAdyacentes().entrySet()) {
                System.out.print("("+relacion.getKey().getId() + "/" + relacion.getValue().getValor()+")"  );
            }
            System.out.println("");
        }
        imprimirMatriz(grafo.obtenerMatrizAdyacencia());
        Dijkstra dijkstra=new Dijkstra(grafo.obtenerMatrizAdyacencia(),2,0);
        dijkstra.caminoMinimos();
    }
}

