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
//Declaro una clase de tipo final para que no tenga mas subclases, es una subclase de trabajadoress e implementa a la interface trabajadores
public final class StaffVentas extends Trabajadoress implements Trabajadores {

    private final static int bonoTiempo=50;//variable de tipo int con modificador de accso private con keyword final para que no admita acmbios, y static para inicilizarla aqui mismo
    
    public StaffVentas(String nombre, String apellido, int edad, double Id) {//constructor de la clase
        super(nombre, apellido, edad, Id);
    }

    @Override//metodo sobreescrito de la interface utilizado par darle el valor al sueldo del trabajador
    public void setSueldo(float tiempo, int tiempos) {
        
        this.obtenerTiempoDeTrabajo(tiempo, tiempos);//utilizo el metodo obtener timpo parasaber el tiepo de trabajao, mediante los metodo recibid en la funcion
        float aux;//declaro una variable de tipo float
        aux = this.SegundosTiendaStaff*StaffVentas.bonoTiempo;//le doy el valor a la variabl aux, la operacion entre el atributo declarado en la clase trabajadores por, el bono declarado en esta misma clase
        this.Sueldo=aux+Trabajadores.sueldo;
    }

    @Override
    public void setBonoExtra(boolean a) {//metodo declarado para sber si se le dara bono o no al trabjador, recibe un parametro de tipo boleeano
       if(true!=a)
       {
           
       }
       else 
       {
           this.Sueldo+=Trabajadores.bonoExtra;
       }
    }

    @Override
    public void getInformacion() {//metodo sobreescrito de la interface trabajadores, utilizado para saber cuato sueldo es del trabajador
        System.out.println("El nombre del Vendedor es: "+this.getNombre());
        System.out.println("El apellido del Vendedor es: "+this.getApellido());
        System.out.println("La edad del Vendedor es: "+this.getEdad());
        System.out.println("El id del Vendedor es: "+this.getID());
    }
    
}
