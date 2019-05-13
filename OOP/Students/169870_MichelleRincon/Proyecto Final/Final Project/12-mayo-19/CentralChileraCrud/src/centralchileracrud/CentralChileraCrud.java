package centralchileracrud;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tanya
 */

public class CentralChileraCrud {
    
    public static void main(String[] args) {
    
        String[] options = {"Customer", "Product", "Order"};
           int s = JOptionPane.showOptionDialog(null, "Select information table", "Central Chilera", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
           
           if(s == 0){
                JFrame frame = new JFrame();
                frame.setContentPane(new Customer_CRUD());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
           }
           if(s==1){
                JFrame frame = new JFrame();
                frame.setContentPane(new Product_CRUD());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
           }
           if(s==2){
                JFrame frame = new JFrame();
                frame.setContentPane(new Order_CRUD());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
           }       
    }
}
