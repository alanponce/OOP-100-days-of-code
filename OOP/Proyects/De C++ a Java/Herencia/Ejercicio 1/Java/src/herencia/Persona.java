
package herencia;   //Se utiliza package herencia para relacionar las tres clases

public class Persona {  //Se crea una clase persona con modificador de acceso public
    private String name;    //se declara una variable de tipo String y modificador de acceso privado de nombre name
    private String LastName;    //Se declara una variable de tipo String y modificador de acceso privado de nombre LastName
    private int age;    //Se declara una variable de tipo entero y modificador de acceso privado de nombre age
    
    public Persona (String name, String LastName, int age) {    //Constructor de la clase que tiene como argumentos las variable privadas de la clase
        this.name = name;   //Se utiliza this para acceder a la variable privada "oculta" name
        this.LastName = LastName;   //Se utiliza this para acceder a la variable privada "oculta" LastName
        this.age=age;   //Se utiliza this para acceder a la variable privada "oculta" age
    }
    
    public String getName(){    //Metodo getName de tipo String con modificador de acceso publico sin argumentos
        return name;    //Regresa el contenido de la variable name
    }
    
    public String getLastName(){    //Metodo getLastName de tipo String con modificador de acceso publico sin argumentos
        return LastName;    //Regresa el contenido de la variable LastName
    }
    
    public int getAge(){    //Metodo getAge de tipo entero con modificador de acceso publico sin argumentos
        return age; //Regresa el contenido de la variable age
    }
}
