package Ventana;

import codigo.Grafo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JPanel;

public class Panel extends JPanel {

    ArrayList<Vertice> vertices;
    ArrayList<Arista> aristas;
    char cantVert;
    Grafo grafo1;
    boolean trazar = false;
    HashMap<Character, Point> conjunto;

    Panel(Grafo grafo1) {
        this.grafo1 = grafo1;
        cantVert = grafo1.ultimoVertice();
        this.setSize(800, 370);
        this.setLocation(80, 70);
        this.setBackground(new Color(103,150,193));
        vertices = new ArrayList();
        aristas = new ArrayList();
        crearMapa();
    }

    public void trazar(boolean opcion, char[] aristas) {
        trazar = opcion;
        this.removeAll();
        cambiarColor(aristas);
        repaint();
    }

    public void reiniciar() {
        this.grafo1 = grafo1;
        cantVert = grafo1.ultimoVertice();
        this.setSize(800, 370);
        this.setLocation(80, 70);
        this.setBackground(new Color(103,150,193));
        vertices = new ArrayList();
        aristas = new ArrayList();
        crearMapa();
    }

    public void cambiarColor(char[] aristas) {
        for (int j = 0; j < aristas.length - 1; j++) {
            for (int i = 0; i < this.aristas.size(); i++) {
                if (this.aristas.get(i).es(conjunto.get(aristas[j]).x, conjunto.get(aristas[j]).y, conjunto.get(aristas[j + 1]).x, conjunto.get(aristas[j + 1]).y)) {
                    this.aristas.get(i).color = Color.red;
                }
            }
        }
    }

    public void crearVertice(char v, int x, int y) {
        vertices.add(new Vertice(v, x, y));
    }

    public void crearArista(int d, int x, int y, int x1, int y1) {
        aristas.add(new Arista(d, x, y, x1, y1));
    }

    public void crearMapa() {
        conjunto = new HashMap<Character, Point>();
        //Creamos Vertices
        //VERTICE A
        crearVertice('A', 100, 50);
        conjunto.put('A', new Point(100, 50));
        //Vertica B
        crearVertice('B', 400, 80);
        conjunto.put('B', new Point(400, 80));
        //Vertica C
        crearVertice('C', 200, 200);
        conjunto.put('C', new Point(200, 200));
        //Vertica D
        crearVertice('D', 60, 300);
        conjunto.put('D', new Point(60, 300));
        //Vertica E
        crearVertice('E', 620, 320);
        conjunto.put('E', new Point(620, 320));
        //Vertica F
        crearVertice('F', 700, 100);
        conjunto.put('F', new Point(700, 100));
        //Vertica G
        crearVertice('G', 450, 200);
        conjunto.put('G', new Point(450, 200));
         //Vertica H
        crearVertice('H', 750, 250);
        conjunto.put('H', new Point(750, 250));
        for (char v = 'A'; v <= cantVert; v++) {
            HashMap<Character, Integer> relacion = grafo1.getVertice(v);
            for (char u = 'A'; u <= cantVert; u++) {
                int d = 0;
                try {
                    d = relacion.get(u);
                } catch (Exception e) {
                    continue;
                }
                if (d != 0) {
                    crearArista(d, conjunto.get(v).x, conjunto.get(v).y, conjunto.get(u).x, conjunto.get(u).y);
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).paint(g);
        }
        for (int i = 0; i < aristas.size(); i++) {
            aristas.get(i).paint(g, trazar);
        }
        this.repaint();
    }

}
