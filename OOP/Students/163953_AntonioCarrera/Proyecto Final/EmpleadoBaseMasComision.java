public class EmpleadoBaseMasComision extends EmpleadoPorComision{ //creamos una clase publica llamada empleadosbasemascomision que es una extension de la clase empleadoporcomision
    
    private double salarioBase; //creamos un dato privado de tipo double llamado salariobase
    
//Permite heredar los atributos de la clase empleado por comisión
    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario){
    
        super(nombre, apellido, nss, ventas, tarifa);//utilizamos super para invocaral constructor de la clase superior que comparta el mismo tipo de parametrización.
        establecerSalarioBase(salario);
    }
    
//Permite establecer el salario
    public void establecerSalarioBase(double salario){
        if(salario < 0.0 ){
            salarioBase = 0.0;
        }
        else{
            salarioBase = salario;
        }
    }
    
//Permite obtener el salario base
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public double ingresos(){
        return obtenerSalarioBase() + super.ingresos();
    }
    
//Permite sobrescribir el método
    @Override
    public String toString(){
        return String.format("%s%s; %s: $%,.2f",
                "con salario base", super.toString(),
                "salario base", obtenerSalarioBase());
    }
}
