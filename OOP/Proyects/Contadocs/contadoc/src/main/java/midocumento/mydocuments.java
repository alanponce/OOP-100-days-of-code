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
//Permite modificar atributos de los textos
import java.awt.BorderLayout;
//Permite modificar las dimensiones de las vantanas
import java.awt.Dimension;
// Permite Asigna capas al sistem
import java.awt.GridLayout;
//Carga la asignación de los accesos rapidos a cada tab
import java.awt.event.KeyEvent;
//Permite desplegar paneles maestros
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
        ImageIcon iconBus = createImageIcon("/images/consultas.jpg");
        ImageIcon iconMov = createImageIcon("/images/movimientos.jpg");
        ImageIcon iconCliente = createImageIcon("/images/clientes.jpg");
        
         //Se instancia un nuevo panel con su respectivo nombre
        JComponent panelConsulta = makeTextPanel("Consultas");
         //Se le agrega el nuevo tab con el nombre, su icono, un pequeño mensaje de ayuda y contenido.
        panelPrincipal.addTab("Consultas", iconBus, panelConsulta, "Busca la ubicación de los documentos");
         //Se le asigna un acceso rápido a la ceja
         panelPrincipal.setMnemonicAt(0, KeyEvent.VK_C);
         
         //Se instancia un nuevo panel con su respectivo nombre
         JComponent panelMovimientos = makeTextPanel("Movimientos");
         //Se le agrega el nuevo tab con el nombre, su icono, un pequeño mensaje de ayuda y contenido.
         panelPrincipal.addTab("Movimientos", iconMov, panelMovimientos,"Genera documentos nuevos");
         //Se le asigna un acceso rápido a la ceja
         panelPrincipal.setMnemonicAt(1, KeyEvent.VK_M);
         
         //Se instancia un nuevo panel con su respectivo nombre
         JComponent panel3 = makeTextPanel("Nuevos Clientes");
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
     
    protected JComponent makeTextPanel(String text) {

        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 10));
        panel.add(filler);
        return panel;
    }
     

    protected static ImageIcon createImageIcon(String path) {
        //Solo para depuración, verifica si el icono está presente
        java.net.URL imgURL = mydocuments.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Archivo no encontrado " + path);
            return null;
        }
    }

    private static void createAndShowGUI() {
        //Crea y configura la ventana
        //Instancia la ventana con su título
        JFrame frame = new JFrame("Contadoc");
        //Se configura para que la ventana coloque los tres botones que permite minimizar, reducir o cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Se le asigna un tamaño por omisión
        frame.setPreferredSize(new Dimension(400, 300));
        //Agrega contenido al documento
        frame.add(new mydocuments(), BorderLayout.CENTER);
        //Despliega la ventana
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        //invoca la ventana principal
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        createAndShowGUI(); //Se manda a llamar la ventana
            }
        });
    }
}
