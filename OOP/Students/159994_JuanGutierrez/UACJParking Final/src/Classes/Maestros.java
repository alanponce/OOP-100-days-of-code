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
public class Maestros {

    /*Declaramos las variables que nos ayudaran a saber cuanta gente
    Discapacitada y gente normal hay en el estacionamiento
     */
    private int cajUtilMaeNorm,cajUtilMaeDisc;
    
    private final int cajMaeNorm = 5,cajMaeDisc = 5;
    
    public int getCajMaeNorm() {
        return cajMaeNorm;
    }


    public int getCajMaeDisc() {
        return cajMaeDisc;
    }


    public int getCajUtilMaeNorm() {
        return cajUtilMaeNorm;
    }

    public void setCajUtilMaeNorm(int cajUtilMaeNorm) {
        this.cajUtilMaeNorm = cajUtilMaeNorm;
    }

    public int getCajUtilMaeDisc() {
        return cajUtilMaeDisc;
    }

    
    public void setCajUtilMaeDisc(int cajUtilMaeDisc) {
        this.cajUtilMaeDisc = cajUtilMaeDisc;
    }

}
