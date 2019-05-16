
public class PruebaSistemaNomina {
    
    public static void main(String[] args) {
        //argumentos: Nombre, Apellido, NSS y salario.
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Diego", "Arevalo", "111-11-1111", 900.00);
        
        //argumentos: Nombre, Apellido, NSS, Sueldo por hora y horas trabajadas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Sandra", "Avelar", "222-22-2222", 17.75, 450);
        
        //argumentos: Nombre, Apellido, NSS, ventas brutas y tarifa de comisión
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Daniel", "Rodríguez", "333-33-3333", 10000, .06);
        
        //argumentos: Nombre, Apellido, NSS, ventas brutas, tarifa de comisión, salario base
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Diego", "Avelar", "444-44-4444", 5500, .05, 400);
        
        System.out.println("Empleado procesados por separado:\n");
        System.out.println("----------------------------------------------------------------------------------------------");
        
        /*System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());*/
        
        //Polimorfismo
        Empleado [] empleados = new Empleado[4];
        
        empleados[ 0 ] = empleadoAsalariado;
        empleados[ 1 ] = empleadoPorHoras;
        empleados[ 2 ] = empleadoPorComision;
        empleados[ 3 ] = empleadoBaseMasComision;
         System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Empleados procesados en forma polimórfica:");
        
        //procesa en forma genérica a cada elemento en el arreglo de empleados
        for(Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual); //invoca a toString
            
            if (empleadoActual instanceof EmpleadoBaseMasComision){
                
                //Conversión descendente de la referencia de Empleado
                //a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado =
                        (EmpleadoBaseMasComision) empleadoActual;
                
                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
                
                System.out.printf("el nuevo salario base con 10%% de aumento es : $%,.2f\n",
                        empleado.obtenerSalarioBase());
            }//fin del if
            
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
         System.out.println("----------------------------------------------------------------------------------------------");
        //obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++){
            System.out.printf("El empleado %d es un %s\n", j, empleados[ j ].getClass().getName());
        }
        
        
        
    }
    
}
