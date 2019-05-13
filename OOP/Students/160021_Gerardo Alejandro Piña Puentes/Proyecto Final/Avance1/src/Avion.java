
public class Avion {
    private String modelo; //Modelo de tipo string
    private int combustible = 100; //combustible que inicia en 100
    private int kilometraje;
    private int cantidadVuelos;
    private int cantidadMantenciones;
    private boolean mantencion = true; //declaramos un booleano que definira si se hara la mantencion o no
    private Mecanico mecanico;//tipo mecanico y atributo mecanico, asiosiaremos estos dos

       public void recibirMantencion(int realizacion){ //metodo para la mantencion/ El mecanico realiza la mantencion 
           if(realizacion == 1){ //Si la realizacion se puede realizar
               this.mantencion = true; //cuando la mantencion se hizo
               System.out.println("el mecanico " + this.mecanico.getNombre() + "Pudo realizar la mantencion");//se imprime pudo realizar la mantencion
              this.cantidadMantenciones++; //el atributo se incrementa siempre y cuando se realize la mantencion
              
    
           }else{ //de lo contrario (si no se puede realizar la mantentcion
               System.out.println("el mecanico " + this.mecanico.getNombre() + "no pudo realizar la mantencion"); //imprimira no se pudo realizar
           }
           this.combustible+=20;//independiente de cualquier cosa el combustible se incrementara en 20
           System.out.println("Se cargaron 20 puntos de combustible");//y se imprime que se cargaron 20 de combustible
           if(this.combustible> 100){//si el combustible pasa los 100 se quedara en 100 para que no se sobrepase
               this.combustible = 100;
           }
       }
       
//Generamos todos los gets y sets para todos los atributos//
    /**
     * regresa  modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * regresa the combustible
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    /**
     * regresa  kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the cantidadVuelos
     */
    public int getCantidadVuelos() {
        return cantidadVuelos;
    }

    /**
     * @param cantidadVuelos the cantidadVuelos to set
     */
    public void setCantidadVuelos(int cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }

    /**
     * @return the cantidadMantenciones
     */
    public int getCantidadMantenciones() {
        return cantidadMantenciones;
    }

    /**
     * @param cantidadMantenciones the cantidadMantenciones to set
     */
    public void setCantidadMantenciones(int cantidadMantenciones) {
        this.cantidadMantenciones = cantidadMantenciones;
    }

    /**
     * @return the mantencion
     */
    public boolean isMantencion() {
        return mantencion;
    }

    /**
     * @param mantencion the mantencion to set
     */
    public void setMantencion(boolean mantencion) {
        this.mantencion = mantencion;
    }

    /**
     * @return the mecanico
     */
    public Mecanico getMecanico() {
        return mecanico;
    }

    /**
     * @param mecanico the mecanico to set
     */
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
            
}
