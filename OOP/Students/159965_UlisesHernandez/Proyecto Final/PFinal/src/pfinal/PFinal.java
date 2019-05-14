/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfinal;

/**
 *
 * @author Ulises
 */
public class PFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Porteros p;
        p = new Porteros("Ulises","Hernandez",20,159965,5,10);
        
        p.entrenar();
        p.obtenerInfo();
        p.jugarPartido();
        p.aumentarMSG(10);
        p.setSueldo(200);
        System.out.println(p.getSueldo());
        
        Administrador a;
        a=new Administrador("Ulises","Hernandez",21,12);
        p=a.deletePortero(p);
        System.out.println(p.getNombre());
        
        Guardias b;
        b=new Guardias("Jorge","Garcia",20,1599);
        
        
    }
    
}
