
public class EmpleadoPorComision extends Empleado{
    
//atributos de la clase
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
        super(nombre, apellido, nss);
        
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
    
//Permite calcular la tarifa de comisión
    public void establecerTarifaComision(double tarifa) {
        if(tarifa > 0.0 && tarifa < 1.0 ){
            tarifaComision = tarifa;
        }
        else{
            tarifa = 0.0;
        }
    }
    
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    public void establecerVentasBrutas(double ventas){
        if(ventas < 0.0){
            ventasBrutas = 0.0;
        }
        else {
            ventasBrutas = ventas;
        }
    }
    
//Permite obtener las ventas
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    
    @Override
//Permite calcular los ingresos del empleado
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    
//Permite sobrevenir los métodos
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "empleado por comisión", super.toString(), "ventas brutas", obtenerVentasBrutas(),
                "tarifia de comisión", obtenerTarifaComision());
    }
}
