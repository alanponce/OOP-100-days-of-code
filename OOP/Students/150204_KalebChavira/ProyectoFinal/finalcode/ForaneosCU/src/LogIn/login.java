/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;//indica que este codigo pertenece al paquete de login

import CRUD.CRUD;////importamos la clase para poder invocar un objeto de esa clase
import CRUD.Create;//importamos la clase para poder invocar un objeto de esa clase
import java.awt.TextField;//importamos la clase de un nuevo campo de texto e implementar la contrtaseña cifrada
import javax.swing.JOptionPane;//importamos la clase para poder sacar mensajes de pantalla


public class login extends javax.swing.JFrame {

   // private Component confirmation;//componente para confirmar el inicio de sesion 
    private static String admin,acontraseña,usuario,contraseña; //variables para los usuarios y contraseñas, privasos para que nadie tenga acceso a modificar y staticos para no ser modoficados
    
    
    public login() {//constructor de la clase login
        initComponents();//iniciar los componentes o los 
    this.setLocationRelativeTo(null);//centrar la forma a la hora de correrla
   
    }
    public void datos(String us, String con, String ad, String acon){// constructor de datos de usuario y admin
    usuario=   "angel";//valor del usuario
    contraseña = "angel123";//valor de la contraseña
    admin= "kaleb";//valor de la contraseña del administrador
    acontraseña= "kaleb123";//valor de la contraseña del administrador
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        txtcontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BIniciar.setText("Entrar");
        BIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Foraneos CU");

        jLabel4.setText("LogIn");

        bCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtcontraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(bCancelar)
                        .addGap(71, 71, 71)
                        .addComponent(BIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BIniciar)
                    .addComponent(bCancelar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {  //evento del boton de cancelar
  int ax = JOptionPane.showConfirmDialog(null, "Esta Seguro Que Desea Salir?");//mensjae de opciones donde indica opciones con botones
    if  ( ax == JOptionPane.YES_NO_OPTION ) {//en caso de que demos click en la opcion de yes
        JOptionPane.showMessageDialog(null,"Hasta Pronto,Que Tengas Un Buen Dia.");//mensaje de que vas  a salir
        System.exit(0);//metodo de salir del sistema
    }
   if ( ax == JOptionPane.NO_OPTION ) {//en caso de que des click en el no
        JOptionPane.showMessageDialog(null, "Has seleccionado NO.");//mensaje donde te indica que diste click en el no
    }
    }  

        private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) { //se ejecuta este evento al dar clic en este campo de txt                                             
   TextField contraseña = new TextField();//crea un nuevo campo de txt ubicadp en el campo de contraseña
contraseña.setEchoChar('*');//la contraseña con el metodo echochar se ira llenando de signos *
    }           
    private void BIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarActionPerformed
        //se ejecutara las siguientes lineas de accion al dar click en el boton de inciar
        
        datos (usuario,contraseña,admin,acontraseña);//invoca el constructo de datos y invoca sus valores
         if(usuario.equals(txtusuario.getText())||admin.equals(txtcontraseña.getText()) && contraseña.equals(txtcontraseña.getText())||acontraseña.equals(txtcontraseña.getText())){//en caso de que el usuario y la constraseña de del recepcionista y el admin sean igual a las del texto
          if(usuario.equals(txtusuario.getText())){//si los datos ingresados son igual al user del recepcionista
              JOptionPane.showMessageDialog(null, "Bienvenido Recepcionista\nA continuacion\nEl Create...");//da un mensaje de bienvenida al recpcionista
              Create ir = new Create();//creamos un objeto de la clase create
              ir.setVisible(true);//usamos el objeto junto con un metodo para hacer visible la clase create de valor verdadero
              this.dispose();//este metodo hace que esta clase se cierre
          }  
          else if (admin.equals(txtusuario.getText())){//en caso de que lo ingresado en el usuario sea igual al usuario del admin
              JOptionPane.showMessageDialog(null, "Bienvenido Adimnistrador\nA continuacion\nEl Menu...");//mandamos un mensaje de bienvenida
              CRUD ir = new CRUD();//creamos un objeto de la clase crud
              ir.setVisible(true);//con el objeto ir utilizamos un metodo para invocar la clase crud
              this.dispose();//metodo para que esta clase se cierre
          }
             
    }//GEN-LAST:event_BIniciarActionPerformed

    else if(txtusuario.getText().equals("") && txtcontraseña.getText().equals("")){//en caso de que los campos de usuario y contraseña esten vacios
        JOptionPane.showMessageDialog(this,"Usuario y Contraseña estan vacios\nIngrese los por favor.");//mandamos un mensaje de alerta
        txtusuario.setFocusable(true);//hacemos que el campo de usuario sea el enfocque principal de la metodo anterior
    }else if(txtusuario.getText().equals("")){//en caso de que solo el usurio este vacio
        JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");//mensaje de alerta de que el campo de usuario este vacio
        txtusuario.setFocusable(true);//hacemos que de nuevo el campo de usuario sea el enfocque
    }else if(txtcontraseña.getText().equals("")){//en caso de que la contraseña sea vacia
        JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");//mensjae de alerta de que la constraseña esta vacia
        txtcontraseña.setFocusable(true);//ahora hacemos de que la cotraseña sea el enfoque
    }
    else if(txtusuario.getText().compareTo(usuario)!=0 && txtcontraseña.getText().compareTo(contraseña)!=0){//en caso de que el usuario y la contraseña sean incorrectos
        JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");//mesnaje de alerta de que ambos campos estan incorectos
         txtusuario.setFocusable(true);//hacemos que el campo de usuario sea en enfoque de nuevo
    }
    else if(txtusuario.getText().compareTo(usuario)!=0){//en caso de que el usuario esta incorrecto
        JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");//mesnaje de alerta
        txtusuario.setFocusable(true);//enfocamos el usuario
    }
    else if(txtcontraseña.getText().compareTo(contraseña)!=0){//en caso de que la constraseña sea la incorrecta
        JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");//mesnaje de alerta de constraseña incorrecta
        txtcontraseña.setFocusable(true);//constraseña sea el enfoque
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
