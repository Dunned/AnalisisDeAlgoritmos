/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Codigo.Arista;
import Codigo.Convertidor;
import Codigo.Dijkstra;
import Codigo.Grafo;
import Codigo.Nodo;
import Codigo.PlantaOxigeno;
import Codigo.Resultado;
import Codigo.Usuario;
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
public class SubVentanaMapaCieneguilla extends javax.swing.JPanel {

    Usuario usuario;
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    Nodo nodoFavorito = null;
    ArrayList<Arista> caminoRecorrido;
    ArrayList<PlantaOxigeno> plantasFavoritas;
    int recorridoTotal;

    public SubVentanaMapaCieneguilla(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.plantasFavoritas = new ArrayList<PlantaOxigeno>();
        botonAñadirFavorito.setVisible(false);
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
        //Creacion de Nodos
        
        //

        //Decidimos cuales son plantas de oxigeno
        /*PlantaOxigeno a = new PlantaOxigeno("PUREZA",
                "\\imagenesLugares\\oxigenoPatitas.jpg", "CHACLACAYO",
                "URB. Miguel Grau Mz S Lote 19", "Av Integracion Mz S 19",
                "9997402359", "LOS MEJORES PRECIOS");


        p1.setPlantaOxigeno(a);*/
        
        //Insertamos todos los nodos
        
        
        //CONEXIONES
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelMapa = new javax.swing.JPanel();
        labelMapa = new javax.swing.JLabel();
        botonAñadirFavorito = new javax.swing.JButton();
        etiquetaNodoOrigen = new javax.swing.JLabel();
        etiquetaRecorridoTotal = new javax.swing.JLabel();
        etiquetaNodoFin = new javax.swing.JLabel();
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

        labelMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapaCieneguilla.png"))); // NOI18N
        labelMapa.setPreferredSize(new java.awt.Dimension(960, 720));
        PanelMapa.add(labelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        jPanel1.add(PanelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 180, 770, 515));

        botonAñadirFavorito.setBackground(new java.awt.Color(255, 102, 102));
        botonAñadirFavorito.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        botonAñadirFavorito.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadirFavorito.setText("AGREGAR FAVORITO");
        botonAñadirFavorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirFavoritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAñadirFavoritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAñadirFavoritoMouseExited(evt);
            }
        });
        botonAñadirFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirFavoritoActionPerformed(evt);
            }
        });
        jPanel1.add(botonAñadirFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, 180, -1));

        etiquetaNodoOrigen.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etiquetaNodoOrigen.setForeground(new java.awt.Color(0, 153, 204));
        etiquetaNodoOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaNodoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 220, 60));

        etiquetaRecorridoTotal.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etiquetaRecorridoTotal.setForeground(new java.awt.Color(255, 204, 0));
        etiquetaRecorridoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaRecorridoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 220, 70));

        etiquetaNodoFin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etiquetaNodoFin.setForeground(new java.awt.Color(255, 51, 51));
        etiquetaNodoFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaNodoFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 220, 70));

        fondoMapaChaclacacyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoMapaB.png"))); // NOI18N
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
                etiquetaRecorridoTotal.setText("");
                etiquetaNodoOrigen.setText("");
                etiquetaNodoFin.setText("");
                botonAñadirFavorito.setVisible(false);
                grafo.reiniciarColores();
                nodoInicio = grafo.obtenerNodo(coodenada.x, coodenada.y);
                nodoInicio.getCirculo().setColor(Convertidor.colorNodoInicio);
                etiquetaNodoOrigen.setText(nodoInicio.getCirculo().getEtiqueta());
            } else {
                nodoFin = grafo.obtenerNodo(coodenada.x, coodenada.y);
                nodoFin.getCirculo().setColor(Convertidor.colorNodoFin);
                etiquetaNodoFin.setText(nodoFin.getCirculo().getEtiqueta());
                nodoFavorito = nodoFin;
                if (nodoFavorito.getPlantaOxigeno() != null) {
                    botonAñadirFavorito.setVisible(true);
                }
                graficarResultado();
                Dijkstra dijkstra = new Dijkstra(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
                Resultado resultado = dijkstra.caminoMinimos(); //
                etiquetaRecorridoTotal.setText(String.valueOf(recorridoTotal));
                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
                caminoRecorrido = null;
            }
        } else {
            botonAñadirFavorito.setVisible(false);
            nodoInicio = null;
            nodoFin = null;
            caminoRecorrido = null;
            etiquetaNodoOrigen.setText("");
            etiquetaNodoFin.setText("");
            etiquetaRecorridoTotal.setText("");
            grafo.reiniciarColores();
        }
        dibujarGrafo();
    }//GEN-LAST:event_PanelMapaMouseClicked


    private void botonAñadirFavoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirFavoritoMouseClicked
        if (usuario.getPlantasFavoritas() == null) {
            this.plantasFavoritas.add(nodoFavorito.getPlantaOxigeno());
            JOptionPane.showMessageDialog(this, "SE AÑADIO A FAVORITOS: " + nodoFavorito.getPlantaOxigeno().getNombre());
            this.usuario.setPlantasFavoritas(this.plantasFavoritas);
        } else {
            if (!favoritoDuplicado()) {
                usuario.getPlantasFavoritas().add(nodoFavorito.getPlantaOxigeno());
                JOptionPane.showMessageDialog(this, "SE AÑADIO A FAVORITOS: " + nodoFavorito.getPlantaOxigeno().getNombre());
                botonAñadirFavorito.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this, "LA PLANTA: " + nodoFavorito.getPlantaOxigeno().getNombre() + " YA ESTA EN FAVORITOS!");
            }
        }
        botonAñadirFavorito.setVisible(false);
    }//GEN-LAST:event_botonAñadirFavoritoMouseClicked

    private void botonAñadirFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirFavoritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAñadirFavoritoActionPerformed

    private void botonAñadirFavoritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirFavoritoMouseEntered
        botonAñadirFavorito.setBackground(new Color(255, 203, 58));
    }//GEN-LAST:event_botonAñadirFavoritoMouseEntered

    private void botonAñadirFavoritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirFavoritoMouseExited
        botonAñadirFavorito.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_botonAñadirFavoritoMouseExited

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

        recorridoTotal = resultado.caminoMinimo;
        System.out.println(recorridoTotal);

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
    private javax.swing.JButton botonAñadirFavorito;
    private javax.swing.JLabel etiquetaNodoFin;
    private javax.swing.JLabel etiquetaNodoOrigen;
    private javax.swing.JLabel etiquetaRecorridoTotal;
    private javax.swing.JLabel fondoMapaChaclacacyo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMapa;
    // End of variables declaration//GEN-END:variables
}
