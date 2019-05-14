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
public class Administrador extends Trabajadoress
{

    public Administrador(String nombre, String apellido, int edad, double Id) {
        super(nombre, apellido, edad, Id);
    }

    public Porteros addPortero(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Porteros p=new Porteros(nombre, apellido, edad, Id,nContrato,ncamisa);
        return p;
    }
    
    public Porteros deletePortero(Porteros po)
    {
        po=null;
        return po;
    }
    
    public Medios addMedio(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Medios m=new Medios(nombre, apellido, edad, Id,nContrato,ncamisa);
        return m;
    }
    
    public Medios deleteMedios(Medios po)
    {
        po=null;
        return po;
    }
    
    public Defensas addDefensa(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Defensas d=new Defensas(nombre, apellido, edad, Id,nContrato,ncamisa);
        return d;
    }
    
    public Defensas deleteDefensa(Defensas po)
    {
        po=null;
        return po;
    }
    
    public Delanteros addDelantero(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Delanteros p=new Delanteros(nombre, apellido, edad, Id,nContrato,ncamisa);
        return p;
    }
    
    public Delanteros deleteDelnteros(Delanteros po)
    {
        po=null;
        return po;
    }
  
}
