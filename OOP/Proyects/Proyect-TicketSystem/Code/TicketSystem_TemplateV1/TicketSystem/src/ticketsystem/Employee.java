
package ticketsystem;//Se permite el acceso a la clase employee de todas las clases contenidas en el proyecto.

//Inicializacion de la clase Employee que se usara como clase base de la cual otras clases contenidas en el proyecto heredaran sus atibutos y metodos.
public class Employee 
{
    private int ID;//declaracion de un atributo int con un modificador de acceso private.
    private float salary;//declaracion de un atributo float con un modificador de acceso private.
    private int birthDate;//declaracion de un atributo int con un modificador de acceso private.
    private String name;//declaracion de un atributo string con un modificador de acceso private.
    private String lastName;//declaracion de un atributo string con un modificador de acceso private.
    private String charge;//declaracion de un atributo string con un modificador de acceso private.
    
    Employee(int id, float Salary, int BirthDate, String Name, String LastName, String Charge)//Instanciacion del constructor de la clase con sus respectivos parametros. 
    {//Inicializacion de los atributos de la clase con los parametros recibidos en el constructor.
        ID=id;
        salary=Salary;
        birthDate=BirthDate;
        name=Name;
        lastName=LastName;
        charge=Charge;
    }
}
