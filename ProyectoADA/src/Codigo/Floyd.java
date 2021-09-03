package Codigo;

import java.util.ArrayList;

public class Floyd {
    
    private int[][] matrizAdyacencia;
    private int idNodoInicio, idNofoFin,n;
    public long numeroOperaciones;

    public Floyd(int[][] matrizAdyacencia, int idNodoInicio, int idNofoFin) {
        this.matrizAdyacencia = matrizAdyacencia;
        this.idNodoInicio = idNodoInicio;
        this.idNofoFin = idNofoFin;
        this.n = matrizAdyacencia.length;
        this.numeroOperaciones=0;
    }
    
    /**
     * DESCRIPCION: METODO PARA HALLAR LA MATRIZ FINAL DE DISTANCIAS LUEGO DE LAS ITERACIONES QUE NOS INDICA EL CAMINO MINIMO PARA IR DE UN NODO A OTRO
     * @return RETORNA LA MATRIZ FINAL DE DISTANCIAS LUEGO LAS ITERACIONES NECESARIAS
     */
    public  int[][] hallarMatrizCaminosMinimos() {
        int[][] matriz = new int[n][n];
        int[][] matrizRecorrido = new int[n][n];
        this.numeroOperaciones=this.numeroOperaciones+2; //
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizAdyacencia[i][j];
                matrizRecorrido[i][j] = 0;
                this.numeroOperaciones=this.numeroOperaciones+2; //
            }
        }
        for (int k = 0; k < n; k++) {//Numero de iteraciones a dar
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][k] + matriz[k][j] < matriz[i][j]) {
                        matriz[i][j] = matriz[i][k] + matriz[k][j];
                        matrizRecorrido[i][j] = k + 1;
                        this.numeroOperaciones=this.numeroOperaciones+5; //
                    }
                }
            }
        }
        return matriz;
    }

    /**
     * DESCRIPCION: METODO PARA HALLAR LA MATRIZ DE NODOS POR DONDE PASO PARA RECONTRUIR EL TRAYECTO EFECTUADO PARA UN CAMINO MINIMO
     * @param matrizIncidencia: MATRIZ DE ADYACENCIA DEL GRAFO A EVALUAR
     * @return RETORNA LA MATRIZ FINAL DE NODOS POR DONDE PASO  LUEGO LAS ITERACIONES NECESARIAS
     */
    public  int[][] hallarMatrizRecorrido() {
        int[][] matriz = new int[n][n];
        int[][] matrizRecorrido = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizAdyacencia[i][j];
                matrizRecorrido[i][j] = -1;
            }
        }
        for (int k = 0; k < n; k++) {//Numero de iteraciones a dar
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][k] + matriz[k][j] < matriz[i][j]) {
                        matriz[i][j] = matriz[i][k] + matriz[k][j];
                        matrizRecorrido[i][j] = k;
                    }
                }
            }
        }

        return matrizRecorrido;
    }

    
    /**
     * METODO QUE DEVUELVE POR QUE PUNTOS PASAR PARA HALLAR EL CAMINO MINIMO
     * @param matrizRecorrido //MATRIZ DE RECORRIDO
     * @param acumulacionRecorrido // ARRAY DONDE SE GUARDA EL RECORRIDO
     * @param nodoInicio // NODO DONDE SE INICIA
     * @param nodoFin  // NODO DONDE FINALIZA
     */
    public  void hallarCamino(int[][] matrizRecorrido, ArrayList<Integer> acumulacionRecorrido, int nodoInicio, int nodoFin) {
        if (matrizRecorrido[nodoInicio][nodoFin] ==  -1) {
        } else {
            int posNodoInicio=acumulacionRecorrido.indexOf(nodoInicio);
            int posNodoFin=acumulacionRecorrido.indexOf(nodoFin);
            int nodoIntermedio = matrizRecorrido[nodoInicio][nodoFin];
            int posNodoIntermedio=(int) Math.ceil((double)(posNodoInicio+posNodoFin)/2);
            acumulacionRecorrido.add(posNodoIntermedio, nodoIntermedio);
            hallarCamino(matrizRecorrido, acumulacionRecorrido, nodoInicio, nodoIntermedio);
            hallarCamino(matrizRecorrido, acumulacionRecorrido, nodoIntermedio, nodoFin);
        }
    }
}
