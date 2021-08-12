package Ventana;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Vertice {
    Color color;
    Random r=new Random();
    int x,y;
    char nombre;
    
    public Vertice(char nombre, int x, int y) {
        color=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        this.x = x-20;
        this.y = y-20;
        this.nombre = nombre;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,50,50);
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 20));
        g.drawString(""+nombre,x+17,y+17);
    }
}
