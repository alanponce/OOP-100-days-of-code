
package professionalgym;//Nombre del paquete en el cual se guardan las clases del proyecto.

public class Administrador extends Empleado implements OperacionesEmpleado{/*creacion de una subclase que hereda de la clase 'Empleado' con el fin de utilizar sus atributos,
    ademas esta clase implementa metodos de la clase 'OperacionesEmpleado',y cuenta con la autorizacion de eliminar y agregar recepcionistas*/
    
    public Administrador(int Id, String Nombre, String Direccion, String Telefono) {//Instanciacion del constructor de la clase con sus respectivos parametros.
        super(Id, Nombre, Direccion, Telefono);//Utilizacion de la palabra reservada super, para utilizar el constructor de la clase heredada.
    }
    
    /**
     * <p> Metodo que sirve para añadir un cliente al sistema.
     * @param Nombre
     * @param Direccion
     * @param Telefono
     * @param TipoSangre
     * @return Cliente
     */
    @Override//aclaracion de implementacion de un metodo sobreescrito.
    public Cliente addCliente(String Nombre, String Direccion, String Telefono, String TipoSangre){//declaracion de metodo que retorna un valor de tipo cliente que recibe 4 parametros de tipo String.
        
        Cliente C = new Cliente(Nombre, Direccion, Telefono, TipoSangre);//instanciacion de un objeto de la clase Cliente con el nombre C que recibe los valores que recibe el metodo en sus parametros.
        
        return C;//return que retorna el objeto al metodo.
    }
    /**
     * <p> Metodo que sirve para borrar un cliente del sistema.
     * @param C
     * @return Cliente
     */
    @Override//aclaracion de implementacion de un metodo sobreescrito.
    public Cliente deleteCliente(Cliente C){//declaracion de un metodo que retorna un valor de tipo cliente y recibe un parametro de tipo cliente.
        
      C = null;//variable que iguala sus valores a null, para asi 'borrar' dichos valores.
     return C;//return que retorna la variable al metodo.
    }
    /**
     * <p> Metodo que sirve para añadir una nueva maquina al inventario.
     * @param Marca
     * @param Tipo
     * @param Capacidad
     * @return Inventario
     */
    @Override//aclaracion de implementacion de un metodo sobreescrito.
    public Inventario addMaquina(String Marca, String Tipo, String Capacidad){//declaracion de un metodo que retorna un valor de tipo Inventario y recibe 3 parametros de tipo String.
        
        Maquinas M = new Maquinas(Marca, Tipo, Capacidad);//instanciacion de un objeto de la clase Maquina que recibe los valores del metodo.
        return M;//return que retorna el objeto al metodo.
    }
    /**
     * <p> Metodo que sirve para la añadir una nueva pesa al inventario.
     * @param Marca
     * @param Tipo
     * @param Capacidad
     * @return Inventario
     */
    @Override//aclaracion de implementacion de un metodo sobreescrito.
     public Inventario addPesa(String Marca, String Tipo, String Capacidad){//declaracion de un metodo que retorna un valor de tipo Inventario y recibe 3 parametros de tipo String.
        
        Pesas P = new Pesas(Marca, Tipo, Capacidad);//instanciacion de un objeto de la clase pesas que recibe los valores del metodo.
        return P;//return que retorna el objeto al metodo.
    }
    /**
     * <p> Metodo que sirve para eliminar una equipo del inventario, ya sea maquina u objeto.
     * @param I
     * @return Inventario
     */
    @Override//aclaracion de implementacion de un metodo sobreescrito.
    public Inventario deleteInventario(Inventario I){//metodo que retorna un valor de tipo inventario que recibe un parametro de tipo inventario.
        
        I=null;//variable que iguala sus valores a null, para asi 'borrar' dichos valores.
        return I;//return que retorna la variable al metodo.
    }
    /**
     * <p> Metodo que sirve para añadir un nuevo recepcionista al sistema.
     * @param Id
     * @param Nombre
     * @param Direccion
     * @param Telefono
     * @return Recepcionista
     */
    public Recepcionista addRecepcionista(int Id, String Nombre, String Direccion, String Telefono){//declaracion de metodo que retorna un valor de tipo recepcionista y recibe 4 parametros uno de tipo int y tres de tipo String. 
       
     Recepcionista R=new Recepcionista( Id,  Nombre,  Direccion,  Telefono);//instanciacion de un objeto de la clase Recepcionista que recibe los valores del metodo.
        return R;//return que retorna el objeto al metodo.

    }
    /**
     * <p> Metodo que sirve para eliminar un recepcionista del sistema.
     * @param R
     * @return Recepcionista
     */
    public Recepcionista deleteRecepcionista(Recepcionista R){//declaracion de un metodo que retorna un valor de tipo recepcionista y recibe un parametro de tipo recepcionista
        
        R=null;//variable que iguala sus valores a null, para asi 'borrar' dichos valores.
        return R;//return que retorna la variable al metodo
    }
}
