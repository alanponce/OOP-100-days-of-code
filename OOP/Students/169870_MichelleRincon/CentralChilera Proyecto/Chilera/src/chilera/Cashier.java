package chilera;

/**
 *
 * @author tanya
 */

//clase que hereda de la clase padre employee
public class Cashier extends Employee{
    //Se declaran las variables privadas para que solo sean invocadas dentro de la clase
    //se declara final y estatico para evitar que sea cambiada
    private final static int salary = 2500;
    
    
    //constructor que invoca los datos protected de la clase padre
    public Cashier(int IdEmployee, String name, String birthDate, int Age){
        super(IdEmployee, name, birthDate, Age);
    }
    
    //metodo que imprime datos importantes del empleado
    public void view(){
        System.out.println("Id: "+getId()+"\nName: "+getName()+"\nSalary: "+salary);
    }
}
