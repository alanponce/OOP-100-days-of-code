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
    private Long id;
    private String ubicacion;
    private String referencia;

    public ubicaciones(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUbicacion( String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
   
    public void setReferencia( String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }
   
}
