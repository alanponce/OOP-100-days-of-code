/*
Here is where the Cat class will appear

 */
package petstore;

/**
 *
 * @author hecto
 */
public class Cat extends Pets {
    float weight;
    int CageNumber;
    
    public float getWeight(){
        return  weight;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }
    public int getCageNumber(){
        return CageNumber;
    }
    public void setCageNumber(int CageNumber){
        this.CageNumber=CageNumber;
    }
}
