/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source.Logica;

/**
 *
 * @author LESM
 */
public class Carta {
    private String palo;
    private String signo;
    private int valor;  
    private boolean disponible;

    public Carta(String palo, String signo) {
        this.palo = palo;
        this.signo = signo;
        this.disponible = true;
    }
    
    

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSingo(String singo) {
        this.signo = signo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}





