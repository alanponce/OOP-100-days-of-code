/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicstore;

/**
 *
 * @author 169868 169840
 */
public class Products {
    private 
            int ID; // Numero de identificacion del producto // solo el admi puede cambiarlos
            String name; //Nombre general del producto // el dueño y el admi puede cambiarlos
            int stock; // Cantitad de products en existencia // el empleado puede modificarlo
            float price; // Precio del producto // solo el dueño puede cambiarlo
    
   public Products(int id, String Name, int Stock, float Price){
       ID = id;
       name = Name;
       stock = Stock;
       price = Price;
   }         
   public void change_ID(int id){
   ID = id;
   }
    public String displayProduct() {
    return "ID: "+ID+ " Name: "+name+" Stock: "+stock+" Price: $"+price+"\n";
  }
}
