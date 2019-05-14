
public abstract class Empleado { //creamos una clase abstracta co modificador de acceso publico llamada empleado
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    //Constructor con tres argumentos.
    public Empleado( String nombre, String apellido, String nss ){
        
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        
    }//Fin del constructor de empleado
    
    //Establece el primero nombre
    public void setPrimerNombre(String nombre){
        primerNombre = nombre;
    }
    
    //Devuelve el primer nombre
    public String getPrimerNombre(){
        return primerNombre;
    }
    
    //Establece el apellido paterno
    public void setApellidoPaterno( String apellido ){
        apellidoPaterno = apellido;
    }
    
    //Devuelve el apellido paterno
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    
    //Establece el número de seguridad social
    public void setNumeroSeguroSocial(String nss){
        numeroSeguroSocial = nss;
    }
    
    //Devuelve el número de seguridad social
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    //Devuelve representación String de un objeto Empleado.
    @Override
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }
    
    //método abstracto que debe ser sobrescrito por las subclases
    public abstract double ingresos();
    
}//Fin de la clase abstracta Empleado
