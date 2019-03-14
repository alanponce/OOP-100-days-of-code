
package proyect_pkmn;
import java.io.File; // Se usará para crear archivos
import java.io.FileWriter; // Se usará para escribir en archivos
import Pokemon.*; // Se imortará la clase pokemon
public class Proyect_PKMN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando un objeto "pikachu" de prueba
        // Asignando los valores Name, HP, ATK, Def, Vel
        Pokemon pikachu = new Pokemon("Pika",10,10,10,10);
        // Probando la función setATK
        pikachu.setATK(50);
        // String planeada para imprimir las estadisticas
        String Stats = "Name:"+pikachu.getName()+"\nATK: "+pikachu.getATK()+"\nDEF: "+pikachu.getDEF();
        try{
            // Creamos un archivo llamado trainer_x (entrenador)
        File trainer_1 = new File("trainer_1.txt");
        // Se crea un objeto escribir de la clase FileWriter
        // Se escribirá sobre el archivo creado
         FileWriter escribir=new FileWriter(trainer_1,true);
         escribir.write(Stats); // Escribirá lo guardado en la variable stats
         escribir.close(); // Se cierra el archivo para que se guarde
         // Prueba en consola
         System.out.println("Name: "+pikachu.getName()+"\nATK: "+pikachu.getATK()+"\nDEF: "+pikachu.getDEF());
        }
        catch(Exception e){
            System.out.println("Error al Escribir");
        }
    }
    
}
