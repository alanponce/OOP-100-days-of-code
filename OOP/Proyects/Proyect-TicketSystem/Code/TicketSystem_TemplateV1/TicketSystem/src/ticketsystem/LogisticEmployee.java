
package ticketsystem;//Se permite el acceso a la clase LogisticEmployee de todas las clases contenidas en el proyecto.

//Incializacion de la clase LogisticEmployee la cual sera una de las clases derivadas que hereda de la clase Employee.
public class LogisticEmployee extends Employee 
{
    private int medicalExpensiveInsurance;//declaracion de un atributo int con un modificador de acceso private.
    
    LogisticEmployee(int id, float Salary, int BirthDate, String Name, String LastName, String Charge,int idInsuranse)//Instanciacion del constructor de la clase con sus respectivos parametros.
    {
        super(id,Salary,BirthDate,Name,LastName,Charge);//Utilizacion de la palabra reservada super, para utilizar el constructor de la clase heredada.
        medicalExpensiveInsurance=idInsuranse;//inicializacion de atributo de la clase con los parametros recibidos en el constructor.
    }
    
    void watchTripReport()//Funcion de tipo void que no recibe parametro.
    {
        
    }
}
