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
public class Documentos {
 // Es el identificador único del documento
 private Long id;
 // Es el identificador único del cliente como clave secundaria
    private Long id_cliente;
    // Encabezado del documento
    private String encabezado;
    // tipo del documento
    private String tipo;
    // Guarda la ubicación del documento
    private String ubicacion;
    // La variable referencia identifica el lugar en donde se encuentra el documento
    private String referencia;

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
    // Se asigna el valor de la ubicación

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Se obtiene el valor de la ubicación
    public String getUbicacion() {
        return ubicacion;
    }

    // se asigna el valor de referencia
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    // se obtiene el valor de referencia
    public String getReferencia() {
        return referencia;
    }
}
