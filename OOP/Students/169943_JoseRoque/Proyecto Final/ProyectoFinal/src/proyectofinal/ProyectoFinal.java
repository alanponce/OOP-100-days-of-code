package proyectofinal; // el noombre del paquete se llama proyecto final

import java.io.PrintStream; // se importa el paquete java .io.printstream

public class ProyectoFinal { // la clase publica se llamara proyecto final

    
    public static void main(String[] args) { // esta parte es crucial ya que es la que inicia el programa, si el no arrancaria el programa
     Cliente c=new Cliente("Jose","Roque",4); // se crea un objeto de la clase cliente que se llamara c en el cual agregaremos los parametros del nombre apellido de los productos
     c.Elegir_cantidad(); // una vez ccreada el objeto podemos usar el objeto y agregar un punto para acceder a los metodos que  tenemos disponibles
     System.out.println(c.Nombre+c.Apellido+"El precio por las peliculas es de: "+c.Hacercompra());
     // se imprime en pantalla los atributos de la clase cliente del objeto creado c, deespues imprimira lo que esta entre parentesis y al final llamara a la funcion de hacer compra
        
     Producto P=new Producto(); // se instancia un objeto de la clase producto  llamado p en el cual podremos usar para utilizar los metodos creado de esa clase
     System.out.println(P.getNombre()); // se imprime la funcion de genombre, de la clase producto
      System.out.println("Su ID es:"+P.getID()); // se imprime lo que esta entre parentesis y despues toma el valor de ID del objeto instanciado p
     System.out.println("El precio es de:"+P.getPrecio()); // se imprime en pantalla lo que esta entre parentesis y despues se del objeto instanciado se obtiene el valor del atributo del metodo getprecio
     
     Project_Manager Pro=new Project_Manager("Alejandro","Garcia"); // se intancia un objeto llamado pro de la clase project_manager en el cual recibira como parametros el nombre y el apellido
     System.out.println(Pro.getNombre()+Pro.getApellido()); // se imprime en pantalla los metodos nombre y apellido que  fueron dados en el objeto intanciado de la clase project_manager
      Pro.Atender_cliente(); // del objeto instanciado pro, se utiliza para llamar a los metodos de la clase correspondiente
      Pro.mantener_orden_de_trabajo(); // del objeto instanciado pro, este se utiloiza para llamar a los funciones de la clase
      
      Director_de_operaciones Dir=new Director_de_operaciones("Jorge","Jimenez"); // se crea un objeto llamado dir de la clase director de operaciones en el cual recibira como parametors el nombre y el apellido
      Dir.Toma_de_desiciones(); // del objeto insanciado se toma el metodo llamado de la clase
      Dir.Obtener_Salario(); // se utiliza el metodo obtener salario de la clase derector de operaciones
      
      Analista ana=new Analista("pancho","Rodriguez"); // se crea un objeto de la clae analista en el cual recibira como parametors o argumenyos el nommbre y el apellido
      ana.Obtener_Salario(); // del objeto creado ana, este se utiliza para usar el metodo de la clase analista
      ana.Atender_cliente(); // del objeto creado ana, este se utiliza par usar el metodo de la clase analista
      ana.Datos_de_negocio(); // del objeto creado ana, este se utiliza par usar el metodo de la clase analista
      
      Inventario.Ingresar_producto("Plicula de terror", 5); // para utilizar un objeto creado de un metodo estatico solo se utiliza el nombre de la clase agregando un punto para obtener informacion respecto a los metodos "estaticos" de la clase
      Inventario.Ingresar_producto("Pelicula de comedia", 4); // recibiendo como parametros el nombre de la pelicula y la cantida a agregar
      
      System.out.println(""); // se imprime en pantalla lo que esta entre parentesis (nada)
      Proveedor.Agregar_Producto("Usted agrego este producto"); // el metodo estatico es llamado al insertar el nombre de la clase y agregar los metodos estaticos que tiene
      Proveedor.Registrar_productos_vendidos("Cantidad vendidas del dia de hoy:14"); // estos 2 metodos estaticos recibiran como parametros o argumentos el agregar y registrar productos
      
       Responsable_Financiero Res=new  Responsable_Financiero("edgar","lopez","14500");
       // se crea un objeto instanciado de la clase responsable financiero en el cual recibira como parametros el nombre, apellido y la id
       // la id es un valor unico en el cual no se puede cambiar una vez dada el valor
       // por lo tanto es de tipo Final
      
      
}
}