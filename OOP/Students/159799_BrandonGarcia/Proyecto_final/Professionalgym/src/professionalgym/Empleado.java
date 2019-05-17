
package professionalgym;//Nombre del paquete en el cual se guardan las clases del proyecto.

public abstract class Empleado {//Creacion de la clase empleado de tipo abstracta, con el fin de que otras clases hereden de ella.
    //Declaracion de los atributos de la clase que podran ser heredados por otras subclases.
    private final int id;//atributo de tipo final int con modificador de acceso private.
    private final String nombre;//atributo de tipo final String con modificador de acceso private.
    private String direccion;//atributo de tipo String con modificador de acceso private.
    public double salario;//atributo de tipo double con modificador de acceso private.
    private String telefono;//atributo de tipo String con modificador de acceso private.
    
    Empleado(int Id, String Nombre, String Direccion, String Telefono){//Instanciacion del constructor de la clase con sus respectivos parametros. 
        //Inicializacion de los atributos de la clase con los parametros recibidos en el constructor.
        id=Id;
        nombre=Nombre;
        direccion=Direccion;
        telefono=Telefono;
    }
   /**
    * <p> Metodo que sirve para obtener el salario de los empleados. 
    * @return double
    */
    public double getSalario(){//declaracion de metodo que retorna un double.
       System.out.println("Salario: " + salario);//print que imprime el salario.
       return salario;//return que devuelve un double.
    }
   /**
    * <p> Metodo que sirve para obtener el id de los empleados.
    */
    public void getId(){//declaracion de un metodo que retorna vacio.
        System.out.println("ID: " + id);//print que imprime el id.
    }
    /**
     * <p> Metodo que sirve para obtener el nombre de los empleados.
     * @return String
     */
    public String getNombre(){//declaracion de metodo que retorna un String.
        System.out.println("Nombre: " + nombre);//print que imprime el nombre.
        return nombre;//return que devuelve un String.
    }
    /**
     * <p> Metodo que sirve para establecer el salario del empleado.
     * @param salario 
     */
    public void setSalario(double salario){//declaracion de un metodo que retorna un vacio y recibe un double.
    this.salario = salario;//se le da el valor a la variable del metodo igual al atributo de la clase.
    }
    /**
     * <p> Metodo que sirve para establecer el salario del empleado si este tiene un bono extra.
     * @param salario
     * @param bono 
     */
    public void setSalario(double salario, float bono){//declaracion de un metodo que retorna un vacio y recibe 2 parametros, un double y un float.
        this.salario = salario + bono;//se le da el valor a la variable con los valores recibidos en las variables del metodo sumandolas.
    }
    /**
     * <p> Metodo que sirve para obtener el telefono del empleado.
     * @return String
     */
    public String getTelefono(){//declaracion de un metodo que retorna un String.
        System.out.println("Telefono: " + telefono);//print que imprime el telefono del empleado.
        return telefono;//return que devuelve un String.
    }
    
}
