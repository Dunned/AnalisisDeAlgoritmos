
public class MultiplicacionEnterosGrandes {

    public int multiplica(int x, int y) {
        int n = Math.max(numeroCifras(x), numeroCifras(y));
        if (x == 0 || y == 0) {
            return 0;
        } else {
            if (n == 1) { //es pequeño
                return x * y;
            } else {
                //Debemos obtener xi,xd,yi,yd
                int s = n / 2;
                //x=abcd
                int xi = (x / (10 ^ s));  //=ab
                int xd = x % (10 ^ s);  //=cd
                //y=pqrs
                int yi = (int) (y / Math.pow(10, s));  //=pq
                int yd = (int) (y % Math.pow(10, s));  //=rs
                int p1 = multiplica(xi, yi);
                int p2 = multiplica(xi, yd);
                int p3 = multiplica(xd, yi);
                int p4 = multiplica(xd, yd);
                //Combinamos
                return (int) (p1 * Math.pow(10, 2 * s) + (p2 + p3) * Math.pow(10, s) + p4);
            }
        }
    }

    public int multiplicaOptimizado(int x, int y) {
        int n = Math.max(numeroCifras(x), numeroCifras(y));
        if (x == 0 || y == 0) {
            return 0;
        } else {
            if (n == 1) { //es pequeño
                return x * y;
            } else {
                //Debemos obtener xi,xd,yi,yd
                int s = n / 2;
                //x=abcd
                int xi = (int) (x / Math.pow(10, s));  //=ab
                int xd = (int) (x % Math.pow(10, s));  //=cd
                //y=klmn
                int yi = (int) (y / Math.pow(10, s));  //=kl
                int yd = (int) (y % Math.pow(10, s));  //=mn
                int r = multiplicaOptimizado(xi + xd, yi + yd);
                int p = multiplicaOptimizado(xi, yi);
                int q = multiplicaOptimizado(xd, yd);
                //Combinamos
                return (int) (p * Math.pow(10, 2 * s) + (r - p - q) * Math.pow(10, s) + q);
            }
        }

    }
    //Metodo para contar el numero de cifras de un numero
    private int numeroCifras(int numero) {
        int nCifras = 0;
        while (numero > 0) {
            numero = numero / 10;
            nCifras++;
        }
        return nCifras;
    }

}
