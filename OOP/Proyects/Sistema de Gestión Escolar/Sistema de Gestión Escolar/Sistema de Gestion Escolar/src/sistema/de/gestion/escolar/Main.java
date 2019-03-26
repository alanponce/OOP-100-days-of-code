package gestionescuela;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner input= new Scanner(System.in);
        
        
        Alumnos alm=new Alumnos();
        
     
        String nombre=alm.obtenerNombre();
        String apellidos=alm.obtenerApellidos();
        String grado=alm.obtenerGrado();
        String grupo=alm.obtenerGrupo();
        int id=alm.obtenerID();
        String fecha=alm.obtenerFecha();
        
        alm.mostrarRes(nombre, apellidos, grado, grado, grupo, fecha);
       
    }
}
