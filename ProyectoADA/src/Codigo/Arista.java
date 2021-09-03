package Codigo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.io.Serializable;
import sun.java2d.loops.DrawLine;

public class Arista implements Serializable {

    private int valor;
    private Point origen;
    private Point fin;
    private Color color = Convertidor.colorLineaDefecto;
    private float grosorLinea = 2.8f;
    /**
     * DESCRIPCION: METODO CONSTRUCTOR PARA CREAR UN OBJETO ARISTA.
     * @param valor : PARAMETRO PARA ESTABLECER UN VALOR ENTERO A LA VARIABLE VALOR.
     * @param origen: PARAMETRO PARA ESTABLECER UN VALOR PUNTO A LA VARIABLE ORIGEN.
     * @param fin : PARAMETRO PARA ESTABLECER UN VALOR PUNTO A LA VARIABLE FIN.
     */
    public Arista(int valor, Point origen, Point fin) {
        this.valor = valor;
        this.origen = origen;
        this.fin = fin;
    }
    /**
     * DESCRIPCION: METODO PARA DIBUJAR UNA LINEA EN EL PANEL.
     * @param g :OBJETO PARA DIBUJAR EN EL PANEL.
     */
    public void dibujarLinea(Graphics g) {
        ((Graphics2D) g).setColor(this.color);
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(grosorLinea);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(origen.x+10, origen.y+10, fin.x+10, fin.y+10);
        ((Graphics2D) g).setColor(Color.BLACK);
        Font fuente = new Font("Arial", Font.BOLD, 17);
        g.setFont(fuente);
        int xMenor = menor(origen.x+10, fin.x+10);
        int yMenor = menor(origen.y+10, fin.y+10);
        int xMayor = mayor(origen.x+10, fin.x+10);
        int yMayor = mayor(origen.y+10, fin.y+10);
        int distanciaVertical = yMayor - yMenor;
        int distanciaHorizontal = xMayor - xMenor;
        ((Graphics2D) g).drawString(valor + "", (distanciaHorizontal / 2) + xMenor-6, (distanciaVertical / 2) + yMenor+5);
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL VALOR MAYOR ENTRE LAS VARIABLES N1 Y N2.
     * @param n1: PARAMETRO QUE REPRESENTA LA UBICACION DE UN PUNTO DEL EXTREMO DEL CIRCULO.
     * @param n2: PARAMETRO QUE REPRESENTA LA UBICACION DE OTRO PUNTO DEL EXTREMO DEL CIRCULO.
     * @return : RETORNA EL VALOR MAYOR.
     */
    private int mayor(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL VALOR MENOR ENTRE LAS VARIABLES N1 Y N2.
     * @param n1: PARAMETRO QUE REPRESENTA LA UBICACION DE UN PUNTO DEL EXTREMO DEL CIRCULO.
     * @param n2: PARAMETRO QUE REPRESENTA LA UBICACION DE OTRO PUNTO DEL EXTREMO DEL CIRCULO.
     * @return : RETORNA EL VALOR MENOR. 
     */
    private int menor(int n1, int n2) {
        return (n1 < n2) ? n1 : n2;
    }
    /**
     * DESCRIPCION: METODO PARA OBTENER EL VALOR DE LA ARISTA.
     * @return : RETORNA EL VALOR DE LA ARISTA.
     */
    public int getValor() {
        return valor;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER EL COLOR DE LA ARISTA.
     * @param color : PARAMETRO QUE REPRESENTA EL COLOR DE LA ARISTA.
     */
    public void setColor(Color color) {
        this.color = color;
    }

}
