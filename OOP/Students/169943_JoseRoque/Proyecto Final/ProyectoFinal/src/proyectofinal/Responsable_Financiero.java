package proyectofinal; // el nombre del paquete se llama proyecto final
 
public class Responsable_Financiero extends Empleado{ // el nombre de la clase publica es responsable financiero que heredara los metodos y atributos de la clase  abstracta empleado

    private final String ID; // se declara como metodo final la variable String ID ya que este es un numero en el cual no se puede repetir 

    public Responsable_Financiero(String ID, String Nombre, String Apellido) { // se crea el conctructor de la clase en el cual se van a inicializar los atributos ID, nombre y apellido
        super(Nombre, Apellido); // se utiliza super  ya que  esta utilizando los atributos de la clase abstrasta que esta heredando
        this.ID = ID; // se utiliza this ya que el atributo fue creada en esta clase y por lo tanto para que aparezca en el constructor se debe utilizar this
    }

    
   
    

    @Override // palabra reservada para la sobressvritura
    public void Obtener_Salario() { // metodo sobreescrito de la clase empleado en el cual tendra una funcion diferente por aplciar
        System.out.println("El salario es 2500"); // se imprime lo que esta entre parentesis
    }
    @Override // palabra reservada para aplicar la sobreescritura
     public void Atender_cliente() { // metodo sobreescrito de la clase empleado
      System.out.println("Que se le ofrece"); // se imprime en pantalla lo que esta entre parentesis
    }
    public void Reportar_finanzas(){ // se crea un metodo en el cual se llamara reportar finanzar en el cual solo de dara un reporte
        System.out.println("Dar reporte de los productos"); // se imprime en paantalla lo que esta entre parentesis
    }
    public void Mantenimiento_de_calidad(){ //se crea un metodo de tipo void en el cual no retornara un valor que se llamara mantenimiento de calidad 
        System.out.println("Verificacion de los servicios de los empleados"); // se imprime en pantalla lo que esta entre parentesis
        }
    
}
