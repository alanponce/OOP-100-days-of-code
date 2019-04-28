
package animales;//creamos un paquete que llamaremos animales

public class Animales {//creamos nuestra clase de caracter publico llamandola animales

    public static void main(String[] args) { //creamos nuestra funcion main
        Pug Dog1 = new Pug("Dixie", 7, (float) 10.35);//creamos un nuevo objeto llamado pug
        Dog1.setNameOwner("Michelle Rincon");//en esta linea nos permiyte establecer el nombre del propietario del perro
        Dog1.print();//imprime el nombre del propietario del perro
    }   
}
