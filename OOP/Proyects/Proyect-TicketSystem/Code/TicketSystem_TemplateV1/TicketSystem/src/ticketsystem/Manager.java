
package ticketsystem;//Se permite el acceso a la clase Manager de todas las clases contenidas en el proyecto.

//Incializacion de la clase Manager la cual sera una de las clases derivadas que hereda de la clase Employee.
public class Manager extends Employee
{
    private int lifeInsurance;////declaracion de un atributo int con un modificador de acceso private.
    
    Manager(int id, float Salary, int BirthDate, String Name, String LastName, String Charge,int idInsuranse)//Instanciacion del constructor de la clase con sus respectivos parametros.
    {
        super(id,Salary,BirthDate,Name,LastName,Charge);//Utilizacion de la palabra reservada super, para utilizar el constructor de la clase heredada.
        lifeInsurance=idInsuranse;//inicializacion de atributo de la clase con los parametros recibidos en el constructor.
    }
    
    void addTrip(int idBuss,float price,String Destiny)//Funcion de tipo void que recibe como parametro un entero, un float y un string.
    {
    }
    
    void addUser(int charge)//Funcion de tipo void que recibe como parametro un entero.
    {
    }
    
    void deleteTrip(int idBuss)//Funcion de tipo void que recibe como parametro un entero.
    {
    }
    
    void deleteUser(int userID)//Funcion de tipo void que recibe como parametro un entero.
    {
        
    }
}
