/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicstore;


import javax.swing.JOptionPane;

/**
 *
 * @author 169868 169840
 */
public class ElectronicStore {

    
    
    public static void main(String[] args) {
        
        Products usb = new Products(12300,"USB", 50, 10); //USB ID 10000
        Products laptop = new Products(21000,"Laptop", 4, 72000); // Laptop ID 20000
        Products tv = new Products(32400,"Smart TV", 6, 69000); // TV ID 30000
        Products phone = new Products(46520, "Phone", 21, 45000);// Phone Id 40000
        
        try{
            String[] whoAreYou = {"Administrador","Dueño","Trabajador","Cliente"}; //Estas son las opciones que se desplegarán
            
            // showOptionDialog(Component parentComponent,String title,int optionType,int messageType,Icon icon, Object[] options,Object initialValue)
        int seleccion = JOptionPane.showOptionDialog(null, "Elegir una opcion", "Electronic Store", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, whoAreYou, whoAreYou[0]);
            if (seleccion == 0){//Seleccion 0 ser Administrador
               String[] whatDoYouWantToDo = {"Cambiar ID", "Cambiar nombre a un producto"}; //Estas son las opciones que se desplegarán
                int admiSelec = JOptionPane.showOptionDialog(null, "Elegir una opcion", "Welcome Administrador", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, whatDoYouWantToDo, whatDoYouWantToDo[0]);
                Admin administrador = new Admin();
                    if (admiSelec == 0){
                       String[] choseAProduct = {usb.displayProduct(),laptop.displayProduct(),tv.displayProduct(), phone.displayProduct()}; 
                        int changeIDoption = JOptionPane.showOptionDialog(null, "Elegir una opcion", "Administrador ChangeID", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choseAProduct, choseAProduct[0]);
               
                    }
                    else if(admiSelec == 1){
                        
                    }
        
        }
            
        
        }
        catch(Exception e){ // Agarrar cualquier error
            System.out.println("Error al Elegir");
        }
        
    }
    
}
