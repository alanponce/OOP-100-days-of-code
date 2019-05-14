/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author ENEMY345
 */
public class Alumnos {//Se crea la clase Alumnos con el modificador de acceso publico
    
    private int cajUtilAluNorm,cajUtilAluDisc;//Se declaran 2 variables enteras con el modificador de acceso privado
    
    private final int cajAluNorm = 5, cajAluDisc = 5;//Se declaran 2 variables enteras con el modificador de acceso privado y final porque no requiere mas cambios

    public int getCajAluNorm() {//Se genera un getter para poder obtener el valor de la variable encapsulada
        return cajAluNorm; //Nos regresa el valor de la variable
    }


    public int getCajAluDisc() {//Se genera un getter para poder obtener el valor de la variable encapsulada
        return cajAluDisc; //Nos regresa el valor de la variable
    }


    public int getCajUtilAluNorm() {//Se genera un getter para poder obtener el valor de la variable encapsulada
        return cajUtilAluNorm; //Nos regresa el valor de la variable
    }

    public void setCajUtilAluNorm(int cajUtilAluNorm) {//Se genera un setter para poder cambiar el valor de la variable encapsulada
        this.cajUtilAluNorm = cajUtilAluNorm;//Le ingresa una valor a la variable
    }

    public int getCajUtilAluDisc() {//Se genera un getter para poder obtener el valor de la variable encapsulada
        return cajUtilAluDisc;//Nos regresa el valor de la variable
    }

    public void setCajUtilAluDisc(int cajUtilAluDisc) {//Se genera un setter para poder cambiar el valor de la variable encapsulada
        this.cajUtilAluDisc = cajUtilAluDisc;//Le ingresa una valor a la variable
    }
    
    
}
