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
public class ubicaciones {
    // id es el identificador único del documento
    private Long id;
    // Es el identificador único del documento como clave secundaria
    private Long id_documento;
    // Guarda la ubicación del documento
    private String ubicacion;
    // La variable referencia identifica el lugar en donde se encuentra el documento
    private String referencia;

    public ubicaciones(){}
        // Modifica el valor de Id
    public void setId(Long id) {
        this.id = id;
    }
        // Obtiene el valor de Id
    public Long getId() {
        return id;
    }
    //Se asigna el valor de la clave secundaria
    public void setId_documento(Long id_documento) {
        this.id_documento = id_documento;
    }
    // Se obtiene el valor de la clave secundaria
    public Long getId_documento() {
        return id_documento;
    }
    // Se asigna el valor de la ubicación
    
    public void setUbicacion( String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    // Se obtiene el valor de la ubicación
    public String getUbicacion() {
        return ubicacion;
    }
   // se asigna el valor de referencia
    public void setReferencia( String referencia) {
        this.referencia = referencia;
    }

    // se obtiene el valor de referencia
    public String getReferencia() {
        return referencia;
    }
   
}
