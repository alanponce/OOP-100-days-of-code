
package ticketsystem;//Se permite el acceso a la clase SalesEmployee de todas las clases contenidas en el proyecto.

//Incializacion de la clase SalesEmployee la cual sera una de las clases derivadas que hereda de la clase Employee.
public class SalesEmployee extends Employee
{
    private int IDInsurance;//declaracion de un atributo int con un modificador de acceso private.
    
    SalesEmployee(int id, float Salary, int BirthDate, String Name, String LastName, String Charge,int idInsuranse)//Instanciacion del constructor de la clase con sus respectivos parametros.
    {
        super(id,Salary,BirthDate,Name,LastName,Charge);//Utilizacion de la palabra reservada super, para utilizar el constructor de la clase heredada.
        IDInsurance=idInsuranse;//inicializacion de atributo de la clase con los parametros recibidos en el constructor.
    }
    
    void makeSalesReport()//Funcion de tipo void que no recibe parametro.
    {
        
    }
}
