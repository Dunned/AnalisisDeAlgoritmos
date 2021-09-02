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
    private Color color = Color.BLACK;
    private float grosorLinea = 4f;

    public Arista(int valor, Point origen, Point fin) {
        this.valor = valor;
        this.origen = origen;
        this.fin = fin;
    }

    public void dibujarLinea(Graphics g) {
        ((Graphics2D) g).setColor(this.color);
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(grosorLinea);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(origen.x+10, origen.y+10, fin.x+10, fin.y+10);
        ((Graphics2D) g).setColor(Color.BLACK);
        Font fuente = new Font("Verdana", Font.BOLD, 20);
        g.setFont(fuente);
        int xMenor = menor(origen.x, fin.x);
        int yMenor = menor(origen.y, fin.y);
        int xMayor = mayor(origen.x, fin.x);
        int yMayor = mayor(origen.y, fin.y);
        int distanciaVertical = yMayor - yMenor-4;
        int distanciaHorizontal = xMayor - xMenor+40;
        ((Graphics2D) g).drawString(valor + "", (distanciaHorizontal / 2) + xMenor, (distanciaVertical / 2) + yMenor);
    }

    private int mayor(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }

    private int menor(int n1, int n2) {
        return (n1 < n2) ? n1 : n2;
    }

    public int getValor() {
        return valor;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
