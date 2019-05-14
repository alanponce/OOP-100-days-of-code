/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicstore;

/**
 *
 * @author 169868
 */
public class USB extends Products {
    private 
            int storage; // Pulgadas
    public USB(int id, String Name, int Stock, float Price, int Storage) {
        super(id, Name, Stock, Price);
        storage = Storage;
    }
    public String showAll(){
        return super.showAll()+" GB:" +storage;
    }
    
}
