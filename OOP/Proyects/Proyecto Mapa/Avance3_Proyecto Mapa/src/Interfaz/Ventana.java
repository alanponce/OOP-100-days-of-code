/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author ENEMY345
 */
public class Ventana extends javax.swing.JFrame {
    //Creamos un metodo con una entrada booleana para poder deshabilitar y ocultar los botones
    public void Btnactivo(boolean falso)
    {
        //Deshabilitando y ocultando los botones
        this.btnAztecas.enable(falso);
        this.btnAztecas.show(falso);
        this.btnCarlosamaya.enable(falso);
        this.btnCarlosamaya.show(falso);
        this.btnPanamericana.enable(falso);
        this.btnPanamericana.show(falso);
        this.btnCentro.enable(falso);
        this.btnCentro.show(falso);
        this.btnIndependencia.enable(falso);
        this.btnIndependencia.show(falso);
        this.btnPlazajuarez.enable(falso);
        this.btnPlazajuarez.show(falso);
        this.btnPlazadelreloj.enable(falso);
        this.btnPlazadelreloj.show(falso);
        this.btnPlazasendero.enable(falso);
        this.btnPlazasendero.show(falso);
        this.btnPlazalastorres.enable(falso);
        this.btnPlazalastorres.show(falso);
        this.btnPorvenir.enable(falso);
        this.btnPorvenir.show(falso);
        this.btnRayonylucero.enable(falso);
        this.btnRayonylucero.show(falso);
        this.btnTorreshenequen.enable(falso);
        this.btnTorreshenequen.show(falso);
        this.btnTorreslibramiento.enable(falso);
        this.btnTorreslibramiento.show(falso);
        this.btnRetorno.enable(falso);
        this.btnRetorno.show(falso);
        
    }
//Creamos un metodo con una entrada booleana para poder deshabilitar y ocultar las tablas
    public void Tblactivo(boolean falso)
    {
        //Deshabilitando y ocultando las tablas
        this.tblAztecas.enable(falso);
        this.tblAztecas.show(falso);
        this.tblCarlosamaya.enable(falso);
        this.tblCarlosamaya.show(falso);
        this.tblPanamericana.enable(falso);
        this.tblPanamericana.show(falso);
        this.tblCentro.enable(falso);
        this.tblCentro.show(falso);
        this.tblIndependencia.enable(falso);
        this.tblIndependencia.show(falso);
        this.tblPlazajuarez.enable(falso);
        this.tblPlazajuarez.show(falso);
        this.tblPlazadelreloj.enable(falso);
        this.tblPlazadelreloj.show(falso);
        this.tblPlazasendero.enable(falso);
        this.tblPlazasendero.show(falso);
        this.tblPlazalastorres.enable(falso);
        this.tblPlazalastorres.show(falso);
        this.tblPorvenir.enable(falso);
        this.tblPorvenir.show(falso);
        this.tblRayonylucero.enable(falso);
        this.tblRayonylucero.show(falso);
        this.tblTorreshenequen.enable(falso);
        this.tblTorreshenequen.show(falso);
        this.tblTorreslibramiento.enable(falso);
        this.tblTorreslibramiento.show(falso);
    }
    //Creamos otro metodo para el boton de retorno
    public void BtnRetorno(boolean falso)
    {
        this.btnRetorno.enable(falso);
        this.btnRetorno.show(falso);
    }
    
    public Ventana() {
        initComponents();
        //Le asignamos un nombre a la barra de titulo del programa
        this.setTitle("Mapa");
        
        //Eliminamos el boton de maximizar porque no lo necesitamos
        this.setResizable(true);
        
        //Comando para posicionar la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Empezamos con los botones deshabilitados
        Btnactivo(false);
        Tblactivo(false);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRetorno = new javax.swing.JButton();
        btnAztecas = new javax.swing.JButton();
        btnCarlosamaya = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        btnIndependencia = new javax.swing.JButton();
        btnPlazalastorres = new javax.swing.JButton();
        btnRayonylucero = new javax.swing.JButton();
        btnTorreslibramiento = new javax.swing.JButton();
        btnTorreshenequen = new javax.swing.JButton();
        btnPanamericana = new javax.swing.JButton();
        btnPlazajuarez = new javax.swing.JButton();
        btnPlazadelreloj = new javax.swing.JButton();
        btnPlazasendero = new javax.swing.JButton();
        btnPorvenir = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        tblAztecas = new javax.swing.JScrollPane();
        Aztecas = new javax.swing.JTable();
        tblCarlosamaya = new javax.swing.JScrollPane();
        Carlosamaya = new javax.swing.JTable();
        tblCentro = new javax.swing.JScrollPane();
        Centro = new javax.swing.JTable();
        tblIndependencia = new javax.swing.JScrollPane();
        Independencia = new javax.swing.JTable();
        tblPlazalastorres = new javax.swing.JScrollPane();
        Plazalastorres = new javax.swing.JTable();
        tblRayonylucero = new javax.swing.JScrollPane();
        Ramonylucero = new javax.swing.JTable();
        tblTorreslibramiento = new javax.swing.JScrollPane();
        Torreslibramiento = new javax.swing.JTable();
        tblTorreshenequen = new javax.swing.JScrollPane();
        Torreshenequen = new javax.swing.JTable();
        tblPanamericana = new javax.swing.JScrollPane();
        Panamericana = new javax.swing.JTable();
        tblPlazajuarez = new javax.swing.JScrollPane();
        PlazaJuarez = new javax.swing.JTable();
        tblPlazadelreloj = new javax.swing.JScrollPane();
        PlazadelReloj = new javax.swing.JTable();
        tblPlazasendero = new javax.swing.JScrollPane();
        Plazasendero = new javax.swing.JTable();
        tblPorvenir = new javax.swing.JScrollPane();
        Porvenir = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        lblPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRetorno.setText("Atras");
        btnRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        btnAztecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonAztecas.png"))); // NOI18N
        btnAztecas.setContentAreaFilled(false);
        btnAztecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAztecasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAztecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, -1));

        btnCarlosamaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonCarlosamaya.png"))); // NOI18N
        btnCarlosamaya.setContentAreaFilled(false);
        btnCarlosamaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarlosamayaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarlosamaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 120, -1));

        btnCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonCentro.png"))); // NOI18N
        btnCentro.setContentAreaFilled(false);
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, -1));

        btnIndependencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonIndependencia.png"))); // NOI18N
        btnIndependencia.setContentAreaFilled(false);
        btnIndependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndependenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, -1));

        btnPlazalastorres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonTorres.png"))); // NOI18N
        btnPlazalastorres.setContentAreaFilled(false);
        btnPlazalastorres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlazalastorresActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlazalastorres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 120, -1));

        btnRayonylucero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRyL.png"))); // NOI18N
        btnRayonylucero.setContentAreaFilled(false);
        btnRayonylucero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRayonyluceroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRayonylucero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 120, -1));

        btnTorreslibramiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonLibramiento.png"))); // NOI18N
        btnTorreslibramiento.setContentAreaFilled(false);
        btnTorreslibramiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorreslibramientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTorreslibramiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        btnTorreshenequen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonHenequen.png"))); // NOI18N
        btnTorreshenequen.setContentAreaFilled(false);
        btnTorreshenequen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorreshenequenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTorreshenequen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 120, -1));

        btnPanamericana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonPanamericana.png"))); // NOI18N
        btnPanamericana.setContentAreaFilled(false);
        btnPanamericana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanamericanaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPanamericana, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, -1));
        btnPanamericana.getAccessibleContext().setAccessibleDescription("");

        btnPlazajuarez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonJuarez.png"))); // NOI18N
        btnPlazajuarez.setContentAreaFilled(false);
        btnPlazajuarez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlazajuarezActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlazajuarez, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 120, -1));

        btnPlazadelreloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonReloj.png"))); // NOI18N
        btnPlazadelreloj.setContentAreaFilled(false);
        btnPlazadelreloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlazadelrelojActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlazadelreloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 120, -1));

        btnPlazasendero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonSendero.png"))); // NOI18N
        btnPlazasendero.setContentAreaFilled(false);
        btnPlazasendero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlazasenderoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlazasendero, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 120, -1));

        btnPorvenir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonPorvenir.png"))); // NOI18N
        btnPorvenir.setContentAreaFilled(false);
        btnPorvenir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorvenirActionPerformed(evt);
            }
        });
        getContentPane().add(btnPorvenir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 120, -1));

        btnInicio.setBackground(new java.awt.Color(255, 255, 0));
        btnInicio.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnInicio.setText("Horarios");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 230, 110));

        tblAztecas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblAztecas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Aztecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Aztecas.getTableHeader().setReorderingAllowed(false);
        tblAztecas.setViewportView(Aztecas);

        getContentPane().add(tblAztecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblCarlosamaya.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblCarlosamaya.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Carlosamaya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6:40", "12:00"},
                {"10:40", "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Carlosamaya.getTableHeader().setReorderingAllowed(false);
        tblCarlosamaya.setViewportView(Carlosamaya);

        getContentPane().add(tblCarlosamaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 60));

        tblCentro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblCentro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Centro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Centro.getTableHeader().setReorderingAllowed(false);
        tblCentro.setViewportView(Centro);

        getContentPane().add(tblCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblIndependencia.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblIndependencia.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Independencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Independencia.getTableHeader().setReorderingAllowed(false);
        tblIndependencia.setViewportView(Independencia);

        getContentPane().add(tblIndependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblPlazalastorres.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblPlazalastorres.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Plazalastorres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Plazalastorres.getTableHeader().setReorderingAllowed(false);
        tblPlazalastorres.setViewportView(Plazalastorres);

        getContentPane().add(tblPlazalastorres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblRayonylucero.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblRayonylucero.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Ramonylucero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Ramonylucero.getTableHeader().setReorderingAllowed(false);
        tblRayonylucero.setViewportView(Ramonylucero);

        getContentPane().add(tblRayonylucero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblTorreslibramiento.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblTorreslibramiento.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Torreslibramiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Torreslibramiento.getTableHeader().setReorderingAllowed(false);
        tblTorreslibramiento.setViewportView(Torreslibramiento);

        getContentPane().add(tblTorreslibramiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblTorreshenequen.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblTorreshenequen.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Torreshenequen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Torreshenequen.getTableHeader().setReorderingAllowed(false);
        tblTorreshenequen.setViewportView(Torreshenequen);

        getContentPane().add(tblTorreshenequen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblPanamericana.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblPanamericana.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Panamericana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"- 07:00", "- 12:00"},
                {"- 11:10", "- 14:00"},
                {"- 13:20", "- 16:00"},
                {"- 15:10", "- 18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Panamericana.getTableHeader().setReorderingAllowed(false);
        tblPanamericana.setViewportView(Panamericana);

        getContentPane().add(tblPanamericana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblPlazajuarez.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblPlazajuarez.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        PlazaJuarez.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        PlazaJuarez.getTableHeader().setReorderingAllowed(false);
        tblPlazajuarez.setViewportView(PlazaJuarez);

        getContentPane().add(tblPlazajuarez, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblPlazadelreloj.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblPlazadelreloj.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        PlazadelReloj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        PlazadelReloj.getTableHeader().setReorderingAllowed(false);
        tblPlazadelreloj.setViewportView(PlazadelReloj);

        getContentPane().add(tblPlazadelreloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblPlazasendero.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblPlazasendero.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Plazasendero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Plazasendero.getTableHeader().setReorderingAllowed(false);
        tblPlazasendero.setViewportView(Plazasendero);

        getContentPane().add(tblPlazasendero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        tblPorvenir.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tblPorvenir.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Porvenir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "12:00"},
                {"10:50", "14:00"},
                {"12:50", "16:00"},
                {"14:50", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        Porvenir.getTableHeader().setReorderingAllowed(false);
        tblPorvenir.setViewportView(Porvenir);

        getContentPane().add(tblPorvenir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        lblStatus.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Inicio");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, -1));

        lblPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        lblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        getContentPane().add(lblPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.btnInicio.setEnabled(false); //Deshabilitamos el boton
        this.btnInicio.show(false); //Esconde el boton
        this.lblStatus.setText("Horarios");//Al activar este boton cambiamos el texto de status a su localizacion
        
        
        //Habilitando los botones y mostrandolos
        Btnactivo(true);//Activamos los botones para acceder al menu
        BtnRetorno(false);//Deshabilitamos el boton porque no lo necesitamos aqui
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCarlosamayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarlosamayaActionPerformed
        this.tblCarlosamaya.enable(true);//Habilita la tabla de los horarios
        this.tblCarlosamaya.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Carlos Amaya");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false);//deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnCarlosamayaActionPerformed

    private void btnAztecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAztecasActionPerformed
        this.tblAztecas.enable(true);//Habilita la tabla de los horarios
        this.tblAztecas.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Aztecas");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false);//deshabilitamos los botones y los ocultamos   
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnAztecasActionPerformed

    private void btnPanamericanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanamericanaActionPerformed
        this.tblPanamericana.enable(true);//Habilita la tabla de los horarios
        this.tblPanamericana.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Panamericana");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnPanamericanaActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        this.tblCentro.enable(true);//Habilita la tabla de los horarios
        this.tblCentro.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Centro");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos 
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnIndependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndependenciaActionPerformed
        this.tblIndependencia.enable(true);//Habilita la tabla de los horarios
        this.tblIndependencia.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Independencia");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnIndependenciaActionPerformed

    private void btnPlazadelrelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazadelrelojActionPerformed
        this.tblPlazadelreloj.enable(true);//Habilita la tabla de los horarios
        this.tblPlazadelreloj.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza del Reloj");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnPlazadelrelojActionPerformed

    private void btnPorvenirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorvenirActionPerformed
        this.tblPorvenir.enable(true);//Habilita la tabla de los horarios
        this.tblPorvenir.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Porvenir");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnPorvenirActionPerformed

    private void btnRayonyluceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRayonyluceroActionPerformed
        this.tblRayonylucero.enable(true);//Habilita la tabla de los horarios
        this.tblRayonylucero.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Rayon y Lucero");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnRayonyluceroActionPerformed

    private void btnPlazalastorresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazalastorresActionPerformed
        this.tblPlazalastorres.enable(true);//Habilita la tabla de los horarios
        this.tblPlazalastorres.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza las Torres");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnPlazalastorresActionPerformed

    private void btnTorreslibramientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreslibramientoActionPerformed
        this.tblTorreslibramiento.enable(true);//Habilita la tabla de los horarios
        this.tblTorreslibramiento.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Torres Libramiento");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnTorreslibramientoActionPerformed

    private void btnTorreshenequenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreshenequenActionPerformed
        this.tblTorreshenequen.enable(true);//Habilita la tabla de los horarios
        this.tblTorreshenequen.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Torres Henequen");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnTorreshenequenActionPerformed

    private void btnPlazajuarezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazajuarezActionPerformed
        this.tblPlazajuarez.enable(true);//Habilita la tabla de los horarios
        this.tblPlazajuarez.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza Juarez");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
    }//GEN-LAST:event_btnPlazajuarezActionPerformed

    private void btnPlazasenderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazasenderoActionPerformed
        this.tblPlazasendero.enable(true);//Habilita la tabla de los horarios
        this.tblPlazasendero.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza Sendero");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Btnactivo(false); //deshabilitamos los botones y los ocultamos 
        BtnRetorno(true); //Activamos el boton al activar este boton
    }//GEN-LAST:event_btnPlazasenderoActionPerformed

    private void btnRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornoActionPerformed
        Tblactivo(false); //Primero desactivamos las tablas para que no se muestren
        Btnactivo(false); // Desactivamos los botones para evitar que sigan alli
        Btnactivo(true); //Activamos todos los botones para que sean visibles
        BtnRetorno(false); //Desactivamos el boton y lo deshabilitamos para no verlo
        this.lblStatus.setText("Horarios");//Al precionar el boton cambiamos el texto de status a horarios
    }//GEN-LAST:event_btnRetornoActionPerformed

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
    private javax.swing.JTable Aztecas;
    private javax.swing.JTable Carlosamaya;
    private javax.swing.JTable Centro;
    private javax.swing.JTable Independencia;
    private javax.swing.JTable Panamericana;
    private javax.swing.JTable PlazaJuarez;
    private javax.swing.JTable PlazadelReloj;
    private javax.swing.JTable Plazalastorres;
    private javax.swing.JTable Plazasendero;
    private javax.swing.JTable Porvenir;
    private javax.swing.JTable Ramonylucero;
    private javax.swing.JTable Torreshenequen;
    private javax.swing.JTable Torreslibramiento;
    private javax.swing.JButton btnAztecas;
    private javax.swing.JButton btnCarlosamaya;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnIndependencia;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPanamericana;
    private javax.swing.JButton btnPlazadelreloj;
    private javax.swing.JButton btnPlazajuarez;
    private javax.swing.JButton btnPlazalastorres;
    private javax.swing.JButton btnPlazasendero;
    private javax.swing.JButton btnPorvenir;
    private javax.swing.JButton btnRayonylucero;
    private javax.swing.JButton btnRetorno;
    private javax.swing.JButton btnTorreshenequen;
    private javax.swing.JButton btnTorreslibramiento;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JScrollPane tblAztecas;
    private javax.swing.JScrollPane tblCarlosamaya;
    private javax.swing.JScrollPane tblCentro;
    private javax.swing.JScrollPane tblIndependencia;
    private javax.swing.JScrollPane tblPanamericana;
    private javax.swing.JScrollPane tblPlazadelreloj;
    private javax.swing.JScrollPane tblPlazajuarez;
    private javax.swing.JScrollPane tblPlazalastorres;
    private javax.swing.JScrollPane tblPlazasendero;
    private javax.swing.JScrollPane tblPorvenir;
    private javax.swing.JScrollPane tblRayonylucero;
    private javax.swing.JScrollPane tblTorreshenequen;
    private javax.swing.JScrollPane tblTorreslibramiento;
    // End of variables declaration//GEN-END:variables
}
