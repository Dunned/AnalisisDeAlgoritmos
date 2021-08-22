package alternativa;

import objetos.*;
import java.util.ArrayList;

public class Coordenadas extends ArrayList< int[]> {

    private int xMaxima;
    private int yMaxima;

    /**
     * Metodo Constructor por defecto para inicializar en 0 las Cordenadas
     */
    public Coordenadas() {
        this(0, 0);
    }

    /**
     * Metodo Constructor para inicializar atributos de una Cordenada
     *
     * @param xMaxima: Cordenada en x Max
     * @param yMaxima: Cordenada en y Max
     */
    public Coordenadas(int xMaxima, int yMaxima) {
        super();
        this.xMaxima = xMaxima;
        this.yMaxima = yMaxima;
    }

    /**
     * Metodo para establecer Cordenadas Maxima y Cordenada Especifica
     *
     * @param xMaxima: Cordenada en x Max
     * @param yMaxima: Cordenada en y max
     * @param x: Cordenada en x
     * @param y: Cordenada en y
     */
    public Coordenadas(int xMaxima, int yMaxima, int x, int y) {
        super();
        this.xMaxima = xMaxima;
        this.yMaxima = yMaxima;
        addCoordenada(x, y); //Se añade cordenada
    }

    /**
     * Metodo para añadir cordenada al ArrayList Cordenada
     *
     * @param x: Cordenada a establecer en x
     * @param y: Cordenada a establecer en y
     */
    public void addCoordenada(int x, int y) {
        if (x >= 0 && x <= xMaxima && y >= 0 && y <= yMaxima) {
            int[] parXY = {x, y};
            add(parXY);
        }
    }

    /**
     * Metodo para establecer la cordenada x Maxima
     *
     * @param xMaxima : valor x a establecer como Maximo
     */
    public void setXMaxima(int xMaxima) {
        this.xMaxima = xMaxima;
    }

    /**
     * Metodo para establecer la cordenada y Maxima
     *
     * @param yMaxima : valor y a establecer como Maximo
     */
    public void setYMaxima(int yMaxima) {
        this.yMaxima = yMaxima;
    }

    /**
     * Metodo para obtener Cordenada xMaxima
     *
     * @return valor numerico de la cordenada Maxima X
     */
    public int getxMaxima() {
        return xMaxima;
    }

    /**
     * Metodo para obtener Cordenada YMaxima
     *
     * @return valor numerico d ela cordenada Maxima Y
     */
    public int getyMaxima() {
        return yMaxima;
    }
}
