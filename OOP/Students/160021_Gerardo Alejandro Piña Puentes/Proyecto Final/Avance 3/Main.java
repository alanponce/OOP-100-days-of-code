import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {
       public static Scanner s = new Scanner(System.in); //creamos scaner
       public static ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();

    public static void main(String[] args) {
        //String[] pasajeros = {"Daniel", "Christian", "Jordy", "Juanito","Luis","Pedro", "Mario", "Alexa", "Chona"};
        Random rnd = new Random();
        String modelo = "", nombreMecanico = "", nombrePasajero = ""; //declaramos variables que necesitaremos
        int nivelMecanico = 0, opcion = 0, tipoViaje = 0, tipoPasajero = 0; //para eligir las opciones
        System.out.println("Ingrese el modelo del avion");//se imprime
        modelo = s.nextLine();//lo leemos por pantalla
        Avion a = new Avion();//creamos un avion OBJETO "A"
        a.setModelo(modelo);//le entregamos por parametros el modelo a travez del metodo set para modificar su atributo
        System.out.println("Ingrese el nombre del mecanico del avion");
        nombreMecanico = s.nextLine();//leemos por pantalla el nombre del mecanico
        do{//aqui seran a diferencia el nivel del mecanico
            System.out.println("Ingrese el nivel del mecanico (1.Nivel 1 / 2.Nivel 2");
            nivelMecanico = Integer.parseInt(s.nextLine());//forma de leer variables de tipo entero - Le asignamos el nivel

        }while(nivelMecanico != 1 && nivelMecanico != 2);//si es diferente de ambos, volvera a preguntar el nivel del mecanico
        Mecanico m = new Mecanico();//se crea el objeto de tipo mecanico
        m.setNombre(nombreMecanico);//vamos al set nombre que esta en mecanico
        m.setNivel(nivelMecanico);
        a.setMecanico(m);
        System.out.println("Avion y su Mecanico creados");
        System.out.println("Menu de opciones, ingrese el numero de su opcion");
        do{
            System.out.println("1.Realizar vuelo \n2.Cargar combustible \n3.Realizar Mantencion \n4.Ver cantidad de vuelos \n5.Ver cantidad de mantenciones\n6.Ver kilometraje \n7.Ver combustible \n8.Anadir Pasajeros \n9.Ver pasajeros \n10.Salir");
            opcion = Integer.parseInt(s.nextLine());//leeremos por pantalla
            switch(opcion){//evaluamos con un switch que hara funcionar al menu
                case 1:
                    do{
                        System.out.println("Ingrese el tipo de viaje (1.Nacional / 2.Internacional)");
                        tipoViaje = Integer.parseInt(s.nextLine()); //imprimimos y leemos la opcion necesaria
                    }while(tipoViaje < 1 || tipoViaje > 2);//si no esta en este rango vuevlve a preguntar
                    a.realizarVuelo(tipoViaje);//es tipo objeto a, el avion realizara un vuelo, le enviamos por parametro el tipo de viaje
                    break;
                case 2: a.actualizarCombustible(cargaGas(m));//corresponde a cargar combustible
                    break;
                case 3: a.recibirMantencion(darMantencion(m));//se realiza mantencion, sera al azar
                    break;
                case 4: System.out.println("La cantidad de vuelos es " + a.getCantidadVuelos());
                    break;
                case 5: System.out.println("La cantidad de mantencion es " + a.getCantidadMantenciones());
                    break;
                case 6: System.out.println("El kilometraje actual es de " + a.getKilometraje() + "Kms.");
                    break;
                case 7: System.out.println("El nivel de combustible es de " + a.getCombustible());
                    break;
                case 8:
                    System.out.println("Ingrese el nombre del pasajero");
                    nombrePasajero = s.nextLine();
                    System.out.println("Seleccione el tipo de pasajero: \n1.PrimeraClase \n.2 Turista");
                    tipoPasajero = Integer.parseInt(s.nextLine()); //imprimimos y leemos la opcion necesaria
                    if(tipoPasajero == 1){
                      Pasajero pPrimera = new PrimeraClase(nombrePasajero, rnd.nextBoolean(), rnd.nextBoolean(),"Preimum");
                      pasajeros.add(pPrimera);
                      break;
                    }else if(tipoPasajero == 2){
                      //Pasajero pTurista = new SegundaClase(); //Pues pone los parametros
                    }else{
                      break;
                    }
                case 9:
                    for (Pasajero pasajero : pasajeros) {
			                    System.out.print("Nombre: "+pasajero.getNombrePasajero() + "Equipaje?: " + pasajero.getEquipaje() + "\n");
		                }
                    break;
            }
        }while(opcion != 10);//si es distinta de 10 volvera a repetir el menu
        System.out.println("Fin de la aplicacion");

    }
    public static int darMantencion(Mantenimiento m){
		            return m.realizarMantencion();
	  }
    public static int cargaGas(Mantenimiento m){
		            return m.cargarCombustible();
	  }
}
