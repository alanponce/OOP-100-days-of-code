/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
/**
 *
 * @author ivanv
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //datos para pruebas
        
        Administrador a=new Administrador(1,"ivan Valdez","11/06/94","Administrador",457.8);
        
        a.agregarBebidas(1,"Corona", 25.5, "Cerveza", "Cerveza clara", "Corona",3.5);
        a.agregarBebidas(2,"Limonada",15.5, "Agua Natural", "Agua sabor limon con azuvar", "Limon");
        a.agregarBebidas(3,"Fanta", 20, "Refresco", "Refresco gasificado de naranja", "Naranja","coca-cola");
        
        
    }
    
}

