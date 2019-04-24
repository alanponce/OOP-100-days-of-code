package gestionescolar;


public class Mantenimiento extends Empleados{
    private String especialidad;
    
    public Mantenimiento(){
     this.especialidad=null;   
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public String getEspecialidad(){
        return especialidad;
    }
}
