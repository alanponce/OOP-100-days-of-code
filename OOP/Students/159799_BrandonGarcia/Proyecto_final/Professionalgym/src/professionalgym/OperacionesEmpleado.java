
package professionalgym;//Nombre del paquete en el cual se guardan las clases del proyecto.

public interface OperacionesEmpleado {//Creacion de una interface con el objetivo de que la clase 'Recepcionista' y 'Administrador' reutilicen sus metodos.
    //declaracion de los metodos con sus respectivos parametros.
    public Cliente addCliente(String Nombre, String Direccion, String Telefono, String TipoSangre);

    public Cliente deleteCliente(Cliente cliente);
    
    public Inventario addMaquina(String Marca, String Tipo, String Capacidad);
    
    public Inventario addPesa(String Marca, String Tipo, String Capacidad);
    
    public Inventario deleteInventario(Inventario I);
    
}
