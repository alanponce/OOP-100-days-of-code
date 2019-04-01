/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midocumento;

/**
 *
 * @author George Rodriguez
 */
public class Clientes {
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

    public Clientes(){}
        // Asigna un valor a Id
        public void setId(Long id) {
            this.id = id;
        }
        // Obtiene el valor actual de Id
        public Long getId() {
            return id;
        }
        
        // Asigna un valor a Nombre
    public void setNombre(String nombre) {
        this.nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
    }
        
    // Obtiene el valor actual de Nombre
    public String getNombre() {
        return nombre;
    }
        
    // Asigna un valor a Apellido paterno
    public void setApellidoP(String apellidoP) {
        this.apellidoP = Character.toUpperCase(apellidoP.charAt(0)) + apellidoP.substring(1);
    }

    // Obtiene el valor actual de Apellido paterno
    public String getApellidoP() {
        return apellidoP;
    }
    
    // Asigna un valor a Apellido materno
    public void setApellidoM(String apellidoM) {
        this.apellidoM = Character.toUpperCase(apellidoM.charAt(0)) + apellidoM.substring(1);
    }
    
    // Obtiene el valor actual de Apellido materno
    public String getApellidoM() {
        return apellidoM;
    }
    
    // Asigna un valor a telefono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Obtiene el valor actual de Telefono
    public String getTelefono() {
        return telefono;
    }
    
    // Asigna un valor a correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    // Obtiene el valor actual de correo
    public String getCorreo() {
        return correo;
    }
    
    // Asigna un valor a asesor
    public void setAsesor(String asesor) {
        this.asesor = Character.toUpperCase(asesor.charAt(0)) + asesor.substring(1);
    }
    
    // Obtiene el valor actual de asesor
    public String getAsesor() {
        return asesor;
    }

}
