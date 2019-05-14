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
            
        Estacionamiento est = new Estacionamiento();//instanciamos la clase Estacionamiento
        Discapacitados disc = new Discapacitados();//instanciamos la clase Discapacitados
        Normal normal = new Normal();//instanciamos la clase Normal
        Alumnos alumnos = new Alumnos();//instanciamos la clase Alumnos
        Maestros maestros = new Maestros();//instanciamos la clase Maestros
        Alumnos persona = new Alumnos();//instanciamos la clase Alumnos
        Asignar asignar = new Asignar();//instanciamos la clase Asignar
        Scanner scan = new Scanner(System.in);//instanciamos la clase Scanner para poder leer numeros
        
        
        int[] saveSlot = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//Creamos un array que guardara los lugares de las matriculas
       
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
