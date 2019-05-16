/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;//indicamos de a que paquete pertenece este codigo
import LogIn.login;//importmaos la clase login para poder hacer el metodo cerrar sesion
import java.sql.Connection;//importamos esta clase para poder hacer la conexion a la bd
import java.sql.DriverManager;//importamos esta clase para poder cargar el driver de donde esta ubicada la bd
import java.sql.SQLException;//importamos esta clase para ver poder revisar los errores en las conexiones en la bd
import java.sql.Statement;//importamos esta clase para cargar las sentencias de sql
import java.util.logging.Level;//importamos esta clase para que nos diga los tipos de errores que se encuentra en el codigo
import java.util.logging.Logger;//importamos esta clase para hacer la indicacion del error en el codigo
import javax.swing.JOptionPane;//para mostrar paneles de mensajes
/**
 *
 * @author compu
 */
public final class  Create extends javax.swing.JFrame {
//Esta clase hereda de javax.swing.JFrame para poder integrar la interfaz grafica de una manera mas eficiente
//Swing es una biblioteca gráfica para Java. Incluye widgets para interfaz gráfica de usuario tales como cajas de texto, botones, listas desplegables y tablas.
    
Connection conexion;// creamos una variable llamada conexion para hacer la conexion
Statement sentencia;// creamos una variables para hacer las sentencias sql
    
    public Create() {
        initComponents(); // iniciamos componentes de la forma
        conectatarBaseDatos();// invocamos el constructor que hara la conexion a la base de datos
        setLocationRelativeTo(null);//codigo para centrar la forma de manera nulo o en el centro de la pantalla
       //this.setExtendedState(MAXIMIZED_BOTH);/x|/este codigo es para extender la forma en su maximo tamaño
       
    }

    public void conectatarBaseDatos() {// metodo que conecta la base de datos con el codigo
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")//codigo generado donde se inicializan todos los componentes de la interfaz grafica
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoHab = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        BIndividual = new javax.swing.JRadioButton();
        BDoble = new javax.swing.JRadioButton();
        BSupletoria = new javax.swing.JRadioButton();
        BDobleI = new javax.swing.JRadioButton();
        BSuit = new javax.swing.JRadioButton();
        BTriple = new javax.swing.JRadioButton();
        BSuitN = new javax.swing.JRadioButton();
        BSuitJ = new javax.swing.JRadioButton();
        BSuitP = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MsjTipoHab = new javax.swing.JLabel();
        Validar = new javax.swing.JButton();
        cantidadHab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DiaEntrada = new javax.swing.JTextField();
        DiaSalida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CPersonas = new javax.swing.JLabel();
        CostoHab = new javax.swing.JLabel();
        BRegistrar = new javax.swing.JButton();
        CantidadHabitaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cerrarsesion = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Tipo de Habitacion:");

        TipoHab.add(BIndividual);
        BIndividual.setText("Indivudual");

        TipoHab.add(BDoble);
        BDoble.setText("Doble");

        TipoHab.add(BSupletoria);
        BSupletoria.setText("Supletoria");

        TipoHab.add(BDobleI);
        BDobleI.setText("Doble(Individuales)");

        TipoHab.add(BSuit);
        BSuit.setText("Suit");

        TipoHab.add(BTriple);
        BTriple.setText("Triple");

        TipoHab.add(BSuitN);
        BSuitN.setText("Suit Nupcial");

        TipoHab.add(BSuitJ);
        BSuitJ.setText("Suit Junior");

        TipoHab.add(BSuitP);
        BSuitP.setText("Suit Precidencial");

        jLabel2.setText("Datos:");

        jLabel3.setText("Id Registro");

        jLabel4.setText("Nombre Cliente:");

        jLabel5.setText("Tipo de Habitacion:");

        MsjTipoHab.setText(" ");

        Validar.setText("Validar");
        Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarActionPerformed(evt);
            }
        });

        cantidadHab.setText("Cantidad de habitaciones:");

        jLabel7.setText("Dia de Entrada:");

        jLabel8.setText("Dia de Salida:");

        jLabel9.setText("Cantidad de personas:");

        CPersonas.setText("              ");

        CostoHab.setText("            ");

        BRegistrar.setText("Registrar");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });

        CantidadHabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadHabitacionesKeyTyped(evt);
            }
        });

        jLabel6.setText("Ejemplo: 05/02/2019");

        jLabel10.setText("Ejemplo: 05/02/2019");

        cerrarsesion.setText("Cerrar Sesion");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });

        jLabel13.setText("Telefono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BSuit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BDobleI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BSupletoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTriple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BSuitJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BSuitN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BSuitP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(86, 86, 86))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Validar)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cantidadHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DiaSalida)
                                            .addComponent(DiaEntrada)
                                            .addComponent(CantidadHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(txtNombreC)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MsjTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(120, 120, 120))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BRegistrar)
                                .addGap(73, 73, 73)
                                .addComponent(cerrarsesion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CostoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(259, 259, 259))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BSuit)
                            .addComponent(jLabel8)
                            .addComponent(DiaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BSuitJ)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BIndividual)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BDoble)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BDobleI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(MsjTipoHab))
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BSupletoria)
                            .addComponent(cantidadHab)
                            .addComponent(CantidadHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTriple)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DiaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CPersonas)
                                .addGap(0, 11, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BSuitN)
                        .addComponent(jLabel13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CostoHab)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BSuitP)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Validar)
                    .addComponent(BRegistrar)
                    .addComponent(cerrarsesion))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BDoble, BDobleI, BIndividual, BSuit, BSuitJ, BSuitN, BSuitP, BSupletoria, BTriple});

        setSize(new java.awt.Dimension(703, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarActionPerformed
       //boton de validar la informacion del tipo de habitacion y poder leer la informacion de esta misma
       //boton de awt(La Abstract Window Toolkit (AWT, en español Kit de Herramientas de Ventana Abstracta) es un kit de herramientas de gráficos, interfaz de usuario, y sistema de ventanas independiente de la plataforma original de Java.
        //boton privado que tiene una forma abstracta que contiene un evento de dar click y hara las siguientes secuencia
        if (BIndividual.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Individual");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("1 persona");//mostrara la cantidad de personas
        CostoHab.setText("$500.00"); //mostrara la cantidad de dinero del costo de la habiatacion
        }
        else if (BDoble.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Doble");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("2 personas");//mostrara la cantidad de personas
        CostoHab.setText("$1000.00");//mostrara la cantidad de dinero del costo de la habiatacion
        }
        else if (BDobleI.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Doble Individual");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("2 personas");//mostrara la cantidad de personas
        CostoHab.setText("$1200.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
        else if (BSupletoria.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Supletoria");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("2 personas");//mostrara la cantidad de personas
        CostoHab.setText("$800.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
        else if (BTriple.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Triple");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("3 personas");//mostrara la cantidad de personas
        CostoHab.setText("$1800.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
        else if (BSuit.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Suit");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("4 personas");//mostrara la cantidad de personas
        CostoHab.setText("$3000.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
        else if (BSuitJ.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Suit Junior");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("5 personas");//mostrara la cantidad de personas
        CostoHab.setText("$2200.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
        else if (BSuitN.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Suit Nupcial");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("2 personas");//mostrara la cantidad de personas
        CostoHab.setText("$2500.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
        else if (BSuitP.isSelected()){//en caso de selecion de este boton
        MsjTipoHab.setText("Suit Precidencial");//mostrara un mensaje del tipo de habitacion que se reservara
        CPersonas.setText("10 personas");//mostrara la cantidad de personas
        CostoHab.setText("$5000.00");//mostrara la cantidad de dinero del costo de la habiatacion
        
        }
    
    
    }//GEN-LAST:event_ValidarActionPerformed

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
     //boton para registrar los datos a ingresar ser guardados en la bd
     //boton de awt(La Abstract Window Toolkit (AWT, en español Kit de Herramientas de Ventana Abstracta) es un kit de herramientas de gráficos, interfaz de usuario, y sistema de ventanas independiente de la plataforma original de Java.
        //boton privado que tiene una forma abstracta que contiene un evento de dar click y hara las siguientes secuencia
String nombre = this.txtNombreC.getText(); // caputuaramos el nombre de la persona
String tipohabitacion = this.MsjTipoHab.getText();// caputamos el tipo de habitacion el cual se asigno en el botones
    String NHabitacion = this.CantidadHabitaciones.getText();//caputramos la cantidad de habitaciones
    String diaentrada = this.DiaEntrada.getText();//caputaramos el dia de la entrada
 String diasalida = this.DiaSalida.getText();//caputaramos el dia de la salida
String telefono = this.txttelefono.getText();
    
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
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // metodo que al cerrar la ventana o la forma se cancele la conexion para que la memoria no se sature de conexiones
           try {
            sentencia.close();//cierra la sentencia de sql
                JOptionPane.showMessageDialog(null, "La conexion esta cerrada");//mensaje de cerrado
        } catch (SQLException e) {//en caso de que no se cierre
            JOptionPane.showMessageDialog(null, "Error al cerrar la base de datos" + e);//mensaje y el porque no se cancela la conexion
        }
    }//GEN-LAST:event_formWindowClosing

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
   //metodo para salir de la ventana e ir a login
        login ir = new login();//creamos un objeto ir que pertenece a la clase login 
       ir.setVisible(true);//hacemos visible la forma login ya que invocamos un objeto ir con el metodo de abrir la ventana
            this.dispose(); //cerrar esta ventana
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void CantidadHabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadHabitacionesKeyTyped
        char validar = evt.getKeyChar();// creamos una forma de validar de que lo ingresado solo sea de cierta forma
        
        if (Character.isLetter(validar)){//si el caracter validar sea una letra
            getToolkit().beep(); //metodo el cual no permite ingresar letras
            evt.consume();//termina el evento de no permitir escribir letras
            JOptionPane.showMessageDialog(null, "Solo ingresar numeros");//mensjae de prohibicion
        }
    }//GEN-LAST:event_CantidadHabitacionesKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {//menu de inicializacion
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
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }//menu que hace correr la forma

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton BDoble;
    public static javax.swing.JRadioButton BDobleI;
    public static javax.swing.JRadioButton BIndividual;
    private javax.swing.JButton BRegistrar;
    public static javax.swing.JRadioButton BSuit;
    public static javax.swing.JRadioButton BSuitJ;
    public static javax.swing.JRadioButton BSuitN;
    public static javax.swing.JRadioButton BSuitP;
    public static javax.swing.JRadioButton BSupletoria;
    public static javax.swing.JRadioButton BTriple;
    private javax.swing.JLabel CPersonas;
    private javax.swing.JTextField CantidadHabitaciones;
    private javax.swing.JLabel CostoHab;
    private javax.swing.JTextField DiaEntrada;
    private javax.swing.JTextField DiaSalida;
    private javax.swing.JLabel MsjTipoHab;
    private javax.swing.ButtonGroup TipoHab;
    private javax.swing.JButton Validar;
    private javax.swing.JLabel cantidadHab;
    private javax.swing.JButton cerrarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
