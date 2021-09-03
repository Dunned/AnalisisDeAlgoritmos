package Codigo;

import Codigo.Convertidor;
import Codigo.Resultado;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Dijkstra {

    public long numeroOperaciones = 0;
    private int[][] matrizAdyacencia;
    //Para cada vertice 
    private int[] ultimo;
    private int[] costoMinimo;
    private boolean[] visitados;
    //
    private int idNodoInicio, idNofoFin, cantidadNodos;
    private ArrayList<Integer> caminoRecuperado;

    /**
     * DESCRIPCION: METODO CONTRUCTOR PARA DIJKSTRA
     *
     * @param matrizAdyacencia: MATRIZ DE ADYACENCIA DEL GRAFO
     * @param idNodoInicio: NODO DESDE DONDE SE PARTE
     * @param idNofoFin : NODO DONDE FINALIZA
     */
    public Dijkstra(int[][] matrizAdyacencia, int idNodoInicio, int idNofoFin) {
        this.matrizAdyacencia = matrizAdyacencia;
        this.cantidadNodos = matrizAdyacencia.length;
        this.idNodoInicio = idNodoInicio;
        this.idNofoFin = idNofoFin;
        this.ultimo = new int[cantidadNodos];
        this.costoMinimo = new int[cantidadNodos];
        this.visitados = new boolean[cantidadNodos];
        this.caminoRecuperado = new ArrayList<Integer>();
        this.numeroOperaciones = 0;
    }

    /**
     * DESCRIPCION: METODO PARA OBTENER EL CAMINO MINIMO POR ALGORITMO DE
     * DIJKSTRA
     *
     * @return RESULTADO : Es un Objeto que tiene como atributos un int(valor
     * del camini minimo) y un ArrayList que contiene los lugares por donde paso
     * ese camino minio
     */
    public Resultado caminoMinimos() {
        for (int i = 0; i < cantidadNodos; i++) {
            visitados[i] = false;
            costoMinimo[i] = matrizAdyacencia[idNodoInicio][i];
            ultimo[i] = idNodoInicio;
            this.numeroOperaciones = this.numeroOperaciones + 3;//
        }
        visitados[idNodoInicio] = true;
        costoMinimo[idNodoInicio] = 0;
        this.numeroOperaciones = this.numeroOperaciones + 2;//
        // Pasos para marcar los cantidadNodos-1 vértices
        for (int i = 0; i < cantidadNodos; i++) {
            int v = minimo();
            this.numeroOperaciones++;//
            /* selecciona vértice no marcadode menor distancia */
            visitados[v] = true;// actualiza distancia de vértices no marcados
            this.numeroOperaciones++;//
            for (int w = 0; w < cantidadNodos; w++) {
                if (!visitados[w]) {
                    this.numeroOperaciones++;
                    if ((costoMinimo[v] + matrizAdyacencia[v][w]) < costoMinimo[w]) {
                        costoMinimo[w] = costoMinimo[v] + matrizAdyacencia[v][w];
                        ultimo[w] = v;
                        this.numeroOperaciones = this.numeroOperaciones + 5;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(costoMinimo));
        int caminoMinimo = costoMinimo[idNofoFin];
        recuperaCamino(idNofoFin);
        Resultado resultado = new Resultado(caminoMinimo, caminoRecuperado);
        System.out.println(caminoRecuperado.toString());
        return resultado;
    }

    /**
     * DESCRIPCION: METODO PARA COMPRAR QUE DISTANCIA ES LA MEJOR DADO UN NODO ADYACENTE , ESTO PERMITE MARCARLO COMO VISITADO O PERMANENTE
     * @return Valor minimo de distancia para ese parcial camino
     */
    private int minimo() {
        int mx = Convertidor.infinito; //999
        int v = 0;
        for (int j = 0; j < cantidadNodos; j++) {
            if (!visitados[j] && (costoMinimo[j] <= mx)) {
                mx = costoMinimo[j];
                v = j;
                this.numeroOperaciones = this.numeroOperaciones + 4;
            }
        }
        return v;
    }

    /**
     * DESCRIPCION: METODO RECURSIVO QUE PERMITE RECUPERAR Y OBTENER EL ARRAYLIST QUE INDICA LOS NODOS POR DONDE PASA EL CAMINO MINIMO
     * @param v: NODO FIN , DESDE DONDE EMPEZARA A ITERAR
     */
    public void recuperaCamino(int v) {
        int anterior = ultimo[v];
        if (v != idNodoInicio) {
            recuperaCamino(anterior); // vuelve al último del último
            caminoRecuperado.add(v);
        } else {
            caminoRecuperado.add(v);
        }
    }

}
