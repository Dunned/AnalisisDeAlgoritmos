package Codigo;

import java.util.ArrayList;

public class Resultado {

    public int caminoMinimo;
    public ArrayList<Integer> caminoRecuperado;
    /**
     * DESCRIPCION: METODO CONSTRUCTOR PARA EL OBJETO RESULTADO.
     * @param caminoMinimo : PARAMETRO QUE CONTIENE EL VALOR DEL CAMINO MINIMO DE UNA DETERMINADA RUTA.
     * @param caminoRecuperado : PARAMETRO QUE CONTIENE UN ARRAYLIST DE LOS VALORES DEL CAMINO RECUPERADO DE UNA DETERMINADA RUTA.
     */
    public Resultado(int caminoMinimo, ArrayList<Integer> caminoRecuperado) {
        this.caminoMinimo = caminoMinimo;
        this.caminoRecuperado = caminoRecuperado;
    }
}
