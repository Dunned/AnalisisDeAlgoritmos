/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import dispersion.Instituto;
import dispersion.ReasignacionLineal;
import dispersion.ReasignacionPorArregloAnidado;
import dispersion.ReasignacionPorDobleDireccion;
import dispersion.ReasignacionPruebaCuadratica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ArregloAnidado extends javax.swing.JDialog {
    

    DefaultTableModel modelo=new DefaultTableModel(){
      @Override 
      public boolean isCellEditable(int row, int column) {
          return false;
        } 
    };   
    DefaultTableModel modelo2=new DefaultTableModel(){
      @Override 
      public boolean isCellEditable(int row, int column) {
          return false;
        } 
    };   
    
    
    Instituto miInstituto = new Instituto("arregloAnidado");
    
    
    public ArregloAnidado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        crearTablaHash();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void crearTablaHash(){
        int codigo[] = {154236,140627,123952,563100,235691,122695,322145,621300,300621,100960,100820, 100120, 200110,
                        204530, 100150,100012, 100213, 100250, 100540, 100420};
        String nombre[] = {"Chiki Carrion","Mariel Barrios","Jordi Salas","Jesus Andres",
                            "Pedro Vino","Matias Succar","Paolo Guerrero","Pedro Aquino",
                            "Carlos Villena","Eduardo Jauregui","Juan Rosales", "Ana Ramirez", "Rosa Huapaya",
                            "Carlos Arana", "Raul Gonzales", "Pedro Mamani",
                            "Rosario Paredes", "Martha Huaman", "Saul Espino",
                            "Karen Mendiola"};
        float pension[] = {367,560,367,742,521,652,1000,963,177,322,320, 400, 300, 400, 350, 320, 450, 320, 450, 300};
        
        
        boolean flag;
        for (int i = 0; i < codigo.length; i++){
            flag = ReasignacionPorArregloAnidado.InsertarArregloAnidado(miInstituto,codigo[i],nombre[i],pension[i]);
            if (flag==false) {
                System.out.println("Tabla llena");
            }
        }
        /*
         for (int i = 0; i < institutoanidado.getNumeroDeAlumnos(); i++){
            for (int j = 0; j < institutoanidado.getGrosor(); j++) {
                System.out.printf("\t%d\t%20s%10.2f\t*******",
                institutoanidado.getCodigoDelAlumno2(i,j),
                institutoanidado.getNombreDelAlumno2(i,j),
                institutoanidado.getPensionDelAlumno2(i,j));
            }
            System.out.println("\n");
        }*/

        //Tabla 1
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Pension");
        //Tabla2
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Pension");
        
        for(int i=0;i<miInstituto.getNumeroDeAlumnos();i++){ 
            for (int j = 0; j < miInstituto.getGrosor(); j++) {
                if (j==0) {
                    String[] contenido={String.valueOf(miInstituto.getCodigoDelAlumno2(i,j))
                           ,miInstituto.getNombreDelAlumno2(i,j)
                           ,String.valueOf(miInstituto.getPensionDelAlumno2(i,j))};
                    modelo.addRow(contenido);
                }
                else{
                    String[] contenido={String.valueOf(miInstituto.getCodigoDelAlumno2(i,j))
                           ,miInstituto.getNombreDelAlumno2(i,j)
                           ,String.valueOf(miInstituto.getPensionDelAlumno2(i,j))};
                    modelo2.addRow(contenido); 
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cajaCodigoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cajaCodigoBorrar = new javax.swing.JTextField();
        botonBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REASIGNACION DOBLE DIRECCION (CLAVE:CODIGO)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(modelo);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 470, 349));

        botonSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 120, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TABLA HASH(2ARREGLOS) DE 20 POSICIONES CLAVE: CODIGO ALUMNO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUSQUEDA POR CODIGO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 320, 40));

        cajaCodigoBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(cajaCodigoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 190, 40));

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BORRAR POR CODIGO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 320, -1));

        cajaCodigoBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(cajaCodigoBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 190, 40));

        botonBorrar.setText("BORRAR");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, 40));

        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable2.setModel(modelo2);
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 460, 349));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRIMER ARREGLO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 470, 20));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEGUNDO ARREGLO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String contenido=cajaCodigoBuscar.getText();
        try {
            int codigo=Integer.parseInt(contenido); 
            int[] posicion;
            posicion= ReasignacionPorArregloAnidado.buscarArregloAnidado(miInstituto,codigo);
            if (posicion!=null && miInstituto.getCodigoDelAlumno2(posicion[0],posicion[1])==codigo && codigo!=0){
                JOptionPane.showMessageDialog(this, 
                        "\tAlumno Encontrado\n"+
                        "Codigo: "+miInstituto.getCodigoDelAlumno2(posicion[0],posicion[1])+ "\n"+                      
                        "Nombre: "+miInstituto.getNombreDelAlumno2(posicion[0],posicion[1])+ "\n"+    
                        "Pension: "+miInstituto.getPensionDelAlumno2(posicion[0],posicion[1]));
            }
            else{
                JOptionPane.showMessageDialog(this, "Alumno con codigo: "+codigo+" no existe");
                cajaCodigoBuscar.setText("");
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo NO-Valido");
            cajaCodigoBuscar.setText("");
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        String contenido=cajaCodigoBorrar.getText();
        try {
            int codigo=Integer.parseInt(contenido); 
            int[] posicion;
            posicion= ReasignacionPorArregloAnidado.buscarArregloAnidado(miInstituto,codigo);
            if (posicion!=null && miInstituto.getCodigoDelAlumno2(posicion[0],posicion[1])==codigo && codigo!=0){
                JOptionPane.showMessageDialog(this, 
                        "\tAlumno ELIMINADO CON EXITO\n"+
                        "Codigo: "+miInstituto.getCodigoDelAlumno2(posicion[0],posicion[1])+ "\n"+                      
                        "Nombre: "+miInstituto.getNombreDelAlumno2(posicion[0],posicion[1])+ "\n"+    
                        "Pension: "+miInstituto.getPensionDelAlumno2(posicion[0],posicion[1]));
                miInstituto.setCodigoDelAlumno2(0, posicion[0],posicion[1]);
                miInstituto.setNombreDelAlumno2("", posicion[0],posicion[1]);
                miInstituto.setPensionDelAlumno2(0, posicion[0],posicion[1]);
                String[] vacio={"0","","0.0"};
                if (posicion[1]==0) {
                    modelo.insertRow(posicion[0], vacio);
                    modelo.removeRow(posicion[0]+1);  
                }
                else{
                    modelo2.insertRow(posicion[0], vacio);
                    modelo2.removeRow(posicion[0]+1);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Alumno con codigo: "+codigo+" no existe");
                cajaCodigoBuscar.setText("");
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo NO-Valido");
            cajaCodigoBuscar.setText("");
        } 
    }//GEN-LAST:event_botonBorrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ArregloAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArregloAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArregloAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArregloAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArregloAnidado dialog = new ArregloAnidado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField cajaCodigoBorrar;
    private javax.swing.JTextField cajaCodigoBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
