
import java.util.Arrays;

public class MergueSort {

    public void mergeSort(int[] a, int inicio, int fin) {
        if (inicio < fin) {//Si el arreglo es mayor a 1 elemento
            int mitad = (inicio + fin) / 2;
            mergeSort(a, inicio, mitad);
            mergeSort(a, mitad + 1, fin);
            fusionar(a, inicio, mitad, fin);
        }
    }

    private void fusionar(int[] a, int inicio, int mitad, int fin) {
        int i, j, k;
        int[] B = new int[a.length]; //array auxiliar
        for (i = inicio; i <= fin; i++) //copia ambas mitades en el array auxiliar                                       
        {
            B[i] = a[i];
        }
        i = inicio;
        j = mitad + 1;
        k = inicio;
        while (i <= mitad && j <= fin) //copia el siguiente elemento más grande                                      
        {
            if (B[i] <= B[j]) {
                a[k++] = B[i++];
            } else {
                a[k++] = B[j++];
            }
        }
        while (i <= mitad) //copia los elementos que quedan de la
        {
            a[k++] = B[i++]; //primera mitad (si los hay)
        }
    }
    
    public static void main(String[] args) {
        int[] arreglo = {1, 6, 4, 7, 5, 1, 3, 4, 0};
        System.out.println(Arrays.toString(arreglo));
        MergueSort mergueSort = new MergueSort();
        mergueSort.mergeSort(arreglo, 0, arreglo.length - 1);
        System.out.println(Arrays.toString(arreglo));
    }
}
