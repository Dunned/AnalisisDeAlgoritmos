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
import dispersion.ReasignacionPorEncadenamiento;
import dispersion.ReasignacionPruebaCuadratica;
import dispersion.nodo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Encadenamiento extends javax.swing.JDialog {
    

    
    
    Instituto miInstituto = new Instituto("listaenlazada");
    
    
    public Encadenamiento(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        crearTablaHash();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    public void crearTablaHash(){
        int codigo[] = {154236,140627,123952,563100,235691,122695,322145,621300,300621,100960,100820, 100120, 200110, 204530, 100150,
        100012, 100213, 100250, 100540, 100420};
        String nombre[] = {"Chiki Carrion","Mariel Barrios","Jordi Salas","Jesus Andres","Pedro Vino","Matias Succar","Paolo Guerrero","Pedro Aquino","Carlos Villena","Eduardo Jauregui","Juan Rosales", "Ana Ramirez", "Rosa Huapaya",
        "Carlos Arana", "Raul Gonzales", "Pedro Mamani",
        "Rosario Pared", "Martha Huaman", "Saul Espino",
        "Karen Mendiola"};
        float pension[] = {367,560,367,742,521,652,265,963,177,322,320, 400, 300, 400, 350, 320, 450, 320, 450, 300};
        
        
        boolean flag;
        for (int i = 0; i < codigo.length; i++){
            flag = ReasignacionPorEncadenamiento.insertarEncadenamiento(miInstituto,codigo[i],nombre[i],pension[i]);
            if (flag==false) {
                System.out.println("Tabla llena");
            }
        }
        
        textArea.setEditable(false);
        for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++){
                nodo puntero=miInstituto.getAlumno(i);
                while (puntero!=null) {
                    
                    String contenido=String.format("\r%d\t%20s%10.2f\t------>",
                    puntero.contenido.getCodigoDelAlumno(),
                    puntero.contenido.getNombreDelAlumno(),
                    puntero.contenido.getPensionDelAlumno());  
                    textArea.append(contenido);
                    puntero=puntero.siguiente;
                }
                textArea.append(System.getProperty("line.separator"));
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REASIGNACION ENCADENAMIENTO (CLAVE:CODIGO)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

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

        textArea.setBackground(new java.awt.Color(0, 0, 0));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 790, 370));

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
            nodo pos = ReasignacionPorEncadenamiento.buscarEncadenamiento(miInstituto,codigo);
            if (pos != null && pos.contenido.getCodigoDelAlumno()==codigo && pos.contenido.getCodigoDelAlumno()!=0){
                JOptionPane.showMessageDialog(this,  
                        "\tAlumno Encontrado\n"+
                        "Codigo: "+pos.contenido.getCodigoDelAlumno()+ "\n"+                      
                        "Nombre: "+pos.contenido.getNombreDelAlumno()+ "\n"+    
                        "Pension: "+pos.contenido.getPensionDelAlumno());
            }
            else{
                JOptionPane.showMessageDialog(this, "Alumno con codigo: "+codigo+" no existe");
                cajaCodigoBuscar.setText("");
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo noValido");
            cajaCodigoBuscar.setText("");
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        String contenido=cajaCodigoBorrar.getText();
        try {
            int codigo=Integer.parseInt(contenido); 
            int hash=ReasignacionPorEncadenamiento.hash(codigo);
                        nodo puntero=miInstituto.getAlumno(hash);
                        if (puntero.contenido.getCodigoDelAlumno()==codigo) {
                            if (puntero.siguiente==null) {
                                miInstituto.setAlumno(hash, null);
                                puntero=null;
                            }
                            else{
                                miInstituto.setAlumno(hash, puntero.siguiente);
                                puntero=null;
                            }
                            textArea.setText(null);
                            for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++){
                                nodo puntero1=miInstituto.getAlumno(i);
                                while (puntero1!=null) {
                                    String contenido1=String.format("\r%d\t%20s%10.2f\t------>",
                                    puntero1.contenido.getCodigoDelAlumno(),
                                    puntero1.contenido.getNombreDelAlumno(),
                                    puntero1.contenido.getPensionDelAlumno());  
                                    textArea.append(contenido1);
                                    puntero1=puntero1.siguiente;
                                }
                                textArea.append(System.getProperty("line.separator"));
                            }   
                            
                        }
                        else{
                            boolean cambio=false;
                            while(puntero!=null){
                                if (puntero.siguiente!=null) {
                                    if (puntero.siguiente.contenido.getCodigoDelAlumno()==codigo) {
                                        puntero.siguiente=puntero.siguiente.siguiente;
                                        textArea.setText(null);
                                        for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++){
                                            nodo puntero1=miInstituto.getAlumno(i);
                                            while (puntero1!=null) {
                                                String contenido1=String.format("\r%d\t%20s%10.2f\t------>",
                                                puntero1.contenido.getCodigoDelAlumno(),
                                                puntero1.contenido.getNombreDelAlumno(),
                                                puntero1.contenido.getPensionDelAlumno());  
                                                textArea.append(contenido1);
                                                puntero1=puntero1.siguiente;
                                                cambio=true;
                                            }
                                            textArea.append(System.getProperty("line.separator"));
                                        }     
                                    }
                                }
                                puntero=puntero.siguiente;
                            }
                            
                            if (!cambio) {
                                JOptionPane.showMessageDialog(this, "Codigo No Existe");
                                cajaCodigoBuscar.setText(""); 
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "ELIMINADO CON EXITO");
                                cajaCodigoBuscar.setText(""); 
                            }
                        } 
                        
                           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo noValido");
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
            java.util.logging.Logger.getLogger(Encadenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encadenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encadenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encadenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                Encadenamiento dialog = new Encadenamiento(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
