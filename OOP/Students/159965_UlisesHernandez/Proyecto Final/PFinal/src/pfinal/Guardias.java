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
//clase delcarada final para no heredar mas clases, hija de la clase trabajadoress y implementa la interface trabajadores
public final class Guardias extends Trabajadoress implements Trabajadores{
    
    private final static int bonoTiempo=20;//varaible declarada static para inicializarla directamente, y final porque no permite cambios ed tipo int y con modificador de acceso private
    
    public Guardias(String nombre, String apellido, int edad, double Id) //constructor de la clase
    {
        super(nombre, apellido, edad, Id);
    }

   
    @Override
    public void setBonoExtra(boolean a) {//metodo declarado para sber si se le dara bono o no al trabjador, recibe un parametro de tipo boleeano
       if(true!=a)
       {
           
       }
       else 
       {
           this.Sueldo+=Trabajadores.bonoExtra;//de seleccionar darle un bono al trabajador, le asignamos a sueldo, el valor de el atributo bonoextra delacrado en la interface
       }
    }

    @Override
    public void getInformacion() {//metodo el cual da la inormacion del trabajador mediante metodos get de cada atributo
        System.out.println("El nombre del guardia es: "+this.getNombre());
        System.out.println("El apellido del guardia es: "+this.getApellido());
        System.out.println("La edad del guardia es: "+this.getEdad());
        System.out.println("El id del guardia es: "+this.getID());
        
    }

    @Override//metodo sobreescrito de la interface trabajadores, utilizado para saber cuato sueldo es del trabajador
    public void setSueldo(float tiempo,int tiempos) 
    {
        this.obtenerTiempoDeTrabajo(tiempo, tiempos);//llamado al metodo obtenertiempo,el cual es un metodo sobrecargado, el cual devuelve tiempo de trabajo
        float aux=this.minutosGuardias*Guardias.bonoTiempo;//declaro un atributo aux para guardar una multiplicacion de los atributos el cual utilizaresmo para calcular el sueldo
        this.Sueldo=aux+Trabajadores.sueldo;//Le asignamos al atributo sueldo el valor entre la suma de aux y sueldo
    }

  
}
