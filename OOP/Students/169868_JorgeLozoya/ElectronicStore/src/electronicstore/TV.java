package electronicstore;

public class TV extends Products {
    private 
            int screen; // Pulgadas
    public TV(int id, String Name, int Stock, float Price, int Screen) {
        super(id, Name, Stock, Price);
        screen = Screen;
    }
    public String showAll(){
        return super.showAll()+" Screen:" +screen;
    }
    
}
