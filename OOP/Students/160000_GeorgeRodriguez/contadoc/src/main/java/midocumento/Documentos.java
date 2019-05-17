/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midocumento;

/**
 *
 * @author George Rodríguez
 */
public class Documentos extends Ubicaciones{
 // Es el identificador único del documento
 private Long id;
 // Es el identificador único del cliente como clave secundaria
    private Long id_cliente;
    // Encabezado del documento
    private String encabezado;
    // tipo del documento
    private String tipo;
    // tipo de operacion a realizar 1 nuevo 2 actualizar 3 borrar
    private int operacion;
    public Documentos(){}
    // Asigna un valor a Id
    public void setId(Long id) {
        this.id = id;
    }
    // Obtiene el valor actual de Id
    public Long getId() {
        return id;
    }

    // Asigna un valor a Id cliente
    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    // obtiene un valor a Id cliente
    public Long getId_cliente() {
        return id_cliente;
    }
    
    // Asigna un valor a Encabezado
     public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    // obtiene un valor a encabezado
    public String getEncabezado() {
        return encabezado;
    }
    
    // Asigna un valor a Tipo
    public void setTipo( String tipo) {
        this.tipo= tipo;
    }

    // obtiene un valor a Tipo
    public String getTipo() {
        return tipo;
    }
    // Asigna un valor a Tipo
    public void setOperacion( int operacion) {
        this.operacion= operacion;
    }

    // obtiene un valor a operacion
    public int getOperacion() {
        return operacion;
    }

}
