package gestionescolar;
public class Direccion {
    //Atributos de la clase direccion
    private String calle;
    private String numCasa;
    private String colonia;
    private String codigoPostal;

    //Metodos de la clase direccion
    
    public Direccion(){
        this.calle = null;
        this.numCasa = null;
        this.colonia = null;
        this.codigoPostal = null;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }
    
    public String getColonia() {
        return colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
   
    public String getCodigoPostal() {
        return codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
   
}
