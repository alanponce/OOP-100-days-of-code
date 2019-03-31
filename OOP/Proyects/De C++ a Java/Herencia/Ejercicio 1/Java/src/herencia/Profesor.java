
package herencia;

public class Profesor extends Persona {
    private String IdProfesor;
    
    public Profesor(String name, String LastName, int age){
        super(name, LastName, age);
        IdProfesor="Unknown";
    }
    
    public void setIdProfesor(String IdProfesor){
        this.IdProfesor = IdProfesor;
    }
    
    public String getIdProfesor(){
        return IdProfesor;
    }
    
    public void Show(){
        System.out.println("Teacher: "+getName()+" "+getLastName()+" with Id: "+getIdProfesor());
    }
}
