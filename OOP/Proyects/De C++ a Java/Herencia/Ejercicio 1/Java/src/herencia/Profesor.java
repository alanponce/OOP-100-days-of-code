
package herencia;    //Se utiliza package herencia para relacionar las tres clases

public class Profesor extends Persona {     //Se crea una subclase profesor de la clase persona
    private String IdProfesor;      //Se declara una variable de tipo String con modificador de acceso privado IdProfesor
    
    public Profesor(String name, String LastName, int age){     //Constructor de la clase profesor que tiene como argumentos las variables privadas de la clase persona
        super(name, LastName, age);     //Se utiliza super para llamar al constructor de la clase persona
        IdProfesor="Unknown";   //Se inicializa IdProfesor como desconocido
    }
    
    public void setIdProfesor(String IdProfesor){   //Metodo setIdProfesor de tipo String con modificador de acceso publico con argumento el atributo privado de la clase profesor
        this.IdProfesor = IdProfesor;   //Se utiliza this para acceder a la variable privada "oculta" IdProfesor
    }
    
    public String getIdProfesor(){    //Metodo setIdProfesor de tipo String con modificador de acceso publico sin argumento
        return IdProfesor;      //Regresa el contenido de la variable IdProfesor
    }
    
    public void Show(){     //Metodo  Show de topo void con modificador de acceso public sin argumentos
        System.out.println("Teacher: "+getName()+" "+getLastName()+" with Id: "+getIdProfesor());   //Se imprime el nombre, apellodo y Id del profesor
    }
}
