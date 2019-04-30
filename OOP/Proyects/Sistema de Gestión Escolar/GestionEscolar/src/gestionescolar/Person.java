package gestionescolar;
public class Person {
    //Atributos de la clase Person
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private char genero;
    private String telefono;
    
    private Direccion direccion;
    
    
    //Metodos de la clase Person 
    public Person(){
       //Inicializacion de atributos de la clase Persona
        this.nombre = null;
        this.apellido = null;
        this.fechaNacimiento = null;
        this.genero = '\u0000';
        this.telefono = null;
    }
    
    public Person(String nombre, String apellido, String fechaNacimiento, 
            char genero, String telefono, String calle, String numCasa, 
            String colonia, String codigoPostal){
        
        //Inicializacion de atributos de la clase Persona
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.telefono = telefono;
        
        //Atributos de la clase Direccion
        this.direccion = new Direccion();
        direccion.setCalle(calle);
        direccion.setCodigoPostal(codigoPostal);
        direccion.setNumCasa(numCasa);
        direccion.setColonia(colonia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
