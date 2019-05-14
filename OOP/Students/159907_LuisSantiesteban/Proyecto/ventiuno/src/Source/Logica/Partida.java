/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source.Logica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LESM
 */
public class Partida extends Reglas{
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Baraja baraja = new Baraja();
        Jugador jugador = new Jugador();
        Jugador maquina = new Jugador(); 
        Carta c1,c2,c3,c4;
        int turno = 0;
        boolean fin = true;
        boolean booleanTmp = true;
        int respuestaTmp;
        String ganador = "";
                
        
        do{
            c1 = obtenerCarta(baraja);
        }while(!c1.isDisponible());
        do{
            c2 = obtenerCarta(baraja);
        }while(!c1.isDisponible());
        do{
            c3 = obtenerCarta(baraja);
        }while(!c1.isDisponible());
        do{
            c4 = obtenerCarta(baraja);
        }while(!c1.isDisponible());
        
        jugador.getBarajaJugador().add(c1);
        jugador.getBarajaJugador().add(c2);
        maquina.getBarajaJugador().add(c3);
        maquina.getBarajaJugador().add(c4);
        
        
        
        do{
            //Inicio de turno
            System.out.println(turno+"\n_____________________________________________________________________________________________________________");
            System.out.println("Jugador\n"+mostrarBaraja(jugador.getBarajaJugador())+"Total: "+obtenerTotal(jugador.getBarajaJugador())+"\n");
            System.out.println("Maquina\n"+mostrarBaraja(maquina.getBarajaJugador())+"Total: "+obtenerTotal(maquina.getBarajaJugador())+"\n");
        
            turno++;
            
            //Truno del jugador y toma de decision
            if(jugador.isActivo()){
                System.out.println("Jugador, su total es de "+obtenerTotal(jugador.getBarajaJugador())+" . Desea otra carta?\nSi: 1\tNo: 2");
                respuestaTmp=teclado.nextInt();
                booleanTmp = true;
                do{
                switch(respuestaTmp){
                    case 1:
                        do{
                            c1 = obtenerCarta(baraja);
                        }while(!c1.isDisponible());
                        jugador.getBarajaJugador().add(c1);
                        booleanTmp=false;
                        break;
                    case 2:
                        jugador.setActivo(false);
                        booleanTmp=false;
                        break;
                    default:
                        break;
                }
                }while(booleanTmp);
            }else{
                System.out.println("Jugador es inactivo");
            }
            
            
            //Turno de la maquina
            if(maquina.tomaDecision(obtenerTotal(maquina.getBarajaJugador()))){
                do{
                    c1 = obtenerCarta(baraja);
                }while(!c1.isDisponible());
                maquina.getBarajaJugador().add(c1);
            }else{
                maquina.setActivo(false);
            }
            
            
            //Verificacion de fin de partida
            
                //Verificacion si alguien se paso de 21
                if(obtenerTotal(jugador.getBarajaJugador())>21){
                    ganador = "Maquina";
                    fin = false;
                }else{
                    if(obtenerTotal(maquina.getBarajaJugador())>21){
                        ganador = "Jugador";
                        fin = false;
                    }else{
                        //Verifica si exiten jugadores activos para ver si el juego continua
                        if(!jugador.isActivo() && !maquina.isActivo()){
                            //Decidir ganador
                            if(obtenerTotal(jugador.getBarajaJugador())>obtenerTotal(maquina.getBarajaJugador())){
                                ganador = "Jugador";
                            }else{
                                if(obtenerTotal(jugador.getBarajaJugador())<obtenerTotal(maquina.getBarajaJugador())){
                                    ganador = "Maquina";
                                }else{
                                    ganador = "Empate";
                                }
                            }
                            fin = false;
                        }
                    }
                }
                
            
                
                
        }while(fin);
        //Se imprime el fin de la partida y se muestra el ganador
        System.out.println(turno+"\n_____________________________________________________________________________________________________________");
            System.out.println("Jugador\n"+mostrarBaraja(jugador.getBarajaJugador())+"Total: "+obtenerTotal(jugador.getBarajaJugador())+"\n");
            System.out.println("Maquina\n"+mostrarBaraja(maquina.getBarajaJugador())+"Total: "+obtenerTotal(maquina.getBarajaJugador())+"\n");
        System.out.println("El ganador es: "+ganador);
    }
    
    public static Carta obtenerCarta(Baraja baraja){
    
        return baraja.getBaraja().get(escogerCarta());
    }
    
    public static int escogerCarta(){
        int numero = (int) (Math.random() * 52);
        return numero;
    }
    
    public static String mostrarBaraja(ArrayList<Carta> p){
        String result = "";
        for(int i =0; i<p.size();i++){
            Carta c = p.get(i);
            
            result = result + c.getPalo()+", ";
            result = result + c.getSigno()+", ";
            result = result + c.getValor()+".\n";
        }
        return result;
    }
    
    public static int obtenerTotal(ArrayList<Carta> p){
        int total = 0;
        for(int i =0; i<p.size();i++){
            Carta c = p.get(i);
            total = total + c.getValor();
        }
        return total;
    }
    
    
}