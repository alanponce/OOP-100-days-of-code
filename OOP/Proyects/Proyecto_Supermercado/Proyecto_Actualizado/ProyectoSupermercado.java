//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 20/03/2019
//Hora de inicio: 19:45
//Hora de fin:  20:50
package proyecto.supermercado;
import java.util.Scanner;
public class ProyectoSupermercado {
    public static void main(String[]args){
Scanner N = new Scanner(System.in);
int D,d;
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
System.out.println("Estás en el supermercado, desde la entrada se pueden ver las diferentes secciones: \n1.Carniceria \n2.Frutas y Verduras \n3. Pescadería\n0. Cajas \n¿A donde te diriges?: ");
D = N.nextInt();
    if(D>=0&&D<=3){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 3 o si no se encuentra entre estos valores.
     switch(D){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
Carnicero.Nombre = "Juan";//Se asigna el atributo de nombre de la clase carnicero como "Juan".
Carnicero.Puesto = "carnicero";//Se asigna el atributo de puesto de la clase carnicero como "carnicero".
Carnicero carnicero = new Carnicero();//Se crea un objeto de la clase carnicero.
carnicero.Presentacion();//Realiza el método Presentacion de la clase Carnicero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
carnicero.Catalogo();//Se muestra el catalogo de productos que tiene la carniceria.
 d = N.nextInt();//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Chuleta = new Articulo("Chuleta de Cerdo",92,0);//Se crea una chuleta, la cual es un objeto de la clase carnes.
            System.out.println("Va a llevar "+Chuleta.Nombre+" ¿Qué Cantidad?");
            Chuleta.Cantidad += N.nextFloat();
            Carnicero.Articulo = Chuleta.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
            Carnicero.Precio = Chuleta.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
            Carnicero.Cantidad = Chuleta.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
            Carnicero.Total = Carnicero.Total+Chuleta.Precio*Chuleta.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
            //Verificar si la asignacion de valores a estos atributos de la clase carnicero se puede realizar de una manera que use menos codigo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Chuleta.Nombre+", $"+Chuleta.Precio+", lleva "+Chuleta.Cantidad+" Kg";
            break;
         case 2:
            Articulo Molida = new Articulo("Carne Molida",118,0);
            System.out.println("Va a llevar "+Molida.Nombre+" ¿Qué Cantidad?");
            Molida.Cantidad += N.nextFloat();
            Carnicero.Articulo = Molida.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto molida.
            Carnicero.Precio = Molida.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto molida.
            Carnicero.Cantidad = Molida.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto molida.
            Carnicero.Total = Carnicero.Total+Molida.Precio*Molida.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto molida.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Molida.Nombre+", $"+Molida.Precio+", lleva "+Molida.Cantidad+" Kg";
            break;
         case 3:
            Articulo Lengua = new Articulo("Lengua",260,0);
            System.out.println("Va a llevar "+Lengua.Nombre+" ¿Qué Cantidad?");
            Lengua.Cantidad += N.nextFloat();
            Carnicero.Articulo = Lengua.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Lengua.
            Carnicero.Precio = Lengua.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Lengua.
            Carnicero.Cantidad = Lengua.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Lengua.
            Carnicero.Total = Carnicero.Total+Lengua.Precio*Lengua.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Lengua.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Lengua.Nombre+", $"+Lengua.Precio+", lleva "+Lengua.Cantidad+" Kg";
            break;
         case 4:
            Articulo Salchicha = new Articulo("Salchicha",98,0);
            System.out.println("Va a llevar "+Salchicha.Nombre+" ¿Qué Cantidad?");
            Salchicha.Cantidad += N.nextFloat();
            Carnicero.Articulo = Salchicha.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Salchicha.
            Carnicero.Precio = Salchicha.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Salchicha.
            Carnicero.Cantidad = Salchicha.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Salchicha.
            Carnicero.Total = Carnicero.Total+Salchicha.Precio*Salchicha.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Salchicha.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Salchicha.Nombre+", $"+Salchicha.Precio+", lleva "+Salchicha.Cantidad+" Kg";
            break;
         case 5:
            Articulo Chorizo = new Articulo("Chorizo",60,0);
            System.out.println("Va a llevar "+Chorizo.Nombre+" ¿Qué Cantidad?");
            Chorizo.Cantidad += N.nextFloat();
            Carnicero.Articulo = Chorizo.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chorizo.
            Carnicero.Precio = Chorizo.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chorizo.
            Carnicero.Cantidad = Chorizo.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chorizo.
            Carnicero.Total = Carnicero.Total+Chorizo.Precio*Chorizo.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chorizo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            Cajero.Articulos = Cajero.Articulos+"\n"+Chorizo.Nombre+", $"+Chorizo.Precio+", lleva "+Chorizo.Cantidad+" Kg";
            break;
            case 6:
            Articulo Chicharron = new Articulo("Chicharrón de Cerdo",176,0);
            System.out.println("Va a llevar "+Chicharron.Nombre+" ¿Qué Cantidad?");
            Chicharron.Cantidad += N.nextFloat();
            Carnicero.Articulo = Chicharron.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chicharron.
            Carnicero.Precio = Chicharron.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chicharron.
            Carnicero.Cantidad = Chicharron.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chicharron.
            Carnicero.Total = Carnicero.Total+Chicharron.Precio*Chicharron.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chicharron.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Chicharron.Nombre+", $"+Chicharron.Precio+", lleva "+Chicharron.Cantidad+" Kg";
            break;
         case 7:
            Articulo Milanesa = new Articulo("Milanesa de Cerdo",94,0);
            System.out.println("Va a llevar "+Milanesa.Nombre+" ¿Qué Cantidad?");
            Milanesa.Cantidad += N.nextFloat();
            Carnicero.Articulo = Milanesa.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Milanesa.
            Carnicero.Precio = Milanesa.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Milanesa.
            Carnicero.Cantidad = Milanesa.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Milanesa.
            Carnicero.Total = Carnicero.Total+Milanesa.Precio*Milanesa.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Milanesa.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Milanesa.Nombre+", $"+Milanesa.Precio+", lleva "+Milanesa.Cantidad+" Kg";
            break;
         case 8:
            Articulo Costilla = new Articulo("Costilla de Cerdo",110,0);
            System.out.println("Va a llevar "+Costilla.Nombre+" ¿Qué Cantidad?");
            Costilla.Cantidad += N.nextFloat();
            Carnicero.Articulo = Costilla.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Costilla.
            Carnicero.Precio = Costilla.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Costilla.
            Carnicero.Cantidad = Costilla.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Costilla.
            Carnicero.Total = Carnicero.Total+Costilla.Precio*Costilla.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Costilla.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Costilla.Nombre+", $"+Costilla.Precio+", lleva "+Costilla.Cantidad+" Kg";
            break;
         case 9:
            Articulo Sirloin = new Articulo("Sirloin de Ternera",229,0);
            System.out.println("Va a llevar "+Sirloin.Nombre+" ¿Qué Cantidad?");
            Sirloin.Cantidad += N.nextFloat();
            Carnicero.Articulo = Sirloin.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Sirloin.
            Carnicero.Precio = Sirloin.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Sirloin.
            Carnicero.Cantidad = Sirloin.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Sirloin.
            Carnicero.Total = Carnicero.Total+Sirloin.Precio*Sirloin.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Sirloin.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Sirloin.Nombre+", $"+Sirloin.Precio+", lleva "+Sirloin.Cantidad+" Kg";
            break;
         case 10:
            Articulo Pata = new Articulo("Pata de Res",54,0);
            System.out.println("Va a llevar "+Pata.Nombre+" ¿Qué Cantidad?");
            Pata.Cantidad += N.nextFloat();
            Carnicero.Articulo = Pata.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Pata.
            Carnicero.Precio = Pata.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Pata.
            Carnicero.Cantidad = Pata.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Pata.
            Carnicero.Total = Carnicero.Total+Pata.Precio*Pata.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Pata.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            Cajero.Articulos = Cajero.Articulos+"\n"+Pata.Nombre+", $"+Pata.Precio+", lleva "+Pata.Cantidad+" Kg";
            break;
         case 0:
            break;
     }
 }
 else{
  System.out.println("No seleccionaste un numero valido.");
 }
}
while(d!=0);
             break;
         case 2:
Fruteria fruteria = new Fruteria();//Se crea un objeto de la clase Fruteria.
fruteria.Presentacion();//Realiza el método Presentacion de la clase fruteria.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
fruteria.Estantes();//Se muestra la estanteria de productos que tiene la sección.
 d = N.nextInt();//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Manzana = new Articulo("Manzana",35,0);
            System.out.println("Has decidido llevar "+Manzana.Nombre+" ¿Qué Cantidad?");
            Manzana.Cantidad += N.nextFloat();
            Fruteria.Articulo = Manzana.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Manzana.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Manzana.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Manzana.Precio*Manzana.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Manzana.Nombre+", $"+Manzana.Precio+", lleva "+Manzana.Cantidad+" Kg";
            break;
         case 2:
            Articulo Naranja = new Articulo("Naranja",13,0);
            System.out.println("Has decidido llevar "+Naranja.Nombre+" ¿Qué Cantidad?");
            Naranja.Cantidad += N.nextFloat();
            Fruteria.Articulo = Naranja.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Naranja.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Naranja.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Naranja.Precio*Naranja.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Naranja.Nombre+", $"+Naranja.Precio+", lleva "+Naranja.Cantidad+" Kg";
            break;
         case 3:
            Articulo Platano = new Articulo("Platano",16,0);
            System.out.println("Has decidido llevar "+Platano.Nombre+" ¿Qué Cantidad?");
            Platano.Cantidad += N.nextFloat();
            Fruteria.Articulo = Platano.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Platano.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Platano.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Platano.Precio*Platano.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Platano.Nombre+", $"+Platano.Precio+", lleva "+Platano.Cantidad+" Kg";
            break;
         case 4:
            Articulo Mango = new Articulo("Mango",40,0);
            System.out.println("Has decidido llevar "+Mango.Nombre+" ¿Qué Cantidad?");
            Mango.Cantidad += N.nextFloat();
            Fruteria.Articulo = Mango.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Mango.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Mango.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Mango.Precio*Mango.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Mango.Nombre+", $"+Mango.Precio+", lleva "+Mango.Cantidad+" Kg";
            break;
         case 5:
            Articulo Guayaba = new Articulo("Guayaba",39,0);
            System.out.println("Has decidido llevar "+Guayaba.Nombre+" ¿Qué Cantidad?");
            Guayaba.Cantidad += N.nextFloat();
            Fruteria.Articulo = Guayaba.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Guayaba.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Guayaba.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Guayaba.Precio*Guayaba.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Guayaba.Nombre+", $"+Guayaba.Precio+", lleva "+Guayaba.Cantidad+" Kg";
            break;
         case 6:
            Articulo Zanahoria = new Articulo("Zanahoria",16,0);
            System.out.println("Has decidido llevar "+Zanahoria.Nombre+" ¿Qué Cantidad?");
            Zanahoria.Cantidad += N.nextFloat();
            Fruteria.Articulo = Zanahoria.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Zanahoria.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Zanahoria.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Zanahoria.Precio*Zanahoria.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Zanahoria.Nombre+", $"+Zanahoria.Precio+", lleva "+Zanahoria.Cantidad+" Kg";
            break;
         case 7:
            Articulo Cebolla = new Articulo("Cebolla",30,0);
            System.out.println("Has decidido llevar "+Cebolla.Nombre+" ¿Qué Cantidad?");
            Cebolla.Cantidad += N.nextFloat();
            Fruteria.Articulo = Cebolla.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Cebolla.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Cebolla.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Cebolla.Precio*Cebolla.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Cebolla.Nombre+", $"+Cebolla.Precio+", lleva "+Cebolla.Cantidad+" Kg";
            break;
         case 8:
            Articulo Apio = new Articulo("Apio",26,0);
            System.out.println("Has decidido llevar "+Apio.Nombre+" ¿Qué Cantidad?");
            Apio.Cantidad += N.nextFloat();
            Fruteria.Articulo = Apio.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Apio.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Apio.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Apio.Precio*Apio.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Apio.Nombre+", $"+Apio.Precio+", lleva "+Apio.Cantidad+" Kg";
            break;
         case 9:
            Articulo Brocoli = new Articulo("Brócoli",39,0);
            System.out.println("Has decidido llevar "+Brocoli.Nombre+" ¿Qué Cantidad?");
            Brocoli.Cantidad += N.nextFloat();
            Fruteria.Articulo = Brocoli.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Brocoli.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Brocoli.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Brocoli.Precio*Brocoli.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Brocoli.Nombre+", $"+Brocoli.Precio+", lleva "+Brocoli.Cantidad+" Kg";
            break;
         case 10:
            Articulo Lechuga = new Articulo("Lechuga",18,0);
            System.out.println("Has decidido llevar "+Lechuga.Nombre+" ¿Qué Cantidad?");
            Lechuga.Cantidad += N.nextFloat();
            Fruteria.Articulo = Lechuga.Nombre;//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Lechuga.Precio;//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Lechuga.Cantidad;//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Lechuga.Precio*Lechuga.Cantidad;//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Lechuga.Nombre+", $"+Lechuga.Precio+", lleva "+Lechuga.Cantidad+" Kg";
            break;
            
         case 0:
            break;
     }
 }
 else{
  System.out.println("No seleccionaste un numero valido.");
 }
}
while(d!=0);
             break;
         case 3:
             Pescadero.Nombre = "Pedro";//Se asigna el atributo de nombre de la clase pescadero como "Pedro".
Pescadero.Puesto = "pescadero";//Se asigna el atributo de puesto de la clase pescadero como "pescadero".
Pescadero pescadero = new Pescadero();//Se crea un objeto de la clase pescadero.
pescadero.Presentacion();//Realiza el método Presentacion de la clase Pescadero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
pescadero.Catalogo();//Se muestra el catalogo de productos que tiene la pescadería.
 d = N.nextInt();//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo FileteB = new Articulo("Filete de Basa",100,0);
            System.out.println("Va a llevar "+FileteB.Nombre+" ¿Qué Cantidad?");
            FileteB.Cantidad += N.nextFloat();
            Pescadero.Articulo = FileteB.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteB.
            Pescadero.Precio = FileteB.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteB.
            Pescadero.Cantidad = FileteB.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteB.
            Pescadero.Total = Pescadero.Total+FileteB.Precio*FileteB.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteB.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FileteB.Nombre+", $"+FileteB.Precio+", lleva "+FileteB.Cantidad+" Kg";
            break;
         case 2:
            Articulo Camaron = new Articulo("Camarón",275,0);
            System.out.println("Va a llevar "+Camaron.Nombre+" ¿Qué Cantidad?");
            Camaron.Cantidad += N.nextFloat();
            Pescadero.Articulo = Camaron.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Camaron.
            Pescadero.Precio = Camaron.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Camaron.
            Pescadero.Cantidad = Camaron.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Camaron.
            Pescadero.Total = Pescadero.Total+Camaron.Precio*Camaron.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Camaron.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Camaron.Nombre+", $"+Camaron.Precio+", lleva "+Camaron.Cantidad+" Kg";
            break;
         case 3:
            Articulo FileteS = new Articulo("Filete de Salmón",375,0);
            System.out.println("Va a llevar "+FileteS.Nombre+" ¿Qué Cantidad?");
            FileteS.Cantidad += N.nextFloat();
            Pescadero.Articulo = FileteS.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteS.
            Pescadero.Precio = FileteS.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteS.
            Pescadero.Cantidad = FileteS.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteS.
            Pescadero.Total = Pescadero.Total+FileteS.Precio*FileteS.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteS.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FileteS.Nombre+", $"+FileteS.Precio+", lleva "+FileteS.Cantidad+" Kg";
            break;
         case 4:
            Articulo FiletePA = new Articulo("Filete de Pescado de Alaska",90,0);
            System.out.println("Va a llevar "+FiletePA.Nombre+" ¿Qué Cantidad?");
            FiletePA.Cantidad += N.nextFloat();
            Pescadero.Articulo = FiletePA.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FiletePA.
            Pescadero.Precio = FiletePA.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FiletePA.
            Pescadero.Cantidad = FiletePA.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FiletePA.
            Pescadero.Total = Pescadero.Total+FiletePA.Precio*FiletePA.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FiletePA.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FiletePA.Nombre+", $"+FiletePA.Precio+", lleva "+FiletePA.Cantidad+" Kg";
            break;
         case 5:
            Articulo FileteM = new Articulo("Filete de Mojarra",105,0);
            System.out.println("Va a llevar "+FileteM.Nombre+" ¿Qué Cantidad?");
            FileteM.Cantidad += N.nextFloat();
            Pescadero.Articulo = FileteM.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteM.
            Pescadero.Precio = FileteM.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteM.
            Pescadero.Cantidad = FileteM.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteM.
            Pescadero.Total = Pescadero.Total+FileteM.Precio*FileteM.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteM.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FileteM.Nombre+", $"+FileteM.Precio+", lleva "+FileteM.Cantidad+" Kg";
            break;
            case 6:
            Articulo Barrita = new Articulo("Barrita de Pescado",79,0);
            System.out.println("Va a llevar "+Barrita.Nombre+" ¿Qué Cantidad?");
            Barrita.Cantidad += N.nextFloat();
            Pescadero.Articulo = Barrita.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Barrita.
            Pescadero.Precio = Barrita.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Barrita.
            Pescadero.Cantidad = Barrita.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Barrita.
            Pescadero.Total = Pescadero.Total+Barrita.Precio*Barrita.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Barrita.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Barrita.Nombre+", $"+Barrita.Precio+", lleva "+Barrita.Cantidad+" Kg";
            break;
         case 7:
            Articulo Mojarra = new Articulo("Mojarra Entera",64,0);
            System.out.println("Va a llevar "+Mojarra.Nombre+" ¿Qué Cantidad?");
            Mojarra.Cantidad += N.nextFloat();
            Pescadero.Articulo = Mojarra.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Mojarra.
            Pescadero.Precio = Mojarra.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Mojarra.
            Pescadero.Cantidad = Mojarra.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Mojarra.
            Pescadero.Total = Pescadero.Total+Mojarra.Precio*Mojarra.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Mojarra.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Mojarra.Nombre+", $"+Mojarra.Precio+", lleva "+Mojarra.Cantidad+" Kg";
            break;
         case 8:
            Articulo Huachinango = new Articulo("Huachinango",269,0);
            System.out.println("Va a llevar "+Huachinango.Nombre+" ¿Qué Cantidad?");
            Huachinango.Cantidad += N.nextFloat();
            Pescadero.Articulo = Huachinango.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Huachinango.
            Pescadero.Precio = Huachinango.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Huachinango.
            Pescadero.Cantidad = Huachinango.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Huachinango.
            Pescadero.Total = Pescadero.Total+Huachinango.Precio*Huachinango.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Huachinango.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Huachinango.Nombre+", $"+Huachinango.Precio+", lleva "+Huachinango.Cantidad+" Kg";
            break;
         case 9:
            Articulo Pescaldo = new Articulo("Pescado para Caldo",85,0);
            System.out.println("Va a llevar "+Pescaldo.Nombre+" ¿Qué Cantidad?");
            Pescaldo.Cantidad += N.nextFloat();
            Pescadero.Articulo = Pescaldo.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Pescaldo.
            Pescadero.Precio = Pescaldo.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Pescaldo.
            Pescadero.Cantidad = Pescaldo.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Pescaldo.
            Pescadero.Total = Pescadero.Total+Pescaldo.Precio*Pescaldo.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Pescaldo.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Pescaldo.Nombre+", $"+Pescaldo.Precio+", lleva "+Pescaldo.Cantidad+" Kg";
            break;
         case 10:
            Articulo Figuritas = new Articulo("Figuritas de Pescado Empanizado",79,0);
            System.out.println("Va a llevar "+Figuritas.Nombre+" ¿Qué Cantidad?");
            Figuritas.Cantidad += N.nextFloat();
            Pescadero.Articulo = Figuritas.Nombre;//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Figuritas.
            Pescadero.Precio = Figuritas.Precio;//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Figuritas.
            Pescadero.Cantidad = Figuritas.Cantidad;//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Figuritas.
            Pescadero.Total = Pescadero.Total+Figuritas.Precio*Figuritas.Cantidad;//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Figuritas.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Figuritas.Nombre+", $"+Figuritas.Precio+", lleva "+Figuritas.Cantidad+" Kg";
            break;
         case 0:
            break;
     }
 }
 else{
  System.out.println("No seleccionaste un numero valido.");
 }
}
while(d!=0);
             break;
         case 0:
             break;
     }
 }
 else{
  System.out.println("No seleccionaste un numero valido.");
 }
}
while(D!=0); 
Cajero.Total = Carnicero.Total+Fruteria.Total+Pescadero.Total;//Se asigna el atributo de precio total en la clase cajero con la suma entre los precios totales que posee cada clase.
Cajero.Nombre = "Jorge";//Se asigna el atributo de nombre de la clase carnicero como "Jorge".
Cajero.Puesto = "cajero";//Se asigna el atributo de puesto de la clase cajero como "cajero".
System.out.println("Cajas del Supermercado");//Se imprime un mensaje que indica que ahora se encuentra en las cajas.
Cajero cajero = new Cajero();
cajero.Presentacion();//Realiza el método Saludo de la clase Cajero.
Cajero.Caja();//Realiza el método Caja de la clase Cajero.
/*Error solucionado: Al asignar y mostrar primero los atributos y métodos de la clase carnicero, y después asignar y mostrar los
atributos y métodos de la clase cajero, se logra realizar el proceso como se esperaba; de todos modos, aún pienso que ésta práctica no
es óptima, por lo que me dedicaré a investigar alguna manera de hacer esto de forma más efectiva y práctica.*/
}}
