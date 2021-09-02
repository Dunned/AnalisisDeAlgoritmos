/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Codigo.Usuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class PanelMiPerfil extends javax.swing.JPanel {

    Usuario usuario;

    public PanelMiPerfil(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        cargarDatos();
    }

    private void cargarDatos() {
        ImageIcon fondo=new ImageIcon(usuario.getFoto());
        Icon icono=new ImageIcon(fondo.getImage().getScaledInstance(160, 280,Image.SCALE_SMOOTH));
        labelParaFoto.setIcon(icono);
        labelNombre.setText(usuario.getNombre()+" "+usuario.getApellido());
        labelTelefono.setText(usuario.getNumeroCelular());
        labelDNI.setText(usuario.getDni());
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelParaFoto = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 79, 97));
        setPreferredSize(new java.awt.Dimension(960, 740));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 640, 70));
        jPanel1.add(labelParaFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 160, 280));

        labelDNI.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jPanel1.add(labelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, 420, 50));

        labelTelefono.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jPanel1.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 420, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MiPerfil.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelParaFoto;
    private javax.swing.JLabel labelTelefono;
    // End of variables declaration//GEN-END:variables
}
