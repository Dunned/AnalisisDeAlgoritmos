package Ventana;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class Arista {

    int x, y, x1, y1;
    int valor;
    float alpha = 0.6f;
    Color color= new Color((float) 0.7, (float) 0.9, (float) 0.1, alpha); //Red 

    public Arista(int valor, int x, int y, int x1, int y1) {
        this.x = x-2;
        this.y = y+10;
        this.x1 = x1-2;
        this.y1 = y1+10;
        this.valor = valor;
    }
    
    public void cambiarColor(Color color){
        this.color=color;
    }
    
    public boolean es(int x, int y, int x1, int y1) {
        if (this.x==x-2 && this.y==y+10 && this.x1==x1-2 && this.y1==y1+10 ) {
            return true;
        }
        return false;
    }

    public void paint(Graphics g,boolean trazar) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(color);   
        g2d.setStroke(new BasicStroke(3));
        drawArrowLine(g, x, y, x1, y1, 40, 6);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Tahoma", Font.BOLD, 30));
        g.drawString("" + valor, ((x + x1) / 2), ((y + y1) / 2));
    }

    private void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h) {
    int dx = x2 - x1, dy = y2 - y1;
    double D = Math.sqrt(dx*dx + dy*dy);
    double xm = D - d, xn = xm, ym = h, yn = -h, x;
    double sin = dy / D, cos = dx / D;

    x = xm*cos - ym*sin + x1;
    ym = xm*sin + ym*cos + y1;
    xm = x;

    x = xn*cos - yn*sin + x1;
    yn = xn*sin + yn*cos + y1;
    xn = x;

    int[] xpoints = {x2, (int) xm, (int) xn};
    int[] ypoints = {y2, (int) ym, (int) yn};

    g.drawLine(x1, y1, x2, y2);
    g.fillPolygon(xpoints, ypoints, 3);
}
}
