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
public final class Administrador extends Trabajadoress//declaro una clase final para que no tenga mas subclases y es una clase hija de trabajadores
{

    //constructor de la clase
    public Administrador(String nombre, String apellido, int edad, double Id) {
        super(nombre, apellido, edad, Id);
    }

    //funcion para dar el sueldo de un administrador,el parametro que recibe es el sueldo, por esto le damos el valor del parametro a sueldo
    public void setSueldo(int a)
    {
        this.Sueldo=a;
    }
    
    //funcion para agregar un portero,creando un objeto de este mismo tipo
    public Porteros addPortero(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Porteros p=new Porteros(nombre, apellido, edad, Id,nContrato,ncamisa);
        return p;//return usado para devolver un objeto de la clase porteros
    }
    
    public Porteros deletePortero(Porteros po)
    {
        po=null;
        return po;//return usado para regresarun objeto de tipo portero null, para que este vacio y de esta forma poder borrar lo que se tenia creado;
    }
    
    //funcion para agregar un medio,creando un objeto de este mismo tipo
    public Medios addMedio(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Medios m=new Medios(nombre, apellido, edad, Id,nContrato,ncamisa);
        return m;//return usado para devolver un objeto de tipo medios
    }
    
    public Medios deleteMedios(Medios po)
    {
        po=null;
        return po;//return usado para regresarun objeto de tipo mdios null, para que este vacio y de esta forma poder borrar lo que se tenia creado;
    }
    
    //funcion para agregar un defensa,creando un objeo de este tipo
    public Defensas addDefensa(String nombre, String apellido, int edad, double Id,int nContrato,int ncamisa)
    {
        Defensas d=new Defensas(nombre, apellido, edad, Id,nContrato,ncamisa);
        return d;
    }
    
    public Defensas deleteDefensa(Defensas po)
    {
        po=null;
        return po;//return usado para regresarun objeto de tipo defensas null, para borrar sus campos
    }
    
   /*SAME FOR ALL FUNCTIONS*/
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
    
    //funcion para agregar un Director tecnico
    public  Director addDirector(String nombre,String apellido,int edad,double Id,int anioscontrato,int idfifa)
    {
        Director p=new Director(nombre, apellido, edad, Id,anioscontrato,idfifa);
        return p;
    }
    
    public Director deleteDirector(Director po)
    {
        po=null;
        return po;
    }
  
    //funcion para agregar un portero
    public  Medico addMedico(String nombre,String apellido,int edad,double Id,int anioscontrato,int cedulaPr)
    {
        Medico p=new Medico(nombre, apellido, edad, Id,anioscontrato,cedulaPr);
        return p;
    }
    
    public Medico deleteMedico(Medico po)
    {
        po=null;
        return po;
    }
    
    //funcion para agregar un portero
    public  Utilero addUtilero(String nombre,String apellido,int edad,double Id,int anioscontrato,int matricula)
    {
        Utilero p=new Utilero(nombre, apellido, edad, Id,anioscontrato,matricula);
        return p;
    }
    
    public Utilero deleteUtilero(Utilero po)
    {
        po=null;
        return po;
    }
    
    //funcion para agregar un portero
    public Guardias addGuardia(String nombre, String apellido, int edad, double Id)
    {
        Guardias p=new Guardias(nombre, apellido, edad, Id);
        return p;
    }
    
    public Guardias deleteGuardia(Guardias po)
    {
        po=null;
        return po;
    }
    
    public StaffVentas addStaffVentas(String nombre, String apellido, int edad, double Id)
    {
        StaffVentas p=new StaffVentas(nombre, apellido, edad, Id);
        return p;
    }
    
    public StaffVentas deleteStaffVentas(StaffVentas po)
    {
        po=null;
        return po;
    }
    
     public Limpieza addLimpieza(String nombre, String apellido, int edad, double Id)
    {
        Limpieza p=new Limpieza(nombre, apellido, edad, Id);
        return p;
    }
    
    public Limpieza deleteLimpieza(Limpieza po)
    {
        po=null;
        return po;
    }
}
