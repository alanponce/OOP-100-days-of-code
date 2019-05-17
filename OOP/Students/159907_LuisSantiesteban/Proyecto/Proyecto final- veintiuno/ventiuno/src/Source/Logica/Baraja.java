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

//Esta clase se encarga de la creacion de todas las cartas
public class Baraja {
    
    ArrayList<Carta> baraja = new ArrayList<>();//este array list almacena todas las cartas
    
    
     // palo se refiere al diamante, corazon, espada y trebol
    public Baraja() {//constructor
        
        generarPalo("Diamante"); //se le manda el parametro Diamante al metodo generar palo
        generarPalo("Corazon");
        generarPalo("Espada");
        generarPalo("Trebol");
        
    }
    
    //Este metodo recive un palo y manda a llamar a los demas metodos para generar toda la baraja de ese palo
    public void generarPalo(String palo){
        generarNumeros(palo);//genera los numeros de cada palo
        generarSignos(palo);//genera los signos de cada palo
        CartaAz carta = new CartaAz(palo, "A");//creacion del obteto Carta de la clase CartaAz y se le manda el parametro del palo y A
        baraja.add(carta); //agrega a la baraja la carta as dependiendo el palo utilizando el metodo add de la clase de array list
    }
    
    //Reciviendo un palo genera los numero del 2 al 10 de ese palo
    public void generarNumeros(String palo){ 
        for (int i = 2; i <= 10; i++) { //for para generar los numeros del 2-10 de la cartas
            CartaNumero carta = new CartaNumero(palo, String.valueOf(i));//creacion del objeto Carta de la clase Cartanumero que recibe de parametro el palo y usa el metodo valueof para hacer un parseo de int a string
            baraja.add(carta);  //agrega a la baraja la carta as dependiendo el palo utilizando el metodo add de la clase de array list
            
        }
    }
    //Reciviendo un palo genera las cartas con los 3 signos, rey, quina, y joto
    public void generarSignos(String palo){
        CartaSigno carta1 = new CartaSigno(palo, "K");//Se crea el objeto carta1 de la clase CartaSigno y se le manda los parametros del palo y el signo k
        baraja.add(carta1); //agrega a la baraja la carta  dependiendo el palo utilizando el metodo add de la clase de array list
        CartaSigno carta2 = new CartaSigno(palo, "Q");//Se crea el objeto carta1 de la clase CartaSigno y se le manda los parametros del palo y el signo k
        baraja.add(carta2);//agrega a la baraja la carta  dependiendo el palo utilizando el metodo add de la clase de array list
        CartaSigno carta = new CartaSigno(palo, "J");//Se crea el objeto carta1 de la clase CartaSigno y se le manda los parametros del palo y el signo k
        baraja.add(carta);//agrega a la baraja la carta  dependiendo el palo utilizando el metodo add de la clase de array list
  
    }

    
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
   
    
    
}
