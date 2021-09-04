package pregunta2;

import java.util.Scanner;

public class TorresDeHannoi {
    //Contador para eficiencia
    private static int contadorTiempo=0;

    public static int getContadorTiempo() {
        return contadorTiempo;
    }

    //Metodo Recursivo
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        contadorTiempo++;
        if(n==1)
            System.out.println("mover disco de " + origen + " a " + destino);
        else{
            Hanoi(n-1, origen, destino, auxiliar);
            System.out.println("mover disco de "+ origen + " a " + destino);
            Hanoi(n-1, auxiliar, origen, destino);
        }
    }

    //metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
        System.out.println("Eficienci: "+TorresDeHannoi.getContadorTiempo());
    }
}
