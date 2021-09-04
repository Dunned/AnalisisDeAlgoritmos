package pregunta1;

public class Factorial {

    //Contador para analizar eficiencia
    public static int contadorFactorial=0;

    public static int getContadorFactorial() {
        return contadorFactorial;
    }

    //Metodo de factorial por recursividad
    public static int factorial(int n){
        contadorFactorial++;
        if (n==1){
            return 1;
        }
        else {
            return (n*factorial(n-1));
        }
    }

    //Metodo de factorial iterativo
    public static int factorialIterativo(int n){
        contadorFactorial=1;
        int factorial=1;
        for (int i = n; i>1; i--) {
            contadorFactorial++;
            factorial=factorial*i;
        }
        return factorial;
    }
}
