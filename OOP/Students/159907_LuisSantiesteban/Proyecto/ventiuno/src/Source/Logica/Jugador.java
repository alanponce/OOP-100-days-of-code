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
public class Jugador {
    ArrayList<Carta> barajaJugador = new ArrayList<>();
    boolean activo = true;
    boolean puntaje = true;

    public Jugador() {
        
    }
    
    

    public ArrayList<Carta> getBarajaJugador() {
        return barajaJugador;
    }

    public void setBarajaJugador(ArrayList<Carta> barajaJugador) {
        this.barajaJugador = barajaJugador;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public boolean tomaDecision(int total){
        int numero = (int) (Math.random() * 101);
        if(total<10){
            return numero<100;
        }
        if(total<12){
            return numero<80;
        }
        if(total<14){
            return numero<60;
        }
        if(total<16){
            return numero<50;
        }
        if(total<18){
            return numero<40;
        }
        if(total<20){
            return numero<20;
        }
        return false;
        
    }
    
}
