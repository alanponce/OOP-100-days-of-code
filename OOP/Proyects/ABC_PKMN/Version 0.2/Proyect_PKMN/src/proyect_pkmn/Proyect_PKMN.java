
package proyect_pkmn;
import java.util.Scanner; //Clase para recibir datos de entrada
import java.io.File; // Se usará para crear archivos
import java.io.FileWriter; // Se usará para escribir en archivos
import javax.swing.JOptionPane;// Se usará como interfaz de usuario
import java.io.BufferedWriter;// Se usará para escribir en archivos
import Pokemon.*; // Se importará la clase pokemon

public class Proyect_PKMN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner Nombre = new Scanner(System.in); //Se instanciará un objeto de la clase Scanner para recibir los nombres desde la consola
        System.out.print("Nombre del pokemon: ");
        String name = Nombre.nextLine();// Se guardará el nombre del pokemon dado por el usuario
        System.out.print("Vida de "+name+" : ");
        int hp = Nombre.nextInt(); // Se guardará la vida del pokemon dada por el usuario
        */
        
         
        
        try{
            String[] options = {"Crear un Equipo", "Modificar un equipo", "Batallas "}; //Estas son las opciones que se desplegarán
            // showOptionDialog(Component parentComponent,String title,int optionType,int messageType,Icon icon, Object[] options,Object initialValue)
        int seleccion = JOptionPane.showOptionDialog(null, "Elegir una opcion", "ABC_Pokémon", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (seleccion == 0){//Seleccion 0 es crear un equipo
        String name = JOptionPane.showInputDialog("Escribe el nombre de tu pokémon");    // Muestra un cuadro de dialogo donde se escribira el nombre
        String hp = JOptionPane.showInputDialog("Dar HP"); // Muestra un cuadro de dialogo donde se escribira la vida
            int HP = Integer.parseInt(hp); // La cadena recibida se convertirá a int
        String atk = JOptionPane.showInputDialog("Dar ATK");
            int ATK = Integer.parseInt(atk);
        String def = JOptionPane.showInputDialog("Dar DEF");
            int DEF = Integer.parseInt(hp);
        String vel = JOptionPane.showInputDialog("Dar VEL");
            int VEL = Integer.parseInt(vel);
        // Creando un objeto "pikachu" de prueba de la clase general Pokemon
        // Asignando los valores Name, HP, ATK, Def, Vel al constructor de Pokemon
        Pokemon pikachu = new Pokemon(name,HP,ATK,DEF,VEL);
        // Creamos un archivo llamado trainer_x (entrenador)
        File trainer = new File("trainer_1.txt");
        
        /* BufferedWriter 
        Writes text to a character-output stream, buffering characters so as to provide 
        for the efficient writing of single characters, arrays, and strings.
        */
        BufferedWriter wr = new BufferedWriter(new FileWriter(trainer)); // File Writer nos permite escribir en un archivo  
        
        wr.write("Name: "+pikachu.getName()); // Metodo para imprimir en el objeto "wr" . Se imprimirá el nombre en el archivo de texto
        wr.newLine(); // Metodo para saltar de linea en el texto
        wr.write("HP: "+pikachu.getHP()); // Se imprimirá la Vida (HP)
        wr.newLine();// Salto de linea
        wr.write("ATK: "+pikachu.getATK()); // Se imprimirá la Ataque(ATK)
        wr.newLine();// Salto de linea
        wr.write("DEF: "+pikachu.getDEF()); // Se imprimirá la Defensa (DEF)
        wr.newLine();// Salto de linea
        wr.write("VEL: "+pikachu.getVEL()); // Se imprimirá la Velocidad (VEL)
        wr.close();
        // Prueba en consola
        System.out.println("Name: "+pikachu.getName()+"\nHP: "+pikachu.getHP()+"\nATK: "+pikachu.getATK()+"\nDEF: "+pikachu.getDEF());
        
        }
            
        
        }
        catch(Exception e){ // Agarrar cualquier error
            System.out.println("Error al Escribir");
        }
    }
    
}
