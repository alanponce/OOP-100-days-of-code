public class TipoVuelo extends Avion {
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
}