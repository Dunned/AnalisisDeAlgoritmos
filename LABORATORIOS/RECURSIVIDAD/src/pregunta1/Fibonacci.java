package pregunta1;

public class Fibonacci {

    //Contador para analizar la eficiencia
    public static int contadorFib=0;

    public static int getContadorFib() {
        return contadorFib;
    }

    //Metodo Recursivo
    public static int fibonacci(int n){
        contadorFib++;
        int fib;
        if (n<=1){
            fib=n;
        }
        else {
            fib=fibonacci(n-1)+fibonacci(n-2);
        }
        return fib;
    }

    //Metodo Iterativo
    public static int fibonacciIterativo(int n){
        contadorFib=1;
        int a=0;
        int b=1;
        int fib = a+b;
        int aux=0;
        if (n<=2){
            fib=1;
        }
        else {
            for (int i=3;i<=n;i++){
                contadorFib++;
                aux=a;
                a=b;
                b=fib;
                fib=+a+b;
            }
        }
        return fib;
    }
}
