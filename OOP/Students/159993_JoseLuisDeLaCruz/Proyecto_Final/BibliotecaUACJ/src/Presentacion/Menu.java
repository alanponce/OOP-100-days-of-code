package Presentacion;//paquete presentacion

import Datos.Registro;//importamos datos y registro

 // @author Jose Luis De La Cruz 
 
public class Menu extends javax.swing.JFrame {//nos dice que jFrame va ser publico y se va a llamar ingresar
Registro doc;//nos dice que es publico y que se llama registro 
    public Menu() {//nos dice que sera publico y se llamara menu
        initComponents();//nos permite inicializar los componentes
        doc=new Registro();//nos dice que sera un documento nuevo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuIngresar = new javax.swing.JMenu();
        menuEliminar = new javax.swing.JMenu();
        MenuListar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Iniciar");

        menuIngresar.setText("Ingresar");
        menuIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuIngresarMouseClicked(evt);
            }
        });
        jMenu2.add(menuIngresar);

        menuEliminar.setText("Eliminar");
        menuEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEliminarMouseClicked(evt);
            }
        });
        jMenu2.add(menuEliminar);

        MenuListar.setText("Listar");
        MenuListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuListarMouseClicked(evt);
            }
        });
        jMenu2.add(MenuListar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Salir");

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void menuIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIngresarMouseClicked
       Ingresar in=new Ingresar();//nos dice que podemos ingresar
       in.setVisible(true);//nos dice que sera visible
    }//GEN-LAST:event_menuIngresarMouseClicked

    private void menuEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEliminarMouseClicked
        Eliminar el=new Eliminar();//nos dice que podemos eliminar
        el.setVisible(true);//y que sera visible
    }//GEN-LAST:event_menuEliminarMouseClicked

    private void MenuListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuListarMouseClicked
        Listar li=new Listar();//podemos listar
        li.setVisible(true);//nos dice que sera visible
    }//GEN-LAST:event_MenuListarMouseClicked

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {//nos dice que si correra el programa si cumple con los requisitos
                new Menu().setVisible(true);//nos dice que el menu sera visible
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuListar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuIngresar;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
