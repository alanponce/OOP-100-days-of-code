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
public class CartaNumero extends Carta{

    public CartaNumero(String palo, String signo) {//constructor
        super(palo, signo);
        setValor();
        
    }

 
    public void setValor() {
        super.setValor(Integer.parseInt(getSigno()));//se manda a llamar el constructor de la clase padre
    }

    @Override
    void setValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
