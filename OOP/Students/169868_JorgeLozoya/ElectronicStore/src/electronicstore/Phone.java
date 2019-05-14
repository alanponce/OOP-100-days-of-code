package electronicstore;

/**
 *
 * @author 169868
 */
public class Phone extends Products {
    private 
            int camera; // Pulgadas
    public Phone(int id, String Name, int Stock, float Price, int Camera) {
        super(id, Name, Stock, Price);
        camera = Camera;
    }
    public String showAll(){
        return super.showAll()+" Camera:" +camera;
    }
}
