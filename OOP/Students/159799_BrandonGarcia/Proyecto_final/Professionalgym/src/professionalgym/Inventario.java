
package professionalgym;//Nombre del paquete en el cual se guardan las clases del proyecto.

public abstract class Inventario {//Creacion de la clase empleado de tipo abstracta, con el fin de que otras clases hereden de ella.
    //Declaracion de los atributos de la clase que podran ser heredados por otras subclases.
    private String marca;//atributo de tipo String con modificador de acceso private.
    private String tipo;//atributo de tipo String con modificador de acceso private.
    private String capacidad;//atributo de tipo String con modificador de acceso private.
    
    Inventario(String Marca, String Tipo, String Capacidad){//Instanciacion del constructor de la clase con sus respectivos parametros. 
        //Inicializacion de los atributos de la clase con los parametros recibidos en el constructor.
        marca=Marca;
        tipo=Tipo;
        capacidad = Capacidad;
    }
    /**
     * <p> Metodo que sirve para obtener la marca del equipo.
     * @return String
     */
    public String getMarca(){//declaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Marca: " + marca);//print que imprime la marca del equipo.
        return marca;//return que retorna un String.
    }
    /**
     * <p> Metodo que sirve para obtener el tipo del equipo.
     * @return String
     */
    public String getTipo(){//declaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Tipo: "+ tipo);//print que imprime el tipo de equipo.
        return tipo;//return que retorna un String.
    }
    /**
     * <p> Metodo que sirve para obtener la capacidad del equipo.
     * @return String
     */
    public String getCapacidad(){//declaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Tiene una capacidad de: " + capacidad);//print que imprime la capacidad del equipo.
        return capacidad;//return que retorna un String.
    }
}
