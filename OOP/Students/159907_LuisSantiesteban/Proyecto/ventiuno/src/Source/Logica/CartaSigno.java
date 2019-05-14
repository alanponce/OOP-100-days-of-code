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
public class CartaSigno extends Carta{

    public CartaSigno(String palo, String signo) {
        super(palo, signo);
        setValor();
    }

   
    
    
    public void setValor() {
        super.setValor(10);
    }
    
}
