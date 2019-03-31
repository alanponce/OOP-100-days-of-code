/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ENEMY345
 */
public class Ventana extends javax.swing.JFrame {
    //Declarando variables
    char[] aCorregir;
    Mapa browser = new Mapa();
   
    //Creamos un metodo con una entrada booleana para poder deshabilitar y ocultar los botones
    private void Btnactivo(boolean falso)
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
    private void Tblactivo(boolean falso)
    {
        //Deshabilitando y ocultando las jsp
        this.jspAztecas.enable(falso);
        this.jspAztecas.show(falso);
        this.jspCarlosamaya.enable(falso);
        this.jspCarlosamaya.show(falso);
        this.jspPanamericana.enable(falso);
        this.jspPanamericana.show(falso);
        this.jspCentro.enable(falso);
        this.jspCentro.show(falso);
        this.jspIndependencia.enable(falso);
        this.jspIndependencia.show(falso);
        this.jspPlazajuarez.enable(falso);
        this.jspPlazajuarez.show(falso);
        this.jspPlazadelreloj.enable(falso);
        this.jspPlazadelreloj.show(falso);
        this.jspPlazasendero.enable(falso);
        this.jspPlazasendero.show(falso);
        this.jspPlazalastorres.enable(falso);
        this.jspPlazalastorres.show(falso);
        this.jspPorvenir.enable(falso);
        this.jspPorvenir.show(falso);
        this.jspRayonylucero.enable(falso);
        this.jspRayonylucero.show(falso);
        this.jspTorreshenequen.enable(falso);
        this.jspTorreshenequen.show(falso);
        this.jspTorreslibramiento.enable(falso);
        this.jspTorreslibramiento.show(falso);
    }
    
    //Creamos un metodo para deshabilitar o habilitar el buscador
    private void Rastreo(boolean falso)
    {
        //botones
        this.btnLocalizar.enable(falso);
        this.btnLocalizar.show(falso);
        this.btnUbicacion.enable(falso);
        this.btnUbicacion.show(falso);
        this.btnRecorrido.enable(falso);
        this.btnRecorrido.show(falso);
        //labels
        this.lblTrayecto.enable(falso);
        this.lblTrayecto.show(falso);
        this.lblIngrese.enable(falso);
        this.lblIngrese.show(falso);
        this.lblUbicacion.enable(falso);
        this.lblUbicacion.show(falso);
        this.lblRecorrido.enable(falso);
        this.lblRecorrido.show(falso);
        //textbox
        this.tbUbicacion.enable(falso);
        this.tbUbicacion.show(falso);

    }
    //Creamos otro metodo para el boton de retorno
    private void BtnRetorno(boolean falso)
    {
        this.btnRetorno.enable(falso);
        this.btnRetorno.show(falso);
        
    }
    
    private void Conjunto()
    {
        Btnactivo(false);//deshabilitamos los botones y los ocultamos
        BtnRetorno(true);//Activamos el boton al activar este boton
        Rastreo(true);//Activamos todas la funciones de rastreo
        MiniMap(true);
    }
    
    
    //Este metodo arreglara el problema de utilizar espacioes en el textbox
    private String Corrector(String Corregir)
    {
        
        aCorregir = Corregir.toCharArray();
        //Este for nos sustituye los espacios con +
        for(int i = 0; i != aCorregir.length; i++)
        {
            if(aCorregir[i] == ' ')
            {
                aCorregir[i] = '+';
            }
        }
        //Se crea un objecto de tipo string para poder converir el arreglo en un string y poder utilizarlo
        String resultado = new String(aCorregir);
        
        return resultado;

    }
    
    //Se utiliza este metodo para mostrar googlemaps dentro de la aplicacion
    private void Navegador(String url)
    {
        browser.loadURL(url);
        browser.setBounds(1, 1, jpMapa.getWidth() - 1, jpMapa.getHeight() - 1);
        jpMapa.add(browser);
    }
    //Se utiliza este metodo para mostrar googlemaps dentro de la aplicacion, aqui pide mas argumentos porque se necesita para la busqueda del domicilio
        private void Navegador(String url,String coordenadasHogar, String coordenadasDestino)
    {
        browser.loadURL(url + coordenadasHogar + coordenadasDestino);
        browser.setBounds(1, 1, jpMapa.getWidth() - 1, jpMapa.getHeight() - 1);
        jpMapa.add(browser);
    }
    //Se utilizo el navegador predeterminado del sistema para el boton Ubicacion, porque el Engine de webmoto no soporta imagenes 360    
    private void Navegador2(String url)
    {
        try
        {
            Desktop.getDesktop().browse(new URL(url).toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void MiniMap(boolean falso){
        this.btnMinMap.enable(falso);
        this.btnMinMap.show(falso);
        this.btnMaxMap.enable(falso);
        this.btnMaxMap.show(falso);
        this.jpMapa.enable(falso);
        this.jpMapa.show(falso);
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
        Rastreo(false);
        MiniMap(false);
       
    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMapa = new javax.swing.JPanel();
        btnMinMap = new javax.swing.JButton();
        btnMaxMap = new javax.swing.JButton();
        jspAztecas = new javax.swing.JScrollPane();
        tblAztecas = new javax.swing.JTable();
        jspCarlosamaya = new javax.swing.JScrollPane();
        tblCarlosamaya = new javax.swing.JTable();
        jspCentro = new javax.swing.JScrollPane();
        tblCentro = new javax.swing.JTable();
        jspIndependencia = new javax.swing.JScrollPane();
        tblIndependencia = new javax.swing.JTable();
        jspPlazalastorres = new javax.swing.JScrollPane();
        tblPlazalastorres = new javax.swing.JTable();
        jspPanamericana = new javax.swing.JScrollPane();
        tblPanamericana = new javax.swing.JTable();
        jspPlazajuarez = new javax.swing.JScrollPane();
        tblPlazaJuarez = new javax.swing.JTable();
        jspPlazadelreloj = new javax.swing.JScrollPane();
        tblPlazadelReloj = new javax.swing.JTable();
        jspPlazasendero = new javax.swing.JScrollPane();
        tblPlazasendero = new javax.swing.JTable();
        jspPorvenir = new javax.swing.JScrollPane();
        tblPorvenir = new javax.swing.JTable();
        jspRayonylucero = new javax.swing.JScrollPane();
        tblRamonylucero = new javax.swing.JTable();
        jspTorreshenequen = new javax.swing.JScrollPane();
        tblTorreshenequen = new javax.swing.JTable();
        jspTorreslibramiento = new javax.swing.JScrollPane();
        tblTorreslibramiento = new javax.swing.JTable();
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
        btnUbicacion = new javax.swing.JButton();
        btnRecorrido = new javax.swing.JButton();
        btnLocalizar = new javax.swing.JButton();
        btnRetorno = new javax.swing.JButton();
        lblRecorrido = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblTrayecto = new javax.swing.JLabel();
        lblIngrese = new javax.swing.JLabel();
        tbUbicacion = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpMapa.setOpaque(false);

        btnMinMap.setText("-");
        btnMinMap.setContentAreaFilled(false);
        btnMinMap.setOpaque(true);
        btnMinMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMapActionPerformed(evt);
            }
        });
        jpMapa.add(btnMinMap);

        btnMaxMap.setText("□");
        btnMaxMap.setContentAreaFilled(false);
        btnMaxMap.setOpaque(true);
        btnMaxMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxMapActionPerformed(evt);
            }
        });
        jpMapa.add(btnMaxMap);

        getContentPane().add(jpMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 170, 220));

        jspAztecas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspAztecas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblAztecas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAztecas.getTableHeader().setReorderingAllowed(false);
        jspAztecas.setViewportView(tblAztecas);

        getContentPane().add(jspAztecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        jspCarlosamaya.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspCarlosamaya.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblCarlosamaya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6:40", "12:00"},
                {"10:40", "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblCarlosamaya.getTableHeader().setReorderingAllowed(false);
        jspCarlosamaya.setViewportView(tblCarlosamaya);

        getContentPane().add(jspCarlosamaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 60));

        jspCentro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspCentro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblCentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:40", "14:00"},
                {"12:50", "14:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblCentro.getTableHeader().setReorderingAllowed(false);
        jspCentro.setViewportView(tblCentro);

        getContentPane().add(jspCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 60));

        jspIndependencia.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspIndependencia.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblIndependencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:50", "12:00"},
                {"11:20", "14:00"},
                {"13:20", "16:00"},
                {"15:20", "18:00"},
                {null, null}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblIndependencia.getTableHeader().setReorderingAllowed(false);
        jspIndependencia.setViewportView(tblIndependencia);

        getContentPane().add(jspIndependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        jspPlazalastorres.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspPlazalastorres.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblPlazalastorres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:00", "12:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblPlazalastorres.getTableHeader().setReorderingAllowed(false);
        jspPlazalastorres.setViewportView(tblPlazalastorres);

        getContentPane().add(jspPlazalastorres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 40));

        jspPanamericana.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspPanamericana.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblPanamericana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:00", "12:00"},
                {"11:10", "14:00"},
                {"13:20", "16:00"},
                {"15:10", "18:00"},
                {null, "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblPanamericana.getTableHeader().setReorderingAllowed(false);
        jspPanamericana.setViewportView(tblPanamericana);

        getContentPane().add(jspPanamericana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        jspPlazajuarez.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspPlazajuarez.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblPlazaJuarez.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:40", "14:00"},
                {"12:40", "16:00"},
                {"14:40", "18:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblPlazaJuarez.getTableHeader().setReorderingAllowed(false);
        jspPlazajuarez.setViewportView(tblPlazaJuarez);

        getContentPane().add(jspPlazajuarez, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 70));

        jspPlazadelreloj.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspPlazadelreloj.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblPlazadelReloj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:50", "Ninguno"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblPlazadelReloj.getTableHeader().setReorderingAllowed(false);
        jspPlazadelreloj.setViewportView(tblPlazadelReloj);

        getContentPane().add(jspPlazadelreloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 40));

        jspPlazasendero.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspPlazasendero.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblPlazasendero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"06:55", "12:00"},
                {"11:00", "14:00"},
                {"13:00", "16:00"},
                {"", "18:00"},
                {null, "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblPlazasendero.getTableHeader().setReorderingAllowed(false);
        jspPlazasendero.setViewportView(tblPlazasendero);

        getContentPane().add(jspPlazasendero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        jspPorvenir.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspPorvenir.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblPorvenir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:10", "12:00"},
                {"11:10", "14:00"},
                {"13:10", "16:00"},
                {"", "18:00"},
                {null, "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblPorvenir.getTableHeader().setReorderingAllowed(false);
        jspPorvenir.setViewportView(tblPorvenir);

        getContentPane().add(jspPorvenir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        jspRayonylucero.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspRayonylucero.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblRamonylucero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:00", "Ninguno"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblRamonylucero.getTableHeader().setReorderingAllowed(false);
        jspRayonylucero.setViewportView(tblRamonylucero);

        getContentPane().add(jspRayonylucero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 40));

        jspTorreshenequen.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspTorreshenequen.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblTorreshenequen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:15", "12:00"},
                {"11:10", "14:00"},
                {"13:10", "16:00"},
                {"15:10", "18:00"},
                {null, "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblTorreshenequen.getTableHeader().setReorderingAllowed(false);
        jspTorreshenequen.setViewportView(tblTorreshenequen);

        getContentPane().add(jspTorreshenequen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

        jspTorreslibramiento.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspTorreslibramiento.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblTorreslibramiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07:15", "12:00"},
                {"11:15", "14:00"},
                {"13:15", "16:00"},
                {"15:15", "18:00"},
                {null, "20:00"}
            },
            new String [] {
                "Punto a CU", "Salida a CU"
            }
        ));
        tblTorreslibramiento.getTableHeader().setReorderingAllowed(false);
        jspTorreslibramiento.setViewportView(tblTorreslibramiento);

        getContentPane().add(jspTorreslibramiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 90));

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

        btnUbicacion.setText("Ubicacion");
        btnUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        btnRecorrido.setText("Recorrido");
        btnRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLocalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        btnRetorno.setText("Atras");
        btnRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        lblRecorrido.setText("Mostrar el recorrido de la parada al destino");
        getContentPane().add(lblRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblUbicacion.setText("Mostrar en donde se para el autobus");
        getContentPane().add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblTrayecto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTrayecto.setText("Trayecto a tu indiobus seleccionado");
        getContentPane().add(lblTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblIngrese.setText("Ingrese su ubicacion:");
        getContentPane().add(lblIngrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        tbUbicacion.setText("Ejemplo:Anemona 9146");
        tbUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(tbUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, -1));

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
        MiniMap(false);
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCarlosamayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarlosamayaActionPerformed
        this.jspCarlosamaya.enable(true);//Habilita la tabla de los horarios
        this.jspCarlosamaya.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Carlos Amaya");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnCarlosamayaActionPerformed

    private void btnAztecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAztecasActionPerformed
        this.jspAztecas.enable(true);//Habilita la tabla de los horarios
        this.jspAztecas.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Aztecas");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnAztecasActionPerformed

    private void btnPanamericanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanamericanaActionPerformed
        this.jspPanamericana.enable(true);//Habilita la tabla de los horarios
        this.jspPanamericana.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Panamericana");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnPanamericanaActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        this.jspCentro.enable(true);//Habilita la tabla de los horarios
        this.jspCentro.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Centro");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnIndependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndependenciaActionPerformed
        this.tblIndependencia.enable(true);//Habilita la tabla de los horarios
        this.tblIndependencia.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Independencia");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnIndependenciaActionPerformed

    private void btnPlazadelrelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazadelrelojActionPerformed
        this.jspPlazadelreloj.enable(true);//Habilita la tabla de los horarios
        this.jspPlazadelreloj.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza del Reloj");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnPlazadelrelojActionPerformed

    private void btnPorvenirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorvenirActionPerformed
        this.jspPorvenir.enable(true);//Habilita la tabla de los horarios
        this.jspPorvenir.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Porvenir");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnPorvenirActionPerformed

    private void btnRayonyluceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRayonyluceroActionPerformed
        this.jspRayonylucero.enable(true);//Habilita la tabla de los horarios
        this.jspRayonylucero.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Rayon y Lucero");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnRayonyluceroActionPerformed

    private void btnPlazalastorresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazalastorresActionPerformed
        this.jspPlazalastorres.enable(true);//Habilita la tabla de los horarios
        this.jspPlazalastorres.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza las Torres");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnPlazalastorresActionPerformed

    private void btnTorreslibramientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreslibramientoActionPerformed
        this.jspTorreslibramiento.enable(true);//Habilita la tabla de los horarios
        this.jspTorreslibramiento.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Torres Libramiento");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnTorreslibramientoActionPerformed

    private void btnTorreshenequenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreshenequenActionPerformed
        this.jspTorreshenequen.enable(true);//Habilita la tabla de los horarios
        this.jspTorreshenequen.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Torres Henequen");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnTorreshenequenActionPerformed

    private void btnPlazajuarezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazajuarezActionPerformed
        this.jspPlazajuarez.enable(true);//Habilita la tabla de los horarios
        this.jspPlazajuarez.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza Juarez");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnPlazajuarezActionPerformed

    private void btnPlazasenderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlazasenderoActionPerformed
        this.jspPlazasendero.enable(true);//Habilita la tabla de los horarios
        this.jspPlazasendero.show(true);//Habilita la tabla de los horarios
        this.lblStatus.setText("Plaza Sendero");//Al activar este boton cambiamos el texto de status a su localizacion
        
        Conjunto();//Ejecuta una serie de metodos ya predefinidos
    }//GEN-LAST:event_btnPlazasenderoActionPerformed

    private void btnRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornoActionPerformed
        Tblactivo(false); //Primero desactivamos las tablas para que no se muestren
        Btnactivo(false); // Desactivamos los botones para evitar que sigan alli
        Btnactivo(true); //Activamos todos los botones para que sean visibles
        BtnRetorno(false); //Desactivamos el boton y lo deshabilitamos para no verlo
        Rastreo(false);//Desactivamos todas la funciones de rastreo
        MiniMap(false);
        this.lblStatus.setText("Horarios");//Al precionar el boton cambiamos el texto de status a horarios
    }//GEN-LAST:event_btnRetornoActionPerformed

    private void tbUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbUbicacionActionPerformed

    }//GEN-LAST:event_tbUbicacionActionPerformed

   
    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
       
        Corrector(this.tbUbicacion.getText());
        
        
        //Estos switches nos ayudan a determinar que url abrir en cualquier caso
        switch(this.lblStatus.getText())
            {
                case "Aztecas":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6620202,-106.4726568");
                    break;
                case "Carlos Amaya":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6960171,-106.4820059");
                    break;
                case "Centro":
                   Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.7387286,-106.4844009");
                   break;
                case "Independencia":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.7387286,-106.4844009");
                    break;
                case "Panamericana":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.65621,-106.4308213");
                    break;
                case "Plaza del Reloj":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6622238,-106.3930957");
                    break;
                case "Plaza Juarez":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.7056663,-106.4259918");
                    break;
                case "Plaza las Torres":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6225826,-106.3943623");
                    break;
                case "Plaza Sendero":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6922341,-106.3825022");
                    break;
                case "Porvenir":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.7050374,-106.4018729");
                    break;
                case "Rayon y Lucero":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6274441,-106.372479");
                    break;
                case "Torres Henequen":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6494885,-106.3889386");
                    break;
                case "Torres Libramiento":
                    Navegador("https://www.google.com.mx/maps/dir/", Corrector(this.tbUbicacion.getText()), "/31.6058216,-106.3990229");
                    break;
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridoActionPerformed
       //Estos switches nos ayudan a determinar que url abrir en cualquier caso
        switch(this.lblStatus.getText())
        {
            case "Aztecas":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./Coppel+Aztecas/@31.5814109,-106.5719991,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m5!1m1!1s0x86e75e46eef772e3:0xb9201f334cc78ff7!2m2!1d-106.4724865!2d31.6615309");
                    break;
            case "Carlos Amaya":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./31.6959478,-106.4820112/@31.6237953,-106.557617,11z/data=!3m1!4b1!4m8!4m7!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m0");
                    break;
            case "Centro":
                   Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chihuahua/''/@31.6237953,-106.5488782,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m5!1m1!1s0x86e75926d9f8c091:0x4834655a93bad4a1!2m2!1d-106.484473!2d31.7389149");
                   break;
            case "Independencia":
                    Navegador("https://www.google.com.mx/maps/@31.6259389,-106.3540675,3a,75y,80.03h,76.98t/data=!3m6!1e1!3m4!1sl6eKz7x7w5qyRznzpPkqYg!2e0!7i13312!8i6656");
                    break;
            case "Panamericana":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chihuahua/31.6569464,-106.4314551/@31.5749486,-106.4803074,12z/data=!3m1!4b1!4m8!4m7!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m0");
                    break;
            case "Plaza del Reloj":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./''/@31.5774964,-106.4535935,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m5!1m1!1s0x86e75d75ff9a9789:0xbe1fc10467d48c55!2m2!1d-106.3939378!2d31.6634682");
                    break;
            case "Plaza Juarez":
                    Navegador("https://www.google.com.mx/maps/@31.7057122,-106.4260768,3a,75y,180.94h,84.88t/data=!3m6!1e1!3m4!1sYJMBrQnH3in3ULbFmzZJKQ!2e0!7i13312!8i6656");
                    break;
            case "Plaza las Torres":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./Provive/@31.5571962,-106.4637933,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m5!1m1!1s0x0:0x41639c736cca3d2d!2m2!1d-106.3961736!2d31.6230604");
                    break;
            case "Plaza Sendero":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chihuahua/31.692365,-106.3823795/@31.5924775,-106.5236401,11z/data=!3m1!4b1!4m8!4m7!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m0");
                    break;
            case "Porvenir":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./''/@31.6012749,-106.5169455,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m5!1m1!1s0x0:0xd279c341609c048f!2m2!1d-106.4024064!2d31.705352");
                    break;
            case "Rayon y Lucero":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./Supermercado+Gonz%C3%A1lez/@31.5592008,-106.4504529,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m5!1m1!1s0x86e7679565f1117b:0xd93c4495f205cca6!2m2!1d-106.3725715!2d31.6270697");
                    break;
            case "Torres Henequen":
                    Navegador("https://www.google.com.mx/maps/dir/31.6495287,-106.3889386/31.4927427,-106.4138476/@31.5474312,-106.4668231,12.04z/data=!4m2!4m1!3e0");
                    break;
            case "Torres Libramiento":
                    Navegador("https://www.google.com.mx/maps/dir/Ciudad+Universitaria+edificio+B,+Ciudad+Ju%C3%A1rez,+Chih./31.6065209,-106.3990941/@31.5489522,-106.4637933,12z/data=!3m1!4b1!4m8!4m7!1m5!1m1!1s0x86e764eb800a2325:0xfa28fa2110f1714!2m2!1d-106.4140104!2d31.4938195!1m0");
                    break;
        }
    }//GEN-LAST:event_btnRecorridoActionPerformed

    private void btnUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbicacionActionPerformed
        //Estos switches nos ayudan a determinar que url abrir en cualquier caso
        switch(this.lblStatus.getText())
            {
                case "Aztecas":
                    Navegador2("https://www.google.com.mx/maps/@31.6620508,-106.4726488,3a,75y,185.1h,90.7t/data=!3m6!1e1!3m4!1s5aFDHdKhg9apj0hcpK1tQw!2e0!7i13312!8i6656");
                    break;
                case "Carlos Amaya":
                    Navegador2("https://www.google.com.mx/maps/@31.6960013,-106.4820112,3a,75y,228.85h,90.69t/data=!3m6!1e1!3m4!1sEsMPrJfUJARZul0NwQQ2rg!2e0!7i13312!8i6656");
                    break;
                case "Centro":
                   Navegador2("https://www.google.com.mx/maps/@31.738736,-106.4844212,3a,75y,127.55h,91.93t/data=!3m6!1e1!3m4!1scQGHqJjxyKA4Ffj0PryTlg!2e0!7i13312!8i6656");
                   break;
                case "Independencia":
                    Navegador2("https://www.google.com.mx/maps/@31.6259389,-106.3540675,3a,75y,80.03h,76.98t/data=!3m6!1e1!3m4!1sl6eKz7x7w5qyRznzpPkqYg!2e0!7i13312!8i6656");
                    break;
                case "Panamericana":
                    Navegador2("https://www.google.com.mx/maps/@31.6562202,-106.4307287,3a,75y,35.31h,81.58t/data=!3m6!1e1!3m4!1scsxonokFvKDOi1Ho3erZ8A!2e0!7i13312!8i6656");
                    break;
                case "Plaza del Reloj":
                    Navegador2("https://www.google.com.mx/maps/@31.6622975,-106.3930108,3a,75y,17.97h,79.78t/data=!3m6!1e1!3m4!1sB2SOHXUM7c_EwOYYkNVWxw!2e0!7i13312!8i6656");
                    break;
                case "Plaza Juarez":
                    Navegador2("https://www.google.com.mx/maps/@31.7057122,-106.4260768,3a,75y,180.94h,84.88t/data=!3m6!1e1!3m4!1sYJMBrQnH3in3ULbFmzZJKQ!2e0!7i13312!8i6656");
                    break;
                case "Plaza las Torres":
                    Navegador2("https://www.google.com.mx/maps/@31.6225983,-106.3944445,3a,75y,222.05h,86.82t/data=!3m6!1e1!3m4!1s03jf6K6N-MNfew5UCveUSg!2e0!7i13312!8i6656");
                    break;
                case "Plaza Sendero":
                    Navegador2("https://www.google.com.mx/maps/@31.6922964,-106.3823878,3a,75y,35.32h,70.21t/data=!3m6!1e1!3m4!1s40YRe4_OG2hG8Kg3NVb5Aw!2e0!7i13312!8i6656");
                    break;
                case "Porvenir":
                    Navegador2("https://www.google.com.mx/maps/@31.7051006,-106.4018142,3a,75y,217.93h,72.96t/data=!3m6!1e1!3m4!1siqLUesX-jcHpnLUe9fPeZg!2e0!7i13312!8i6656");
                    break;
                case "Rayon y Lucero":
                    Navegador2("https://www.google.com.mx/maps/@31.6275471,-106.3724378,3a,75y,115.75h,77.03t/data=!3m6!1e1!3m4!1s461EH6bOYC_PXADMC9vZww!2e0!7i13312!8i6656");
                    break;
                case "Torres Henequen":
                    Navegador2("https://www.google.com.mx/maps/@31.6495515,-106.3889821,3a,75y,222.8h,80.13t/data=!3m6!1e1!3m4!1sLpseY8icx4xXkuKYNj9PuA!2e0!7i13312!8i6656");
                    break;
                case "Torres Libramiento":
                    Navegador2("https://www.google.com.mx/maps/@31.605935,-106.3990186,3a,75y,109.22h,73.28t/data=!3m6!1e1!3m4!1sJsArOU8dI7q48LFrDkT1tA!2e0!7i13312!8i6656");
                    break;
        }
    }//GEN-LAST:event_btnUbicacionActionPerformed

    private void btnMaxMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxMapActionPerformed
       
         this.jpMapa.setLocation(75, 120); 
         this.jpMapa.setSize(600, 600 );

    }//GEN-LAST:event_btnMaxMapActionPerformed

    private void btnMinMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinMapActionPerformed
        this.jpMapa.setLocation(420, 130); 
        this.jpMapa.setSize(170, 220);
    }//GEN-LAST:event_btnMinMapActionPerformed

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
    private javax.swing.JButton btnAztecas;
    private javax.swing.JButton btnCarlosamaya;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnIndependencia;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnMaxMap;
    private javax.swing.JButton btnMinMap;
    private javax.swing.JButton btnPanamericana;
    private javax.swing.JButton btnPlazadelreloj;
    private javax.swing.JButton btnPlazajuarez;
    private javax.swing.JButton btnPlazalastorres;
    private javax.swing.JButton btnPlazasendero;
    private javax.swing.JButton btnPorvenir;
    private javax.swing.JButton btnRayonylucero;
    private javax.swing.JButton btnRecorrido;
    private javax.swing.JButton btnRetorno;
    private javax.swing.JButton btnTorreshenequen;
    private javax.swing.JButton btnTorreslibramiento;
    private javax.swing.JButton btnUbicacion;
    private javax.swing.JPanel jpMapa;
    private javax.swing.JScrollPane jspAztecas;
    private javax.swing.JScrollPane jspCarlosamaya;
    private javax.swing.JScrollPane jspCentro;
    private javax.swing.JScrollPane jspIndependencia;
    private javax.swing.JScrollPane jspPanamericana;
    private javax.swing.JScrollPane jspPlazadelreloj;
    private javax.swing.JScrollPane jspPlazajuarez;
    private javax.swing.JScrollPane jspPlazalastorres;
    private javax.swing.JScrollPane jspPlazasendero;
    private javax.swing.JScrollPane jspPorvenir;
    private javax.swing.JScrollPane jspRayonylucero;
    private javax.swing.JScrollPane jspTorreshenequen;
    private javax.swing.JScrollPane jspTorreslibramiento;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblRecorrido;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTrayecto;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JTextField tbUbicacion;
    private javax.swing.JTable tblAztecas;
    private javax.swing.JTable tblCarlosamaya;
    private javax.swing.JTable tblCentro;
    private javax.swing.JTable tblIndependencia;
    private javax.swing.JTable tblPanamericana;
    private javax.swing.JTable tblPlazaJuarez;
    private javax.swing.JTable tblPlazadelReloj;
    private javax.swing.JTable tblPlazalastorres;
    private javax.swing.JTable tblPlazasendero;
    private javax.swing.JTable tblPorvenir;
    private javax.swing.JTable tblRamonylucero;
    private javax.swing.JTable tblTorreshenequen;
    private javax.swing.JTable tblTorreslibramiento;
    // End of variables declaration//GEN-END:variables
}
