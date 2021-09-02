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
import alternativa.PlantaOxigeno;
import alternativa.Resultado;
import alternativa.Usuario;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduar
 */
public class SubVentanaMapaChaclacayo extends javax.swing.JPanel {

    Usuario usuario;
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    Nodo nodoFavorito = null;
    ArrayList<Arista> caminoRecorrido;
    ArrayList<PlantaOxigeno> plantasFavoritas;

    public SubVentanaMapaChaclacayo(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.plantasFavoritas = new ArrayList<PlantaOxigeno>();
        añadirFavorito.setVisible(false);
        creadoDeMapa();
    }

    /*
    case "A":
                numero = 0;
                break;
            case "B":
                numero = 1;
                break;
            case "C":
                numero = 2;
                break;
            case "D":
                numero = 3;
                break;
            case "E":
                numero = 4;
                break;
            case "F":
                numero = 5;
                break;
            case "G":
                numero = 6;
                break;
            case "H":
                numero = 7;
                break;
            case "I":
                numero = 8;
                break;
            case "J":
                numero = 9;
                break;
            case "K":
                numero = 10;
                break;
            case "L":
                numero = 11;
                break;
            case "M":
                numero = 12;
                break;
            case "N":
                numero = 13;
                break;
            case "O":
                numero = 14;
                break;
            case "P":
                numero = 15;
                break;
            case "Q":
                numero = 16;
                break;
            case "R":
                numero = 17;
                break;
            case "S":
                numero = 18;
                break;
            case "T":
                numero = 19;
                break;
            case "U":
                numero = 20;
                break;
            case "V":
                numero = 21;
                break;
            case "W":
                numero = 22;
                break;
            case "X":
                numero = 23;
                break;
            case "Y":
                numero = 24;
                break;
            case "Z":
                numero = 25;
                break;
     */

    private void creadoDeMapa() {
        /*PlantaOxigeno(String nombre
        , String rutaImagen, String Distrito
        , String Direccion1, String Direccion2
        , String numeroTelefono, String descripcion
        )*/
        caminoRecorrido = new ArrayList<Arista>();
        Nodo p1 = new Nodo("A", new Point(161, 347));
        Nodo p2 = new Nodo("B", new Point(333, 341));
        Nodo p3 = new Nodo("C", new Point(505, 341));
        Nodo p4 = new Nodo("D", new Point(711,205));
        Nodo p5 = new Nodo("E", new Point(592, 140));
        Nodo p6 = new Nodo("F", new Point(641,20));
        Nodo p7 = new Nodo("G", new Point(331, 38));
        Nodo p8 = new Nodo("H", new Point(217, 39));
        Nodo p9 = new Nodo("I", new Point(156, 97));
        Nodo p10 = new Nodo("J", new Point(100,35));
        Nodo p11 = new Nodo("K", new Point(11, 74));
        Nodo p12 = new Nodo("L", new Point(54, 180));
        Nodo p13 = new Nodo("M", new Point(54, 286));
        Nodo p14 = new Nodo("N", new Point(29, 397));
        Nodo p15 = new Nodo("O", new Point(176, 438));
        Nodo p16 = new Nodo("P", new Point(333, 436));
        Nodo p17 = new Nodo("Q", new Point(583,430));
        Nodo p18 = new Nodo("R", new Point(678,332));
        Nodo p19 = new Nodo("S", new Point(565,266));
        Nodo p20 = new Nodo("T", new Point(372,239));
        Nodo p21 = new Nodo("U", new Point(165,205));
        Nodo p22 = new Nodo("V", new Point(367,139));
        Nodo p23 = new Nodo("W", new Point(476,96));
        Nodo p24 = new Nodo("X", new Point(249,123));
        
        //Decidimos cuales son plantas de Oxigeno
        PlantaOxigeno a = new PlantaOxigeno("OXIGENO PATITAS",
                "\\imagenesLugares\\oxigenoPatitas.jpg", "CHACLACAYO",
                "URB. Miguel Grau Mz S Lote 19", "Av Integracion Mz S 19",
                "9997402359", "LOS MEJORES PRECIOS");

        PlantaOxigeno x = new PlantaOxigeno("OXIGENO PEDRO SANTO",
                "\\imagenesLugares\\oxigenoPedroSanto.jpg", "CHACLACAYO",
                "URB. Moron Chico", "Av Tiburoness Mz K Lote 20",
                "9997404265", "SIN COLAS NI AGLOMERACIONES");

        
        p1.setPlantaOxigeno(a);
        p24.setPlantaOxigeno(x);
        //
        //Insertamos todos los nodos
        grafo.insertarNodo(p1);
        grafo.insertarNodo(p2);
        grafo.insertarNodo(p3);
        grafo.insertarNodo(p4);
        grafo.insertarNodo(p5);
        grafo.insertarNodo(p6);
        grafo.insertarNodo(p7);
        grafo.insertarNodo(p8);
        grafo.insertarNodo(p9);
        grafo.insertarNodo(p10);
        grafo.insertarNodo(p11);
        grafo.insertarNodo(p12);
        grafo.insertarNodo(p13);
        grafo.insertarNodo(p14);
        grafo.insertarNodo(p15);
        grafo.insertarNodo(p16);
        grafo.insertarNodo(p17);
        grafo.insertarNodo(p18);
        grafo.insertarNodo(p19);
        grafo.insertarNodo(p20);
        grafo.insertarNodo(p21);
        grafo.insertarNodo(p22);
        grafo.insertarNodo(p23);
        grafo.insertarNodo(p24);
        
        //Conexiones A
        p1.insertarNodoAdyacente(p2, 5); //B
        p1.insertarNodoAdyacente(p13, 4); //M
        p1.insertarNodoAdyacente(p14, 2); //N
        p1.insertarNodoAdyacente(p15, 6); //O
        p1.insertarNodoAdyacente(p21, 10); //U
        //Conexiones B
        p2.insertarNodoAdyacente(p16, 10); //P
        p2.insertarNodoAdyacente(p3, 20); //C
        p2.insertarNodoAdyacente(p21, 5); //U
        p2.insertarNodoAdyacente(p20, 6); //T
        //Conexiones C
        p3.insertarNodoAdyacente(p16, 2); //p
        p3.insertarNodoAdyacente(p20, 3); //t
        p3.insertarNodoAdyacente(p17,  8); //q
        p3.insertarNodoAdyacente(p18, 11); //r
        //Conexiones Q
        p17.insertarNodoAdyacente(p18, 2);//r
        //Conexiones R
        p18.insertarNodoAdyacente(p19, 3); //S
        //Conexiones S
        p19.insertarNodoAdyacente(p4, 4); //D
        p19.insertarNodoAdyacente(p5, 5); //E
        p19.insertarNodoAdyacente(p23, 2);//W
        //Conexiones D
        p4.insertarNodoAdyacente(p6, 7); //F
        //Conexion F
        p6.insertarNodoAdyacente(p23, 4); //W
        //Conexion W
        p23.insertarNodoAdyacente(p7, 4); //G
        p23.insertarNodoAdyacente(p22, 2);//V
        //Conexion V
        p22.insertarNodoAdyacente(p19, 3); //S
        p22.insertarNodoAdyacente(p24, 5); //X
        //Nodo X
        p24.insertarNodoAdyacente(p8, 2); //H
        p24.insertarNodoAdyacente(p9, 5); // I 
        p24.insertarNodoAdyacente(p21, 3); //U
        //Nodo I
        p9.insertarNodoAdyacente(p10, 7); //J
        p9.insertarNodoAdyacente(p12, 6); //L
        //Nodo k
        p11.insertarNodoAdyacente(p12, 2);
        p11.insertarNodoAdyacente(p14, 5);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelMapa = new javax.swing.JPanel();
        labelMapa = new javax.swing.JLabel();
        añadirFavorito = new javax.swing.JButton();
        fondoMapaChaclacacyo = new javax.swing.JLabel();

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

        labelMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MapaChaclacayo.jpg"))); // NOI18N
        labelMapa.setPreferredSize(new java.awt.Dimension(960, 720));
        PanelMapa.add(labelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 464));

        jPanel1.add(PanelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 147, 740, 465));

        añadirFavorito.setText("favorito");
        añadirFavorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirFavoritoMouseClicked(evt);
            }
        });
        añadirFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirFavoritoActionPerformed(evt);
            }
        });
        jPanel1.add(añadirFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, -1, -1));

        fondoMapaChaclacacyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapaFondoChaclacayo.png"))); // NOI18N
        jPanel1.add(fondoMapaChaclacacyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1160, 870));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PanelMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMapaMouseClicked
        Point coodenada = evt.getPoint();
        System.out.println("" + (evt.getX() - 10) + "," + (evt.getY() - 10));
        if (grafo.existeNodo(coodenada.x, coodenada.y)) {
            if (nodoInicio == null) {
                añadirFavorito.setVisible(false);
                grafo.reiniciarColores();
                nodoInicio = grafo.obtenerNodo(coodenada.x, coodenada.y);
                nodoInicio.getCirculo().setColor(Color.YELLOW);
            } else {
                nodoFin = grafo.obtenerNodo(coodenada.x, coodenada.y);
                nodoFin.getCirculo().setColor(Color.GREEN);
                nodoFavorito = nodoFin;
                if (nodoFavorito.getPlantaOxigeno() != null) {
                    añadirFavorito.setVisible(true);
                }
                graficarResultado();
                Dijkstra dijkstra = new Dijkstra(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
                Resultado resultado = dijkstra.caminoMinimos(); //
                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
                caminoRecorrido = null;
            }
        } else {
            añadirFavorito.setVisible(false);
            nodoInicio = null;
            nodoFin = null;
            caminoRecorrido = null;
            grafo.reiniciarColores();
        }
        dibujarGrafo();
    }//GEN-LAST:event_PanelMapaMouseClicked

    private void añadirFavoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirFavoritoMouseClicked
        if (usuario.getPlantasFavoritas() == null) {
            this.plantasFavoritas.add(nodoFavorito.getPlantaOxigeno());
            JOptionPane.showMessageDialog(this, "SE AÑADIO A FAVORITOS: " + nodoFavorito.getPlantaOxigeno().getNombre());
            this.usuario.setPlantasFavoritas(this.plantasFavoritas);
        } else {
            if (!favoritoDuplicado()) {
                usuario.getPlantasFavoritas().add(nodoFavorito.getPlantaOxigeno());
                JOptionPane.showMessageDialog(this, "SE AÑADIO A FAVORITOS: " + nodoFavorito.getPlantaOxigeno().getNombre());
                añadirFavorito.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this, "LA PLANTA: " + nodoFavorito.getPlantaOxigeno().getNombre() + "Esta planta ya esta en Favoritos");
            }
        }
        añadirFavorito.setVisible(false);
    }//GEN-LAST:event_añadirFavoritoMouseClicked

    private void añadirFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirFavoritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirFavoritoActionPerformed

    private boolean favoritoDuplicado() {
        String nombre = nodoFavorito.getPlantaOxigeno().getNombre();
        for (PlantaOxigeno p : usuario.getPlantasFavoritas()) {
            if (p.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

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
    private javax.swing.JButton añadirFavorito;
    private javax.swing.JLabel fondoMapaChaclacacyo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMapa;
    // End of variables declaration//GEN-END:variables
}
