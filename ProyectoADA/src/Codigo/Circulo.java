package Codigo;

import java.awt.*;
import java.io.Serializable;

public class Circulo implements Serializable {

    private Point coordenada;
    private Color color;
    private int diametro;
    private String etiqueta;
    private Font fuente;
    private int izquierda;
    private int grosorBorde;

    /**
     * Metodo Constructor para un Objeto Circulo
     *
     * @param coordenadas: Cordenada donde se ubicara el Objeto Circulo
     */
    public Circulo(Point coordenada, String etiqueta) {
        this.coordenada = coordenada;
        color = new Color(52, 59, 60);
        diametro = 18;
        this.etiqueta = etiqueta;
        fuente = new Font("Dialog", Font.BOLD, 16);
        izquierda = 0;
        grosorBorde = 3;
    }

    public void dibujarCirculo(Graphics g) {
        if (coordenada != null) {
            ((Graphics2D) g).setColor(color);
            ((Graphics2D) g).setStroke(new BasicStroke(grosorBorde));
            ((Graphics2D) g).fillOval(coordenada.x, coordenada.y, diametro, diametro);
            ((Graphics2D) g).setColor(Color.black); 
            ((Graphics2D) g).drawOval(coordenada.x, coordenada.y, diametro, diametro);
            if (!"".equals(etiqueta)) {
                if (fuente != null) {
                    g.setFont(fuente);
                }
                ((Graphics2D) g).setColor(Convertidor.colorEtiquetaNodo); //Color de etiqueta Nodo
                ((Graphics2D) g).drawString(etiqueta, coordenada.x + 5 - (izquierda), coordenada.y - 5);
                ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }
        }
    }

    public void dibujarCirculo(Graphics g, Color remarcado) {
        if (coordenada != null) {
            ((Graphics2D) g).setColor(remarcado);
            ((Graphics2D) g).setStroke(new BasicStroke(grosorBorde));
            ((Graphics2D) g).fillOval(coordenada.x - 10, coordenada.y - 10, diametro, diametro);
            ((Graphics2D) g).setColor(Color.BLACK);
            ((Graphics2D) g).drawOval(coordenada.x - 10, coordenada.y - 10, diametro, diametro);
            if (!"".equals(etiqueta)) {
                if (fuente != null) {
                    g.setFont(fuente);
                }
                ((Graphics2D) g).setColor(Convertidor.colorEtiquetaNodo); //Color de etiqueta Nodo
                ((Graphics2D) g).drawString(etiqueta, coordenada.x + 5 - (izquierda), coordenada.y - 5);
                ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }
        }
    }

    public int getDiametro() {
        return diametro;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

}
