/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora; // declaramnos un conjutno de clases e interfaces
// relacionadas entre si
/**
 *
 * @author alex
 */

public class Calculadora {
// se crea la clase con el nombre de calculadora
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //el que inicia el programa de java
        new interfaz().setVisible(true);// lo que hace esa linea de codigo es tomar el objeto que hemos creado
        // llamado interfaz(), y lo hace visible con la parte de codigo setVisible
        // es importante que el parametro deba de tener true, de lo contrario, 
        // estariamos oculatando el formulario
        
    }
    
}
