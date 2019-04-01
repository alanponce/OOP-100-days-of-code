
package ticketsystem;//Se permite el acceso a la clase client de todas las clases contenidas en el proyecto.

public class Client
{
    public String name;//declaracion de un atributo string con un modificador de acceso publico.
    public int age;//declaracion de un atributo int con un modificador de acceso publico.
    public  String lastName;//declaracion de un atributo string con un modificador de acceso publico.
    private int phone;//declaracion de un atributo int con un modificador de acceso private.
    private int cost;//declaracion de un atributo int con un modificador de acceso private.
    
    
    Client(String Name, int Age, String Lastname, int Phone, int Cost)//Instanciacion del constuctor de la clase con sus respectivos parametros. 
    {//Inicializacion de los atributos de la clase con los parametros recibidos en el constructor.
        name=Name;
        age=Age;
        lastName=Lastname;
        phone=Phone;
        cost=Cost;
    }
    
    void searchTrip(int ticketId)//Funcion de tipo void que recibe como parametro un entero.
    {
        
    }
    
    void setTrip(int busID)//Funcion de tipo void que recibe como parametro un entero.
    {
        
    }
    
    void setTime(int time)//Funcion de tipo void que recibe como parametro un entero.
    {
        
    }
}
