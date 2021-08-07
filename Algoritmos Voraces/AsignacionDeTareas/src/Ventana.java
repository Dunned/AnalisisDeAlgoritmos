
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

    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    int[] tiempoTrabajador1 = {14, 5, 8, 7};
    Trabajador trabajador1 = new Trabajador(1, tiempoTrabajador1);
    int[] tiempoTrabajador2 = {2, 12, 6, 5};
    Trabajador trabajador2 = new Trabajador(2, tiempoTrabajador2);
    int[] tiempoTrabajador3 = {7, 8, 3, 9};
    Trabajador trabajador3 = new Trabajador(3, tiempoTrabajador3);
    int[] tiempoTrabajador4 = {2, 4, 6, 10};
    Trabajador trabajador4 = new Trabajador(4, tiempoTrabajador4);
    Trabajador[] trabajadores = {trabajador1, trabajador2, trabajador3, trabajador4};
    String[] solucion = new String[4];

    public Ventana() {
        initComponents();
        cargarTabla();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void cargarTabla() {
        modelo1.addColumn("TRABAJADOR #");
        modelo1.addColumn("TAREA 1");
        modelo1.addColumn("TAREA 2");
        modelo1.addColumn("TAREA 3");
        modelo1.addColumn("TAREA 4");
        for(int i=0;i<trabajadores.length;i++){
            String[] contenido=new String[5];
            contenido[0]="TRABAJADOR #"+String.valueOf(trabajadores[i].id);
            for(int j=0;j<trabajadores[i].tiempoTareas.length;j++){
                contenido[j+1]=String.valueOf(trabajadores[i].tiempoTareas[j])+ "hrs.";
            }
            modelo1.addRow(contenido);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASIGNACION DE TAREAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 890, -1));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBackground(new java.awt.Color(0, 153, 255));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(modelo1);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 820, 100));

        jButton1.setText("ASIGNAR TAREAS PARA OPTENER EL MENOR TIEMPO ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jTable2.setModel(modelo2);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 780, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < solucion.length; i++) {
            solucion[i]="";
        }
        AsignacionTareas asignacionTareas = new AsignacionTareas();
        int total=asignacionTareas.voraz(trabajadores, solucion);
        modelo2.addColumn("TAREA");
        modelo2.addColumn("TRABAJADOR ESCOGIDO");
        for(int i=0;i<solucion.length;i++){
            String[] contenido={"TAREA "+(i+1),solucion[i]};
            modelo2.addRow(contenido);
        }
        String[] contenido={"TIEMPO TOTAL ",String.valueOf(total)+" HORAS EN TOTAL"};
        modelo2.addRow(contenido);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
