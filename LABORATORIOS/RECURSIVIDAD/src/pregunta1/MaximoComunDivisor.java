package pregunta1;

public class MaximoComunDivisor {

    //Contador para medir eficiencia
    public static int contadorMCD=0;

    public static int getContadorMCD() {
        return contadorMCD;
    }

    //Metodo con Recursividad
    public static int maximoComunDivisor(int n, int m){
        contadorMCD++;
        int mcd;
        if (n==m){
            mcd=n;
        }
        else {
            if (n>m){
                mcd=maximoComunDivisor(n-m,m);
            }
            else {
                mcd=maximoComunDivisor(n,m-n);
            }
        }
        return mcd;
    }

    //Metodo Iterativo
    public static int maximoComunDivisorIterativo(int n,int m){
        contadorMCD=1;
        int mcd;
        int resto;
        if (n==m){
            mcd=m;
            return mcd;
        }
        else {
            if (n>m){
                resto=n%m;
                while (resto!=0){
                    contadorMCD++;
                    n=m;
                    m=resto;
                    resto=n%m;
                }
                mcd=m;
                return mcd;
            }
            else {
                resto=m%n;
                while (resto!=0){
                    contadorMCD++;
                    m=n;
                    n=resto;
                    resto=m%n;
                }
                mcd=n;
                return mcd;
            }
        }
    }
}
