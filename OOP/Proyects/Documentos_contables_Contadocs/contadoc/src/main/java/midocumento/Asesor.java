package midocumento;

/**
 * @author George Rodriguez
 */
public class Asesor extends Persona {
    // Es el identificador único del asesor
    private Long id;
    // Almacena el nombre del asesor
    private String nombre;
    // Almacena el apellido paterno del asesor
    private String apellidoP;
    // Almacena el apellido materno del asesor
    private String apellidoM;
    // Almacena el teléfono del asesor
    private String telefono;
    // Almacena el correo del asesor
    private String correo;

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
        if (nombre.length() != 0) {
            this.nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
        } else
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
    
    @Override
    public void borrarDatos() {
        nombre = "";
        apellidoP = "";
        apellidoM = "";
        telefono = "";
        correo = "";
    }

}
