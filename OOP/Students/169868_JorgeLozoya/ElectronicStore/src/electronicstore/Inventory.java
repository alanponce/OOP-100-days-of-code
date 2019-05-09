/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicstore;
// Clase general donde los productos interactuarán  
public abstract class Inventory {
    // Variable para acomular cuantos productos hay.
    private
            int totalProducts;
    public abstract String showAll();
    public void sumTotal(){
    totalProducts++;
    }
    public int getTotal(){
    return totalProducts;
    }
}
