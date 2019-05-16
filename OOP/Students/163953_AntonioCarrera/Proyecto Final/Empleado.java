
public abstract class Empleado { //creamos una clase abstracta co modificador de acceso publico llamada empleado
    
    private String primerNombre;    //creamos datos privados de tipo string llamado primer nombre
    private String apellidoPaterno; //creamos datos privados de tipo string llamado apellidoPaterno
    private String numeroSeguroSocial;  //creamos datos privados de tipo string numeroSeguroSocial
    
    //Creamos un constructor con tres argumentos.
    public Empleado( String nombre, String apellido, String nss ){
        
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        
    }//Fin del constructor del empleado
    
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
    @Override //sobreescribe el metodo tostring de nuestra clase padre
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }
    
    //método abstracto que debe ser sobrescrito por las subclases
    public abstract double ingresos();
    
}//Fin de la clase abstracta Empleado
