
import java.util.Random;


public class Mecanico {
    private String nombre; //declaramos nombre de tipo String
    private int nivel; //metodo que retorna un valor
 
    public int realizarMantencion(){ //retornara un entero
        int probabilidad = 0; //declaramos una variable probabilidad inicializada en cero
        Random rnd = new Random(); //Creamos nuevo objeto de tipo random, importando la clase
        probabilidad =  rnd.nextInt(2);// 0-1 Probabilidad de que se haga o no el mantenimiento
        return probabilidad; //retornamos el valor de probabilidad al lugar donde invoquemos al metodo     
   }
    public int cargarCombustible(){ //creamos metodo cargarCombustible 
        return this.getNivel();
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
