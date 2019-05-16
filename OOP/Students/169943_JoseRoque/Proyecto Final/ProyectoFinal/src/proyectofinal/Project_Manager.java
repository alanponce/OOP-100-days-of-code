package proyectofinal;

public class Project_Manager extends Empleado{
    public  String salario= "1000";

    public Project_Manager(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    public String getSalario() {
        return salario;
    }
    
    @Override
    public void Obtener_Salario() {
       System.out.println("El salario del project_manager es : $1000");
        
    }

    @Override
    public void Atender_cliente() {
        System.out.println("Que se le ofrece?");
    }
    
    public void mantener_orden_de_trabajo(){
    System.out.println("El lugar esta bajo control");
    }
    
    
    
    
}
