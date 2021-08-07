
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduar
 */
public class Ventana extends javax.swing.JFrame {

    Actividad a = new Actividad("A", 8, 14);
    Actividad b = new Actividad("B", 9, 12);
    Actividad c = new Actividad("C", 11, 13);
    Actividad d = new Actividad("D", 11, 16);
    Actividad e = new Actividad("E", 12, 15);
    Actividad f = new Actividad("F", 13, 17);
    Actividad g = new Actividad("G", 14, 18);
    Actividad h = new Actividad("H", 16, 19);
    Actividad[] actividades = {a, b, c, d, e, f, g, h};
    Actividad[] solucion = new Actividad[actividades.length];
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    public Ventana() {
        initComponents();
        cargarTabla();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        botonReiniciar.setVisible(false);
    }

    private void cargarTabla() {
        modelo1.addColumn("ID");
        modelo1.addColumn("HORA INICIO");
        modelo1.addColumn("HORA FIN");
        for (int i = 0; i < actividades.length; i++) {
            String[] contenido = {actividades[i].id, String.valueOf(actividades[i].inicio), String.valueOf(actividades[i].fin)};
            modelo1.addRow(contenido);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        etiquetaReuniones = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCION DE ACTIVIDADES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 720, -1));

        jTable1.setBackground(new java.awt.Color(255, 153, 51));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(modelo1);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 520, 160));

        jTable2.setBackground(new java.awt.Color(102, 255, 153));
        jTable2.setModel(modelo2);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 520, 180));

        etiquetaReuniones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaReuniones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaReuniones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 720, 30));

        boton.setText("SELECCIOAR A QUE EVENTOS PUEDO IR");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 270, 40));

        botonReiniciar.setText("REINICIAR");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(botonReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        etiquetaReuniones.setText("EVENTOS A LOS QUE PUEDE IR");
        for (int i = 0; i < solucion.length; i++) {
            Actividad tmp = new Actividad("", 0, 0);
            solucion[i] = tmp;
        }
        SeleccionActividades seleccionActividades = new SeleccionActividades();
        seleccionActividades.seleccionActividades(actividades, solucion);
        modelo2.addColumn("ID");
        modelo2.addColumn("HORA INICIO");
        modelo2.addColumn("HORA FIN");
        for (int i = 0; i < solucion.length; i++) {
            if (solucion[i].id != "") {
                String[] contenido = {solucion[i].id, String.valueOf(solucion[i].inicio), String.valueOf(solucion[i].fin)};
                modelo2.addRow(contenido);
            } else {
                break;
            }
        }
        boton.setEnabled(false);
        botonReiniciar.setVisible(true);
    }//GEN-LAST:event_botonActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        this.dispose();
        Ventana ventana=new Ventana();
        ventana.setVisible(true);
    }//GEN-LAST:event_botonReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JLabel etiquetaReuniones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
