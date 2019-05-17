/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source.Pruebas;
import Source.Logica.Baraja;
import Source.Logica.Carta;

/**
 *
 * @author Maste
 */

//Imprime toda la baraja
public class PruebaBaraja {
    public static void main(String[] args) {
        Baraja p = new Baraja();
        
        for(int i = 0; i<=51;i++){
            Carta c = p.getBaraja().get(i);
            String result = "";
            result = result + c.getPalo()+", ";
            result = result + c.getSigno()+", ";
            result = result + c.getValor()+"";
            System.out.println(result);
        }
        
    }
    
    
}
