
package Pokemon;

public class Pokemon {

    // Stats de cualquier pokemon
    public
            String Name;
            int HP; // Health points, puntos de salud
            int ATK; // Attack
            int DEF; // Defence
            int VEL; // Velocity
            //String stats;
    public Pokemon(String name,int hp, int atk, int def, int vel){ // Constructor
    //String stats = "HP: "+HP+"\n ATK: "+ATK+"\n DEF: "+DEF+"\n VEL: "+VEL;
        Name = name;
        HP = hp;
        ATK = atk;
        DEF = def;
        VEL = vel;
    }
    // Metodos
    
    // Metodos para modificar datos
    public void setName(String name){
        Name = name;
    }
    public void setName(int hp){
        HP = hp;
    }
    public void setATK(int atk){
        ATK = atk;
    }
    public void setDEF(int def){
        DEF = def;
    }
    public void setVEL(int vel){
        VEL = vel;
    }   
    // Meetodos para obtener datos
    public String getName(){
        return Name;
    }
    public int getHP(){
        return HP;
    }
    public int getATK(){
        return ATK;
    }
    public int getDEF(){
        return DEF;
    }
    public int getVEL(){
        return VEL;
    }
}
