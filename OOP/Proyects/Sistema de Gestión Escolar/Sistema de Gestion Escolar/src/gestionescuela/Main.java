package gestionescuela;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner input= new Scanner(System.in);
        
        
        Alumnos alm=new Alumnos();
        
        alm.establecerNombre("Erik");
        alm.establecerApellidos("Macias");
        alm.establecerGrado("6");
        alm.establecerGrupo("A");
       
        
        alm.mostrarRes();
     
        
       
       
    }
}
