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
public class documentos {
    private Long id;
    private String encabezado;
    private String tipo;

    public documentos(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
     public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getEncabezado() {
        return encabezado;
    }
    public void setTipo( String tipo) {
        this.tipo= tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
