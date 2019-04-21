package Clase;

/**
 *
 * @author tanya
 */
public class Alumnos extends Persona{
    
    private float grade;
    private String clase;
    private final String school = "UACJ";
    
    public Alumnos(String name, int age, float grade, String clase, String school){
        super(name, age);
        this.grade = grade;
        this.clase = clase;
        //this.school = school;   //Error por asignacion a variable final
    }
    
    public float getGrade(){
        return grade;
    }
    
    public String getClase(){
        return clase;
    }
    
    public String getSchool(){
        return school;
    }
    
    public void print(){
        System.out.println("Alumno: "+getName()+
                            "\nEdad: "+getAge()+
                            "\nCalificacion: "+getGrade()+
                            "\nClase: "+getClase()+
                            "\nInstitucion: "+getSchool()+"\n\n");
    }
}
