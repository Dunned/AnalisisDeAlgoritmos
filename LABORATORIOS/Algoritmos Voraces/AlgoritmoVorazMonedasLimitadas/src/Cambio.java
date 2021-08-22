public class Cambio {

    //S-->Conjunto Solucion 
    //V-->Conjunto de Monedas
    public void Voraz(int s[], Moneda[] v, double cambio) {
        double x; //Guardara momentaneamente la moneda a utilizar
        int pos;//Guarda en que pos del arreglo estamos
        int i = 0; //Contador para iterar entre el arreglo
        while (!Solucion(s, v, cambio) && i < s.length) {
            //No halla llegado al cambio y no me pase del arreglo
            x = v[i].valor; //Seleccionar moneda y guardar en x
            pos=i;
            if (Factible(s, v, cambio, x,pos)) //Comprabmaos si la moneda x se puede usar
            {
                s[i]++; //Aumentamos en 1 la cantidad del arreglo solucion
                v[pos].cantidad--; // Dismunuimos la cantidad de la moneda en 1
            } else {
                i++; //Rechazamos moneda y nos vamos a la siguiente pos de monedas
            }
        }
    }

    //Comprobar si ya se llego al cambio
    public boolean Solucion(int s[], Moneda[] v, double cambio) {
        double suma = 0.0; //Almacenar la suma 
        for (int i = 0; i < s.length; i++) { //Cuanto de cambio tenemos hasta ahora
            suma += s[i] * v[i].valor;
        }
        suma = Math.rint(suma * 100) / 100;
        if (suma == cambio) { //Si la suma es igual al cambio ya tenemos el objetivo
            return true;
        } else {
            return false;  //Aun no llegamos al cambio
        }
    }

    //Comprobamos si la moneda x puede ser agregada al cambio que tenemos acumulado
    public boolean Factible(int s[], Moneda[] v, double cambio, double x,int pos) {
        double suma = 0.0;
        for (int i = 0; i < s.length; i++) {
            suma += s[i] * v[i].valor;
        }
        suma = suma + x;
        suma = Math.rint(suma * 100) / 100;
        if (suma <= cambio) {
            if (v[pos].cantidad>0) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
