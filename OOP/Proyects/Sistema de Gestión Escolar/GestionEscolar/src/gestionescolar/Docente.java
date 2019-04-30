package gestionescolar;


public class Docente extends Empleados{
    private String grupo;
    private String grado;
    
    public Docente(){
        this.grupo=null;
        this.grado=null;
    }
    public void setGrupo(String grupo){
        this.grupo=grupo;
    }
    public String getGrupo(){
        return grupo;
    }
    public void setGrado(String grado){
        this.grado=grado;
    }
    public String getGrado(){
        return grado;
    }
}
