package alternativa;

import java.util.ArrayList;

public class Resultado {

    public int caminoMinimo;
    public ArrayList<Integer> caminoRecuperado;

    public Resultado(int caminoMinimo, ArrayList<Integer> caminoRecuperado) {
        this.caminoMinimo = caminoMinimo;
        this.caminoRecuperado = caminoRecuperado;
    }
}
