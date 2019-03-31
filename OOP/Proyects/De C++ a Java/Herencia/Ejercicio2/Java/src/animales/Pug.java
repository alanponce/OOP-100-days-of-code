
package animales;

public class Pug extends Perros{
    private String nameOwner;
    
    public Pug(String name, int age, float weight){
        super(name, age, weight);
        nameOwner="Unknown";
    }
    
    public void setNameOwner(String nameOwner){
        this.nameOwner = nameOwner;
    }
    
    public String getNameOwner(){
        return nameOwner;
    }
    
    public void print(){
        System.out.println("Dog's name: "+getName()+" with weight "+getWeight()+". Owner's name: "+getNameOwner());
    }
}