/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.Connection;//importamos libreria para que haga la conexion ala bd
import java.sql.DriverManager;//importamos libreria para cargar el driver donde se ubica el bd
import java.sql.ResultSet;//importamos libreria para arrojar resultados de en las tablas y se vea reflejada la bd
import java.sql.SQLException;//importamos libreria para generar las excepciones de los errores
import java.sql.Statement;//importamos libreria para poder cargar la sentencia sql dependiedo de la accion a realizae
import java.util.logging.Level;//importamos esta clase para que nos diga los tipos de errores que se encuentra en el codigo
import java.util.logging.Logger;//importamos esta clase para hacer la indicacion del error en el codigo
import javax.swing.JOptionPane;//para mostrar paneles de mensajes
import javax.swing.table.DefaultTableModel;// importamos esta clase para poder cargar una tabla por default y mostrar los resultados de la bd

/**
 * @author KALEB
 */
public class CRUD extends javax.swing.JFrame {//clase donde se realiza el crud y hereda de la clase Frame para poder utilizar la forma de swing
    DefaultTableModel modelo = new DefaultTableModel();//creamos una tabla por defualt el cual servira como base para la informacion de la bd
       Connection conexion;// creamos una variable llamada conexion para hacer la conexion
Statement sentencia;// creamos una variables para hacer las sentencias sql

    public CRUD() {//constructor de la clase crud
        initComponents();//inicia los componentes de la forma
        conectatarBaseDatos();//conecta el sistema con la base de datos

     
    }
    
       public void conectatarBaseDatos() {// constructor que conecta la base de datos con el codigo
        try {
           
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Linea que carga el driver
           JOptionPane.showMessageDialog(null, "Cargo el driver");//mensaje
        } catch (ClassNotFoundException e) {//en caso de que no funcione el driver
            JOptionPane.showMessageDialog(null, "Error al cargar Dirver");//mensaje
        }
        try {
  conexion = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\compu\\OneDrive\\Documentos\\BD\\hotel.accdb");//busca la ubicacion de la BD y se enlaza
  JOptionPane.showMessageDialog(null,"Encontro la direccion");//mensaje

  //"jdbc:ucanaccess://C:\\Proyecto.accdb"
//En esta parte tenemos que cambiar la ruta en la que se encuentra nuestra base de datos 
//Ejemplo "jdbc:ucanaccess://C:\\Proyecto.accdb" hace referencia que esta en el disco local C
//JOptionPane.showMessageDialog(null, "Encontro la direccion");
        } catch (SQLException e) {// en caso de que no carge la sentencia hace una Exception la cual no encuentra la direccion
            JOptionPane.showMessageDialog(null, "Error en la dirección de la base de datos");//menasje
        }
        try {
            sentencia = conexion.createStatement();// crea una sentencia para poder mandar el codigo de sql
           JOptionPane.showMessageDialog(null, "Cargo la sentencia");//mensaje
        } catch (SQLException e) {//en caso de que no carge la sentencia busca otra exception para identificar el error
            JOptionPane.showMessageDialog(null, "Error al crear la conexión con la base de datos");// mensaje
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        tTipo = new javax.swing.JTextField();
        tCantidad = new javax.swing.JTextField();
        tEntrada = new javax.swing.JTextField();
        tSalida = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        Busqueda = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "Nombre", "Tipo de Habitacion:", "Cantidad de Habitaciones:", "Dia de Entrada", "Dia de Salida", "Telefono:"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        scrollPane1.add(jScrollPane1);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tipo de Habitacion:");

        jLabel4.setText("Canitdad de Habitacion:");

        jLabel5.setText("Dia de Entrada:");

        jLabel6.setText("Dia de Salida:");

        jLabel7.setText("Telefono");

        Busqueda.setText("Busqueda");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        jLabel8.setText("Ejemplo: 12/12/2012");

        jLabel9.setText("Ejemplo: 12/12/2012");

        jLabel10.setText("Ejemplo: 6561234567");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNombre)
                            .addComponent(tTipo)
                            .addComponent(tCantidad)
                            .addComponent(tEntrada)
                            .addComponent(tSalida)
                            .addComponent(tTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TId, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Busqueda)
                                .addGap(21, 21, 21)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Modificar)
                                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Crear)
                                    .addComponent(bEliminar)))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Busqueda, Crear, Limpiar, Modificar, bEliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busqueda)
                    .addComponent(Crear)
                    .addComponent(Limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar)
                    .addComponent(bEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Busqueda, Crear, Limpiar, Modificar, bEliminar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
 String campo = TId.getText();//cremaos un string capturando el dato del id para buscar
        String WHERE = "";//creamos un string llamado where para identificar el id de la accion a realizar
        if (!"".equals(campo)) {//en caso de que campo del id no este vacio
            WHERE = "WHERE ID = '" + campo + "'";//guardamos el string where en forma de sql
        }
        
 DefaultTableModel tabla = new DefaultTableModel(); //cargamos la tabla por default
   tabla.addColumn("ID");//añadir columna de ID del registro de la bd
        tabla.addColumn("Nombre");//añadir columna de Nombre del registro de la bd
        tabla.addColumn("TipoHabitacion");//añadir columna del tipo de habitacion del registro de la bd
        tabla.addColumn("NHabitacion");//añadir columna de ID del registro de la bd
        tabla.addColumn("DiaEntrada");//añadir columna de ID del registro de la bd
        tabla.addColumn("DiaSalida");//añadir columna de ID del registro de la bd
        tabla.addColumn("Telefono");//añadir columna de ID del registro de la bd
        this.tabla.setModel(tabla);//indicamos que nuestra tabla nueva se guardara en la de por defualt
        
      String altas[] = new String[7];    //Variable que almacena los datos de la consulta
        String sql = "SELECT  ID, Nombre , TipoHabitacion , NHabitacion , DiaEntrada , DiaSalida , Telefono from Altas " + WHERE ;  //Consulta sql
        try {
            ResultSet resultado = sentencia.executeQuery(sql);  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida dodne se guardan los datos de la bd
                altas[0] = resultado.getString("ID");
                altas[1] = resultado.getString("Nombre");
                altas[2] = resultado.getString("TipoHabitacion");
                altas[3] = resultado.getString("NHabitacion");
                altas[4] = resultado.getString("DiaEntrada");
                altas[5] = resultado.getString("DiaSalida");
                altas[6] = resultado.getString("Telefono");
                tabla.addRow(altas);//añadimos todos los datos de la bd en forma de lineas
                  TId.setText(resultado.getString("ID"));//aqui mostramios los datos de la tabla en los campos de la informacion
                tNombre.setText(resultado.getString("Nombre"));
                  tTipo.setText(resultado.getString("TipoHabitacion"));
                tCantidad.setText(resultado.getString("NHabitacion"));
                  tEntrada.setText(resultado.getString("DiaEntrada"));
                tSalida.setText(resultado.getString("DiaSalida"));
                tTelefono.setText(resultado.getString("Telefono"));
            }
            
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n");//mensaje
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);//arroja el error que tuvo el codigo de sql
        }
        
    }//GEN-LAST:event_BusquedaActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
TId.setText(null);//limpiamos los siguentes campos para que esten vacios con el null y listos para usar o para rellenar
tNombre.setText(null);
tTipo.setText(null);
tCantidad.setText(null);
tEntrada.setText(null);
tSalida.setText(null);
tTelefono.setText(null);

    }//GEN-LAST:event_LimpiarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
 String campo = TId.getText();//cremaos un string capturando el dato del id para buscar
        String WHERE = "";//creamos un string llamado where para identificar el id de la accion a realizar
        if (!"".equals(campo)) {//en caso de que campo del id no este vacio
            WHERE = "WHERE ID = '" + campo + "'";//guardamos el string where en forma de sql
        }
        String nombre = this.tNombre.getText(); // caputuaramos el nombre de la persona
String tipohabitacion = this.tTipo.getText();// caputamos el tipo de habitacion el cual se asigno en el botones
    String NHabitacion = this.tCantidad.getText();//caputramos la cantidad de habitaciones
    String diaentrada = this.tEntrada.getText();//caputaramos el dia de la entrada
 String diasalida = this.tSalida.getText();//caputaramos el dia de la salida
String telefono = this.tTelefono.getText();
    
    //estos formatos de abajo son los solicitados por el sql de access para poder recibir los datos
nombre    = "'" + nombre + "'";
tipohabitacion = "'" + tipohabitacion + "'";
 NHabitacion  = "'" + NHabitacion + "'";
 diaentrada = "'" + diaentrada + "'";
 diasalida = "'" + diasalida + "'";
 telefono = "'" + telefono + "'";
 
 //string de como se guardan los datos ingresados en codigo sql que se manda a la bd y realiza la sentencia
 String sql = "UPDATE Altas SET Nombre="+nombre+", TipoHabitacion="+tipohabitacion+", NHabitacion="+NHabitacion+", DiaEntrada="+diaentrada+", DiaSalida="+diasalida+", Telefono="+ telefono + WHERE;
    try {
        
        sentencia.executeUpdate(sql);//sentencia hace que el codigo sql se actualice en la base de datos y hace que los datos se guarden
        JOptionPane.showMessageDialog(this, "Los datos han sido modificados");//mensaje
        } catch (SQLException ex) {//hace una excepcion en caso de que no se ejecute el codigo sql
        Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);//arroja el error que tuvo el codigo de sql
         JOptionPane.showMessageDialog(null, "Error, sus datos no fueron ingresados\n" + ex);//mensaje de error

        }          // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
String campo = TId.getText();//cremaos un string capturando el dato del id para buscar
        String WHERE = "";//creamos un string llamado where para identificar el id de la accion a realizar
        if (!"".equals(campo)) {//en caso de que campo del id no este vacio
            WHERE = "WHERE ID = '" + campo + "'";//guardamos el string where en forma de sql
        }
        String sql = "Delete From Altas " + WHERE; //arroja el error que tuvo el codigo de sql
        try {
            sentencia.executeUpdate(sql);//sentencia hace que el codigo sql se actualice en la base de datos y hace que los datos se guarden
            JOptionPane.showMessageDialog(null, "Registro Borrado");//mensjae de borrado
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);//linea de codigo que arroja la excepcion para el error en del trycatch
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
String nombre = this.tNombre.getText(); // caputuaramos el nombre de la persona
String tipohabitacion = this.tTipo.getText();// caputamos el tipo de habitacion el cual se asigno en el botones
    String NHabitacion = this.tCantidad.getText();//caputramos la cantidad de habitaciones
    String diaentrada = this.tEntrada.getText();//caputaramos el dia de la entrada
 String diasalida = this.tSalida.getText();//caputaramos el dia de la salida
String telefono = this.tTelefono.getText();
    
    //estos formatos de abajo son los solicitados por el sql de access para poder recibir los datos
nombre    = "'" + nombre + "'";
tipohabitacion = "'" + tipohabitacion + "'";
 NHabitacion  = "'" + NHabitacion + "'";
 diaentrada = "'" + diaentrada + "'";
 diasalida = "'" + diasalida + "'";
 telefono = "'" + telefono + "'";
 
 //string de como se guardan los datos ingresados en codigo sql que se manda a la bd y realiza la sentencia
 String sql = "INSERT INTO Altas(Nombre,TipoHabitacion,NHabitacion,DiaEntrada,DiaSalida,Telefono) VALUES" + "(" + nombre + "," + tipohabitacion + "," + NHabitacion + "," + diaentrada + "," + diasalida + "," + telefono + ")";
    try {
        sentencia.executeUpdate(sql);//sentencia hace que el codigo sql se actualice en la base de datos y hace que los datos se guarden
        JOptionPane.showMessageDialog(this, "Los datos han sido guardados");//mensaje
        } catch (SQLException ex) {//hace una excepcion en caso de que no se ejecute el codigo sql
        Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);//arroja el error que tuvo el codigo de sql
         JOptionPane.showMessageDialog(null, "Error, sus datos no fueron ingresados\n" + ex);//mensaje de error

        }  
    }//GEN-LAST:event_CrearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            sentencia.close();       //al cerrar la ventana qie se cierre la conexion con la base de datos
            JOptionPane.showMessageDialog(null, "La conexion fue cerrada...");
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField TId;
    private javax.swing.JButton bEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField tCantidad;
    private javax.swing.JTextField tEntrada;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tSalida;
    private javax.swing.JTextField tTelefono;
    private javax.swing.JTextField tTipo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
