

import java.util.Arrays;

public class Fibonacci {

    public static int recursivo(int n) {
        System.out.println("fib(" + n + ")");
        if (n <= 1) {
            return n;
        } else {
            return recursivo(n - 1) + recursivo(n - 2);
        }
    }

    public static int memoizacion(int n, int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
        if (arreglo[n] != -1) {
            return arreglo[n];
        } else {
            if (n <= 1) {
                arreglo[n] = n;
                return n;
            } else {

                int resultado = memoizacion(n - 1, arreglo) + memoizacion(n - 2, arreglo);
                arreglo[n] = resultado;
                return resultado;
            }
        }
    }

    public static int dinamico(int n) {
        int[] arreglo = new int[n + 1];
        arreglo[0] = 0;
        arreglo[1] = 1; 
        for (int i = 2; i < n + 1; i++) {
            arreglo[i] = arreglo[i - 1] + arreglo[i - 2];
            System.out.println(Arrays.toString(arreglo));
        }
        return arreglo[n];
    }

    public static void main(String[] args) {
        System.out.println(recursivo(10));
        int n = 10;
        int[] arreglo = new int[n + 1];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = -1;
        }
        System.out.println(memoizacion(n, arreglo));
        System.out.println(dinamico(10));
    }
}
