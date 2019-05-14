/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicstore;

/**
 *
 * @author van17
 */
public class Laptop extends Products {
    private 
            int memoryRAM; // En GB
            String processor; // Nombre del procesador
    public Laptop(int id, String Name, int Stock, float Price, int MemoryRAM,String Processor) {
        super(id, Name, Stock, Price);
        memoryRAM = MemoryRAM;
        processor= Processor;
    }
    public String showAll(){
        return super.showAll()+" Memoria RAM: " +memoryRAM + " Procesador: "+ processor;
    }
}
