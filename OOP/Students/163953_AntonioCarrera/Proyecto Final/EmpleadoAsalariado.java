
public class EmpleadoAsalariado extends Empleado{ //establecemos una clase publica llamada EmpleadoAsalariado que es una extencion de nuestra clase Empleado
    
    private double salario;//creamos un dato privado de tipo double llamado salario

//Permite heredar los atributos de la clase empleados
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    @Override //permite sobreescribir nuestro metodo ingresos de la clase padre
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    
//Permite establecer salario semanal
    public void establecerSalarioSemanal(double sal){
        salario = sal;
    }
    
//permite obtener Salario semanal
    public double obtenerSalarioSemanal(){
        return salario;
    }
    
//reescribe el método
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario Semanal", obtenerSalarioSemanal());
    }
}
