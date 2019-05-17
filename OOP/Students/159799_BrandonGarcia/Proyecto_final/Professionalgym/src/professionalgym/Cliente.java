
package professionalgym;//Nombre del paquete en el cual se guardan las clases del proyecto.

public class Cliente {//creacion de la clase Cliente con el fin de almacenar la informacion de los clientes.
    //Declaracion de los atributos de la clase.
    private String nombre;//atributo de tipo String con modificador de acceso private.
    private String direccion;//atributo de tipo String con modificador de acceso private.
    private String telefono;//atributo de tipo String con modificador de acceso private.
    private String tipoSangre;//atributo de tipo String con modificador de acceso private.
    
    Cliente(String Nombre,String Direccion ,String Telefono,String TipoSangre){//Instanciacion del constructor de la clase con sus respectivos parametros. 
        //Inicializacion de los atributos de la clase con los parametros recibidos en el constructor.
        nombre=Nombre;
        direccion=Direccion;
        telefono=Telefono;
        tipoSangre=TipoSangre;
    }
    /**
     * <p> Metodo que sirve para obtener el nombre del cliente.
     * @return String
     */
    public String getNombre(){//declaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Nombre: " + nombre);//print que imprime el nombre del cliente.
        return nombre;//return que retorna un String.
    }
    /**
     * <p> Metodo que sirve para obtener la direccion del cliente.
     * @return String
     */
    public String getDireccion(){//delcaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Direccion: " + direccion);//print que imprime la direccion del cliente.
        return direccion;//return que retorna un String.
    }
    /**
     * <p> Metodo que sirve para obtener el telefono del cliente.
     * @return String 
     */
    public String getTelefono(){//delcaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Telefono: " + telefono);//print que imprime el telefono del cliente.
        return telefono;//return que retorna un String.
    }
    /**
     * <p> Metodo que sirve para obtener el tipo de sangre del cliente.
     * @return 
     */
    public String getTipoSangre(){//declaracion de un metodo que retorna un valor de tipo String.
        System.out.println("Tipo de sangre: " + tipoSangre);//print que imprime el tipo de sangre del cliente.
        return tipoSangre;//return que retorna un String.
    }
    
}
