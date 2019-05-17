/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products_CRUD;

/**
 *
 * @author 169868
 */
//Es clase final ya que no estamos interesados en una television que herede del 4k
final class FourK_TV extends TV{
   private final double price = 50000; //El precio no puede ser negociable
    
    public FourK_TV(int ID, String nombre, double price, int stock, int pantalla) {
        super(ID, nombre, price, stock, pantalla);
        }
    
    public void imprimirDatos(){
                           System.out.println("**Datos del producto: **\n "
                           +"ID: "+getID()+"\n"
                           +"Nombre: "+getNombre()+"\n"
                           +"Precio: $ "+price+"\n"
                           +"Pantalla: "+getPantalla()+"\n"
                           +"4K \n");
    }
}
