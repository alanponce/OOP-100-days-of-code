
package Clase;

/**
 *
 * @author tanya
 */
public class Clase {
    public static void main(String[] args) {
        Alumnos Alum1 = new Alumnos("Michelle", 19, (float) 9.1, "Teoria", "UACJ");
        
        Alumnos Alum2 = new Alumnos("Diego", 19, (float) 9.1, "Estructura", "UTCJ");
        //En la linea 12 aunque se pretende asignar nombre de institucion no cambia porque es variable final
        
        Alum1.print();
        Alum2.print();
    }
}