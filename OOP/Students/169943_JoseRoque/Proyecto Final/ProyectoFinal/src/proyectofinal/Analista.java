package proyectofinal;

public class Analista extends Empleado {

    public Analista(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    @Override
    public void Obtener_Salario() {
       System.out.println("El salario es de 1500");
    }
    @Override
    public void Atender_cliente() {
        System.out.println("Se le ofrece algo");
    }
    public void Datos_de_negocio(){
    System.out.print("Los registros de peliculas son cada noche");
    }
    public void Estudiar_marketing(){
     System.out.println("Buscar informacion sobre lo mas demandado");
    }
}
