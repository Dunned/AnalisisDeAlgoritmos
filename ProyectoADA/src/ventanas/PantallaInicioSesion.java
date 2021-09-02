package ventanas;

import Informacion.Archivo;
import Informacion.Encadenador;
import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;

public class PantallaInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public PantallaInicioSesion() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        entradaDNI = new javax.swing.JTextField();
        entradaContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        panelSalir = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO (DNI)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        entradaDNI.setBackground(new java.awt.Color(255, 87, 51));
        entradaDNI.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        entradaDNI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entradaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaDNIActionPerformed(evt);
            }
        });
        jPanel2.add(entradaDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 280, 30));

        entradaContraseña.setBackground(new java.awt.Color(255, 87, 51));
        entradaContraseña.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        entradaContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(entradaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 280, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(204, 255, 153));
        botonRegistrarse.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        botonRegistrarse.setText("REGISTRARME");
        botonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseExited(evt);
            }
        });
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 130, -1));

        botonIngresar.setBackground(new java.awt.Color(204, 255, 153));
        botonIngresar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        botonIngresar.setText("INGRESAR");
        botonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIngresarMouseExited(evt);
            }
        });
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 110, -1));

        panelSalir.setBackground(new java.awt.Color(81, 29, 71));
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSalirMouseExited(evt);
            }
        });
        panelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 255, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida (2).png"))); // NOI18N
        panelSalir.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jPanel2.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 70, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loginPro.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 440, 740));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 420, 710));

        jPanel3.setBackground(new java.awt.Color(153, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NYC.gif"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 980, 720));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 710));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("USUARIO (DNI)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaDNIActionPerformed

    private void panelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseEntered
        panelSalir.setBackground(new Color(255, 87, 51));
    }//GEN-LAST:event_panelSalirMouseEntered

    private void panelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseExited
        panelSalir.setBackground(new Color(81, 29, 71));
    }//GEN-LAST:event_panelSalirMouseExited

    private void panelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_panelSalirMouseClicked

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        
            File binario = new File("Usuarios.bin");
            if (binario.exists()) {
                String dni = entradaDNI.getText();
                String contraseña = entradaContraseña.getText();
                Archivo archivo = new Archivo();
                archivo.recuperarTabla();
                Encadenador encadenador = archivo.getTablaHash().buscarEncadenamiento(dni);
                if (encadenador == null) {
                    JOptionPane.showMessageDialog(this, "NO EXISTE UN USUARIO CON EL DNI " + dni);
                } else {
                    if (encadenador.contenido.getContraseña().equals(contraseña)) {
                        PantallaPrincipal ventanaOpcion=new PantallaPrincipal(encadenador.contenido);
                        ventanaOpcion.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "CONTRASEÑA INCORRECTA PARA EL DNI: " + dni);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "NO EXISTE UN USUARIO CON EL DNI " + entradaDNI.getText());
            }
        
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseEntered
        botonIngresar.setBackground(new Color(81, 29, 71));
    }//GEN-LAST:event_botonIngresarMouseEntered

    private void botonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseExited
        botonIngresar.setBackground(new Color(204, 255, 153));
    }//GEN-LAST:event_botonIngresarMouseExited

    private void botonRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseEntered
        botonRegistrarse.setBackground(new Color(81, 29, 71));
    }//GEN-LAST:event_botonRegistrarseMouseEntered

    private void botonRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseExited
        botonRegistrarse.setBackground(new Color(204, 255, 153));
    }//GEN-LAST:event_botonRegistrarseMouseExited

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        SubPantallaRegistro registro = new SubPantallaRegistro(this, true); //JDIALOG REGISTRO
        registro.setVisible(true);
    }//GEN-LAST:event_botonRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField entradaContraseña;
    private javax.swing.JTextField entradaDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelSalir;
    // End of variables declaration//GEN-END:variables
}
