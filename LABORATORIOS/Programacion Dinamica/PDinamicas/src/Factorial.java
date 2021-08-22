

import java.util.Arrays;


public class Factorial {
    public static int recursivo(int n){
        System.out.println(n);
        if (n==0) {
            return 1;
        }
        else{
            return n*recursivo(n-1);
        }
    }
    
    public static int dinamico(int n,int[] arreglo){
            if (arreglo[n]!=-1) {
                System.out.println(Arrays.toString(arreglo));
                return arreglo[n];
            }
            else{
                int resultado=dinamico(n-1, arreglo)*n;
                arreglo[n]=resultado;
                System.out.println(Arrays.toString(arreglo));
                return arreglo[n];
            }
    }
    
    public static void main(String[] args) {
        System.out.println(recursivo(5));
        int[] arreglo=new int[6];//5
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]=-1;
        }
        arreglo[0]=1;
        System.out.println(dinamico(5, arreglo));
    }
}
