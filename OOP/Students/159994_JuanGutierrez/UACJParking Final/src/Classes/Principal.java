/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;


/**
 *
 * @author ENEMY345
 */
public class Principal { 
        public static void main(String[] args) {
            int contador = 0;//Es un contador que se utiliza para saber en que numero de registro vamos
            Scanner scan = new Scanner(System.in);//instanciamos la clase Scanner para poder leer numeros
        
            int[] matriculas = {0,0,0,0,0};//Aqui es donde se guarda el registro de matriculas
            String[] nombres = {"","","","",""};//Aqui es donde se guarda el registro de noombres
            String[] vehiculos = {"","","","",""};//Aqui es donde se guarda el registro de vehiculos
            boolean[] discapacitados = {false,false,false,false,false};//Aqui es donde se guarda el registro de discapacitados
            int[] saveSlot = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//Creamos un array que guardara los lugares de las matriculas
        
            System.out.println("Que desea hacer \n1.-Registrar \n2.-Generar Slot");
            int decision = scan.nextInt();
        
        if(decision == 1)//Esta condicional sirve para saber que es lo que quieres realizar
        {
            int reintentar;
            do{
                
            //Registro
            System.out.println("Es un maestro? true or false ");
            boolean maestro;//Declaramos la varible maestro de tipo booleano para saber si es un profesor o no
            maestro = scan.nextBoolean();//leemos la respuesta
        
                if(maestro ==  true)//En esta condicional vamos a ver si se tiene que trabajar con la clase de maestro o alumno
                {
                    System.out.println("Registro");
                    System.out.print("Ingrese su Matricula: ");
                    int matricula = scan.nextInt();//Leemos la matricula
                    System.out.print("Ingrese su Nombre: ");
                    String nombre = scan.next();//Leemos los nombres
                    System.out.print("Ingrese su tipo Vehiculo(troca,carro,camioneta,moto):  ");
                    String vehiculo = scan.next();//Leemos el vehiculo
                    System.out.print("Es Discapacitado? true or false ");
                    boolean discapacidad = scan.nextBoolean();//Leemos discapacidad
                    Persona teacher = new Maestro(matricula,nombre,vehiculo,discapacidad);//Creamos un objeto De la clase maestro heredada de persona y le asignamos los valores
       
                    for(int i = 0; i < matriculas.length;i++)//Este bucle es el que guarda el registro en arrays
                    {
                        if (contador == i)
                        {
                            matriculas[i] = teacher.getMatricula();
                            nombres[i] = teacher.getNombre();
                            vehiculos[i] = teacher.getVehiculo();
                            discapacitados[i] = teacher.isDiscapacidad();
                    
                        }
                    }
                    System.out.println("");
                    for(int i = 0; i <matriculas.length;i++)//Este bucle imprime las matriculas registradas
                    {
                        System.out.print(matriculas[i] + " , ");
                
                
                    }
                    System.out.println("");
                    for(int i = 0; i <matriculas.length;i++)//Este bucle imprime los nombres registradas
                    {
                
                        System.out.print(nombres[i] + " , ");
                
                
                    }
                    System.out.println("");
                    for(int i = 0; i <matriculas.length;i++)//Este bucle imprime los vehiculos registradas
                    {
               
                        System.out.print(vehiculos[i] + " , ");
                
                
                    }
                    System.out.println("");
                    for(int i = 0; i <matriculas.length;i++)//Este bucle imprime los discapacitados registradas
                    {
                
                        System.out.print(discapacitados[i] + " , ");
                
                    }
                    if("troca".equals(teacher.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Troca();//Se instancia un objeto de la clase troca
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                    if("Carro".equals(teacher.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Carro();//Se instancia un objeto de la clase carro
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                    if("camioneta".equals(teacher.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Camioneta();//Se instancia un objeto de la clase camioneta
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                    if("moto".equals(teacher.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Moto();//Se instancia un objeto de la clase moto
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                   
            
                }
            else
            {
                System.out.print("Ingrese su Matricula: ");
                int matricula = scan.nextInt();//Leemos la matricula
                System.out.print("Ingrese su Nombre: ");
                String nombre = scan.next();//Leemos el nombre
                System.out.print("Ingrese su tipo de Vehiculo(troca,carro,camioneta,moto): ");
                String vehiculo = scan.next();//Leemos el vehiculo
                System.out.print("Es Discapacitado? true or false ");
                boolean discapacidad = scan.nextBoolean();//Leemos la discapacidad
                Persona student = new Alumno(matricula,nombre,vehiculo,discapacidad);//Creamos un objeto De la clase Alumno heredada de persona y le asignamos los valores
                for(int i = 0; i < matriculas.length;i++)//Este bucle es el que guarda el registro en arrays
                {
                    if (contador == i)
                    {
                        matriculas[i] = student.getMatricula();
                        nombres[i] = student.getNombre();
                        vehiculos[i] = student.getVehiculo();
                        discapacitados[i] = student.isDiscapacidad();
                    
                    }
                }
                System.out.println("");
                for(int i = 0; i <matriculas.length;i++)//Este bucle imprime las matriculas registradas
                {
                    System.out.print(matriculas[i] + " , ");
                
                
                }
                System.out.println("");
                for(int i = 0; i <matriculas.length;i++)//Este bucle imprime los nombres registradas
                {
                
                    System.out.print(nombres[i] + " , ");
                
                
                }
                System.out.println("");
                for(int i = 0; i <matriculas.length;i++)//Este bucle imprime los vehiculos registradas
                {
               
                    System.out.print(vehiculos[i] + " , ");
                
                
                }
                System.out.println("");
                for(int i = 0; i <matriculas.length;i++)//Este bucle imprime lds discapacitados registradas
                {
                
                    System.out.print(discapacitados[i] + " , ");
                
                }
                    if("troca".equals(student.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Troca();//Se instancia un objeto de la clase troca
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                    if("Carro".equals(student.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Carro();//Se instancia un objeto de la clase carro
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                    if("camioneta".equals(student.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Camioneta();//Se instancia un objeto de la clase camioneta
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                    if("moto".equals(student.getVehiculo()))//Esta condicional me ayuda a saber que tipo de estacionamiento debe tomar
                    {
                        Vehiculo vehi = new Moto();//Se instancia un objeto de la clase moto
                        vehi.CajEstacionamiento();//Se ejecuta el metodo que me dice que tipo de estacionamiento necesita
                        vehi.Rueda();//Se ejecuta el metodo que me dice que vehiculo tiene
                    }
                   
                
                    
            }
        contador++;//agregamos un contador para poder saber en donde van los registros
        
            System.out.println("\nQuiere realizar otro registro? 1.-si 2.-no");
            reintentar = scan.nextInt();
            }while(reintentar == 1);
        }
            else{
                Asignar asignar = new Asignar();//instanciamos la clase Asignar
                Normal normal = new Normal();//instanciamos la clase Normal
                Alumnos alumnos = new Alumnos();//instanciamos la clase Alumnos
                Maestros maestros = new Maestros();//instanciamos la clase Maestros
                //Seleccionador de slot
        
       
            int reintentar;//Declaramos la varible de tipo entero que nos permitira hacer otra consulta

            do//se crea un bucle do while
            {
                System.out.println("ingrese su matricula");//Preguntamos por la matricula
                int matricula = scan.nextInt();//Leemos la matricula
                asignar.remSlot(normal.cajNorm(alumnos.getCajAluNorm(), maestros.getCajMaeNorm()), saveSlot, matricula);//Mandamos a llamar el metodo que remueve slots de la clase Asignar

                if(asignar.getSlotRem() == 101)//Verificamos si se removio un slot y si no, asignamos uno con la matricula que pusieron
                {
                    asignar.genslot(normal.cajNorm(alumnos.getCajAluNorm(), maestros.getCajMaeNorm()), saveSlot, matricula);//se llama el generador de slots
                }

                for(int i = 0; i < normal.cajNorm(alumnos.getCajAluNorm(), maestros.getCajMaeNorm()); i++)//imprimimos el array para saber lo que ocurrio
                {
                    System.out.print(saveSlot[i] + " , ");//imprimimos 1 componente del array seguido de una coma
                }

                System.out.println("\nDesea hacer otra consulta? 1.-Si 2.-No");//preguntamos si quiere hacer otra consulta
                reintentar = scan.nextInt();//leemos si quiere otra consulta
            }while(reintentar == 1);//si reintentar es igual a 1 entonces se vuelve a ejecutar el bucle 
            }
        }

}
