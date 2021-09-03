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
public class SubVentanaCiudadUniversitaria extends javax.swing.JPanel {

    Usuario usuario;
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    Nodo nodoFavorito = null;
    ArrayList<Arista> caminoRecorrido;
    ArrayList<PlantaOxigeno> plantasFavoritas;
    int recorridoTotal;

    public SubVentanaCiudadUniversitaria(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.plantasFavoritas = new ArrayList<PlantaOxigeno>();
        botonAñadirFavorito.setVisible(false);
        creadoDeMapa();
    }

    
    private void creadoDeMapa() {
         caminoRecorrido = new ArrayList<Arista>();
        //Creacion de Nodos
            Nodo p1 = new Nodo("A", new Point(99,114));
            Nodo p2 = new Nodo("B", new Point(159,84));
            Nodo p3 = new Nodo("C", new Point(143,179));
            Nodo p4 = new Nodo("D", new Point(119,287));
            Nodo p5 = new Nodo("E", new Point(149,236));
            Nodo p6 = new Nodo("F", new Point(206,200));
            Nodo p7 = new Nodo("G", new Point(194,286));
            Nodo p8 = new Nodo("H", new Point(174,366));
            Nodo p9 = new Nodo("I", new Point(166,464));
            Nodo p10 = new Nodo("J", new Point(239,451));
            Nodo p11 = new Nodo("K", new Point(270,385));
            Nodo p12 = new Nodo("L", new Point(321,351));
            Nodo p13 = new Nodo("M", new Point(400,261));
            Nodo p14 = new Nodo("N", new Point(618,164));
            Nodo p15 = new Nodo("O", new Point(600,35));
            Nodo p16 = new Nodo("P", new Point(549,39));
            Nodo p17 = new Nodo("Q", new Point(567,118));
            Nodo p18 = new Nodo("R", new Point(508,133));
            Nodo p19 = new Nodo("S", new Point(451,109));
            Nodo p20 = new Nodo("T", new Point(432,183));
            Nodo p21 = new Nodo("U", new Point(510,195));
            Nodo p22 = new Nodo("V", new Point(299,255));
            Nodo p23 = new Nodo("W", new Point(306,171));
            Nodo p24 = new Nodo("X", new Point(348,109));
            Nodo p25 = new Nodo("Y", new Point(414,50));
            Nodo p26 = new Nodo("Z", new Point(331,23));                  
            
        //dibujo linea entre nodos
            p1.insertarNodoAdyacente(p2,6);
            p1.insertarNodoAdyacente(p3,5);
            p1.insertarNodoAdyacente(p4,12);
            p3.insertarNodoAdyacente(p5,2);
            p3.insertarNodoAdyacente(p6,3);
            p4.insertarNodoAdyacente(p9,9);
            p5.insertarNodoAdyacente(p7,4);
            p6.insertarNodoAdyacente(p23,6);
            p6.insertarNodoAdyacente(p7,4);
            p7.insertarNodoAdyacente(p8,4);
            p8.insertarNodoAdyacente(p11,5);
            p9.insertarNodoAdyacente(p10,6);
            p10.insertarNodoAdyacente(p11,3);
            p11.insertarNodoAdyacente(p12,3);
            p12.insertarNodoAdyacente(p13,8);
            p20.insertarNodoAdyacente(p21,7);
            p13.insertarNodoAdyacente(p20,4);
            p13.insertarNodoAdyacente(p22,5);
            p14.insertarNodoAdyacente(p15,8);
            p15.insertarNodoAdyacente(p16,3);
            p16.insertarNodoAdyacente(p17,5);
            p16.insertarNodoAdyacente(p25,9);
            p17.insertarNodoAdyacente(p18,3);
            p18.insertarNodoAdyacente(p19,3);
            p19.insertarNodoAdyacente(p20,5);
            p19.insertarNodoAdyacente(p24,6);
            p21.insertarNodoAdyacente(p14,5);
            p22.insertarNodoAdyacente(p23,4);
            p23.insertarNodoAdyacente(p24,4);
            p24.insertarNodoAdyacente(p25,5);
            p25.insertarNodoAdyacente(p26,5);
            
            
            
        //Decidimos cuales son plantas de oxigeno
        PlantaOxigeno a = new PlantaOxigeno("HUACA",
                "\\imagenesLugares\\huaca.png", "UNMSM",
                "Av. República de Venezuela", "Cercado de Lima 15081",
                "S/N", "Es un monumento arqueológico que se ubica dentro del campus universitario principal "
                        + "—en uno de los extremos— de la UNMSM");
        
        PlantaOxigeno b = new PlantaOxigeno("FII",
                "\\imagenesLugares\\fiii.jpg", "UNMSM",
                "San Miguel - Cercado de Lima 15081", "Ciudad Universitaria",
                "619 - 7000 anexo 1831", "La facultad en la actualidad, dentro de la organización de la universidad, "
                        + "forma parte del área de Ingenierías y cuenta con las escuelas académico-profesionales de Ingeniería Industrial, "
                        + "Ingeniería Textil, e Ingeniería de Seguridad y Salud en el Trabajo");
        
        PlantaOxigeno c = new PlantaOxigeno("COMEDOR",
                "\\imagenesLugares\\comedor.jpg", "UNMSM",
                "URB. Miguel Grau Mz S Lote 19", "Av Integracion Mz S 19",
                "619 - 7000 anexo 518", "La Oficina General de Bienestar Universitario brinda a los miembros de la comunidad "
                        + "universitaria programas especiales de bienestar en materia de: alimentación, salud, promoción del deporte, "
                        + "servicio social, transporte, adecuación del entorno y protección del ambiente, psicopedagógico y de psicología "
                        + "organizacional, asistencia estudiantil, becas y créditos, apoyo familiar, bolsa de trabajo y formación laboral, "
                        + "recreación y turismo.");
        
        PlantaOxigeno d = new PlantaOxigeno("ESTADIO",
                "\\imagenesLugares\\estadio.jpg", "UNMSM",
                "Cercado de Lima 15081", "Av. Venezuela 3450-3452",
                "6197000", "El Estadio de la Universidad Nacional Mayor de San Marcos, denominado oficialmente como el «Coloso de América». "
                        + "Fue inaugurado en 1951 conmemorando los 400 años de fundación de la Universidad de San Marcos. ");
        
        PlantaOxigeno e = new PlantaOxigeno("DERECHO",
                "\\imagenesLugares\\derecho.jpg", "UNMSM",
                "Av. Universitaria, Cercado de Lima 15081", "Ciudad Univesitaria",
                "4520550", "La facultad en la actualidad, dentro de la organización de la universidad, forma parte del área de Humanidades,"
                        + " Ciencias Jurídicas y Sociales y cuenta con las escuelas profesionales de Derecho y Ciencia Política, "
                        + "que brindan tanto estudios de pregrado como de postgrado.");
        
        PlantaOxigeno f = new PlantaOxigeno("FISI",
                "\\imagenesLugares\\fisi.jpg", "UNMSM",
                "Calle Germán Amézaga s/n - Lima", "Ciudad Universitaria",
                "(01) 6197000", "La facultad en la actualidad, dentro de la organización de la universidad, forma parte del área de "
                        + "Ingenierías y cuenta con las escuelas académico-profesionales de Ingeniería de Sistemas y, de Ingeniería "
                        + "de Software, que brindan tanto estudios de pregrado como de postgrado.");
        
        PlantaOxigeno g = new PlantaOxigeno("FIEE",
                "\\imagenesLugares\\fiee.jpg", "UNMSM",
                "Cercado de Lima 15081", "Ciudad Universitaria",
                "6197000 Anexo 4224", "La facultad en la actualidad, dentro de la organización de la universidad, forma parte del área "
                        + "de Ingenierías y cuenta con las escuelas académico-profesionales de Ingeniería Electrónica, "
                        + "de Ingeniería Eléctrica, de Ingeniería de Telecomunicaciones, y de Ingeniería de Biomédica que brindan "
                        + "tanto estudios de pregrado como de postgrado");
        
        PlantaOxigeno h = new PlantaOxigeno("BIBLIO",
                "\\imagenesLugares\\biblioteca.jpg", "UNMSM",
                "Edificio Biblioteca Central Pedro Zulen", " Av. Amezaga 375, Cercado de Lima 15081",
                "6197000", "Es una institución encargada del apoyo a la comunidad universitaria sanmarquina en el fomento a la lectura, "
                        + "la docencia y la investigación, ofreciendo modernos servicios y una infraestructura favorable para el estudio");


        p2.setPlantaOxigeno(a);//HUACA
        p8.setPlantaOxigeno(b);//FII
        p6.setPlantaOxigeno(c);//COMEDOR
        p22.setPlantaOxigeno(d);//ESTADIO
        p11.setPlantaOxigeno(e);//DERECHO
        p18.setPlantaOxigeno(f);//FISI
        p25.setPlantaOxigeno(g);//FIEE
        p24.setPlantaOxigeno(h);//BIBLIOTECA
        
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
        grafo.insertarNodo(p26);
        
        
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

        labelMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapaCiudadUniversitaria.png"))); // NOI18N
        labelMapa.setPreferredSize(new java.awt.Dimension(960, 720));
        PanelMapa.add(labelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 490));

        jPanel1.add(PanelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 190, 740, 490));

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
        jPanel1.add(botonAñadirFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 180, -1));

        etiquetaNodoOrigen.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etiquetaNodoOrigen.setForeground(new java.awt.Color(0, 153, 204));
        etiquetaNodoOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaNodoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 220, 60));

        etiquetaRecorridoTotal.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etiquetaRecorridoTotal.setForeground(new java.awt.Color(255, 204, 0));
        etiquetaRecorridoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaRecorridoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 220, 70));

        etiquetaNodoFin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etiquetaNodoFin.setForeground(new java.awt.Color(255, 51, 51));
        etiquetaNodoFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaNodoFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 220, 70));

        fondoMapaChaclacacyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoVentanaCiudadUniversitarioa.png"))); // NOI18N
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
                JOptionPane.showMessageDialog(this, "NUMERO OPERACION APROXIMADAS EN DIJKSTRA: "+dijkstra.numeroOperaciones+"\n"+
                                                    "NUMERO OPERACION APROXIMADAS EN FLOYD   : "+floyd.numeroOperaciones);
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
