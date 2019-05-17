/*
This class will have the methods in stylist
In here we hace an overriding in checkanimal
As they do diferent things with the same parameters
 */
package petstore;

/**
 *
 * @author hecto
 */
public class Stylist extends PetEmployee{
    public void Wash(Pets x){
        System.out.println("Se ha terminado de lavar la mascota");
        x.setClean(true);   
        // En este metodo se haria que lo que entre wash, 
        //se convierta en true
    }
    @Override
    public void CheckAnimal(){
        System.out.println("Se realizo el chequeo anal del animal");
        //Los estilistas realizan un chequeo anal, por el hecho que es cuando los animales estan mas calmados
        
    }
}
