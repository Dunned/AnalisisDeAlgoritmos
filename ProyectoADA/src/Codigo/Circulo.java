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
     * DESCRIPCION: ESTE ES EL METODO CONSTRUCTOR PARA UN OBJETO CIRCULO.
     * @param coordenada : PARAMETRO PARA UBICAR EL CIRCULO EN EL PANEL.
     * @param etiqueta : PARAMETRO PARA NOMBRAR EL CIRCULO EN EL PANEL.
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
    /**
     * DESCRIPCION: ESTE METODO SIRVE PARA DIBUJAR EL CIRCULO EN EL PANEL.
     * @param g: OBJETO PARA DIBUJAR EN EL PANEL.
     */
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
    /**
     * DESCRIPCION: ESTE METODO SIRVE PARA DIBUJAR EL CIRCULO EN EL PANEL.
     * @param g: OBJETO PARA DIBUJAR EN EL PANEL.
     * @param remarcado: OBJETO PARA CAMBIAR EL COLOR DE UN NODO SELECCIONADO.
     */
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
    /**
     * DESCRIPCION: METODO PARA OBTENER EL DIAMETRO DEL CIRCULO.
     * @return : RETORNA EL DIAMETRO DEL CIRCULO.
     */
    public int getDiametro() {
        return diametro;
    }
    /**
     * DESCRIPCION: METODO PARA ESTABLECER EL COLOR DEL CIRCULO.
     * @param color: VARIABLE PARA ESTABLECER EL COLOR DEL CIRCULO.
     */
    public void setColor(Color color) {
        this.color = color;
    }
    /**
     * DESCRIPCION: METODO PARA VISUALIZAR EL NOMBRE DEL CIRCULO.
     * @return : RETORNA EL NOMBRE DEL CIRCULO.
     */
    public String getEtiqueta() {
        return etiqueta;
    }
    /**
     * DESCRIPCION: ESTE METODO SIRVE PARA ESTABLECER UNA CADENA DE CARACTERES COMO VALOR DE LA VARIABLE ETIQUETA.
     * @param etiqueta :PARAMETRO PARA NOMBRAR EL CIRCULO EN EL PANEL.
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    /**
     * DESCRIPCION: ESTE METODO SIRVE PARA ESTABLECER UN VALOR ENTERO COMO VALOR DE LA VARIABLE IZQUIERDA.
     * @param izquierda: PARAMETRO PARA REGULAR LA UBICACION DE LA ETIQUETA.
     */
    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

}
