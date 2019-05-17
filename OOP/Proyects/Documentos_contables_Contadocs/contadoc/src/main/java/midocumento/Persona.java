package midocumento;

/**
 *
 * @author George Rodriguez
 */
public abstract class Persona {
// Mi clase abstracta principal
    // Asigna un valor a Id
    public abstract void setId(Long id);
    // Obtiene el valor actual de Id
    public abstract Long getId();
    // Asigna un valor a Nombre
    public abstract void setNombre(String nombre);
    // Obtiene el valor actual de Nombre
    public abstract String getNombre();
    // Asigna un valor a Apellido paterno
    public abstract void setApellidoP(String apellidoP);
    // Obtiene el valor actual de Apellido paterno
    public abstract String getApellidoP();
    // Asigna un valor a Apellido materno
    public abstract void setApellidoM(String apellidoM);
    // Obtiene el valor actual de Apellido materno
    public abstract String getApellidoM();
    // Asigna un valor a telefono
    public abstract void setTelefono(String telefono);
    // Obtiene el valor actual de Telefono
    public abstract String getTelefono();
    // Asigna un valor a correo
    public abstract void setCorreo(String correo);
    // Obtiene el valor actual de correo
    public abstract String getCorreo();
    // Reinicializa las varibles
    public abstract void borrarDatos();

}