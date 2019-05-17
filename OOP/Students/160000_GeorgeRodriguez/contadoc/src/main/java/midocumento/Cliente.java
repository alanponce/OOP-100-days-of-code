package midocumento;
/**
 * @author George Rodriguez
 */
public class Cliente extends Persona {
    // Es el identificador único  del cliente
    private Long id;
    // Almacena el nombre del cliente
    private String nombre;
    // Almacena el apellido paterno del cliente
    private String apellidoP;
    // Almacena el apellido materno del cliente
    private String apellidoM;
    // Almacena el teléfono del cliente
    private String telefono;
    // Almacena el correo del cliente
    private String correo;
    // Almacena el asesor designado al cliente
    private String asesor;

    public Cliente(){}
        // Asigna un valor a Id
    @Override
        public void setId(Long id) {
            this.id = id;
        }
        // Obtiene el valor actual de Id
    @Override
        public Long getId() {
            return id;
        }
        
        // Asigna un valor a Nombre
    @Override
    public void setNombre(String nombre) {
        if (nombre.length() != 0){
            this.nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);}
        else
            this.nombre = "*";
    }
        
    // Obtiene el valor actual de Nombre
    @Override
    public String getNombre() {
        return nombre;
    }
        
    // Asigna un valor a Apellido paterno
    @Override
    public void setApellidoP(String apellidoP) {
        if (apellidoP.length() != 0)
            this.apellidoP = Character.toUpperCase(apellidoP.charAt(0)) + apellidoP.substring(1);
        else
            this.apellidoP = "*";
    }

    // Obtiene el valor actual de Apellido paterno
    @Override
    public String getApellidoP() {
        return apellidoP;
    }
    
    // Asigna un valor a Apellido materno
    @Override
    public void setApellidoM(String apellidoM) {
        if (apellidoP.length() != 0)
            this.apellidoM = Character.toUpperCase(apellidoM.charAt(0)) + apellidoM.substring(1);
        else
            this.apellidoM = "*";
    }
    
    // Obtiene el valor actual de Apellido materno
    @Override
    public String getApellidoM() {
        return apellidoM;
    }
    
    // Asigna un valor a telefono
    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Obtiene el valor actual de Telefono
    @Override
    public String getTelefono() {
        return telefono;
    }
    
    // Asigna un valor a correo
    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    // Obtiene el valor actual de correo
    @Override
    public String getCorreo() {
        return correo;
    }
    
    // Asigna un valor a asesor
    public void setAsesor(String asesor) {
        if (asesor.length() != 0)
        this.asesor = Character.toUpperCase(asesor.charAt(0)) + asesor.substring(1);
                else
            this.asesor = "";
    }
    // Obtiene el valor actual de asesor
    public String getAsesor() {
        return asesor;
    }

    public void borrarDatos() {
         nombre="";
         apellidoP="";
         apellidoM="";
         telefono="";
         correo="";
         asesor="";  
    }

}
