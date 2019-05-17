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
    ArrayList<Carta> barajaJugador = new ArrayList<>();//este array son las cartas que actualmente tiene el jugador
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
    
    //esta es la IA de la maquina, funciona por probabilidad y dificultad
    public boolean tomaDecision(int total,double dif){
        int numero = (int) (Math.random() * 101);
        if(total<10){
            return numero<(100*dif);
        }
        if(total<12){
            return numero<(80*dif);
        }
        if(total<14){
            return numero<(60*dif);
        }
        if(total<16){
            return numero<(50*dif);
        }
        if(total<18){
            return numero<(40*dif);
        }
        if(total<20){
            return numero<(20*dif);
        }
        return false;
        
    }
    
}
