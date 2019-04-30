package gestionescolar;


public class Empleados extends Person{
    private String numEm;
    private int salario;
    private int nss;
    
    public Empleados(){
     this.numEm=null;
     this.salario=0;
     this.nss=0;
    }
    public void setNumEm(String numEm){
        this.numEm=numEm;
    }
    public String getNumEm(){
        return numEm;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return salario;
    }
    public void setNss(int nss){
        this.nss=nss;
    }
    public int getNss(){
        return nss;
    }

    
}
