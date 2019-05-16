public class Avion{
    private String modelo; //Modelo de tipo string
    int combustible = 100; //combustible que inicia en 100
    int kilometraje;
    int cantidadVuelos;
    private int cantidadMantenciones;
    boolean mantencion = true; //declaramos un booleano que definira si se hara la mantencion o no
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

       private void verificarMantencion(){
            int restoMantencion = 0;//primero de realizar un vuelo se revisa la mantencion
            restoMantencion = this.cantidadVuelos % 5; //el resto de la division de cantidad de vuelos por 5 se asignara a restoMantencion
            if(restoMantencion == 0 && this.kilometraje != 0){ //si resto Mantencion es = 0 y al mismo tiempo el kilometraje es distinto de cero
                this.mantencion = false;//si almenos tiene 5 viajes se realizara mantencion

            }else{//de lo contrario
                this.mantencion = true; //si es true quiere decir que no es necesario realizar mantencion
            }
       }

       public void realizarVuelo(int tipoViaje){ //para ver si sera nacional o internacional
           if(this.mantencion == false){
               System.out.println("No se puede realizar el vuelo porque se debe realizar una mantencion del avion" + this.getModelo() );
           }else{
               if(this.combustible < 50) {//Aqui vemos si el combustible es < 50 no se podra realizar el vuelo
                   System.out.println("No se puede realizar vuelo por falta de combustible");
               }else{//tenemos estos 2 filtros en donde no se puede realizar vuelo
                   if(tipoViaje == 1){ //si el tipo de viaje es 1 es nacional
                       this.kilometraje += 500; //porque es nacional se incrementa en 500
                       this.combustible -= 50;// y el combustible se resta en 50
                       System.out.println("se hizo un viaje nacional!");
                       this.cantidadVuelos++;//cantidad de vuelos se incrementa
                       verificarMantencion();//se vuelve a checar mantencion
                   }else{ //segundo tipo de viaje 2
                       this.kilometraje += 800;//el kilometraje se suma de 800 en 80
                       this.combustible -= 80;//el combustible se baja en 80
                       this.cantidadVuelos ++;//la vantidad de vuelos se incrementa
                       System.out.println("Se hizo un viaje internacional!");//se realiza un vuelo internacional
                       verificarMantencion();
                   }
               }
           }
       }

       public void actualizarCombustible(int tipo){ //recibe el parametro tipo porque el mecanico tiene cargar combustible que retorna su nivel
           switch(tipo){
               case 1:
                   this.combustible += 100;//el tipo de mecanico 1 el combustible queda en 100
                   break;
               case 2:
                   this.combustible += 50;//se incrementa en 50
                   break;
           }
           if(this.combustible > 100){//se realiza la validacion de si el combustible sobre pasa los 100
               this.combustible = 100;//se estabiliza a 100
           }
           System.out.println("Carga de combustible realizada por " + this.mecanico.getNombre() + "!");
       }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getCombustible() {
        return combustible;
    }


    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }


    public int getKilometraje() {
        return kilometraje;
    }


    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }


    public int getCantidadVuelos() {
        return cantidadVuelos;
    }


   public void setCantidadVuelos(int cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }


    public int getCantidadMantenciones() {
        return cantidadMantenciones;
    }


    public void setCantidadMantenciones(int cantidadMantenciones) {
        this.cantidadMantenciones = cantidadMantenciones;
    }


    public boolean isMantencion() {
        return mantencion;
    }


    public void setMantencion(boolean mantencion) {
        this.mantencion = mantencion;
    }


    public Mecanico getMecanico() {
        return mecanico;
    }


    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

}
