/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import ManejoDeArchivos.Archivo;
import Codigo.Arista;
import Codigo.Convertidor;
import Codigo.Dijkstra;
import Codigo.Grafo;
import Codigo.Nodo;
import Codigo.Resultado;
import Codigo.Usuario;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import desplazable.Desface;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eduar
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    Usuario usuario;
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    ArrayList<Arista> caminoRecorrido;
    Desface desplace;

    public PantallaPrincipal(Usuario usuario) {
        this.setUndecorated(true);
        this.usuario=usuario;
        initComponents();
        desplace = new Desface();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cambioPanel(new PanelMiPerfil(usuario));
        //prueba();
            
    }

    private void prueba() {
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

        menuPlegable = new javax.swing.JPanel();
        fondoBotonMenu = new javax.swing.JPanel();
        botonMenu = new javax.swing.JLabel();
        fondoBotonPerfil = new javax.swing.JPanel();
        botonMiPerfil = new javax.swing.JLabel();
        fondoBotonFavoritos = new javax.swing.JPanel();
        botonFavoritos = new javax.swing.JLabel();
        fondoBotonMapaX = new javax.swing.JPanel();
        botonMapaX = new javax.swing.JLabel();
        fondoBotonMapaY = new javax.swing.JPanel();
        botonMapaY = new javax.swing.JLabel();
        fondoBotonMapaZ = new javax.swing.JPanel();
        botonMapaZ = new javax.swing.JLabel();
        fondoBotonSalir = new javax.swing.JPanel();
        botonSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Mapa1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPlegable.setBackground(new java.awt.Color(30, 36, 37));

        fondoBotonMenu.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonMenu.setForeground(new java.awt.Color(60, 63, 65));

        botonMenu.setBackground(new java.awt.Color(255, 204, 51));
        botonMenu.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonMenu.setForeground(new java.awt.Color(255, 203, 58));
        botonMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu (1).png"))); // NOI18N
        botonMenu.setText("BARRA DE NAVEGACION");
        botonMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonMenu.setIconTextGap(5);
        botonMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMenuMouseMoved(evt);
            }
        });
        botonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMenuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMenuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonMenuLayout = new javax.swing.GroupLayout(fondoBotonMenu);
        fondoBotonMenu.setLayout(fondoBotonMenuLayout);
        fondoBotonMenuLayout.setHorizontalGroup(
            fondoBotonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        fondoBotonMenuLayout.setVerticalGroup(
            fondoBotonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMenu)
        );

        fondoBotonPerfil.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonPerfil.setForeground(new java.awt.Color(60, 63, 65));

        botonMiPerfil.setBackground(new java.awt.Color(255, 204, 51));
        botonMiPerfil.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonMiPerfil.setForeground(new java.awt.Color(255, 203, 58));
        botonMiPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonMiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user (1).png"))); // NOI18N
        botonMiPerfil.setText("MI PERFIL");
        botonMiPerfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonMiPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMiPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonMiPerfil.setIconTextGap(20);
        botonMiPerfil.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMiPerfilMouseMoved(evt);
            }
        });
        botonMiPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMiPerfilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMiPerfilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMiPerfilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonPerfilLayout = new javax.swing.GroupLayout(fondoBotonPerfil);
        fondoBotonPerfil.setLayout(fondoBotonPerfilLayout);
        fondoBotonPerfilLayout.setHorizontalGroup(
            fondoBotonPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMiPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoBotonPerfilLayout.setVerticalGroup(
            fondoBotonPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMiPerfil)
        );

        fondoBotonFavoritos.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonFavoritos.setForeground(new java.awt.Color(60, 63, 65));

        botonFavoritos.setBackground(new java.awt.Color(255, 204, 51));
        botonFavoritos.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonFavoritos.setForeground(new java.awt.Color(255, 203, 58));
        botonFavoritos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favorite.png"))); // NOI18N
        botonFavoritos.setText("FAVORITOS");
        botonFavoritos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonFavoritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFavoritos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonFavoritos.setIconTextGap(20);
        botonFavoritos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonFavoritosMouseMoved(evt);
            }
        });
        botonFavoritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFavoritosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonFavoritosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonFavoritosLayout = new javax.swing.GroupLayout(fondoBotonFavoritos);
        fondoBotonFavoritos.setLayout(fondoBotonFavoritosLayout);
        fondoBotonFavoritosLayout.setHorizontalGroup(
            fondoBotonFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonFavoritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoBotonFavoritosLayout.setVerticalGroup(
            fondoBotonFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonFavoritos)
        );

        fondoBotonMapaX.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonMapaX.setForeground(new java.awt.Color(60, 63, 65));

        botonMapaX.setBackground(new java.awt.Color(255, 204, 51));
        botonMapaX.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonMapaX.setForeground(new java.awt.Color(255, 203, 58));
        botonMapaX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonMapaX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoMapa1.png"))); // NOI18N
        botonMapaX.setText("MAPA X");
        botonMapaX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonMapaX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMapaX.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonMapaX.setIconTextGap(20);
        botonMapaX.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMapaXMouseMoved(evt);
            }
        });
        botonMapaX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMapaXMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMapaXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonMapaXLayout = new javax.swing.GroupLayout(fondoBotonMapaX);
        fondoBotonMapaX.setLayout(fondoBotonMapaXLayout);
        fondoBotonMapaXLayout.setHorizontalGroup(
            fondoBotonMapaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMapaX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoBotonMapaXLayout.setVerticalGroup(
            fondoBotonMapaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMapaX)
        );

        fondoBotonMapaY.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonMapaY.setForeground(new java.awt.Color(60, 63, 65));

        botonMapaY.setBackground(new java.awt.Color(255, 204, 51));
        botonMapaY.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonMapaY.setForeground(new java.awt.Color(255, 203, 58));
        botonMapaY.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonMapaY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoMapa2.png"))); // NOI18N
        botonMapaY.setText("MAPA Y");
        botonMapaY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonMapaY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMapaY.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonMapaY.setIconTextGap(20);
        botonMapaY.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMapaYMouseMoved(evt);
            }
        });
        botonMapaY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMapaYMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMapaYMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonMapaYLayout = new javax.swing.GroupLayout(fondoBotonMapaY);
        fondoBotonMapaY.setLayout(fondoBotonMapaYLayout);
        fondoBotonMapaYLayout.setHorizontalGroup(
            fondoBotonMapaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMapaY, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        fondoBotonMapaYLayout.setVerticalGroup(
            fondoBotonMapaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoBotonMapaYLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonMapaY)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoBotonMapaZ.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonMapaZ.setForeground(new java.awt.Color(60, 63, 65));

        botonMapaZ.setBackground(new java.awt.Color(255, 204, 51));
        botonMapaZ.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonMapaZ.setForeground(new java.awt.Color(255, 203, 58));
        botonMapaZ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonMapaZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoMapa3.png"))); // NOI18N
        botonMapaZ.setText("MAPA Z");
        botonMapaZ.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonMapaZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMapaZ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonMapaZ.setIconTextGap(20);
        botonMapaZ.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMapaZMouseMoved(evt);
            }
        });
        botonMapaZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMapaZMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMapaZMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonMapaZLayout = new javax.swing.GroupLayout(fondoBotonMapaZ);
        fondoBotonMapaZ.setLayout(fondoBotonMapaZLayout);
        fondoBotonMapaZLayout.setHorizontalGroup(
            fondoBotonMapaZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonMapaZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoBotonMapaZLayout.setVerticalGroup(
            fondoBotonMapaZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoBotonMapaZLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonMapaZ)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoBotonSalir.setBackground(new java.awt.Color(30, 36, 37));
        fondoBotonSalir.setForeground(new java.awt.Color(60, 63, 65));

        botonSalir.setBackground(new java.awt.Color(255, 204, 51));
        botonSalir.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 16)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 203, 58));
        botonSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        botonSalir.setText("CERRAR SESIÓN");
        botonSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonSalir.setIconTextGap(20);
        botonSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSalirMouseMoved(evt);
            }
        });
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonSalirLayout = new javax.swing.GroupLayout(fondoBotonSalir);
        fondoBotonSalir.setLayout(fondoBotonSalirLayout);
        fondoBotonSalirLayout.setHorizontalGroup(
            fondoBotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoBotonSalirLayout.setVerticalGroup(
            fondoBotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoBotonSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPlegableLayout = new javax.swing.GroupLayout(menuPlegable);
        menuPlegable.setLayout(menuPlegableLayout);
        menuPlegableLayout.setHorizontalGroup(
            menuPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoBotonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBotonPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBotonFavoritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBotonMapaX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBotonMapaY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBotonMapaZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPlegableLayout.setVerticalGroup(
            menuPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPlegableLayout.createSequentialGroup()
                .addComponent(fondoBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fondoBotonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fondoBotonFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fondoBotonMapaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoBotonMapaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoBotonMapaZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondoBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 284, Short.MAX_VALUE))
        );

        getContentPane().add(menuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        jPanel2.setBackground(new java.awt.Color(255, 79, 97));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mapa1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Mapa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mapa1MouseClicked(evt);
            }
        });
        Mapa1.setLayout(new java.awt.CardLayout());
        jPanel2.add(Mapa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1140, 860));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMousePressed

        if (menuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(menuPlegable, menuPlegable.getX(), -180, 10, 8);
        } else {
            if (menuPlegable.getX() == -180) {
                desplace.desplazarDerecha(menuPlegable, menuPlegable.getX(), 0, 10, 8);
            }
        }
    }//GEN-LAST:event_botonMenuMousePressed

    private void botonMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMouseMoved
        fondoBotonMenu.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonMenuMouseMoved

    private void botonMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMouseExited
        fondoBotonMenu.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonMenuMouseExited

    private void botonMiPerfilMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMiPerfilMouseMoved
        fondoBotonPerfil.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonMiPerfilMouseMoved

    private void botonMiPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMiPerfilMouseExited
        fondoBotonPerfil.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonMiPerfilMouseExited

    private void botonMiPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMiPerfilMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMiPerfilMousePressed

    private void botonFavoritosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFavoritosMouseMoved

        fondoBotonFavoritos.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonFavoritosMouseMoved

    private void botonFavoritosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFavoritosMouseExited
        fondoBotonFavoritos.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonFavoritosMouseExited

    private void botonMapaXMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaXMouseMoved
       fondoBotonMapaX.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonMapaXMouseMoved

    private void botonMapaXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaXMouseExited
        fondoBotonMapaX.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonMapaXMouseExited

    private void botonMapaXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaXMouseClicked

        SubVentanaMapaChaclacayo mapa=new SubVentanaMapaChaclacayo(usuario);
        cambioPanel(mapa);
    //Mapa1.setVisible(true);
    }//GEN-LAST:event_botonMapaXMouseClicked

    private void botonFavoritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFavoritosMouseClicked
        Favoritos favoritos=new Favoritos(usuario);
        cambioPanel(favoritos);
    }//GEN-LAST:event_botonFavoritosMouseClicked

    private void botonMapaYMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaYMouseMoved
        fondoBotonMapaY.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonMapaYMouseMoved

    private void botonMapaYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaYMouseClicked
        SubVentanaMapaCieneguilla subVentanaMapaCieneguilla=new SubVentanaMapaCieneguilla(usuario);
        cambioPanel(subVentanaMapaCieneguilla);
    }//GEN-LAST:event_botonMapaYMouseClicked

    private void botonMapaYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaYMouseExited
       fondoBotonMapaY.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonMapaYMouseExited

    private void botonMapaZMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaZMouseMoved
        fondoBotonMapaZ.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonMapaZMouseMoved

    private void botonMapaZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaZMouseClicked
        SubVentanaCiudadUniversitaria subVentanaCiudadUniversitaria=new SubVentanaCiudadUniversitaria(usuario);
        cambioPanel(subVentanaCiudadUniversitaria);
    }//GEN-LAST:event_botonMapaZMouseClicked

    private void botonMapaZMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMapaZMouseExited
        fondoBotonMapaZ.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonMapaZMouseExited

    private void botonMiPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMiPerfilMouseClicked
        PanelMiPerfil panelMiPerfil=new PanelMiPerfil(usuario);
        cambioPanel(panelMiPerfil);
    }//GEN-LAST:event_botonMiPerfilMouseClicked

    private void Mapa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mapa1MouseClicked

        /*Point coodenada = evt.getPoint();
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
        dibujarGrafo();*/
    }//GEN-LAST:event_Mapa1MouseClicked

    private void botonSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseMoved
        fondoBotonSalir.setBackground(new Color(52,59,60));
    }//GEN-LAST:event_botonSalirMouseMoved

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        if (this.usuario.getPlantasFavoritas()!=null) {
           Archivo archivo=new Archivo();
        archivo.editarUsuario(this.usuario.getDni(), this.usuario.getPlantasFavoritas());
        this.dispose(); 
        }
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        fondoBotonSalir.setBackground(new Color(30,36,37));
    }//GEN-LAST:event_botonSalirMouseExited
/*
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
    */
    public void cambioPanel(JPanel panelActual){
        Mapa1.removeAll();
        Mapa1.add(panelActual);
        Mapa1.repaint();
        Mapa1.revalidate();
    }

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mapa1;
    private javax.swing.JLabel botonFavoritos;
    private javax.swing.JLabel botonMapaX;
    private javax.swing.JLabel botonMapaY;
    private javax.swing.JLabel botonMapaZ;
    private javax.swing.JLabel botonMenu;
    private javax.swing.JLabel botonMiPerfil;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JPanel fondoBotonFavoritos;
    private javax.swing.JPanel fondoBotonMapaX;
    private javax.swing.JPanel fondoBotonMapaY;
    private javax.swing.JPanel fondoBotonMapaZ;
    private javax.swing.JPanel fondoBotonMenu;
    private javax.swing.JPanel fondoBotonPerfil;
    private javax.swing.JPanel fondoBotonSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menuPlegable;
    // End of variables declaration//GEN-END:variables
}
