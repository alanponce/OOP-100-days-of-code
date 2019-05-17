package proyectofinal;
public abstract class Persona {
    private static int numRegistro;
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    private String lugarNacimiento;
    
    /*Constructores de la clase*/
    Persona(){
        this.numRegistro++;
        this.nombre = null;
        this.apellido = null;
        this.genero = null;
        this.fechaNacimiento = null;
        this.lugarNacimiento = null;
    }
    
    Persona(String nombre, String apellido, String genero, String fechaNacimiento, String lugarNacimiento){
        this.numRegistro++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    
    public int getNumRegistro(){
        return this.numRegistro;
    }
}
