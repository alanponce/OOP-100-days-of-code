/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import CRUD.Create;//importamos las clase para poder crear un objeto con metodo para ir hacia esa forma

import CRUD.Read2;//importamos las clase para poder crear un objeto con metodo para ir hacia esa forma
import CRUD.CRUD;//importamos las clase para poder crear un objeto con metodo para ir hacia esa forma
import LogIn.login;
import javax.swing.JOptionPane;//importamos esta clase para mostrar paneles de mensajes


/**
 *
 * @author compu
 */
public class Menu1 extends javax.swing.JFrame {//menu

    /**
     * Creates new form Menu
     */
    public Menu1() {
        initComponents();    //iniciar los componentes o 
    setLocationRelativeTo(null);// iniciar la forma en el centro o de forma nula

    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        BAltas = new javax.swing.JRadioButton();
        BBajas = new javax.swing.JRadioButton();
        BCambios = new javax.swing.JRadioButton();
        BLecturas = new javax.swing.JRadioButton();
        BIr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecciona un Proceso");

        buttonGroup1.add(BAltas);
        BAltas.setText("Altas");

        buttonGroup1.add(BBajas);
        BBajas.setText("Bajas");

        buttonGroup1.add(BCambios);
        BCambios.setText("Cambios");

        buttonGroup1.add(BLecturas);
        BLecturas.setText("Lecturas");

        BIr.setText("Ir");
        BIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIrActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BBajas)
                            .addComponent(BAltas)
                            .addComponent(BLecturas)
                            .addComponent(BCambios)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BIr)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BBajas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCambios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLecturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(BIr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIrActionPerformed
        if (BAltas.isSelected()){//en caso de que seleccionemos este boton
               JOptionPane.showMessageDialog(this,"Seleccionaste Altas");
            Create ir = new Create();//crea un nuevo objeto de la clase create
            ir.setVisible(true);//usamos ese objeto con metodo de ir a la clase a la cual pertenece
            this.dispose();   //metodo para cerrar esta pantalla
        }
        if (BCambios.isSelected()){//en caso de que seleccionemos este boton
            JOptionPane.showMessageDialog(this,"Seleccionaste Cambios");
            CRUD ir = new CRUD();//crea un nuevo objeto de la clase update
            ir.setVisible(true);//usamos ese objeto con metodo de ir a la clase a la cual pertenece
            this.dispose();//metodo para cerrar esta pantalla
        }
        if (BLecturas.isSelected()){//en caso de que seleccionemos este boton
            JOptionPane.showMessageDialog(this,"Seleccionaste Lecturas");
            Read2 ir = new Read2();//crea un nuevo objeto de la clase read
            ir.setVisible(true);//usamos ese objeto con metodo de ir a la clase a la cual pertenece
            this.dispose();//metodo para cerrar esta pantalla
        }
    }//GEN-LAST:event_BIrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //metodo para salir de la ventana e ir a login
         int elecion = JOptionPane.showConfirmDialog(null, "Esta Seguro Que Desea Cerrar Sesion?");//mostrar un panel con mesaje y con botones de deciocion
    if  ( elecion == JOptionPane.YES_NO_OPTION ) {//en casp de que selecione si
       login ir = new login();//creamos un objeto ir que pertenece a la clase login 
       ir.setVisible(true);//hacemos visible la forma login ya que invocamos un objeto ir con el metodo de abrir la ventana
            this.dispose(); //cerrar esta ventana
    }
   if ( elecion == JOptionPane.NO_OPTION ) {//en caso de que seleccione que no
        JOptionPane.showMessageDialog(null, "Has seleccionado NO.");//mesaje
    }
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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BAltas;
    private javax.swing.JRadioButton BBajas;
    private javax.swing.JRadioButton BCambios;
    private javax.swing.JButton BIr;
    private javax.swing.JRadioButton BLecturas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
