package problemadelamochila;

public class Mochila {

    public static int[][] obtenerMatrizMaximoBeneficio(Objeto[] objetos, int pesoMochila) {
        int nObjetos = objetos.length; //Numero total de objetos
        int[][] matriz = new int[nObjetos + 1][pesoMochila + 1];
        //Inicializamos matriz
        for (int i = 0; i < nObjetos + 1; i++) {
            for (int j = 0; j < pesoMochila + 1; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 1; i <= pesoMochila; i++) { //Iterar entre columnas que simulan peso de mochila 
            for (int j = 1; j <= nObjetos; j++) { //iteramos entre filas que simulan los objetos 
                if (i >= objetos[j - 1].peso) { //Si el objeto actual entra en la mochila de peso i
                    int columnaNoMeterNada = i - objetos[j - 1].peso; //Obtenemos la columnna de la matriz donde se obtieene el maximo beneficio para mochila de i-PesoObjetoActual
                    if (matriz[j - 1][i] < matriz[j - 1][columnaNoMeterNada] + objetos[j - 1].beneficio) { //Si el beneficio al introducir objeto es mayot al beneficio anterior maximo
                        matriz[j][i] = matriz[j - 1][columnaNoMeterNada] + objetos[j - 1].beneficio; //Asignamos nuevo beneficio
                    } else {
                        matriz[j][i] = matriz[j - 1][i]; //Beneficio se mantiene
                    }
                } else {
                    matriz[j][i] = matriz[j - 1][i]; //copiamos beneficio anterior
                }
            }
        } 
        return matriz;
    }
    
    public static String obtenerObjetosUtilizados(Objeto[] objetos,int[][] matrizBeneficio){
        String objetosUtilizados="*";
        int i=objetos.length;
        int j=matrizBeneficio[0].length-1;
        for(int k=1;k<=objetos.length;k++){ //Se repetira la cantidad de veces el numero de objetos+4 
            boolean cambio=false;
            if (matrizBeneficio[i][j]!=matrizBeneficio[i-1][j]) { //Si hubbo cambio en beneficio maximo , se incluye ese objeto
                cambio=true;
            }
            if (cambio==true) { //Si hubo cambio se agrega al string y se retrocede hasta la columna antes de agregar objeto
                objetosUtilizados=objetosUtilizados+(i-1)+"*"; //se agrega el indice al string
                j=j-objetos[i-1].peso; //cambiamos de columna
            }
            else{
            }
            i--;
        }
        String filtro=objetosUtilizados.replace("*",""); // se filtra el string para que retorno solo las pos
        return filtro;
    }

    public static void main(String[] args) {
        Objeto objeto1 = new Objeto(1, 2);
        Objeto objeto2 = new Objeto(3, 5);
        Objeto objeto3 = new Objeto(4, 10);
        Objeto objeto4 = new Objeto(5, 14);
        Objeto objeto5 = new Objeto(7, 15);
        Objeto objeto6 = new Objeto(7, 15);
        Objeto[] objetos = {objeto1, objeto2, objeto3, objeto4, objeto5,objeto6};
        int pesoMochila = 8; //Peso maximo para la mochila
        int[][] matriz = Mochila.obtenerMatrizMaximoBeneficio(objetos, pesoMochila);
        Mochila.obtenerObjetosUtilizados(objetos, matriz);
    }
}
