import java.util.Scanner;



public class Main {
       public static Scanner s = new Scanner(System.in); //creamos scaner
    
    public static void main(String[] args) {
        String modelo = "", nombreMecanico = ""; //declaramos variables que necesitaremos
        int nivelMecanico = 0, opcion = 0, tipoViaje = 0; //para eligir las opciones
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
            System.out.println("1.Realizar vuelo \n2.Cargar combustible \n3.Realizar Mantencion \n4.Ver cantidad de vuelos \n5.Ver cantidad de mantenciones\n6.Ver kilometraje \n7.Ver combustible \n8.Salir");
            opcion = Integer.parseInt(s.nextLine());//leeremos por pantalla
            switch(opcion){//evaluamos con un switch que hara funcionar al menu
                case 1:
                    do{
                        System.out.println("Ingrese el tipo de viaje (1.Nacional / 2.Internacional)");
                        tipoViaje = Integer.parseInt(s.nextLine()); //imprimimos y leemos la opcion necesaria
                    }while(tipoViaje < 1 || tipoViaje > 2);//si no esta en este rango vuevlve a preguntar
                    a.realizarVuelo(tipoViaje);//es tipo objeto a, el avion realizara un vuelo, le enviamos por parametro el tipo de viaje
                    break;
                case 2: a.actualizarCombustible(m.cargarCombustible());//corresponde a cargar combustible
                    break;
                case 3: a.recibirMantencion(m.realizarMantencion());//se realiza mantencion, sera al azar
                    break;
                case 4: System.out.println("La cantidad de vuelos es " + a.getCantidadVuelos());
                    break;
                case 5: System.out.println("La cantidad de mantencion es " + a.getCantidadMantenciones());
                    break;
                case 6: System.out.println("El kilometraje actual es de " + a.getKilometraje() + "Kms.");
                    break;
                case 7: System.out.println("El nivel de combustible es de " + a.getCombustible());
                 break;
            }
        }while(opcion != 8);//si es distinta de 8 volvera a repetir el menu
        System.out.println("Fin de la aplicacion");
       
    }
    
}
