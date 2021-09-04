/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemadelamochila;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduar
 */
public class Ventana extends javax.swing.JFrame {

    Objeto objeto1 = new Objeto(1, 3);
    Objeto objeto2 = new Objeto(2, 5);
    Objeto objeto3 = new Objeto(4, 7);
    Objeto objeto4 = new Objeto(5, 12);
    Objeto objeto5 = new Objeto(7, 16);
    Objeto objeto6 = new Objeto(8, 19);
    Objeto[] objetos = {objeto1, objeto2, objeto3, objeto4, objeto5, objeto6};
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cargarTabla();
        jButton2.setVisible(false);
    }

    private void cargarTabla() {
        modelo1.addColumn("OBJETO");
        modelo1.addColumn("PESO");
        modelo1.addColumn("BENEFICIO");
        char inicio = 'A';
        for (int i = 0; i < objetos.length; i++) {
            String[] contenido = {("" + inicio), String.valueOf(objetos[i].peso) + " Kg.", " S/." + String.valueOf(objetos[i].beneficio)};
            modelo1.addRow(contenido);
            inicio++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaObjetos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        entradaPeso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaResumen = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROBLEMA DE LA MOCHILA 0/1 PROGRAMACION DINAMICA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1040, 20));

        tablaObjetos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tablaObjetos.setModel(modelo1
        );
        jScrollPane1.setViewportView(tablaObjetos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 390, 130));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("PESO DE LA MOCHILA: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entradaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 60));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("HALLAR BENEFICIO MAXIMO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        tabla2.setBackground(new java.awt.Color(255, 204, 0));
        tabla2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        tabla2.setModel(modelo2);
        jScrollPane2.setViewportView(tabla2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 1020, 140));

        jScrollPane3.setBackground(new java.awt.Color(255, 102, 102));

        tablaResumen.setModel(modelo3);
        jScrollPane3.setViewportView(tablaResumen);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, 210));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("OBJETOS DISPONIBLES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("OBJETOS UTILIZADOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MATRIZ GENERADA MEDIANTE PROGRAMACION DINAMICA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 490, 1050, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("REINICIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int pesoMaximo = Integer.parseInt(entradaPeso.getText());
            if (pesoMaximo > 0) {
                int[][] matrizBeneficio = Mochila.obtenerMatrizMaximoBeneficio(objetos, pesoMaximo);
                modelo2.addColumn("OBJETOS");
                for (int i = 0; i <= pesoMaximo; i++) {
                    modelo2.addColumn(i + " Kg");
                }
                char inicial = 'A';
                for (int i = 1; i <= objetos.length; i++) {
                    ArrayList<String> conjunto = new ArrayList<>();
                    conjunto.add(String.valueOf(inicial));
                    for (int j = 0; j <= pesoMaximo; j++) {
                        conjunto.add(String.valueOf(matrizBeneficio[i][j]));
                    }
                    modelo2.addRow(conjunto.toArray());
                    inicial++;
                }
                String pos = Mochila.obtenerObjetosUtilizados(objetos, matrizBeneficio);
                modelo3.addColumn("OBJETO");
                modelo3.addColumn("PESO");
                modelo3.addColumn("BENEFICIO OBTENIDO");
                int total = 0;
                char[] posiciones = pos.toCharArray();
                for (int i = 0; i < posiciones.length; i++) {
                    int j = Character.getNumericValue(posiciones[i]);
                    String[] contenido = {"" + conversor(j), String.valueOf(objetos[j].peso), String.valueOf(objetos[j].beneficio)};
                    total = total + objetos[j].beneficio;
                    modelo3.addRow(contenido);
                }
                String[] total1 = {"TOTAL: ", "", "S/." + String.valueOf(total)};
                modelo3.addRow(total1);
                jButton1.setVisible(false);
                jButton2.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "INGRESA VALORES VALIDOS");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESA VALORES VALIDOS");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Ventana ventana=new Ventana();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private char conversor(int i) {
        char objeto = '-';
        switch (i) {
            case 0:
                objeto = 'A';
                break;
            case 1:
                objeto = 'B';
                break;
            case 2:
                objeto = 'C';
                break;
            case 3:
                objeto = 'D';
                break;
            case 4:
                objeto = 'E';
                break;
            case 5:
                objeto = 'F';
                break;
        }
        return objeto;
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
    private javax.swing.JTextField entradaPeso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tablaObjetos;
    private javax.swing.JTable tablaResumen;
    // End of variables declaration//GEN-END:variables
}
