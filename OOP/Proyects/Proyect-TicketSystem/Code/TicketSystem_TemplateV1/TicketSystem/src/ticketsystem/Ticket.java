
package ticketsystem;//Se permite el acceso a la clase Ticket de todas las clases contenidas en el proyecto.


public class Ticket 
{
    private int ticketID;//declaracion de un atributo int con un modificador de acceso private.
    
    Ticket(int id)//Instanciacion del constructor de la clase con sus respectivos parametros.
    {
        ticketID=id;//inicializacion de atributo de la clase con los parametros recibidos en el constructor.
    }
}
