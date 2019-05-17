/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midocumento;

//todos los controles a las variables instanciadas en la librería
import java.sql.Connection;
// permite recuperar los resultados de las transacciones realizadas
// esta libreria permite el ingreso de teclas
import java.awt.event.KeyEvent;
// Esta libreria permite almacenar los resultados de la consulta
import java.sql.ResultSet;
// Permite controlar las excepciones de las solicitudes enviadas
import java.sql.SQLException;
import javax.swing.DefaultListModel;
// Permite utilizar un arreglo de objetos para el almacenamiento temporal de las operaciones
import java.util.ArrayList;
// La definición de un iterador nativo permite trabajar con elementos de array list 
import java.util.Iterator;

/**
 *
 * @author George Rodriguez
 */
public class documentManager extends javax.swing.JFrame {

    /**
     * Creates new form documentManager
     */
    public documentManager() {
        initComponents();
        configuracionInicial();
    }

    /**
     * Todos los metodos presntados son generados por Form Editor. No es posible
     * comentarlos
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDGuardado = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jBOk = new javax.swing.JButton();
        jDEliminar = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jBNo = new javax.swing.JButton();
        jBSi = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jTFNombreC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFApellidoC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultados = new javax.swing.JTextArea();
        jBBuscarC = new javax.swing.JButton();
        jLConectadoC = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jTFNombreM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFApellidoM = new javax.swing.JTextField();
        jBBuscarM = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBQuitar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jLEncabezado = new javax.swing.JLabel();
        jTFEncabezado = new javax.swing.JTextField();
        jLTipo = new javax.swing.JLabel();
        jTFTipo = new javax.swing.JTextField();
        jLUbicacion = new javax.swing.JLabel();
        jTFUbicacion = new javax.swing.JTextField();
        jLReferencia = new javax.swing.JLabel();
        jTFReferencia = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jLNombreD = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloDoc = new DefaultListModel();
        jLDocsD = new javax.swing.JList<>();
        jLConectadoM = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jTFNombreNC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFApellidoPNC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFApellidoMNC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFTelefonoNC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFCorreoNC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTFAsesorANC = new javax.swing.JTextField();
        jBAgregarNC = new javax.swing.JButton();

        jDGuardado.setTitle("Guardar");
        jDGuardado.setAlwaysOnTop(true);
        jDGuardado.setLocation(new java.awt.Point(250, 200));
        jDGuardado.setMinimumSize(new java.awt.Dimension(350, 150));

        jLabel6.setText("Se han guardado los cambios");

        jBOk.setText("OK");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDGuardadoLayout = new javax.swing.GroupLayout(jDGuardado.getContentPane());
        jDGuardado.getContentPane().setLayout(jDGuardadoLayout);
        jDGuardadoLayout.setHorizontalGroup(
            jDGuardadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDGuardadoLayout.createSequentialGroup()
                .addGroup(jDGuardadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDGuardadoLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jBOk, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDGuardadoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jDGuardadoLayout.setVerticalGroup(
            jDGuardadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDGuardadoLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jBOk)
                .addGap(21, 21, 21))
        );

        jDEliminar.setTitle("Guardar");
        jDEliminar.setAlwaysOnTop(true);
        jDEliminar.setLocation(new java.awt.Point(250, 200));
        jDEliminar.setMinimumSize(new java.awt.Dimension(350, 150));

        jLabel7.setText("¿Desea eliminar el documento?");

        jBNo.setText("No");
        jBNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNoActionPerformed(evt);
            }
        });

        jBSi.setText("Si");
        jBSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDEliminarLayout = new javax.swing.GroupLayout(jDEliminar.getContentPane());
        jDEliminar.getContentPane().setLayout(jDEliminarLayout);
        jDEliminarLayout.setHorizontalGroup(
            jDEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jDEliminarLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel7)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(jDEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDEliminarLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jBSi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
        jDEliminarLayout.setVerticalGroup(
            jDEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEliminarLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jBNo)
                .addContainerGap())
            .addGroup(jDEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEliminarLayout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addComponent(jBSi)
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contadoc");
        setName("Contadoc"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jTAResultados.setColumns(20);
        jTAResultados.setRows(5);
        jScrollPane1.setViewportView(jTAResultados);

        jBBuscarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBBuscarC.setText("Buscar");
        jBBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCActionPerformed(evt);
            }
        });

        jLConectadoC.setText("Desconectado");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFNombreC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFApellidoC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBBuscarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLConectadoC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146)
                .addComponent(jBBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLConectadoC)
                .addGap(35, 35, 35))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBBuscarC)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLConectadoC)
                .addContainerGap())
        );

        jTabbedPane1.addTab(" Consultas  ", new javax.swing.ImageIcon(getClass().getResource("/images/consultas.jpg")), jLayeredPane1); // NOI18N

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jBBuscarM.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBBuscarM.setText("Buscar");
        jBBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarMActionPerformed(evt);
            }
        });

        jLabel5.setText("Documentos:");

        jBQuitar.setText("Quitar");
        jBQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitarActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLEncabezado.setText("Encabezado:");
        jLEncabezado.setName(""); // NOI18N

        jLTipo.setText("Tipo:");

        jLUbicacion.setText("Ubicación:");

        jLReferencia.setText("Referencia:");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLNombreD.setModel(modelo);
        jLNombreD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNombreDMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jLNombreD);

        jLDocsD.setModel(modeloDoc);
        jLDocsD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLDocsDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jLDocsD);

        jLConectadoM.setText("Desconectado");

        jLabel8.setText("Clientes:");

        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFNombreM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFApellidoM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBBuscarM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBQuitar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLEncabezado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFEncabezado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLUbicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFUbicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLReferencia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFReferencia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLConectadoM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFReferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLReferencia)
                                        .addComponent(jTFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLUbicacion))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jBGuardar)
                                        .addGap(61, 61, 61))))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTipo)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFEncabezado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLEncabezado)))))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(202, 202, 202)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLConectadoM)
                .addGap(33, 33, 33))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLEncabezado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLUbicacion))
                            .addComponent(jBQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLReferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLConectadoM))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab(" Movimientos  ", new javax.swing.ImageIcon(getClass().getResource("/images/movimientos.jpg")), jLayeredPane2); // NOI18N

        jLabel10.setText("Nombre:");

        jLabel11.setText("Apellido paterno:");

        jLabel12.setText("Apellido materno:");

        jLabel13.setText("Telefono:");

        jLabel14.setText("Correo:");

        jLabel15.setText("Asesor asignado:");

        jBAgregarNC.setText("Agregar");
        jBAgregarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarNCActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jTFNombreNC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFApellidoPNC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFApellidoMNC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFTelefonoNC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFCorreoNC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFAsesorANC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jBAgregarNC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAgregarNC)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFAsesorANC, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCorreoNC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTelefonoNC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFApellidoMNC, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFApellidoPNC, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombreNC, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidoPNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(35, 35, 35)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidoMNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefonoNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreoNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(32, 32, 32)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAsesorANC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addComponent(jBAgregarNC)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  Nuevos clientes", new javax.swing.ImageIcon(getClass().getResource("/images/clientes.jpg")), jLayeredPane3); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarMActionPerformed
        // TODO add your handling code here:
        // Se borran los datos de  jlist de clientes y documentos
        modelo.clear();
        modeloDoc.clear();
        presentarResultadosD(Buscar(jTFNombreM.getText(), jTFApellidoM.getText()));
    }//GEN-LAST:event_jBBuscarMActionPerformed

    
    
    // Se instancian los objetos globales
    // cliente es el objeto que captura todos sus atributos y los manda a la base de
    // datos
    Cliente cliente = new Cliente();
    // ubicacion es el objeto que captura todos sus atributos y los manda a la base
    // de datos
    Ubicaciones ubicacion = new Ubicaciones();
    // documento es el objeto que captura todos sus atributos y los manda a la base
    // de datos
    Documentos documento = new Documentos();
    Documentos documentoAux = new Documentos();

    // documento es el objeto que captura todos sus atributos y los manda a la base
    // de datos
    ClientesAnalisis baseCliente = new ClientesAnalisis();
    // Numero maximo de elementos que se pueden manejar
    int maxElementos = 10000;
    // Almacenamiento temporal de datos generados
    String[] LocalData = new String[maxElementos];
    private Connection miConexion = null;
    //private javax.swing.JList<String> jLNombreD;
    
    
    public void ocultarCampos() {
        // En la pestaña movimientos es necesario que no estén visibles los campos hasta que los activen
        jLEncabezado.setVisible(false);
        jLReferencia.setVisible(false);
        jLTipo.setVisible(false);
        jLUbicacion.setVisible(false);
        jBGuardar.setVisible(false);
        jTFEncabezado.setVisible(false);
        jTFReferencia.setVisible(false);
        jTFTipo.setVisible(false);
        jTFUbicacion.setVisible(false);

    }
    
    public void visualizarCampos() {
        // En la pestaña movimientos es necesario que no estén visibles los campos
        jLEncabezado.setVisible(true);
        jLReferencia.setVisible(true);
        jLTipo.setVisible(true);
        jLUbicacion.setVisible(true);
        jBGuardar.setVisible(true);
        jTFEncabezado.setVisible(true);
        jTFReferencia.setVisible(true);
        jTFTipo.setVisible(true);
        jTFUbicacion.setVisible(true);

    }
    
    Conexion conexion = new Conexion();
    private void configuracionInicial() {
        // En la pestaña movimientos es necesario que no estén visibles
        ocultarCampos();
        //Se manda un mensaje indicando que no esta conectado
        jLConectadoC.setText("Desconectado");
        //se oculta una ventana
        jDGuardado.setVisible(false);
        //Se inicializa el objeto con toda la informacion de la conexion
        conexion.setUsuario("KDJroUoqfj");
        conexion.setPassword("bmlp5wFD3l");
        conexion.setTipo("mysql");
        conexion.setURL("remotemysql.com");
        conexion.setPuerto(3306);
        conexion.setDbase("KDJroUoqfj");
        conexion.setOpciones("autoReconnect=true&useSSL=false");
        //Se manada a llamar la conexion
        miConexion = conexion.conexionDB();
        //Los botones en la pestaña documentos están desabilitados inicialmente
        jBAgregar.setEnabled(false);
        jBQuitar.setEnabled(false);

    }
    
    private String Alinear(String cad1, String cad2) {
        // Alinea las cadenas de caracteres, es solo orden
        for (int i = cad1.length(); i < 110; i++) {
            cad1 = cad1 + " ";
        }
        return cad1 + cad2;
    }
    
    
    public void mostrar(Cliente cliente, Documentos documento) {
        // La función muestra una consulta en la primera pestaña
        // Integra los campos obtenidos en una sola cadena
        String MiCliente = "Cliente:" + cliente.getNombre() + " " + cliente.getApellidoP() + " "
        + cliente.getApellidoM();
        // Se realiza algo semejante con documento
        String MiTipo = "Tipo: " + documento.getTipo();
        String MiDocumento = "Documento: " + documento.getEncabezado();
        //Se asigna el texto a su respectiva salida
        jTAResultados.setText(jTAResultados.getText() + "Número de cliente: "+String.valueOf(cliente.getId())+ "\n");
        jTAResultados.setText(jTAResultados.getText() + Alinear(MiCliente, "Telefono:") + cliente.getTelefono() + "\n");
        jTAResultados.setText(jTAResultados.getText() + Alinear(MiTipo, "Regimen:") + cliente.getAsesor() + "\n");
        jTAResultados.setText(jTAResultados.getText() + Alinear(MiDocumento, "Correo:") + cliente.getCorreo() + "\n");
        jTAResultados.setText(jTAResultados.getText() + "Ubicacion:" + documento.getUbicacion() + "\n");
        jTAResultados.setText(jTAResultados.getText() + "Referencia:" + documento.getReferencia() + "\n");
        jTAResultados.setText(jTAResultados.getText() + "\n");
        jTAResultados.setText(jTAResultados.getText()
        + "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
        + "\n");
    }
    //Identifica si ya existe el nombre en la lista
    String ClienteAnterior = "";
    
    private void jLNombreDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNombreDMouseClicked
        //Este procedimiento permite elegir una opcion del jlist y mostrar la documentacion asociada
        mostrarDocumentos();
    }//GEN-LAST:event_jLNombreDMouseClicked

    private void mostrarDocumentos(){
        //Se obtiene el elemento elegido
        Long n = Integer.toUnsignedLong(jLNombreD.getSelectedIndex());
        //La variable captura la opcion elegida 
        String nombreClienteS,txtModeloDoc;
        //Se almacenan los resultados de la consulta en rs
        ResultSet rs = null;
        // Cliente instanciado
        Cliente cliente = new Cliente();
        ClientesAnalisis baseCliente = new ClientesAnalisis();
        //Si el modelo contiene elemento procede
        if (!modelo.isEmpty()) {
            modeloDoc.clear();
            nombreClienteS = jLNombreD.getSelectedValue();
            System.out.println(jLNombreD.getSelectedValue());
              char[] ch = nombreClienteS.toCharArray(); 
            for (int i = 0; i < nombreClienteS.length(); i++) {
                //Si el caracter es un espacio entonces              
                if (Character.isSpaceChar(ch[i])) {
                    //Separa los primeros digitos y los convierte a long
                    cliente.setId(Long.parseLong(nombreClienteS.substring(0, i)));
                    //Llena el registro para hacer el CRUD
                    documentoAux.setId_cliente(cliente.getId());
                    //Depuracion
                    System.out.println("Id= "+cliente.getId());
                    //Se realiza la consulta
                    if (conexion.estaConectado()) {
                        jLConectadoM.setText("Conectado");
                        rs = baseCliente.BuscarDocumento(cliente,conexion);
                        try {
                            while (rs.next()) {
                                txtModeloDoc = rs.getString("doc.id") + " " + rs.getString("encabezado");
                                modeloDoc.addElement(txtModeloDoc);
                            }
                        } catch (SQLException sqle) {
                            // solo depuracion
                            System.out
                                    .println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
                        }
                    } else {
                        // De otro modo indica que no se conecto
                        jLConectadoM.setText("Desconectado");
                    }
                    //Finaliza el bucle
                    break;
               } 
            }
           
        }
    }
    private void llenarCamposRegistro(Documentos documento) {
        // Esta función llena los campos de la forma con los datos de cliente y documentos
        jTFEncabezado.setText(documento.getEncabezado());
        jTFReferencia.setText(documento.getReferencia());
        jTFTipo.setText(documento.getTipo());
        jTFUbicacion.setText(documento.getUbicacion());
    }
    
    private void jLDocsDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDocsDMouseClicked
        // visualiza los campos correspondientes a la estructura del modelo
        // Este procedimiento permite elegir una opcion del jlist y mostrar la
        // documentacion asociada
        // Se obtiene el elemento elegido
        Long n = Integer.toUnsignedLong(jLDocsD.getSelectedIndex());
        // La variable captura la opcion elegida
        String nombreDocumentoS;
        // Se almacenan los resultados de la consulta en rs
        ResultSet rs = null;
        // Doocumento instanciado
        Documentos documento = new Documentos();
        ClientesAnalisis baseCliente = new ClientesAnalisis();
        // Si el modelo contiene elemento procede
        if (!modeloDoc.isEmpty()) {
            visualizarCampos();
            nombreDocumentoS = jLDocsD.getSelectedValue();
            System.out.println(jLDocsD.getSelectedValue());
            char[] ch = nombreDocumentoS.toCharArray();
            for (int i = 0; i < nombreDocumentoS.length(); i++) {
                // Si el caracter es un espacio entonces
                if (Character.isSpaceChar(ch[i])) {
                    // Separa los primeros digitos y los convierte a long
                    documento.setId(Long.parseLong(nombreDocumentoS.substring(0, i)));
                    // Depuracion
                    System.out.println("Id= " + documento.getId());
                    // Se realiza la consulta
                    rs = baseCliente.BuscarDocumentoD(documento,conexion);
                    try {
                        while (rs.next()) {
                            documento.setId(Long.valueOf(rs.getString("id")));
                            documento.setEncabezado(rs.getString("encabezado"));
                            documento.setTipo(rs.getString("tipo"));
                            documento.setUbicacion(rs.getString("ubicacion"));
                            documento.setReferencia(rs.getString("referencia"));
                        }
                    } catch (SQLException sqle) {
                        // solo depuracion
                        System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
                    }
                    jBAgregar.setEnabled(true);
                    jBQuitar.setEnabled(true);
                    documentoAux.setOperacion(2);
                    documentoAux.setId(documento.getId());
                    
                    llenarCamposRegistro(documento);
                    // Finaliza el bucle
                    break;
                }
            }
           // llenarCamposRegistro();

        }

   }//GEN-LAST:event_jLDocsDMouseClicked

    public void mostrarD(Cliente Cliente, Documentos Documento) {
        //MostraD ingresa al modelo el contenido de los objetos Cliente y  documento
        // MiCliente concentra el nombre, el apellido paterno y el materno
        String MiCliente = Long.toString(Cliente.getId()) + " "+Cliente.getNombre() + " " + Cliente.getApellidoP() + " "
                + Cliente.getApellidoM();
        if (MiCliente.equals(ClienteAnterior)) {
            ClienteAnterior = MiCliente;
        } else {
            ClienteAnterior = MiCliente;
            // //Se agrega un cliente al arreglo
            // uncliente.add(Cliente);
            // //Se agrega un docuento al arreglo
            // undocumento.add(Documento);git ppull
            //Se incluye el nombre en la lista de clientes
            modelo.addElement(MiCliente);
            //imprime en consola los nombres depuración
            System.out.println("Nombre:" + MiCliente);
            System.out.println("Nombre Objeto:" + Cliente.getNombre());
        }

    }

    public ResultSet Buscar(String x, String y) {
        // Username: KDJroUoqfj Database: KDJroUoqfj Password: bmlp5wFD3l
        // Server:remotemysql.com Port: 3306
        // if (baseCliente.conexionDB("root",""))
        // Comprueba la conexión
        // Si existe conexion se procede a mostrar los resultados
        ResultSet rs =null;
        if (conexion.estaConectado()) {
            // La barra de estatus la cambia a conectado si se logra la conexion
            jLConectadoC.setText("Conectado");
            cliente.borrarDatos();
            if (x.length() > 0) {
                cliente.setNombre(x);
            } else
            cliente.setNombre("*");
            /* Proceso */
            System.out.println("Docu MD: "+"cliente.getNombre()"+ cliente.getNombre() + cliente.getApellidoP() + cliente.getApellidoM());
            if (y.length() == 0) {
                // Implica que el campo apellidos está vacío
                cliente.setApellidoP("*");
                cliente.setApellidoM("*");
            } else {
                char[] ch = y.toCharArray();
                for (int i = 0; i < y.length(); i++) {
                    System.out.println(
                            "substring " + i + "  Character.isSpaceChar(ch[i])= " + Character.isSpaceChar(ch[i]));
                    if (Character.isSpaceChar(ch[i])) {
                        System.out.println("substring " + i);
                        cliente.setApellidoP(y.substring(0, i));
                        System.out.println("y.substring(0, i) " + y.substring(0, i));
                        cliente.setApellidoM(y.substring(i + 1, y.length()));
                       // System.out.println("x.substring(i+1, x.length()) " + y.substring(i + 1, y.length()));
                    } else {
                        cliente.setApellidoP(y);
                        cliente.setApellidoM("*");
                    }

                }
            }
            //Depuracion
            System.out.println("Datos:" + cliente.getNombre() + cliente.getApellidoP() + cliente.getApellidoM());
            //Realiza la busqueda del nombre de los clientes
            rs = baseCliente.BuscarNombre(cliente,conexion);
        }  else    {
            // De otro modo indica que no se conecto
            jLConectadoC.setText("Desconectado");
        }
        return rs;
    }

    private void presentarResultadosB(ResultSet rs) {
        // Presenta los resultados dentro del cuadro
        jTAResultados.setText("");
        try {
            while (rs.next()) {
              //  cliente.setId(rs.getString("id"));
                cliente.setId(Long.valueOf(rs.getString("id")));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidoP(rs.getString("apellidoP"));
                cliente.setApellidoM(rs.getString("apellidoM"));
                cliente.setAsesor(rs.getString("asesor"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                documento.setEncabezado(rs.getString("encabezado"));
                documento.setTipo(rs.getString("tipo"));
                documento.setUbicacion(rs.getString("ubicacion"));
                documento.setReferencia(rs.getString("referencia"));
                mostrar(cliente, documento);
                System.out.print(jTFNombreC.getText() + " ");
                // String username=rs.getString("nombre");
            }
        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }

    private void presentarResultadosD(ResultSet rs) {
        jTAResultados.setText("");
        try {
            while (rs.next()) {
                cliente.setId(Long.valueOf(rs.getString("id")));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidoP(rs.getString("apellidoP"));
                cliente.setApellidoM(rs.getString("apellidoM"));
                cliente.setAsesor(rs.getString("asesor"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                documento.setId_cliente(Long.valueOf(rs.getString("id")));
                documento.setEncabezado(rs.getString("encabezado"));
                documento.setTipo(rs.getString("tipo"));
                documento.setUbicacion(rs.getString("ubicacion"));
                documento.setReferencia(rs.getString("referencia"));
                // Reiniciar los valores aqui
                mostrarD(cliente, documento);
            }
        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }

    private void jBBuscarCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBBuscarCActionPerformed
        // Se inicia la busqueda
        // Se muestra un mensaje para demostrar que se intenta conectar
        jLConectadoC.setText("Conectando...");
        presentarResultadosB(Buscar(jTFNombreC.getText(), jTFApellidoC.getText()));
    }// GEN-LAST:event_jBBuscarCActionPerformed

    private void jBBuscarCKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jBBuscarCKeyTyped
        System.out.println(evt.getKeyCode());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Se muestra un mensaje para demostrar que se intenta conectar
            jLConectadoC.setText("Conectando...");
            Buscar(jTFNombreC.getText(), jTFApellidoC.getText());
        }
    }// GEN-LAST:event_jBBuscarCKeyTyped

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
        // Cuando presionas agregar todos los elementos del registro
        visualizarCampos();
        LimpiarCampos();
        documentoAux.setOperacion(1);
    }// GEN-LAST:event_jBAgregarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBGuardarActionPerformed
        Tabla tabla = new Tabla();
        // Guarda el campo encabezado en su variable correspondiente asociada a la clase
        documentoAux.setEncabezado(jTFEncabezado.getText());
        // Guarda el campo Tipo en su variable correspondiente asociada a la clase
        documentoAux.setTipo(jTFTipo.getText());
        // Guarda el campo Ubicacion en su variable correspondiente asociada a la clase
        documentoAux.setUbicacion(jTFUbicacion.getText());
        // Guarda el campo Referencia en su variable correspondiente asociada a la clase
        documentoAux.setReferencia(jTFReferencia.getText());
        tabla.LlenarTabla(documentoAux, miConexion);
        // Se muestra el cuadro de dialogo
        jDGuardado.setVisible(true);
        mostrarDocumentos();
    }// GEN-LAST:event_jBGuardarActionPerformed

    private void jBAgregarNCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBAgregarNCActionPerformed
        // Se instancias clientes y documentos, deben ser diferentes a las globales
        Cliente capUsuario = new Cliente();
        Tabla tabla = new Tabla();
        // Documentos capDocumento = new Documentos();
        // Se exibe un cuadro de dialogo para confirmar que se guardo
        jDGuardado.setVisible(true);
        capUsuario.setNombre(jTFNombreNC.getText());
        capUsuario.setApellidoP(jTFApellidoPNC.getText());
        capUsuario.setApellidoM(jTFApellidoMNC.getText());
        capUsuario.setTelefono(jTFTelefonoNC.getText());
        capUsuario.setCorreo(jTFCorreoNC.getText());
        capUsuario.setAsesor(jTFAsesorANC.getText());
        tabla.LlenarTabla(capUsuario, miConexion);
        System.out.print("Agregar" + capUsuario.getNombre());
    }// GEN-LAST:event_jBAgregarNCActionPerformed

    private void LimpiarCampos() {
        jTFNombreNC.setText("");
        jTFApellidoPNC.setText("");
        jTFApellidoMNC.setText("");
        jTFTelefonoNC.setText("");
        jTFCorreoNC.setText("");
        jTFAsesorANC.setText("");
    }

    private void LlenarCamposDepu() {
        jTFNombreNC.setText("Juana");
        jTFApellidoPNC.setText("Montes");
        jTFApellidoMNC.setText("Perez");
        jTFTelefonoNC.setText("65633233325");
        jTFCorreoNC.setText("juana@mail.com");
        jTFAsesorANC.setText("José");
        jTFNombreC.setText("javier");
    }

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBOkActionPerformed
        // oculta los campos cuando se presiona el boton guardar
        // en la ceja movimientos
        // Oculta el cuadro de dialogo
        ocultarCampos();
        LimpiarCampos();
        jDGuardado.setVisible(false);
    }// GEN-LAST:event_jBOkActionPerformed

    private void jBQuitarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBQuitarActionPerformed
        
        jDEliminar.setVisible(true);
    }// GEN-LAST:event_jBQuitarActionPerformed

    private void jBNoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBNoActionPerformed
        jDEliminar.setVisible(false);
    }// GEN-LAST:event_jBNoActionPerformed

    private void jBSiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBSiActionPerformed
        Tabla tabla = new Tabla();
        documentoAux.setOperacion(3);
        // Guarda el campo encabezado en su variable correspondiente asociada a la clase
        documentoAux.setEncabezado(jTFEncabezado.getText());
        // Guarda el campo Tipo en su variable correspondiente asociada a la clase
        documentoAux.setTipo(jTFTipo.getText());
        // Guarda el campo Ubicacion en su variable correspondiente asociada a la clase
        documentoAux.setUbicacion(jTFUbicacion.getText());
        // Guarda el campo Referencia en su variable correspondiente asociada a la clase
        documentoAux.setReferencia(jTFReferencia.getText());
        tabla.LlenarTabla(documentoAux, miConexion);
        // Se muestra el cuadro de dialogo
        jDGuardado.setVisible(true);
        mostrarDocumentos();
        jDEliminar.setVisible(false);
    }// GEN-LAST:event_jBSiActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed
        conexion.cerrarConexion();
    }// GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(documentManager.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(documentManager.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(documentManager.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(documentManager.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new documentManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBAgregarNC;
    private javax.swing.JButton jBBuscarC;
    private javax.swing.JButton jBBuscarM;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNo;
    private javax.swing.JButton jBOk;
    private javax.swing.JButton jBQuitar;
    private javax.swing.JButton jBSi;
    private javax.swing.JDialog jDEliminar;
    private javax.swing.JDialog jDGuardado;
    private javax.swing.JLabel jLConectadoC;
    private javax.swing.JLabel jLConectadoM;
    private javax.swing.JList<String> jLDocsD;
    private DefaultListModel modeloDoc;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JList<String> jLNombreD;
    private DefaultListModel modelo;
    private javax.swing.JLabel jLReferencia;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTAResultados;
    private javax.swing.JTextField jTFApellidoC;
    private javax.swing.JTextField jTFApellidoM;
    private javax.swing.JTextField jTFApellidoMNC;
    private javax.swing.JTextField jTFApellidoPNC;
    private javax.swing.JTextField jTFAsesorANC;
    private javax.swing.JTextField jTFCorreoNC;
    private javax.swing.JTextField jTFEncabezado;
    private javax.swing.JTextField jTFNombreC;
    private javax.swing.JTextField jTFNombreM;
    private javax.swing.JTextField jTFNombreNC;
    private javax.swing.JTextField jTFReferencia;
    private javax.swing.JTextField jTFTelefonoNC;
    private javax.swing.JTextField jTFTipo;
    private javax.swing.JTextField jTFUbicacion;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
