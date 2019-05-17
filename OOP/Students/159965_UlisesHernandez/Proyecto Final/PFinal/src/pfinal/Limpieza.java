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

//clase declarada final para que no tenga mas hijos, calse hija de trabjadoress, e implementa la interface trabajadores
public final class Limpieza extends Trabajadoress implements Trabajadores
{
    private final static int tiempoExtra=100;//variable declarada final para no poder cambiar su valor y static para inicializarala aqui mismo con modificador de acceso private
    
    public Limpieza(String nombre, String apellido, int edad, double Id) {//constructor de la clase
        super(nombre, apellido, edad, Id);
    }

    @Override//metodo sobreescrito de la interface el cual recibe dos parametros unp de tipo float y otro de tipo entero
    public void setSueldo(float tiempo, int tiempos) {
        float aux=tiempo*Limpieza.tiempoExtra;//declaro una variable de tipo float el cual almacena el resultado de la operacion entre un parametro recibido y el atributo de la clase delcarado como static
        float aux2=tiempos*Trabajadores.sueldo;//declaro otra vriable de tipo float para realizar la operacion entre el segundo paramtreo y una variable de la interface
        this.Sueldo=aux+aux2;//le asigno a sueldo el valor de la suma entre las 2 variables declaradas anteriormente
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

    @Override//metodo utilizado para obtener la informacion del trabajador
    public void getInformacion() {
        System.out.println("El nombre del Empleado de limpieza es: "+this.getNombre());
        System.out.println("El apellido del Empleado de limpieza es: "+this.getApellido());
        System.out.println("La edad del Empleado de limpieza es: "+this.getEdad());
        System.out.println("El id del Empleado de limpieza es: "+this.getID());
    }
    
}
