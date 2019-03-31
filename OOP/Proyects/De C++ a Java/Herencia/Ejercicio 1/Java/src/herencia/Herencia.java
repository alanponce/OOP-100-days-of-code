
package herencia;   //Se utiliza package herencia para relacionar las tres clases

public class Herencia {     //Se crea una clase Herencia con modificador de acceso public

    public static void main(String[] args) {    //Metodo estatico de tipo void con modificador de acceso publico con parametros de aareglo vacio de tipo String
        Profesor profesor1 = new Profesor("Juan", "Hernandez", 33);     //Se crea un objeto profesor1 de la clase Profesor y se le asignan valores
        profesor1.setIdProfesor("Prof 22-387-11");      //ingresa el id del profesor y se almacena en IdProfesor
        profesor1.Show();   //Se llama al metodo show de la clase profesor
    }   
}
