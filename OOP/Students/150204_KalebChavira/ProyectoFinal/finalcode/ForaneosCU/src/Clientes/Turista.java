/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;//que pertenece al paquete de clientes

/**
 *
 * @author compu
 */
public class Turista extends Clientes {//clase turista que hereda de la clase abtracta clientes
  
    @Override//metodo sobreescrito de la clase abtracta clientes
    public void ChecarSalida() {//metodo de checar salida en la estadia del hotel
            System.out.println("El cliente checha salida");//mensaje
       boolean salida = false;//por default la salida no esta chechada
       if (salida==false){// si el cliente no ha checado
           System.out.println("El cliente no ha checado salida");//mesaje
       }//cierre del if 
       else {//en caso contrario
           salida=true;//el cliente ya checo la salida
           System.out.println("El cliente ya checo salida");//mensaje
           
    }
    }

    @Override//metodo sobreescrito de la clase abtracta clientes
    public void ChecarEntrada() {//metodo donde el cliente checa entrada
          System.out.println("El cliente checha entrada");//mensaje
       boolean entrada = false;//por defecto el cliente no ha checado entrada
       if (entrada==false){// en caso de que lo haya no lo haya hecho
           System.out.println("El cliente no ha checado entrada");//mensaje
       }
       else {
           System.out.println("El cliente ya checo entrada");//en caso de que ya haya checado entrada
           entrada= true;//ya checo entrada
    }
    }

    @Override//metodo sobreescrito de la clase abtracta clientes
    public void Pagar() {//metodo del revisar el pago
         boolean pagohecho = false;//por defecto el cliente no ha pagado
          System.out.println("El cliente ya hizo el pago\n1.Si\n0.No");//mensaje
          int pago = sc.nextInt();//capturar si ya hizo el pago
           
          if (pago>0){//en caso de que ya lo hay hecho
              System.out.println("El cliente ya hizo el pago");//mensaje
              pagohecho=true;//pago hecho
          }
          else{//caso contrario
              System.out.println("El cliente no hecho el pago");//mesaje
              pagohecho=false;//el pago no esta hecho
          }
    }

    @Override//metodo sobreescrito de la clase abtracta clientes
    public void Hospedarse() {//metodo de revisar si el cliente se esta hospedando
          
              boolean entrada=false,salida=false,hospedaje=false;//por defecto si el cliente no ha checado entrada y salida, el cliente no se esta hospedando
              System.out.println("El cliente checo entrada?\n1.Si\n0.No");//mesnjae
              int e= sc.nextInt();//capturamos un entero por si el cliente checa entrada
              if (e>0){//en caso de que asi sea
                  System.out.println("El cliente si checo entrada");//mesaje
                  entrada = true;//el cliente si ha checado entrada
              }
             System.out.println("El cliente checo Salida?\n1.Si\n0.No");//mesaje
              int s= sc.nextInt();//capuramos un entero de que el cliente ha checado salida
              if (s>0){//en caso de que asi sea
                  System.out.println("El cliente si checo salida");//mesaje
                  salida = false;//el cliente no ha cheado salida
              }
              
              if(entrada=true){//si el cliente ha checado entrada
                  if (salida=false){//si el cliente no ha checado salida
                      hospedaje= true;//el cliente sigue en el hotel y se esta hosepando aun
                      System.out.println("El cliente se esta hospedando" + hospedaje);//mesaje
                  }
                  
              }
    }
    
    
    
}
