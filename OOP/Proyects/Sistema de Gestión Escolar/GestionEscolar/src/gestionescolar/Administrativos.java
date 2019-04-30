package gestionescolar;


public class Administrativos extends Empleados{
    private String area;
    
    public Administrativos(){
        this.area=null;
    }
    
    public void setArea(String area){
        this.area=area;
    }
    public String getArea(){
        return area;
    }
    
}
