package midocumento;

//Permite asignar las cejas "tabs"
import javax.swing.JTabbedPane;
//Parmite cargar los iconos
import javax.swing.ImageIcon;
//Permite modificar las etiquetas de los tabs
import javax.swing.JLabel;
//JFrame permite colocar un contenedor principal en donde agregamos componenetes
import javax.swing.JFrame;
//Permite agregar componentes a una ventana diversificando sus posibilidades iniciales
import javax.swing.JComponent;
// Permite agregar elementos con accesorios, por ejemplo los iconos junto al texto
import javax.swing.SwingUtilities;
//Permite modificar atributos de los textos, organiza los elementos dentro de una ventana
import java.awt.BorderLayout;
//Permite modificar las dimensiones de las ventanas
import java.awt.Dimension;
// Permite Asigna capas al sistem
import java.awt.GridLayout;
//Carga la asignación de los accesos rapidos a cada tab
import java.awt.event.KeyEvent;
//Permite desplegar paneles maestros
import javax.swing.JPanel;
import javax.swing.JPanel;

/**
 *
 * @author George Rodriguez
 */
//Extendemos por herencia las propiedades de JFrame
public class mydocuments extends javax.swing.JFrame{
    
    public mydocuments() {
        //Se instancia el panel general con tabs
        JTabbedPane panelPrincipal = new JTabbedPane();
        //Se adquiere cada figura para el tab de correspondiente
        ImageIcon iconBus = crearIcono("/images/consultas.jpg");
        ImageIcon iconMov = crearIcono("/images/movimientos.jpg");
        ImageIcon iconCliente = crearIcono("/images/clientes.jpg");
        
         //Se instancia un nuevo panel con su respectivo nombre
        JComponent panelConsulta = colocarTexto("Consultas");
         //Se le agrega el nuevo tab con el nombre, su icono, un pequeño mensaje de ayuda y contenido.
        panelPrincipal.addTab("Consultas", iconBus, panelConsulta, "Busca la ubicación de los documentos");
         //Se le asigna un acceso rápido a la ceja
         panelPrincipal.setMnemonicAt(0, KeyEvent.VK_C);
         
         //Se instancia un nuevo panel con su respectivo nombre
         JComponent panelMovimientos = colocarTexto("Movimientos");
         //Se le agrega el nuevo tab con el nombre, su icono, un pequeño mensaje de ayuda y contenido.
         panelPrincipal.addTab("Movimientos", iconMov, panelMovimientos,"Genera documentos nuevos");
         //Se le asigna un acceso rápido a la ceja
         panelPrincipal.setMnemonicAt(1, KeyEvent.VK_M);
         
         //Se instancia un nuevo panel con su respectivo nombre
         JComponent panel3 = colocarTexto("Nuevos Clientes");
         //Se le agrega el nuevo tab con el nombre, su icono, un pequeño mensaje de ayuda y contenido.
         panelPrincipal.addTab("Nuevos clientes", iconCliente, panel3,"Genera nuevos clientes");
         panel3.setPreferredSize(new Dimension(210, 50));
         //Se le asigna un acceso rápido a la ceja
        panelPrincipal.setMnemonicAt(2, KeyEvent.VK_N);
         
        //Se agregan todas las cejas al panel
        add(panelPrincipal);
         
        //Permite despalzarse en la ceja con scroll
        panelPrincipal.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
     
    protected JComponent colocarTexto(String text) {
        //Instancia la varible principal con Jpanel
        JPanel panel = new JPanel(false);
        //Instancia nuestra frase origen con Jlabel
        JLabel filler = new JLabel(text);
        //Dentro del espacio disponible centra el texto
        filler.setHorizontalAlignment(JLabel.CENTER);
        //Se genera una malla de elementos para referencia
        panel.setLayout(new GridLayout(1, 1));
        //Se coloca el texto
        panel.add(filler);
        //regresa la variable con los atributos propuestos
        return panel;
    }
     

    protected static ImageIcon crearIcono(String path) {
        //Solo para depuración, verifica si el icono está presente
        java.net.URL imgURL = mydocuments.class.getResource(path);
        if (imgURL != null) {
            //ya que comprobó que existe regresa el icono como una entidad nueva a fin de que se instancie 
            return new ImageIcon(imgURL);
        } else {
            //Manda un mensaje de error
            System.err.println("Archivo no encontrado " + path);
            return null;
        }
    }

    private static void crearInterface() {
        //Crea y configura la ventana
        //Instancia la ventana con su título
        JFrame frame = new JFrame("Contadoc");
        //frame.setLocationRelativeTo(null);
        //Se configura para que la ventana coloque los tres botones que permite minimizar, reducir o cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Se le asigna un tamaño por omisión
        //frame.setPreferredSize(new Dimension(600, 400));
        //Agrega contenido al documento
        frame.add(new mydocuments(), BorderLayout.CENTER);
        //Despliega la ventana
        //frame.setLocationRelativeTo(null);
        frame.setState(JFrame.ICONIFIED);
        frame.setSize(400, 400);
        //frame.setType(javax.swing.JFrame.Type.POPUP);
        frame.pack();
        //Se hace visible la ventana
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        //invoca la ventana principal
       // SwingUtilities.invokeLater(new Runnable() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        crearInterface(); //Se manda a llamar la ventana
            }
        });
    }
}
