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
public class Ubicaciones {
    // Guarda la ubicación del documento
    private String ubicacion;
    // La variable referencia identifica el lugar en donde se encuentra el documento
    private String referencia;

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
