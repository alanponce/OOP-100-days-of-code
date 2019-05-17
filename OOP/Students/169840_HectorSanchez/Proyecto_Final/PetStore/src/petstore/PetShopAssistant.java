/*
En esta clase se encontraran las acciones que puede hacer el
Pet Shop Assistant. 
 */
package petstore;

/**
 *
 * @author hecto
 */
public class PetShopAssistant extends PetEmployee {
    public void CreateDiagnosis(){
        System.out.println("Hmmm, creo que tiene ..."); 
// Debe de poder escribir lo que la mascota tiene. 
    }
    public void FeedPet(){
        System.out.println("Animales han comido");
        //Esta funcion dice cuando los animales ya han comido
    }
    public void CleanCages(){
        System.out.println("Las jaulas han sido limpiados");
        //Esta funcion menciona que las jaulas han sido limpiadas   
    }
    public void CleanFishTanks(){
        System.out.println("Las Peceras han sido limpiadas");
        //Funcion que menciona que las jaulas han sido limpiadas.
    }
    
    
    
}
