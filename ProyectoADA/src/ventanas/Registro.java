/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import alternativa.Usuario;
import java.awt.Color;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Eduar
 */
public class Registro extends javax.swing.JDialog {

    Usuario usuario;

    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        entradaDNI.setBackground(new java.awt.Color(0, 0, 0, 1));
        entradaNumero.setBackground(new java.awt.Color(0, 0, 0, 1));
        entradaNombre.setBackground(new java.awt.Color(0, 0, 0, 1));
        entradaApellido.setBackground(new java.awt.Color(0, 0, 0, 1));
        entradaContraseña1.setBackground(new java.awt.Color(0, 0, 0, 1));
        entradaContraseña2.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entradaNumero = new javax.swing.JTextField();
        entradaDNI = new javax.swing.JTextField();
        entradaNombre = new javax.swing.JTextField();
        entradaApellido = new javax.swing.JTextField();
        entradaContraseña1 = new javax.swing.JPasswordField();
        entradaContraseña2 = new javax.swing.JPasswordField();
        botonCargar = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entradaNumero.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        entradaNumero.setForeground(new java.awt.Color(255, 255, 255));
        entradaNumero.setBorder(null);
        entradaNumero.setOpaque(false);
        jPanel1.add(entradaNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, -1));

        entradaDNI.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        entradaDNI.setForeground(new java.awt.Color(255, 255, 255));
        entradaDNI.setBorder(null);
        entradaDNI.setOpaque(false);
        jPanel1.add(entradaDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, 330, -1));

        entradaNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        entradaNombre.setForeground(new java.awt.Color(255, 255, 255));
        entradaNombre.setBorder(null);
        entradaNombre.setOpaque(false);
        jPanel1.add(entradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, 330, -1));

        entradaApellido.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        entradaApellido.setForeground(new java.awt.Color(255, 255, 255));
        entradaApellido.setBorder(null);
        entradaApellido.setOpaque(false);
        jPanel1.add(entradaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, -1));

        entradaContraseña1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        entradaContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        entradaContraseña1.setBorder(null);
        jPanel1.add(entradaContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, 330, -1));

        entradaContraseña2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        entradaContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        entradaContraseña2.setBorder(null);
        jPanel1.add(entradaContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 330, -1));

        botonCargar.setBackground(new java.awt.Color(255, 79, 97));
        botonCargar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        botonCargar.setText("Elegir Foto");
        botonCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCargarMouseExited(evt);
            }
        });
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 120, 20));

        botonRegistro.setBackground(new java.awt.Color(255, 79, 97));
        botonRegistro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botonRegistro.setText("REGISTRARME");
        botonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegistroMouseExited(evt);
            }
        });
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, 30));

        botonCancelar.setBackground(new java.awt.Color(255, 79, 97));
        botonCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        botonCancelar.setText("CANCELAR");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarMouseExited(evt);
            }
        });
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 20));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fotoDefecto.png"))); // NOI18N
        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("BUSCA TU FOTOGRAFIA PERSONAL!!");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File photo = new File(fc.getSelectedFile().toString());
            photo.getAbsoluteFile();
            rsscalelabel.RSScaleLabel.setScaleLabel(foto, fc.getSelectedFile().toString());
        }
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseEntered
        botonCancelar.setBackground(new Color(204, 153, 0));
    }//GEN-LAST:event_botonCancelarMouseEntered

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
        botonCancelar.setBackground(new Color(255, 79, 97));
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonCargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCargarMouseEntered
        botonCargar.setBackground(new Color(204, 153, 0));
    }//GEN-LAST:event_botonCargarMouseEntered

    private void botonCargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCargarMouseExited
        botonCargar.setBackground(new Color(255, 79, 97));
    }//GEN-LAST:event_botonCargarMouseExited

    private void botonRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseEntered
        botonRegistro.setBackground(new Color(204, 153, 0));
    }//GEN-LAST:event_botonRegistroMouseEntered

    private void botonRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseExited
        botonRegistro.setBackground(new Color(255, 79, 97));
    }//GEN-LAST:event_botonRegistroMouseExited

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        String dni = entradaDNI.getText();
        String numeroCelular = entradaNumero.getText();
        String nombre = entradaNombre.getText();
        String apellido = entradaApellido.getText();
        String contraseña;
        File foto;
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void validarContraseña() {
        String valorPass = new String(entradaContraseña1.getText());

//Si imprimes ahora valorPass, te devolvera el valor real que se ha
// ingresado dentro del txtPasswordFiel
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
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JTextField entradaApellido;
    private javax.swing.JPasswordField entradaContraseña1;
    private javax.swing.JPasswordField entradaContraseña2;
    private javax.swing.JTextField entradaDNI;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaNumero;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
