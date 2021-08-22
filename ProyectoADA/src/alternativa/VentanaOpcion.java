/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternativa;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eduar
 */
public class VentanaOpcion extends javax.swing.JFrame {

    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    ArrayList<Arista> caminoRecorrido;

    public VentanaOpcion() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        prueba();
    }

    private void prueba() {
        caminoRecorrido = new ArrayList<Arista>();
        Nodo p1 = new Nodo("A", new Point(136, 427));
        Nodo p2 = new Nodo("B", new Point(373, 327));
        Nodo p3 = new Nodo("C", new Point(725, 303));
        Nodo p4 = new Nodo("D", new Point(494, 498));
        grafo.insertarNodo(p1);
        grafo.insertarNodo(p2);
        grafo.insertarNodo(p3);
        grafo.insertarNodo(p4);
        p1.insertarNodoAdyacente(p2, 3);
        p1.insertarNodoAdyacente(p4, 1);
        p2.insertarNodoAdyacente(p4, 2);
        p2.insertarNodoAdyacente(p3, 4);
        p3.insertarNodoAdyacente(p4, 5);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mapa1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mapa1.setBackground(new java.awt.Color(204, 255, 51));
        Mapa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mapa1MouseClicked(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Mapa1Layout = new javax.swing.GroupLayout(Mapa1);
        Mapa1.setLayout(Mapa1Layout);
        Mapa1Layout.setHorizontalGroup(
            Mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mapa1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(625, Short.MAX_VALUE))
        );
        Mapa1Layout.setVerticalGroup(
            Mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mapa1Layout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(Mapa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(Mapa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mapa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mapa1MouseClicked
        Point coodenada = evt.getPoint();
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
    }//GEN-LAST:event_Mapa1MouseClicked

    private void dibujarGrafo() {
        Mapa1.paint(Mapa1.getGraphics());
        dibujarAristas();
        dibujarNodos();
    }

    private void dibujarNodos() {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : grafo.mapa.entrySet()) {
            entry.getKey().getCirculo().dibujarCirculo(Mapa1.getGraphics());
        }
    }

    private void dibujarAristas() {
        for (Map.Entry<Nodo, HashMap<Nodo, Arista>> entry : grafo.mapa.entrySet()) {
            for (Map.Entry<Nodo, Arista> relacion : entry.getKey().obtenerNodosAdyacentes().entrySet()) {
                relacion.getValue().dibujarLinea(Mapa1.getGraphics());
            }
        }
    }

    //Esta funcion inicia Dijstra en funcion al nodo inicio y nofo Fin
    private void graficarResultado() {
        caminoRecorrido = new ArrayList<Arista>();
        Dijkstra dijkstra = new Dijkstra(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
        Resultado resultado = dijkstra.caminoMinimos(); //
        int longitudCaminoMinimo = resultado.caminoMinimo;
        System.out.println("GAA" + longitudCaminoMinimo);
        ArrayList<Integer> caminosPorDondePaso = resultado.caminoRecuperado;
        for (int i = (caminosPorDondePaso.size() - 1); i >= 1; i--) {
            System.out.println("dadada");
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
            arista.setColor(Color.yellow);
        }
        System.out.println(aristas);
    }

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Nodo nodo = grafo.obtenerNodo("C");
        nodo.getCirculo().dibujarCirculo(Mapa1.getGraphics(), Color.red);
        Point coodenada = nodo.getCoordenada();
        System.out.println(coodenada.x + "/" + coodenada.y);
    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOpcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mapa1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
