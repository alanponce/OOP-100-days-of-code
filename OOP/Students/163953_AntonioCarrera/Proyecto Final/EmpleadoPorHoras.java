public class EmpleadoPorHoras extends Empleado{//creamos nnuestra clase publica y usamos la palabra reservada extends para indicar que es una extension de la clase empleado
    
    private double sueldo;  //sueldo por hora
    private double horas;    //horas trabajadas.
    
//Constructor sobrecargado
    public EmpleadoPorHoras(String nombre, String apellido, String nss, double salarioPorHoras, double horasTrabajadas){
        super(nombre, apellido, nss);//utilizamos super para invocaral constructor de la clase superior que comparta el mismo tipo de parametrización.
        
        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }

    public double obtenerSueldo() {
        return sueldo;
    }

//método que permite establecer el sueldo
    public void establecerSueldo(double su) {
        if(su < 0.0) {
            sueldo = 0.0;
        }else{
            sueldo = su;
        }
        
    }

//Permite obtener las horas trabajadas
    public double obtenerHoras() {
        return horas;
    }

//Permite establecer las horas trabajadas
    public void establecerHoras(double h) {
        if((h >= 0) && (h <=168)){
            horas = h;
        }
        else{
           horas = 0;
        }
    }
    
    @Override 
//Permite calcular el salario por horas trabajadas
    public double ingresos(){
        if(obtenerHoras()<= 40){
            return obtenerSueldo() * obtenerHoras();
        }
        else{
//si las horas trabajadas son mayor a 40 se aplica un porcentaje 
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }
    }
    
//Permite sobrrescribir los atributos de una clase
    @Override
    public String toString(){
        return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "sueldo por hora", obtenerSueldo(), "horas trabajadas",
                obtenerHoras());
    }
    
    
    
}
