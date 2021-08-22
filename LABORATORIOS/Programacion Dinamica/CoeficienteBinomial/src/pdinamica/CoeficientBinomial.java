package pdinamica;

public class CoeficientBinomial {

    public static int recursivo(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else {
            return recursivo(n - 1, k - 1) + recursivo(n - 1, k);
        }
    }

    public static int dinamica(int n, int k) {
        int[][] matriz = new int[n + 1][k + 1]; //Inicializamos Matriz
        for (int i = 0; i <= n; i++) { //Rellenamos toda la primera columna de 1
            matriz[i][0] = 1;
        }
        for (int i = 1; i <= k; i++) { //Rellenamos la diagonal de 1
            matriz[i][i] = 1;
        }
        //Rellenamos el traingulo hasta donde sea necesario para hallar ese elemento
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                if (j <= k) {
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
            }
        }
        
        return matriz[n][k];

        /*Metodo para impirir matriz
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }*/
        //Exponentes  de a y b que acompañan al coeficiente
        /*int e = n, f = 0;
        for (int i = 1; i <= k; i++) {
            e--;
            f++;
        }
        //Si a es mayor a 0 se muestra , de lo contrario no
        String a = (e > 0) ? ("a^(" + e + ")") : "";
        //Si b es mayor a 0 se muestra , de lo contrario no
        String b = (f > 0) ? ("b^(" + f + ")") : "";
        //Retornamos coeficiente acompañado con los exponentes de a y b
        return matriz[n][k] + a + " " + b;
        */
    }

    public static String[] dinamicaCompleta(int n) {
        //Creamos matriz
        int[][] matriz = new int[n + 1][n + 1];
        //Rellenamos primera columna de 1
        for (int i = 0; i <= n; i++) {
            matriz[i][0] = 1;
        }
        //Rellenamos diagonal de 1
        for (int i = 1; i <= n; i++) {
            matriz[i][i] = 1;
        }
        //Empezamos a rellenar todo el triangulo de pascal
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        
        String[] contenido=new String[n+1];
        int e = n, f = 0;
        for (int i = 0; i <= n; i++) { 
            String a = (e > 0) ? ("a^(" + e + ")") : "";
            String b = (f > 0) ? ("b^(" + f + ")") : "";
            contenido[i]=matriz[n][i]+" "+a + " " + b;
            e--;
            f++;
        }
        return contenido;
    }

    public static void main(String[] args) {
        //System.out.println(recursivo(4, 2)); //(a+b)^(n=4) // tercer termino ==2
        System.out.println(recursivo(4, 4));
        System.out.println(dinamica(4, 5));
        System.out.println(dinamicaCompleta(4));
    }
}
