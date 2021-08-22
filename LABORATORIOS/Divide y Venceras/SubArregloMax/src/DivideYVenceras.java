
import java.util.Arrays;


public class DivideYVenceras {

    public int maxArray(int[] array,int inicio,int fin) {
        if (inicio==fin) {
            return array[inicio];
        } else {
            int mitad = (inicio+fin)/2;
            int sumaIzquierda=maxArray(array, inicio, mitad);
            int sumaDerecha=maxArray(array, mitad+1, fin);
            int sumaCentral=calcularMaxMitad(array,inicio,fin, mitad);
            return Math.max(Math.max(sumaIzquierda, sumaDerecha), sumaCentral);
        }
    }

    public int calcularMaxMitad(int[] array,int inicio,int fin, int mitad) {
        int suma = 0;
        int max_izq = array[mitad];
        for (int i = mitad; i >=inicio ; i--) {
            suma = suma + array[i];
            if (suma > max_izq) {
                max_izq = suma;
            }
        }
        suma = 0;
        int max_der = array[mitad+1];
        for (int i = mitad+1; i <=fin; i++) {
            suma = suma + array[i];
            if (suma > max_der) {
                max_der = suma;
            }
        }
        return max_izq + max_der;
    }

    
    public static void main(String[] args) {
        int[] arreglo = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        DivideYVenceras divideYVenceras = new DivideYVenceras();
        System.out.println(divideYVenceras.maxArray(arreglo,0,arreglo.length-1));
    }
}
