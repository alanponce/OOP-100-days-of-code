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
//Clase abstracta 
public abstract class Carta {
    //Declaracion de los atributos de la clase (se utiliza la palabra private para garantizar la seguridad y que solo puedan ser modificados con getters y setters
    private String palo;
    private String signo;
    private int valor;  
    private boolean disponible;

    public Carta(String palo, String signo) {//constructor de la clases
        this.palo = palo;
        this.signo = signo;
        this.disponible = true;
    }
    //metodo abstracto, se utiliza en la clase as para modificar el valos de 11 a 1
    abstract  void setValores();
    
    //getters y setters de la clase
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





