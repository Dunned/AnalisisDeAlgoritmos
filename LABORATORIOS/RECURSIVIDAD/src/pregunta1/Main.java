package pregunta1;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORIAL");
        System.out.println("\tpregunta1.Factorial de 6");
        System.out.println("\t\tMetodo recursivo:  "+Factorial.factorial(6)+" /eficiencia: "+Factorial.getContadorFactorial());
        System.out.println("\t\tMetodo Iterativo:  "+Factorial.factorialIterativo(6)+" /eficiencia: "+Factorial.getContadorFactorial());
        System.out.println("Maximo Comun Divisor");
        System.out.println("\tMCD de 450 y 360");
        System.out.println("\t\tMetodo recursivo:  "+MaximoComunDivisor.maximoComunDivisor(450,360)+" /eficiencia: "+MaximoComunDivisor.getContadorMCD());
        System.out.println("\t\tMetodo Iterativo:  "+MaximoComunDivisor.maximoComunDivisorIterativo(450,360)+" /eficiencia: "+MaximoComunDivisor.getContadorMCD());
        System.out.println("pregunta1.Fibonacci , termino numero 8");
        System.out.println("\tpregunta1.Factorial de 6");
        System.out.println("\t\tMetodo recursivo "+Fibonacci.fibonacci(6)+" /eficiencia: "+Fibonacci.getContadorFib());
        System.out.println("\t\tMetodo Iterativo "+Fibonacci.fibonacciIterativo(6)+" /eficiencia: "+Fibonacci.getContadorFib());
    }
}
