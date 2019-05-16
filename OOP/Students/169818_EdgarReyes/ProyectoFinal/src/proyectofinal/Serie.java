package proyectofinal;

import java.util.ArrayList;

public class Serie extends Entretenimiento implements manejarRegistros{ //Declaracion de clase serie que hereda de la clase Entretenimiento
    //Atributos de la clase Serie
    private String cadenaTelevision;    //Los atributos son declarados como privados para 
                                        //que nada fuera de la clase los pueda modificar
    private String companiaTelevision;  
    private String creador;
    private ArrayList<String> listaActores;
    
    //Métodos de la clase Serie
    Serie(){
        companiaTelevision = null;
        creador = null;
        listaActores = new ArrayList<String>();
    }
    
    
    public String getCadenaTelevision() {
        return cadenaTelevision;
    }

    public void setCadenaTelevision(String cadenaTelevision) {
        this.cadenaTelevision = cadenaTelevision;
    }

    public String getCompaniaTelevision() {
        return companiaTelevision;
    }

    public void setCompaniaTelevision(String companiaTelevision) {
        this.companiaTelevision = companiaTelevision;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    public String[] getActores(){
        String[] actores = this.listaActores.toArray(new String[this.listaActores.size()]);
        return actores;
    }
    
    public void setActores(String actor){
        this.listaActores.add(actor);
    }
    
    @Override
    //Sobrescritura de metodo en interfaz.
    public void mostrarDatos(){
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void crearRegistro(){
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void eliminarRegistro(){
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void actualizarRegistro(){
        
    }
    
    
}
