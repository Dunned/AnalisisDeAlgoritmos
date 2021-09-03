/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Codigo.Arista;
import Codigo.Convertidor;
import Codigo.Dijkstra;
import Codigo.Floyd;
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

    private void creadoDeMapa() {
        /*PlantaOxigeno(String nombre
        , String rutaImagen, String Distrito
        , String Direccion1, String Direccion2
        , String numeroTelefono, String descripcion
        )*/
        caminoRecorrido = new ArrayList<Arista>();
        //Creacion de Nodos
        Nodo p1 = new Nodo("A", new Point(365, 80));
        Nodo p2 = new Nodo("B", new Point(524, 57));
        Nodo p3 = new Nodo("C", new Point(461, 144));
        Nodo p4 = new Nodo("D", new Point(268, 153));
        Nodo p5 = new Nodo("E", new Point(253, 254));
        Nodo p6 = new Nodo("F", new Point(121, 342));
        Nodo p7 = new Nodo("G", new Point(260, 427));
        Nodo p8 = new Nodo("H", new Point(353, 337));
        Nodo p9 = new Nodo("I", new Point(492, 364));
        Nodo p10 = new Nodo("J", new Point(488, 429));
        Nodo p11 = new Nodo("K", new Point(618, 429));
        Nodo p12 = new Nodo("L", new Point(699, 366));
        Nodo p13 = new Nodo("M", new Point(671, 206));
        Nodo p14 = new Nodo("N", new Point(489, 261));
        Nodo p15 = new Nodo("O", new Point(612, 112));
        Nodo p16 = new Nodo("P", new Point(711, 45));
        Nodo p17 = new Nodo("Q", new Point(463, 16));
        Nodo p18 = new Nodo("R", new Point(274, 18));
        Nodo p19 = new Nodo("S", new Point(121, 50));
        Nodo p20 = new Nodo("T", new Point(122, 131));
        Nodo p21 = new Nodo("U", new Point(47, 251));
        Nodo p22 = new Nodo("V", new Point(54, 391));
        Nodo p23 = new Nodo("W", new Point(400, 205));
        Nodo p24 = new Nodo("X", new Point(579, 206));
        Nodo p25 = new Nodo("Y", new Point(649, 307));
        //
        //Conexiones A
        p1.insertarNodoAdyacente(p17, 5); //Q
        p1.insertarNodoAdyacente(p18, 4); //R
        p1.insertarNodoAdyacente(p3, 2); //C
        p1.insertarNodoAdyacente(p4, 6); //D
        //Conexiones B
        p2.insertarNodoAdyacente(p17, 2); //Q
        p2.insertarNodoAdyacente(p3, 3); //C
        p2.insertarNodoAdyacente(p15, 5); //O
        //Conexiones C
        p3.insertarNodoAdyacente(p23, 7); //W
        p3.insertarNodoAdyacente(p24, 10); //X
        p3.insertarNodoAdyacente(p14, 8); //N
        //Conexiones D
        p4.insertarNodoAdyacente(p23, 20); //W
        p4.insertarNodoAdyacente(p5, 5); //E
        //Conexiones E
        p5.insertarNodoAdyacente(p21, 13); //U
        p5.insertarNodoAdyacente(p6, 6); //F
        p5.insertarNodoAdyacente(p8, 5); //H
        p5.insertarNodoAdyacente(p23, 10); //W
        //Conexiones F
        p6.insertarNodoAdyacente(p22, 3); //V
        p6.insertarNodoAdyacente(p7, 8); //G
        p6.insertarNodoAdyacente(p20, 20); //T
        //Conexiones G
        p7.insertarNodoAdyacente(p8, 8); //H
        p7.insertarNodoAdyacente(p10, 15); //J
        //Conexiones H
        p8.insertarNodoAdyacente(p9, 5); //I
        //Conexiones I
        p9.insertarNodoAdyacente(p10, 2); //J
        p9.insertarNodoAdyacente(p14, 4); //N
        p9.insertarNodoAdyacente(p25, 7); //Y
        p9.insertarNodoAdyacente(p12, 10); //L
        //Conexiones K
        p11.insertarNodoAdyacente(p12, 5); //L
        p11.insertarNodoAdyacente(p10, 6); //J
        //Conexiones M
        p13.insertarNodoAdyacente(p15, 7); //O
        p13.insertarNodoAdyacente(p24, 5); //X
        //Conexiones Y
        p25.insertarNodoAdyacente(p13, 5); //M
        //Conexiones O
        p15.insertarNodoAdyacente(p16, 6); //P
        //Conexiones S
        p19.insertarNodoAdyacente(p18, 6); //R
        p19.insertarNodoAdyacente(p20, 6); //T

        PlantaOxigeno a = new PlantaOxigeno("Plaza de Armas",
                "\\imagenesLugares\\PlazaArmas.jpg", "CIENEGUILLA",
                "Casa Vieja, circa de SE 2938", "Ovalo San José",
                "9997402359", "PLAZA DE ARMAS DE CIENEGUILLA, Centro histórico del distrito, Bonito lugar para darse un paseo mientras conoce cieneguilla");

        PlantaOxigeno b = new PlantaOxigeno("Parque de la familia",
                "\\imagenesLugares\\ParqueFamilia.jpg", "CIENEGUILLA",
                "C. 119 375, Cieneguilla 15593", "Ovalo Torre Aliaga",
                "9997516894", "PARQUE DE LA FAMILIA, Lugar perfecto de esparcimiento para toda la familia, cuenta con zonas para niños e incluso para traer al engreído de la familia");

        PlantaOxigeno c = new PlantaOxigeno("El Valle",
                "\\imagenesLugares\\CieneValle.jpg", "CIENEGUILLA",
                "Av. Condor Waca 5577", "C. Algodonal cuadra 2",
                "9997514267", "EL VALLE, Zona de turismo en una de las partes mas bonitas de cieneguilla, cuenta con hoteles de lujo");

        PlantaOxigeno d = new PlantaOxigeno("Catedral de Cieneguilla",
                "\\imagenesLugares\\CieneCatedral.jpg", "CIENEGUILLA",
                "C. Inca Roca, Cieneguilla 15586", "Av Pachacutec Mz A Lt 5",
                "9998596432", "CATEDRAL DE CIENEGUILLA, Centro principal de cieneguilla ubicada a pocos metros del parque de la familia, perfecto lugar para visitar y apreciar el arte que la hace magnífica");

        PlantaOxigeno e = new PlantaOxigeno("Entrada de cieneguilla",
                "\\imagenesLugares\\EntradaCiene.jpg", "CIENEGUILLA",
                "Av. Condor Waca 5465", "Av Integracion Mz S 19",
                "9997458796", "ENTRADA DE CIENEGUILLA, Bienvenido a cieneguilla un distrito nuevo y con muchos luigares turísticos y de esparcimiento para salir de la rutina");

        /*p1.setPlantaOxigeno(a);*/
        p5.setPlantaOxigeno(a);
        p1.setPlantaOxigeno(b);
        p11.setPlantaOxigeno(c);
        p2.setPlantaOxigeno(d);
        p7.setPlantaOxigeno(e);

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
        grafo.insertarNodo(p25);
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

                //METODOS CAMINOS MINIMOS
                Dijkstra dijkstra = new Dijkstra(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
                Floyd floyd = new Floyd(grafo.obtenerMatrizAdyacencia(), Convertidor.letraANumero(nodoInicio.getId()), Convertidor.letraANumero(nodoFin.getId()));
                Resultado resultado = dijkstra.caminoMinimos(); // EJECUCION DJISTRA
                floyd.hallarMatrizCaminosMinimos(); //EJECUCION FLOYD
                etiquetaRecorridoTotal.setText(String.valueOf(recorridoTotal));
                JOptionPane.showMessageDialog(this, "NUMERO OPERACION APROXIMADAS EN DIJKSTRA: " + dijkstra.numeroOperaciones + "\n"
                        + "NUMERO OPERACION APROXIMADAS EN FLOYD   : " + floyd.numeroOperaciones);
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
