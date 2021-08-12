package codigo;

import java.util.ArrayList;

public class Floyd {

    public static int[][] hallarMatrizCaminosMinimos(int[][] matrizIncidencia) {
        int n = matrizIncidencia.length;
        int[][] matriz = new int[n][n];
        int[][] matrizRecorrido = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizIncidencia[i][j];
                matrizRecorrido[i][j] = 0;
            }
        }
        for (int k = 0; k < n; k++) {//Numero de iteraciones a dar
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][k] + matriz[k][j] < matriz[i][j]) {
                        matriz[i][j] = matriz[i][k] + matriz[k][j];
                        matrizRecorrido[i][j] = k + 1;
                    }
                }
            }
        }
        return matriz;
    }

    public static int[][] hallarMatrizRecorrido(int[][] matrizIncidencia) {
        int n = matrizIncidencia.length;
        int[][] matriz = new int[n][n];
        int[][] matrizRecorrido = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizIncidencia[i][j];
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

    public static void hallarCamino(int[][] matrizRecorrido, ArrayList<Integer> acumulacionRecorrido, int nodoInicio, int nodoFin) {
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
