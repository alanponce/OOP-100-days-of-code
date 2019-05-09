/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Proyecto.Basedatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ENEMY345
 */
public class MenuRegistro extends javax.swing.JFrame {

    /**
     * Creates new form MenuRegistro
     */
    public MenuRegistro() {
        initComponents();
        //this.setLocationRelativeTo(null); nos centra la ventana
        this.setLocationRelativeTo(null);
        //ocultar nos elimina el texto de los textbox
        Eliminar();
    }
    
    private void Eliminar()//los declaro privados porque no ocupo utilizar este metodo en otras formas
    {
        this.jt_Matricula.setText("");
        this.jt_Modelo.setText("");
        this.jt_Color.setText("");
        this.jt_Llantas.setText("");
        this.jt_Placa.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Matricula = new javax.swing.JLabel();
        jl_Modelo = new javax.swing.JLabel();
        jl_Color = new javax.swing.JLabel();
        jl_Llantas = new javax.swing.JLabel();
        jl_Placa = new javax.swing.JLabel();
        jt_Matricula = new javax.swing.JTextField();
        jt_Modelo = new javax.swing.JTextField();
        jt_Color = new javax.swing.JTextField();
        jt_Llantas = new javax.swing.JTextField();
        jt_Placa = new javax.swing.JTextField();
        jb_Registrar = new javax.swing.JButton();
        jb_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_Matricula.setText("Matricula:");

        jl_Modelo.setText("Modelo:");

        jl_Color.setText("Color:");

        jl_Llantas.setText("Llantas:");

        jl_Placa.setText("Placa:");

        jt_Matricula.setText("jTextField1");

        jt_Modelo.setText("jTextField2");

        jt_Color.setText("jTextField3");

        jt_Llantas.setText("jTextField4");

        jt_Placa.setText("jTextField5");

        jb_Registrar.setText("Registrar");
        jb_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_RegistrarActionPerformed(evt);
            }
        });

        jb_Regresar.setText("Regresar");
        jb_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jl_Matricula)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jl_Modelo)
                                    .addGap(27, 27, 27)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Color)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_Llantas)
                            .addGap(27, 27, 27)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Placa)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jt_Placa)
                    .addComponent(jt_Llantas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Color, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Modelo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Matricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Registrar)
                .addGap(76, 76, 76)
                .addComponent(jb_Regresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Matricula)
                    .addComponent(jt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Modelo)
                    .addComponent(jt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Color)
                    .addComponent(jt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Llantas)
                    .addComponent(jt_Llantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Placa)
                    .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Registrar)
                    .addComponent(jb_Regresar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_RegistrarActionPerformed
        Basedatos db = new Basedatos();//instanciamos un objeto de la clase Basededatos
        Connection con = db.Conexion();//Declaramos una variable de tipo connection para poder conectarnos a la base de datos
        //Declaramos variables de tipo string que almacenaran los datos de los textbox para pasarlos a la base de datos
        String matricula, modelo, color, llantas, placa;
        //Declaramos la variable sql que nos ayudara a indicar donde poner los datos en la basen utilizo final porque no necesitare mover mas ese parametro
        final String sql;
        //Le asignamos los datos de las textbox a las variables
        matricula = this.jt_Matricula.getText();
        modelo    = this.jt_Modelo.getText();
        color     = this.jt_Color.getText();
        llantas   = this.jt_Llantas.getText();
        placa     = this.jt_Placa.getText();
        
        //le asignamos estos parametros a sql para que la base de datos coloque los valores en sun lugar
        //insert into = insertar en
        //registro = el numero de la tabla, ya que en la clase base de datos, ya accedimos a la base de datos
        //(Matricula, Modelo, Color, Llantas, Placa) = los valores que rellenaremos
        //values(?,?,?,?,?) = nos indica cuantos valores vamos a meter en la tabla en este caso 5
        sql = "insert into registro (Matricula, Modelo, Color, Llantas, Placa) values(?,?,?,?,?)";
        //Declaramos una variable de tipo PreparedStatement que nos pone los datos en una cola para enviarlos
        PreparedStatement preparado;
        //intentamos enviarle los datos a la direccion de sql
        try {
            //le  asignamos el valor de la variable con a preparado y accedemos al metodo prepareStatement que prepara los datos para enviarlos
            preparado = con.prepareStatement(sql);
            //le asignamos los valores a con para que los envie
            //el primer parametro que pide setString es la columna en la que se insertara el dato y el segundo el valor a insertar
            preparado.setString(1, matricula);
            preparado.setString(2, modelo);
            preparado.setString(3, color);
            preparado.setString(4, llantas);
            preparado.setString(5, placa);
            //Declaramos n como entero porque  executeUpdate() nos regresa un valor entero como puede ser 1 informando que si se envio algun valor o 0 de que no se envio nada
            //Enviamos los datos a la base con executeUpdate()
            int n = preparado.executeUpdate();
            //Verificamos que se envio el dato con una ventana
            if(n>0)
            {
                JOptionPane.showMessageDialog(null, "guardado");
            }
            //si ocurre un error nos lo hace saber
        } catch (SQLException ex) {
            Logger.getLogger(MenuRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jb_RegistrarActionPerformed

    private void jb_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_RegresarActionPerformed
        //dispose(); nos permite cerrar una ventana sin cerrar todo el proyecto
        this.dispose();
    }//GEN-LAST:event_jb_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Registrar;
    private javax.swing.JButton jb_Regresar;
    private javax.swing.JLabel jl_Color;
    private javax.swing.JLabel jl_Llantas;
    private javax.swing.JLabel jl_Matricula;
    private javax.swing.JLabel jl_Modelo;
    private javax.swing.JLabel jl_Placa;
    private javax.swing.JTextField jt_Color;
    private javax.swing.JTextField jt_Llantas;
    private javax.swing.JTextField jt_Matricula;
    private javax.swing.JTextField jt_Modelo;
    private javax.swing.JTextField jt_Placa;
    // End of variables declaration//GEN-END:variables
}
