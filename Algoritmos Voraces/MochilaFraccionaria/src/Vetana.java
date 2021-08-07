
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
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
public class Vetana extends javax.swing.JFrame {

    Objetos o1 = new Objetos("Hierro", 30, 20);
    Objetos o2 = new Objetos("Zinc", 55, 50);
    Objetos o3 = new Objetos("Carbon", 40, 40);
    Objetos o4 = new Objetos("Oro", 65, 30);
    Objetos o5 = new Objetos("Plata", 20, 10);
    Objetos[] objetos = {o1, o2, o3, o4, o5};

    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();

    public Vetana() {
        initComponents();
        cargarTablaObjetos();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        botonReiniciar.setVisible(false);
        
    }

    private void cargarTablaObjetos() {
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Peso");
        modelo1.addColumn("Beneficio");
        for (int i = 0; i < objetos.length; i++) {
            String[] contenido = {objetos[i].nombre, String.valueOf(objetos[i].peso) + " Kg.", String.valueOf(objetos[i].valor)};
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tamañoMochila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tituloOrden = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        escogidos = new javax.swing.JLabel();
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROBLEMA DE LA MOCHILA FRACCIONARIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 102, 102));

        jTable1.setBackground(new java.awt.Color(255, 102, 102));
        jTable1.setModel(modelo1);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 323, 109));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("OBJETOS PARA SELECCIONAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jTable2.setModel(modelo2);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 111));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("ESCOGER POR MAXIMO BENEFICIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));
        jPanel1.add(tamañoMochila, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 143, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("TAMAÑO DE LA MOCHILA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        tituloOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloOrden.setForeground(new java.awt.Color(255, 255, 255));
        tituloOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tituloOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 453, 20));

        jTable3.setModel(modelo3);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 470, 140));

        escogidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        escogidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(escogidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 470, 30));

        botonReiniciar.setText("REINICIAR PROGRAMA");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(botonReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            double tamanio = Double.parseDouble(tamañoMochila.getText());
            tituloOrden.setText("OBJETOS ORDENADOS POR (BENEFICIO/PESO)");
            MochilaFraccionaria mochilaFraccionaria = new MochilaFraccionaria();
            double[] sol = {0, 0, 0, 0, 0};
            mochilaFraccionaria.Voraz(objetos, sol, tamanio);
            modelo2.addColumn("Nombre");
            modelo2.addColumn("Peso");
            modelo2.addColumn("Beneficio");
            modelo2.addColumn("Beneficio/Peso");
            for (int i = 0; i < objetos.length; i++) {
                String[] contenido = {objetos[i].nombre, String.valueOf(objetos[i].peso) + " Kg.", String.valueOf(objetos[i].valor), String.valueOf(objetos[i].valorPeso)};
                modelo2.addRow(contenido);
            }
            modelo3.addColumn("NOMBRE");
            modelo3.addColumn("PESO ESCOGIDO");
            modelo3.addColumn("BENEFICIO OBTENIDO");
            escogidos.setText("OBJETOS PARA MAXIMO BENEFICIO");
            double beneficioTotal = 0;
            double pesoTotal = 0;
            int pos=0;
            for (int i = 0; i < sol.length; i++) {
                if (sol[i] > 0) {
                    double peso = objetos[i].peso * sol[i];
                    double beneficio = objetos[i].valor * sol[i];
                    pesoTotal = pesoTotal + peso;
                    beneficioTotal = beneficioTotal + beneficio;
                    String nombre = objetos[i].nombre;
                    String[] contenido = {nombre, String.valueOf(peso) + " Kg.", "S/." + String.valueOf(beneficio)};
                    modelo3.addRow(contenido);
                    pos++;
                } 
            }
            String[] contenido = {"TOTAL", String.valueOf(pesoTotal) + " Kg.", "S/." + String.valueOf(beneficioTotal)};
            modelo3.addRow(contenido);
            jTable3.addRowSelectionInterval(pos, pos);
            jButton1.setEnabled(false);
            botonReiniciar.setVisible(true);
            
            if (pesoTotal<tamanio) {
                JOptionPane.showMessageDialog(this, "NO HAY SUFICIENTES OBJETOS PARA LLENAR TODA LA MOCHILA");
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "INTRODUZCA VALORES VALIDOS");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        this.dispose();
        Vetana vetana=new Vetana();
        vetana.setVisible(true);
    }//GEN-LAST:event_botonReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vetana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JLabel escogidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField tamañoMochila;
    private javax.swing.JLabel tituloOrden;
    // End of variables declaration//GEN-END:variables
}
