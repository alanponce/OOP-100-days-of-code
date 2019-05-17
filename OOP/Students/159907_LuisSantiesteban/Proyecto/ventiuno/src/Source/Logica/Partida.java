/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source.Logica;

import java.util.ArrayList; //importacion del Arraylist (Almecena objetos)
import java.util.Scanner; //importacion de scanner para imprimir en pantalla

/**
 *
 * @author LESM
 */
//creacion de la clase partida
public class Partida {

    public static void main(String[] args) {
        //Declaracion de variables
        boolean salir = true;
        do {
            salir = true;
            Scanner teclado = new Scanner(System.in);

            Baraja baraja = new Baraja();
            Jugador jugador = new Jugador();
            Jugador maquina = new Jugador();
            Carta c1, c2, c3, c4;
            int turno = 0;
            boolean fin = true;
            boolean booleanTmp = true;
            int respuestaTmp;
            String ganador = "";
            double dif = 1.5;

            //Seleccion de dificultad
            System.out.println("\n 21 Black Jack\n Creado por: Luis Santiesteban\n Es hora de comenzar\n");
            System.out.println("Escoja dificultad\n1.\tFacil: 1\n2.\tMedio: 2\n3.\tDificil: 3");
            switch (teclado.nextInt()) {
                case 1:
                    dif = 1;
                    break;
                case 2:
                    dif = 1.2;
                    break;
                case 3:
                    dif = 1.5;
                    break;
            }

            //Aqui se reparten las 4 primeras cartas
            do {
                c1 = obtenerCarta(baraja);//Obtiene carta
            } while (!c1.isDisponible());//Verifica disponibilidad
            if (c1.getSigno() == "A") {
                System.out.println("Desea que el valor de la casta Az cambie de 1 a 11?\n\tSi: 1\n\tNo: 2");//Revisa si la casta es un AZ y da la opcion de cambiar su valor
                if (teclado.nextInt() == 1) {
                    c1.setValores();
                }
            }
            do {
                c2 = obtenerCarta(baraja);
            } while (!c1.isDisponible());
            if (c2.getSigno() == "A") {
                System.out.println("Desea que el valor de la casta Az cambie de 1 a 11?\n\tSi: 1\n\tNo: 2");
                if (teclado.nextInt() == 1) {
                    c2.setValores();
                }
            }
            do {
                c3 = obtenerCarta(baraja);
            } while (!c1.isDisponible());
            do {
                c4 = obtenerCarta(baraja);
            } while (!c1.isDisponible());

            //Se dan las cartas a los jugadores
            jugador.getBarajaJugador().add(c1);
            jugador.getBarajaJugador().add(c2);
            maquina.getBarajaJugador().add(c3);
            maquina.getBarajaJugador().add(c4);

            //Este DO sirve para mantener el ciclo de los turnos
            do {
                //Inicio de turno
                System.out.println(turno + "\n_____________________________________________________________________________________________________________");
                System.out.println("Jugador\n" + mostrarBaraja(jugador.getBarajaJugador()) + "Total: " + obtenerTotal(jugador.getBarajaJugador()) + "\n");
                System.out.println("Maquina\n" + mostrarBaraja(maquina.getBarajaJugador(), 1) + "Total: " + "?" + "\n");

                turno++;

                //Truno del jugador y toma de decision
                if (jugador.isActivo()) {
                    System.out.println("Jugador, su total es de " + obtenerTotal(jugador.getBarajaJugador()) + " . Desea otra carta?\nSi: 1\tNo: 2");
                    respuestaTmp = teclado.nextInt();
                    booleanTmp = true;
                    do {
                        switch (respuestaTmp) {
                            case 1:
                                do {
                                    c1 = obtenerCarta(baraja);
                                } while (!c1.isDisponible());
                                if (c1.getSigno() == "A") {
                                    System.out.println("Desea que el valor de la casta Az cambie de 1 a 11?\n\tSi: 1\n\tNo: 2");
                                    if (teclado.nextInt() == 1) {
                                        c1.setValores();
                                    }
                                }
                                jugador.getBarajaJugador().add(c1);
                                booleanTmp = false;
                                break;
                            case 2:
                                jugador.setActivo(false);
                                booleanTmp = false;
                                break;
                            default:
                                break;
                        }
                    } while (booleanTmp);
                } else {
                    System.out.println("Jugador es inactivo");
                }

                //Truno de la maquina
                if (maquina.tomaDecision(obtenerTotal(maquina.getBarajaJugador()), dif)) {
                    do {
                        c1 = obtenerCarta(baraja);
                    } while (!c1.isDisponible());
                    maquina.getBarajaJugador().add(c1);
                } else {
                    maquina.setActivo(false);
                }

                //Verificacion de fin de partida
                //Verificacion si alguin se paso de 21
                if (obtenerTotal(jugador.getBarajaJugador()) > 21) {
                    ganador = "Maquina";
                    fin = false;
                } else {
                    if (obtenerTotal(maquina.getBarajaJugador()) > 21) {
                        ganador = "Jugador";
                        fin = false;
                    } else {
                        //Verifica si exiten jugadores activos para ver si el juego continua
                        if (!jugador.isActivo() && !maquina.isActivo()) {
                            //Decidir ganador
                            if (obtenerTotal(jugador.getBarajaJugador()) > obtenerTotal(maquina.getBarajaJugador())) {
                                ganador = "Jugador";
                            } else {
                                if (obtenerTotal(jugador.getBarajaJugador()) < obtenerTotal(maquina.getBarajaJugador())) {
                                    ganador = "Maquina";
                                } else {
                                    ganador = "Empate";
                                }
                            }
                            fin = false;
                        }
                    }
                }

            } while (fin);
            //Se imprime el fin de la partida y se muestra el ganador
            System.out.println(turno + "\n_____________________________________________________________________________________________________________");
            System.out.println("Jugador\n" + mostrarBaraja(jugador.getBarajaJugador()) + "Total: " + obtenerTotal(jugador.getBarajaJugador()) + "\n");
            System.out.println("Maquina\n" + mostrarBaraja(maquina.getBarajaJugador()) + "Total: " + obtenerTotal(maquina.getBarajaJugador()) + "\n");
            System.out.println("El ganador es: " + ganador);

            System.out.println("Desea sailr?\nSi:\t1\nNo: \t2");
            if (teclado.nextInt() == 1) {
                salir = false;
            }

        } while (salir);
    }
    //Obteiene una carta de la baraja
    public static Carta obtenerCarta(Baraja baraja) {

        return baraja.getBaraja().get(escogerCarta());
    }

    //Devuelve un valor aleatorio entre 1 y 52 para decidir que carta escoge de la baraja
    public static int escogerCarta() {
        int numero = (int) (Math.random() * 52);
        return numero;
    }

    //Imprime una baraja dada desde el primer elementeo
    public static String mostrarBaraja(ArrayList<Carta> p) {
        String result = "";
        for (int i = 0; i < p.size(); i++) {
            Carta c = p.get(i);

            result = result + c.getPalo() + ", ";
            result = result + c.getSigno() + ", ";
            result = result + c.getValor() + ".\n";
        }
        return result;
    }

    //Imprime una baraja dada desde el elemento indicado, ademas muestra el mensaje de carta escondidad por cada carta no mostrada inicial
    public static String mostrarBaraja(ArrayList<Carta> p, int inicio) {
        String result = "";
        for (int i = 0; i < inicio; i++) {
            result = result + "Carta esconidad\n";
        }

        for (int i = inicio; i < p.size(); i++) {
            Carta c = p.get(i);

            result = result + c.getPalo() + ", ";
            result = result + c.getSigno() + ", ";
            result = result + c.getValor() + ".\n";
        }
        return result;
    }

    //Obtiene el total de puntos de una baraja dada
    public static int obtenerTotal(ArrayList<Carta> p) {
        int total = 0;
        for (int i = 0; i < p.size(); i++) {
            Carta c = p.get(i);
            total = total + c.getValor();
        }
        return total;
    }

}
