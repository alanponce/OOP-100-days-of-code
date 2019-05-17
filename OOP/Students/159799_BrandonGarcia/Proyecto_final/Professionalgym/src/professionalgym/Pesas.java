
package professionalgym;

public class Pesas extends Inventario{//Creacion de la subclase maquinas que hereda de Inventario, con el objetivo de especificar que el equipo es una pesa.
   
    public Pesas(String Marca, String Tipo,String Capacidad) {//Instanciacion del constructor de la clase con sus respectivos parametros.
        super(Marca, Tipo, Capacidad);//Utilizacion de la palabra reservada super, para utilizar el constructor de la clase heredada.
    }
    

   }
    

