
package animales;//invocamos nuestro paquete animales

public class Perros { //creamos nuestra clase publica perros
    private String name;//declaramos un dato de tipo string con modificador de acceso privado llamado name
    private int age;//declaramos un dato de tipo entero con modificador de acceso privado llamado age
    private float weight;//declaramos un dato de tipo flotante con modificador de acceso privado llamado weight
    
    public Perros(String name, int age, float weight){//llamamos nuestra  clase perros incluye datos de tipo string,int y float
        this.name=name; //en esta linea se alm acena el nombre
        this.age=age;//en esta linea se almacena la edad
        this.weight=weight;//en esta linea almacenamos el peso
    }
    
    public String getName(){//creamos un metodo getName tipo string con modificador de acceso publico
        return name;//muestra el nombre del perro
    }
    
    public int getAge(){//creamos un metodo getAge tipo int con modificador de acceso publico
        return age;//muestra la edad del perro
    }
    
    public float getWeight(){//creamos un metodo getWeight tipo flotante con modificador de acceso publico
        return weight;//muestra el peso del perro
    }
}
