package laboratorio001_semana02;

public class Laboratorio001<T> {

    private  int contadorTiempo; //Contador global para toda la clase

    public int getContadorTiempo() { //Muestra el valor del contador
        return contadorTiempo;
    }

    public void setContadorTiempo(int contadorTiempo) { //Nos sirve para reiniciar el contador
        this.contadorTiempo = contadorTiempo;
    }

    public int maximoComunDivisor(int a, int b) { //Funcion para hallar MCD
        setContadorTiempo(0); //reiniciamos el contador
        if (a == 0 || b == 0) { //Primer Caso a=0,b=0 --> MCD 0 ; A!=B (Uno de ellos puede ser 0)
            contadorTiempo++;
            if (a >= b) { //Nos retorna 0 siempre , sirve para cuando ambos son 0

                return a;
            } else return b; //Nos retorna el numero entero diferente 0, sirve cuando uno de los dos (A,b) es 0

        } else { if (a > b) { //A y b =! 0 , pero a es mayor
                int mcd = b; //sabemos que mcd siempre es como maximo el numero menor(b)
                while (mcd > 0) {
                    contadorTiempo++;
                    if (a % mcd == 0 && b % mcd == 0) { //buscara el maximo divisor comun entre a y b en el rango [b hasta 1]
                        return mcd;
                    }
                    mcd--;
                }

            //A y b =! 0 , pero b es mayor
        } else { int mcd = a; //sabemos que mcd siempre es como maximo el numero menor(a)
                while (mcd > 0) {
                    contadorTiempo++;
                    if (a % mcd == 0 && b % mcd == 0) { //buscara el maximo divisor comun entre a y b en el rango [a hasta 1]
                        return mcd;
                    }
                    mcd--;
                }
            }
        }

        return 0; //relleno , nunca llega hasta aqui
    }

    public boolean buscar(T[] array,T valor){ //recibe como parametro una clase generica
        setContadorTiempo(0); //reiniciamos el contador
        boolean encontrado=false;
        int i=0;
        while (encontrado==false && i<array.length){ //buscamos posision por posicion
            contadorTiempo++;
            if (array[i].equals(valor)){
                encontrado=true; //si se encuentra cambia el valor
                return true; // y se devuelve verdadero
            }
            i++;
        }
        return encontrado; // se devuelve falso si no encuentra nada
    }

    public String mostrarVector (T[] array){ //Metodo para mostrar contenido de vector generico
        String arreglo="";
        for (T valor:array) {
            arreglo=arreglo+valor.toString()+" , ";
        }
        return "["+arreglo+"]";
    }

}

