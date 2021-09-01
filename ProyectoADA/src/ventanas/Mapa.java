/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import alternativa.Arista;
import alternativa.Convertidor;
import alternativa.Dijkstra;
import alternativa.Grafo;
import alternativa.Nodo;
import alternativa.Resultado;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eduar
 */
public class Mapa extends javax.swing.JPanel {

    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    ArrayList<Arista> caminoRecorrido;
    
    public Mapa() {
        initComponents();
        creadoDeMapa();
    }
    
    private void creadoDeMapa() {
        caminoRecorrido = new ArrayList<Arista>();
        Nodo p1 = new Nodo("A", new Point(253, 314));
        Nodo p2 = new Nodo("B", new Point(365, 315));
        Nodo p3 = new Nodo("C", new Point(647, 315));
        Nodo p4 = new Nodo("D", new Point(646, 560));
        Nodo p5 = new Nodo("E", new Point(480, 562));
        Nodo p6 = new Nodo("F", new Point(315, 570));
        Nodo p7 = new Nodo("G", new Point(210, 588));
        Nodo p8 = new Nodo("H", new Point(72, 619));
        Nodo p9 = new Nodo("I", new Point(265, 446));
        grafo.insertarNodo(p1);
        grafo.insertarNodo(p2);
        grafo.insertarNodo(p3);
        grafo.insertarNodo(p4);
        grafo.insertarNodo(p5);
        grafo.insertarNodo(p6);
        grafo.insertarNodo(p7);
        grafo.insertarNodo(p8);
        grafo.insertarNodo(p9);
        p1.insertarNodoAdyacente(p2, 3);
        p2.insertarNodoAdyacente(p3, 4);
        p3.insertarNodoAdyacente(p4, 5);
        p4.insertarNodoAdyacente(p5, 5);
        p5.insertarNodoAdyacente(p6, 7);
        p6.insertarNodoAdyacente(p7, 2);
        p7.insertarNodoAdyacente(p8, 5);
        p9.insertarNodoAdyacente(p6, 5);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelMapa = new javax.swing.JPanel();
        labelMapa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(960, 740));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMapaMouseClicked(evt);
            }
        });
        PanelMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapaA.jpg"))); // NOI18N
        labelMapa.setPreferredSize(new java.awt.Dimension(960, 720));
        PanelMapa.add(labelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        jPanel1.add(PanelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 960, 720));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("DISTRITO DE CHACLACAYO ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PanelMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMapaMouseClicked
        Point coodenada = evt.getPoint();
        System.out.println(evt.getX());
        System.out.println(evt.getY());
        if (grafo.existeNodo(coodenada.x, coodenada.y)) {
            if (nodoInicio == null) {
                System.out.println("seleccionasteinicio");
                grafo.reiniciarColores();
                nodoInicio = grafo.obtenerNodo(coodenada.x, coodenada.y);
                nodoInicio.getCirculo().setColor(Color.YELLOW);
            } else {
                System.out.println("seleccionastefin");
                nodoFin = grafo.obtenerNodo(coodenada.x, coodenada.y);
                nodoFin.getCirculo().setColor(Color.GREEN);
                graficarResultado();
                Dijkstra dijkstra = new Dijkstra(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
                Resultado resultado = dijkstra.caminoMinimos(); //
                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
                caminoRecorrido = null;
            }
        } else {
            nodoInicio = null;
            nodoFin = null;
            caminoRecorrido = null;
            grafo.reiniciarColores();
        }
        dibujarGrafo();
    }//GEN-LAST:event_PanelMapaMouseClicked

    
    private void dibujarGrafo() {
        PanelMapa.paint(PanelMapa.getGraphics());
        dibujarAristas();
        dibujarNodos();
    }

    private void dibujarNodos() {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : grafo.mapa.entrySet()) {
            entry.getKey().getCirculo().dibujarCirculo(PanelMapa.getGraphics());
        }
    }

    private void dibujarAristas() {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : grafo.mapa.entrySet()) {
            for (Map.Entry<Nodo, Arista> relacion : entry.getKey().obtenerNodosAdyacentes().entrySet()) {
                relacion.getValue().dibujarLinea(PanelMapa.getGraphics());
            }
        }
    }

    //Esta funcion inicia Dijstra en funcion al nodo inicio y nofo Fin
    private void graficarResultado() {
        caminoRecorrido = new ArrayList<Arista>();
        Dijkstra dijkstra = new Dijkstra(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
        Resultado resultado = dijkstra.caminoMinimos(); //
        int longitudCaminoMinimo = resultado.caminoMinimo;
        ArrayList<Integer> caminosPorDondePaso = resultado.caminoRecuperado;
        for (int i = (caminosPorDondePaso.size() - 1); i >= 1; i--) {
            int idNodoSucesor = caminosPorDondePaso.get(i);
            int idNodoAntecesor = caminosPorDondePaso.get(i - 1);
            Nodo nodoSucesor = grafo.obtenerNodo(Convertidor.numeroALetra(idNodoSucesor));
            Nodo nodoAntecesor = grafo.obtenerNodo(Convertidor.numeroALetra(idNodoAntecesor));
            caminoRecorrido.add(nodoSucesor.obtenerNodosAdyacentes().get(nodoAntecesor));
            caminoRecorrido.add(nodoAntecesor.obtenerNodosAdyacentes().get(nodoSucesor));
        }
        cambiarColorAristasPaso(caminoRecorrido);
    }

    private void cambiarColorAristasPaso(ArrayList<Arista> aristas) {
        for (Arista arista : aristas) {
            arista.setColor(Color.red);
        }
        System.out.println(aristas);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMapa;
    // End of variables declaration//GEN-END:variables
}
