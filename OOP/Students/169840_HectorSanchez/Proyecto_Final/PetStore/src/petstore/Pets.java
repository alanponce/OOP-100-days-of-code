/*
 Here is where the abtract class will be contained. From here the pets, will receive there status.
 */
package petstore;

/**
 *
 * @author hecto
 */
public abstract class Pets {
    int OrderId; //EL Id de la orden
    String Name; //Nombre de la mascota
    String Owner; //Nombre del propietario
    String Type; //Tipo de Animal: Perro, Gato, Pez
    boolean Clean; //El animal ha sido limpiado
    boolean CheckUp; //Se ha revisado al animal
    String Breed; //La raza del animal
    
    public int getOrderId(){
        return OrderId;
    }
    public void setOrderId(int OrderId){
        this.OrderId=OrderId;
    }
    
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getOwner(){
        return Owner;
    }
    public void setOwner(String Owner){
        this.Owner=Owner;
    }
    public String getType(){
        return Type;
    }
    public void setType(String Type){
        this.Type=Type;
    }
    public boolean getClean(){
        return Clean;
    }
    public void setClean(boolean Clean){
        this.Clean=Clean;
    }
    public boolean getCheckUp(){
        return CheckUp;
    }
    public void setCheckUp(boolean CheckUp){
        this.CheckUp=CheckUp;
    }
}

