public class Potencia {
    static long contador1=0;
    static long contado2=0;
    public long potencia(long x, long y) {
        contador1++;
        if (y == 0) {
            return 1;
        } else {
            if (y == 1) {
                return x;
            } else {
                long a = y / 2;
                long b = y % 2;
                long p = potencia(x, a);
                long q = potencia(x, b);
                return p*p*q;
            }
        }
    }
    
    public long potenciaNormal(int x,int y){
        long potencia=1;
        for(long i=0;i<y;i++){
             contado2++;
            potencia=potencia*x;
        }
        return potencia;
    }

    public static void main(String[] args) {
        Potencia potencia = new Potencia();
        long a = potencia.potencia(2, 20);
        System.out.println(a);
        System.out.println(contador1);
        long b = potencia.potenciaNormal(2, 20);
        System.out.println(b);
        System.out.println(contado2);
    }
}
