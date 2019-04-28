
package animales;//invocamos nuestro paquete animales

public class Perros { //creamos nuestra clase publica perros
    private String name;//declaramos un dato de tipo string de caracter privado llamado name
    private int age;//declaramos un dato de tipo entero de caracter privado llamado age
    private float weight;//declaramos un dato de tipo flotante  de caracter privado llamado weight
    
    public Perros(String name, int age, float weight){//llamamos nuestra  clase perros incluye datos de tipo string,int y float
        this.name=name; //en esta linea se alm acena el nombre
        this.age=age;//en esta linea se almacena la edad
        this.weight=weight;//en esta linea almacenamos el peso
    }
    
    public String getName(){//declaramos un dato de tipo string de caracter publico llamado getName
        return name;//muestra el nombre del perro
    }
    
    public int getAge(){//declaramos un dato de tipo int de caracter publico llamado getAge
        return age;//muestra la edad del perro
    }
    
    public float getWeight(){////declaramos un dato de tipo float de caracter publico llamado getWeight
        return weight;//muestra el peso del perro
    }
}
