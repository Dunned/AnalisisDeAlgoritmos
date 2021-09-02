/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Codigo.PlantaOxigeno;
import Codigo.Usuario;
import java.awt.Image;
import java.awt.TextArea;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduar
 */
public class Favoritos extends javax.swing.JPanel {

    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    Usuario usuario;

    //PlantaOxigeno plantaOxigeno = new PlantaOxigeno("PATITAS FELICES", "\\imagenesLugares\\oxigenoPatitas.jpg");
    //PlantaOxigeno plantaOxigeno2 = new PlantaOxigeno("PEDRO SANTO", "\\imagenesLugares\\oxigenoPedroSanto.jpg");
    public Favoritos(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.texAreaDescripcion.setLineWrap(true);
        this.texAreaDescripcion.setEditable(false);
        cargarTabla();
        System.out.println(usuario.getPlantasFavoritas().toString());
    }

    private void cargarTabla() {
        modeloTabla.addColumn("PLANTA");
        modeloTabla.addColumn("DISTRITO");
        int i = 0;
        if (usuario.getPlantasFavoritas().size() > 0) {
            for (PlantaOxigeno p : usuario.getPlantasFavoritas()) {
                String[] contenido = {p.getNombre(), p.getDistrito()};
                modeloTabla.addRow(contenido);
            }
            tablaListaLugares.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tablaListaLugares.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int pos = tablaListaLugares.getSelectedRow();
                    cargarInformacionPlantaOxigeno(usuario.getPlantasFavoritas().get(pos));
                }
            });
        }
    }

    private void cargarInformacionPlantaOxigeno(PlantaOxigeno planta) {
        ImageIcon fondo = new ImageIcon(getClass().getClassLoader().getResource(planta.getRutaImagen()));
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(410, 220, Image.SCALE_SMOOTH));
        labelFotoLugar.setIcon(icono);
        etiquetaNombrePlanta.setText(planta.getNombre());
        etiquetaDistrito.setText(planta.getDistrito());
        etiquetaDireccion1.setText(planta.getDireccion1());
        etiquetaDireccion2.setText(planta.getDireccion2());
        etiquetaTelefono.setText(planta.getNumeroTelefono());
        //Limpiar TextArea
        texAreaDescripcion.selectAll();
        texAreaDescripcion.replaceSelection("");
        //Poner Nueva Descripcion
        texAreaDescripcion.append(planta.getDescripcion());
        jPanel1.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaLugares = new javax.swing.JTable();
        labelFotoLugar = new javax.swing.JLabel();
        etiquetaNombrePlanta = new javax.swing.JLabel();
        letraNumeroTelefono = new javax.swing.JLabel();
        letraDescripcion = new javax.swing.JLabel();
        letraDireccion2 = new javax.swing.JLabel();
        letraDireccion1 = new javax.swing.JLabel();
        letraDistrito = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texAreaDescripcion = new javax.swing.JTextArea();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaDistrito = new javax.swing.JLabel();
        etiquetaDireccion1 = new javax.swing.JLabel();
        etiquetaDireccion2 = new javax.swing.JLabel();
        fondoFavoritos = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 203, 58));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaListaLugares.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListaLugares.setModel(modeloTabla);
        tablaListaLugares.setRowHeight(30);
        tablaListaLugares.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(tablaListaLugares);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 241, 380, 440));
        jPanel1.add(labelFotoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 220));

        etiquetaNombrePlanta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        etiquetaNombrePlanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaNombrePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 460, 70));

        letraNumeroTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        letraNumeroTelefono.setText("NUMERO TELEFONO: ");
        jPanel1.add(letraNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 785, -1, -1));

        letraDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        letraDescripcion.setText("DESCRIPCION:");
        jPanel1.add(letraDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, -1, -1));

        letraDireccion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        letraDireccion2.setText("DIRECCION 2: ");
        jPanel1.add(letraDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, -1, -1));

        letraDireccion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        letraDireccion1.setText("DIRECCION 1: ");
        jPanel1.add(letraDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, -1, -1));

        letraDistrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        letraDistrito.setText("DISTRITO: ");
        jPanel1.add(letraDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 632, -1, -1));

        texAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        texAreaDescripcion.setColumns(20);
        texAreaDescripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        texAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(texAreaDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, 440, 70));

        etiquetaTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(etiquetaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 785, 130, 20));

        etiquetaDistrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(etiquetaDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 632, 350, 20));

        etiquetaDireccion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(etiquetaDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 350, 20));

        etiquetaDireccion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(etiquetaDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 350, 20));

        fondoFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LUGARFAVORITO.png"))); // NOI18N
        jPanel1.add(fondoFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 870));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaDireccion1;
    private javax.swing.JLabel etiquetaDireccion2;
    private javax.swing.JLabel etiquetaDistrito;
    private javax.swing.JLabel etiquetaNombrePlanta;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel fondoFavoritos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFotoLugar;
    private javax.swing.JLabel letraDescripcion;
    private javax.swing.JLabel letraDireccion1;
    private javax.swing.JLabel letraDireccion2;
    private javax.swing.JLabel letraDistrito;
    private javax.swing.JLabel letraNumeroTelefono;
    private javax.swing.JTable tablaListaLugares;
    private javax.swing.JTextArea texAreaDescripcion;
    // End of variables declaration//GEN-END:variables
}
