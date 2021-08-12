/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import codigo.Floyd;
import codigo.Grafo;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    Grafo g = new Grafo();
    Panel p = new Panel(g);
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    char[] filtro;

    public Ventana() {

        initComponents();
        this.getContentPane().add(p);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        opcionesComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        origen = new javax.swing.JComboBox<>();
        fin = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        etiquetaLongitudTotal = new javax.swing.JLabel();
        etiquetaCaminosASeguir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALGORITMO DE FLOYD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        tabla.setBackground(new java.awt.Color(0, 204, 204));
        tabla.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tabla.setModel(modelo);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 430, 160));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HALLAR MATRIZ DE ADYACENCIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 270, -1));

        tabla2.setBackground(new java.awt.Color(102, 204, 0));
        tabla2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tabla2.setModel(modelo2);
        jScrollPane2.setViewportView(tabla2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 420, 160));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HALLAR MATRIZ DE CAMINOS MINIMOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jTable1.setModel(modelo3);
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 410, 160));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HALLAR MATRIZ DE RECORRIDO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PUNTO FINAL:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 760, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("PUNTO ORIGEN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 700, -1, -1));

        origen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                origenItemStateChanged(evt);
            }
        });
        origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenActionPerformed(evt);
            }
        });
        jPanel1.add(origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 700, 170, 30));

        fin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                finItemStateChanged(evt);
            }
        });
        jPanel1.add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 760, 170, 30));

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton4.setText("HALLAR RUTA MINIMA!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 820, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, 390, 120));

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiquetaLongitudTotal.setBackground(new java.awt.Color(255, 102, 51));
        etiquetaLongitudTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiquetaLongitudTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        etiquetaCaminosASeguir.setBackground(new java.awt.Color(255, 102, 51));
        etiquetaCaminosASeguir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiquetaCaminosASeguir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("LONGITUD TOTAL");

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("CAMINOS A SEGUIR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCaminosASeguir, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(etiquetaLongitudTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaLongitudTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCaminosASeguir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 870, 480, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[][] matriz = g.matrizAdyacencia();

        for (int i = 0; i <= g.tamanio(); i++) {
            if (i == 0) {
                modelo.addColumn("-");
                continue;
            }
            modelo.addColumn("" + g.vertices[i - 1]);
        }
        for (int i = 0; i < g.tamanio(); i++) {
            String[] contenido = new String[g.tamanio() + 1];
            contenido[0] = "" + g.vertices[i];
            for (int j = 0; j < matriz.length; j++) {
                contenido[j + 1] = String.valueOf(matriz[i][j]);
            }
            modelo.addRow(contenido);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int[][] matriz = g.matrizAdyacencia();
        int[][] matrizFinal = Floyd.hallarMatrizCaminosMinimos(matriz);

        for (int i = 0; i <= g.tamanio(); i++) {
            if (i == 0) {
                modelo2.addColumn("-");
                continue;
            }
            modelo2.addColumn("" + g.vertices[i - 1]);
        }
        for (int i = 0; i < g.tamanio(); i++) {
            String[] contenido = new String[g.tamanio() + 1];
            contenido[0] = "" + g.vertices[i];
            for (int j = 0; j < matrizFinal.length; j++) {
                contenido[j + 1] = String.valueOf(matrizFinal[i][j]);
            }
            modelo2.addRow(contenido);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int[][] matriz = g.matrizAdyacencia();
        int[][] matrizRecorrido = Floyd.hallarMatrizRecorrido(matriz);
        char[][] matrizRecorridoChar = new char[g.vertices.length][g.vertices.length];
        for (int i = 0; i < g.vertices.length; i++) {
            for (int j = 0; j < g.vertices.length; j++) {
                matrizRecorridoChar[i][j] = conversorAChar(matrizRecorrido[i][j]);
            }
        }
        for (int i = 0; i <= g.tamanio(); i++) {
            if (i == 0) {
                modelo3.addColumn("-");
                continue;
            }
            modelo3.addColumn("" + g.vertices[i - 1]);
        }
        for (int i = 0; i < g.tamanio(); i++) {
            String[] contenido = new String[g.tamanio() + 1];
            contenido[0] = "" + g.vertices[i];
            for (int j = 0; j < matrizRecorrido.length; j++) {
                contenido[j + 1] = String.valueOf(matrizRecorridoChar[i][j]);
            }
            modelo3.addRow(contenido);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void opcionesComboBox() {
        for (int i = 0; i < g.vertices.length; i++) {
            origen.addItem("NODO " + g.vertices[i]);
            fin.addItem("NODO " + g.vertices[i]);
        }
    }

    private void origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenActionPerformed

    }//GEN-LAST:event_origenActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String comienzo = (String) origen.getSelectedItem();
        String termino = (String) fin.getSelectedItem();
        String[] nodo1 = comienzo.split(" ");
        String[] nodo2 = termino.split(" ");
        comienzo = nodo1[1];
        termino = nodo2[1];
        busquedaRecorridoMinimo(comienzo.charAt(0), termino.charAt(0));
        caminosASeguir(comienzo.charAt(0), termino.charAt(0));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void origenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_origenItemStateChanged
        this.etiquetaCaminosASeguir.setText("");
        this.etiquetaLongitudTotal.setText("");
        p.reiniciar();
    }//GEN-LAST:event_origenItemStateChanged

    private void finItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_finItemStateChanged
        this.etiquetaCaminosASeguir.setText("");
        this.etiquetaLongitudTotal.setText("");
        p.reiniciar();
    }//GEN-LAST:event_finItemStateChanged

    public void busquedaRecorridoMinimo(char comienzo, char termino) {
        if (comienzo == termino) {
            etiquetaLongitudTotal.setText("!ESTAS EN EL MISMO LUGAR!");

        } else {
            int i = conversorANumero(comienzo);
            int f = conversorANumero(termino);
            int[][] matriz = Floyd.hallarMatrizCaminosMinimos(g.matrizAdyacencia());
            int minimo = matriz[i][f];
            if (minimo == 9999) {
                etiquetaLongitudTotal.setText("NO EXISTE CAMINO");
            } else {
                etiquetaLongitudTotal.setText("RECORRIDO MIN: " + minimo);
            }
        }
    }

    private void caminosASeguir(char comienzo, char termino) {
        if (comienzo == termino) {
            etiquetaCaminosASeguir.setText("!ESTAS EN EL MISMO LUGAR!");
        } else {
            String contenido = "";
            int[][] matrizDeRecorridos = Floyd.hallarMatrizRecorrido(g.matrizAdyacencia());
            if (matrizDeRecorridos[conversorANumero(comienzo)][conversorANumero(termino)] == -1 && g.matrizAdyacencia()[conversorANumero(comienzo)][conversorANumero(termino)]==9999) {
                etiquetaCaminosASeguir.setText("");
            } else {
                ArrayList<Integer> recorrido = new ArrayList<>();
                recorrido.add(conversorANumero(comienzo));
                recorrido.add(conversorANumero(termino));
                Floyd.hallarCamino(matrizDeRecorridos, recorrido, conversorANumero(comienzo), conversorANumero(termino));
                filtro = new char[recorrido.size()];
                for (int i = 0; i < recorrido.size(); i++) {
                    filtro[i] = conversorAChar(recorrido.get(i));
                }
                for (int i = 0; i < filtro.length; i++) {
                    if (i == filtro.length - 1) {
                        contenido = contenido + filtro[i];
                    } else {
                        contenido = contenido + filtro[i] + "--->";
                    }
                }
                etiquetaCaminosASeguir.setText(contenido);
                this.p.trazar(true, filtro);
            }
        }
    }

    private int conversorANumero(char termino) {
        int retorno = 0;
        switch (termino) {
            case 'A':
                retorno = 0;
                break;
            case 'B':
                retorno = 1;
                break;
            case 'C':
                retorno = 2;
                break;
            case 'D':
                retorno = 3;
                break;
            case 'E':
                retorno = 4;
                break;
            case 'F':
                retorno = 5;
                break;
            case 'G':
                retorno = 6;
                break;
            case 'H':
                retorno = 7;
                break;
        }
        return retorno;
    }

    private char conversorAChar(int termino) {
        char retorno = 0;
        switch (termino) {
            case -1:
                retorno = '-';
                break;
            case 0:
                retorno = 'A';
                break;
            case 1:
                retorno = 'B';
                break;
            case 2:
                retorno = 'C';
                break;
            case 3:
                retorno = 'D';
                break;
            case 4:
                retorno = 'E';
                break;
            case 5:
                retorno = 'F';
                break;
            case 6:
                retorno = 'G';
                break;
            case 7:
                retorno = 'H';
                break;
        }
        return retorno;
    }

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
    private javax.swing.JLabel etiquetaCaminosASeguir;
    private javax.swing.JLabel etiquetaLongitudTotal;
    private javax.swing.JComboBox<String> fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
