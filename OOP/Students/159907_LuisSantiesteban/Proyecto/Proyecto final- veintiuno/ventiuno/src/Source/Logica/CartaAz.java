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
//cracion de la clase CartaAz que hereda de la clase carta e implementa  la interfaz Ass
public class CartaAz extends Carta implements Ass{

    
    public CartaAz(String palo, String signo) {//constructor
        super(palo, signo);
        setValor();//Agrega el valor de 1 a la carta
    }

    

    public void setValor() {//getters y setters
        super.setValor(1);
    }

    public static int getValor2() {//metodo estatico
        return valor2;
    }

    //metodo para cambiar el valor de 1 a 11
    @Override
    void setValores() {
       this.setValor(11);
    }
    
    
    
}
