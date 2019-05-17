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
//Creacion de la clase CartaSigno que hereda apartir de la clase carta
public class CartaSigno extends Carta{

    public CartaSigno(String palo, String signo) {//contructor
        super(palo, signo);//super de la clase padre que solicita los parametros del constructor de dicha clase
        setValor();//cambia el valor de la carata 10
    }

   
    
    
    public void setValor() {//setter
        super.setValor(10);
    }

    @Override
    void setValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
