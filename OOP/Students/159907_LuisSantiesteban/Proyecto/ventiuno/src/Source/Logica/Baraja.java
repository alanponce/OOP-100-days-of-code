/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source.Logica;

import java.util.ArrayList;

/**
 *
 * @author LESM
 */
public class Baraja {
    
    ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja() {
        
        generarPalo("Diamante");
        generarPalo("Corazon");
        generarPalo("Espada");
        generarPalo("Trebol");
        
    }
    
    public void generarPalo(String palo){
        generarNumeros(palo);
        generarSignos(palo);
        CartaAz carta = new CartaAz(palo, "A");
        baraja.add(carta);
    }
    
    
    public void generarNumeros(String palo){
        for (int i = 2; i <= 10; i++) {
            CartaNumero carta = new CartaNumero(palo, String.valueOf(i));
            baraja.add(carta);
            
        }
    }
    
    public void generarSignos(String palo){
        CartaSigno carta1 = new CartaSigno(palo, "K");
        baraja.add(carta1);
        CartaSigno carta2 = new CartaSigno(palo, "Q");
        baraja.add(carta2);
        CartaSigno carta = new CartaSigno(palo, "J");
        baraja.add(carta);
  
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
   
    
    
}
