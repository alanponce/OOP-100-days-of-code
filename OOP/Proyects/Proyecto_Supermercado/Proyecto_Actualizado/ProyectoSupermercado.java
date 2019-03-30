//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 29/03/2019
package proyecto.supermercado;
import javax.swing.JOptionPane;
public class ProyectoSupermercado {
    public static void main(String[]args){
int D,d;
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
D = Integer.parseInt(JOptionPane.showInputDialog(null,"Estás en el supermercado, desde la entrada se pueden ver las diferentes secciones: \n1.Carniceria \n2.Frutas y Verduras \n3. Pescadería\n0. Cajas \n¿A donde te diriges?: "));    
if(D>=0&&D<=3){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 3 o si no se encuentra entre estos valores.
     switch(D){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
Carnicero carnicero = new Carnicero("Juan","Carnicero");//Se crea un objeto de la clase carnicero.
carnicero.Presentacion();//Realiza el método Presentacion de la clase Carnicero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
carnicero.Catalogo();//Se muestra el catalogo de productos que tiene la carniceria.
 d = Integer.parseInt(Carnicero.Eleccion);//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Chuleta = new Articulo("Chuleta de Cerdo",92,0);//Se crea una chuleta, la cual es un objeto de la clase carnes.
            Chuleta.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chuleta.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Chuleta.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
            Carnicero.Precio = Chuleta.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
            Carnicero.Cantidad = Chuleta.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
            Carnicero.Total = Carnicero.Total+Chuleta.getPrecio()*Chuleta.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
            //Verificar si la asignacion de valores a estos atributos de la clase carnicero se puede realizar de una manera que use menos codigo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Chuleta.getNombre()+", $"+Chuleta.getPrecio()+", lleva "+Chuleta.getCantidad()+" Kg";
            break;
         case 2:
            Articulo Molida = new Articulo("Carne Molida",118,0);
            Molida.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Molida.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Molida.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto molida.
            Carnicero.Precio = Molida.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto molida.
            Carnicero.Cantidad = Molida.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto molida.
            Carnicero.Total = Carnicero.Total+Molida.getPrecio()*Molida.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto molida.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Molida.getNombre()+", $"+Molida.getPrecio()+", lleva "+Molida.getCantidad()+" Kg";
            break;
         case 3:
            Articulo Lengua = new Articulo("Lengua",260,0);
            Lengua.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Lengua.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Lengua.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Lengua.
            Carnicero.Precio = Lengua.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Lengua.
            Carnicero.Cantidad = Lengua.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Lengua.
            Carnicero.Total = Carnicero.Total+Lengua.getPrecio()*Lengua.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Lengua.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Lengua.getNombre()+", $"+Lengua.getPrecio()+", lleva "+Lengua.getCantidad()+" Kg";
            break;
         case 4:
            Articulo Salchicha = new Articulo("Salchicha",98,0);
            Salchicha.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Salchicha.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Salchicha.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Salchicha.
            Carnicero.Precio = Salchicha.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Salchicha.
            Carnicero.Cantidad = Salchicha.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Salchicha.
            Carnicero.Total = Carnicero.Total+Salchicha.getPrecio()*Salchicha.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Salchicha.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Salchicha.getNombre()+", $"+Salchicha.getPrecio()+", lleva "+Salchicha.getCantidad()+" Kg";
            break;
         case 5:
            Articulo Chorizo = new Articulo("Chorizo",60,0);
            Chorizo.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chorizo.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Chorizo.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chorizo.
            Carnicero.Precio = Chorizo.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chorizo.
            Carnicero.Cantidad = Chorizo.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chorizo.
            Carnicero.Total = Carnicero.Total+Chorizo.getPrecio()*Chorizo.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chorizo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            Cajero.Articulos = Cajero.Articulos+"\n"+Chorizo.getNombre()+", $"+Chorizo.getPrecio()+", lleva "+Chorizo.getCantidad()+" Kg";
            break;
            case 6:
            Articulo Chicharron = new Articulo("Chicharrón de Cerdo",176,0);
            Chicharron.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chicharron.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Chicharron.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chicharron.
            Carnicero.Precio = Chicharron.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chicharron.
            Carnicero.Cantidad = Chicharron.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chicharron.
            Carnicero.Total = Carnicero.Total+Chicharron.getPrecio()*Chicharron.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chicharron.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Chicharron.getNombre()+", $"+Chicharron.getPrecio()+", lleva "+Chicharron.getCantidad()+" Kg";
            break;
         case 7:
            Articulo Milanesa = new Articulo("Milanesa de Cerdo",94,0);
            Milanesa.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Milanesa.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Milanesa.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Milanesa.
            Carnicero.Precio = Milanesa.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Milanesa.
            Carnicero.Cantidad = Milanesa.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Milanesa.
            Carnicero.Total = Carnicero.Total+Milanesa.getPrecio()*Milanesa.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Milanesa.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Milanesa.getNombre()+", $"+Milanesa.getPrecio()+", lleva "+Milanesa.getCantidad()+" Kg";
            break;
         case 8:
            Articulo Costilla = new Articulo("Costilla de Cerdo",110,0);
            Costilla.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Costilla.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Costilla.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Costilla.
            Carnicero.Precio = Costilla.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Costilla.
            Carnicero.Cantidad = Costilla.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Costilla.
            Carnicero.Total = Carnicero.Total+Costilla.getPrecio()*Costilla.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Costilla.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Costilla.getNombre()+", $"+Costilla.getPrecio()+", lleva "+Costilla.getCantidad()+" Kg";
            break;
         case 9:
            Articulo Sirloin = new Articulo("Sirloin de Ternera",229,0);
            Sirloin.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Sirloin.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Sirloin.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Sirloin.
            Carnicero.Precio = Sirloin.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Sirloin.
            Carnicero.Cantidad = Sirloin.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Sirloin.
            Carnicero.Total = Carnicero.Total+Sirloin.getPrecio()*Sirloin.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Sirloin.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Sirloin.getNombre()+", $"+Sirloin.getPrecio()+", lleva "+Sirloin.getCantidad()+" Kg";
            break;
         case 10:
            Articulo Pata = new Articulo("Pata de Res",54,0);
            Pata.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Pata.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.Articulo = Pata.getNombre();//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Pata.
            Carnicero.Precio = Pata.getPrecio();//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Pata.
            Carnicero.Cantidad = Pata.getCantidad();//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Pata.
            Carnicero.Total = Carnicero.Total+Pata.getPrecio()*Pata.getCantidad();//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Pata.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            Cajero.Articulos = Cajero.Articulos+"\n"+Pata.getNombre()+", $"+Pata.getPrecio()+", lleva "+Pata.getCantidad()+" Kg";
            break;
         case 0:
            break;
     }
 }
 else{
  JOptionPane.showMessageDialog(null,"No seleccionaste un numero valido.");
 }
}
while(d!=0);
             break;
         case 2:
Fruteria fruteria = new Fruteria();//Se crea un objeto de la clase Fruteria.
fruteria.Presentacion();//Realiza el método Presentacion de la clase fruteria.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
fruteria.Estantes();//Se muestra la estanteria de productos que tiene la sección.
 d = Integer.parseInt(Fruteria.Eleccion);//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Manzana = new Articulo("Manzana",35,0);
            Manzana.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Manzana.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Manzana.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Manzana.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Manzana.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Manzana.getPrecio()*Manzana.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Manzana.getNombre()+", $"+Manzana.getPrecio()+", lleva "+Manzana.getCantidad()+" Kg";
            break;
         case 2:
            Articulo Naranja = new Articulo("Naranja",13,0);
            Naranja.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Naranja.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Naranja.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Naranja.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Naranja.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Naranja.getPrecio()*Naranja.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Naranja.getNombre()+", $"+Naranja.getPrecio()+", lleva "+Naranja.getCantidad()+" Kg";
            break;
         case 3:
            Articulo Platano = new Articulo("Platano",16,0);
            Platano.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Platano.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Platano.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Platano.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Platano.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Platano.getPrecio()*Platano.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Platano.getNombre()+", $"+Platano.getPrecio()+", lleva "+Platano.getCantidad()+" Kg";
            break;
         case 4:
            Articulo Mango = new Articulo("Mango",40,0);
            Mango.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Mango.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Mango.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Mango.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Mango.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Mango.getPrecio()*Mango.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Mango.getNombre()+", $"+Mango.getPrecio()+", lleva "+Mango.getCantidad()+" Kg";
            break;
         case 5:
            Articulo Guayaba = new Articulo("Guayaba",39,0);
            Guayaba.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Guayaba.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Guayaba.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Guayaba.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Guayaba.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Guayaba.getPrecio()*Guayaba.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Guayaba.getNombre()+", $"+Guayaba.getPrecio()+", lleva "+Guayaba.getCantidad()+" Kg";
            break;
         case 6:
            Articulo Zanahoria = new Articulo("Zanahoria",16,0);
            Zanahoria.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Zanahoria.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Zanahoria.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Zanahoria.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Zanahoria.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Zanahoria.getPrecio()*Zanahoria.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Zanahoria.getNombre()+", $"+Zanahoria.getPrecio()+", lleva "+Zanahoria.getCantidad()+" Kg";
            break;
         case 7:
            Articulo Cebolla = new Articulo("Cebolla",30,0);
            Cebolla.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Cebolla.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Cebolla.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Cebolla.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Cebolla.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Cebolla.getPrecio()*Cebolla.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Cebolla.getNombre()+", $"+Cebolla.getPrecio()+", lleva "+Cebolla.getCantidad()+" Kg";
            break;
         case 8:
            Articulo Apio = new Articulo("Apio",26,0);
            Apio.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Apio.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Apio.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Apio.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Apio.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Apio.getPrecio()*Apio.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Apio.getNombre()+", $"+Apio.getPrecio()+", lleva "+Apio.getCantidad()+" Kg";
            break;
         case 9:
            Articulo Brocoli = new Articulo("Brócoli",39,0);
            Brocoli.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Brocoli.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Brocoli.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Brocoli.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Brocoli.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Brocoli.getPrecio()*Brocoli.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Brocoli.getNombre()+", $"+Brocoli.getPrecio()+", lleva "+Brocoli.getCantidad()+" Kg";
            break;
         case 10:
            Articulo Lechuga = new Articulo("Lechuga",18,0);
            Lechuga.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Lechuga.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.Articulo = Lechuga.getNombre();//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.Precio = Lechuga.getPrecio();//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.Cantidad = Lechuga.getCantidad();//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.Total = Fruteria.Total+Lechuga.getPrecio()*Lechuga.getCantidad();//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Eleccion();//Realiza el método Proceso de la clase Fruteria.
            Cajero.Articulos = Cajero.Articulos+"\n"+Lechuga.getNombre()+", $"+Lechuga.getPrecio()+", lleva "+Lechuga.getCantidad()+" Kg";
            break;
            
         case 0:
            break;
     }
 }
 else{
  JOptionPane.showMessageDialog(null,"No seleccionaste un numero valido.");
 }
}
while(d!=0);
             break;
         case 3:
Pescadero pescadero = new Pescadero("Pedro","Pescadero");//Se crea un objeto de la clase pescadero.
pescadero.Presentacion();//Realiza el método Presentacion de la clase Pescadero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
pescadero.Catalogo();//Se muestra el catalogo de productos que tiene la pescadería.
 d = Integer.parseInt(Pescadero.Eleccion);//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo FileteB = new Articulo("Filete de Basa",100,0);
            FileteB.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteB.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = FileteB.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteB.
            Pescadero.Precio = FileteB.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteB.
            Pescadero.Cantidad = FileteB.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteB.
            Pescadero.Total = Pescadero.Total+FileteB.getPrecio()*FileteB.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteB.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FileteB.getNombre()+", $"+FileteB.getPrecio()+", lleva "+FileteB.getCantidad()+" Kg";
            break;
         case 2:
            Articulo Camaron = new Articulo("Camarón",275,0);
            Camaron.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Camaron.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = Camaron.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Camaron.
            Pescadero.Precio = Camaron.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Camaron.
            Pescadero.Cantidad = Camaron.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Camaron.
            Pescadero.Total = Pescadero.Total+Camaron.getPrecio()*Camaron.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Camaron.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Camaron.getNombre()+", $"+Camaron.getPrecio()+", lleva "+Camaron.getCantidad()+" Kg";
            break;
         case 3:
            Articulo FileteS = new Articulo("Filete de Salmón",375,0);
            FileteS.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteS.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = FileteS.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteS.
            Pescadero.Precio = FileteS.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteS.
            Pescadero.Cantidad = FileteS.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteS.
            Pescadero.Total = Pescadero.Total+FileteS.getPrecio()*FileteS.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteS.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FileteS.getNombre()+", $"+FileteS.getPrecio()+", lleva "+FileteS.getCantidad()+" Kg";
            break;
         case 4:
            Articulo FiletePA = new Articulo("Filete de Pescado de Alaska",90,0);
            FiletePA.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FiletePA.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = FiletePA.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FiletePA.
            Pescadero.Precio = FiletePA.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FiletePA.
            Pescadero.Cantidad = FiletePA.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FiletePA.
            Pescadero.Total = Pescadero.Total+FiletePA.getPrecio()*FiletePA.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FiletePA.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FiletePA.getNombre()+", $"+FiletePA.getPrecio()+", lleva "+FiletePA.getCantidad()+" Kg";
            break;
         case 5:
            Articulo FileteM = new Articulo("Filete de Mojarra",105,0);
            FileteM.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteM.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = FileteM.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteM.
            Pescadero.Precio = FileteM.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteM.
            Pescadero.Cantidad = FileteM.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteM.
            Pescadero.Total = Pescadero.Total+FileteM.getPrecio()*FileteM.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteM.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+FileteM.getNombre()+", $"+FileteM.getPrecio()+", lleva "+FileteM.getCantidad()+" Kg";
            break;
            case 6:
            Articulo Barrita = new Articulo("Barrita de Pescado",79,0);
            Barrita.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Barrita.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = Barrita.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Barrita.
            Pescadero.Precio = Barrita.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Barrita.
            Pescadero.Cantidad = Barrita.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Barrita.
            Pescadero.Total = Pescadero.Total+Barrita.getPrecio()*Barrita.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Barrita.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Barrita.getNombre()+", $"+Barrita.getPrecio()+", lleva "+Barrita.getCantidad()+" Kg";
            break;
         case 7:
            Articulo Mojarra = new Articulo("Mojarra Entera",64,0);
            Mojarra.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Mojarra.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = Mojarra.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Mojarra.
            Pescadero.Precio = Mojarra.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Mojarra.
            Pescadero.Cantidad = Mojarra.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Mojarra.
            Pescadero.Total = Pescadero.Total+Mojarra.getPrecio()*Mojarra.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Mojarra.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Mojarra.getNombre()+", $"+Mojarra.getPrecio()+", lleva "+Mojarra.getCantidad()+" Kg";
            break;
         case 8:
            Articulo Huachinango = new Articulo("Huachinango",269,0);
            Huachinango.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Huachinango.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = Huachinango.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Huachinango.
            Pescadero.Precio = Huachinango.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Huachinango.
            Pescadero.Cantidad = Huachinango.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Huachinango.
            Pescadero.Total = Pescadero.Total+Huachinango.getPrecio()*Huachinango.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Huachinango.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Huachinango.getNombre()+", $"+Huachinango.getPrecio()+", lleva "+Huachinango.getCantidad()+" Kg";
            break;
         case 9:
            Articulo Pescaldo = new Articulo("Pescado para Caldo",85,0);
            Pescaldo.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Pescaldo.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = Pescaldo.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Pescaldo.
            Pescadero.Precio = Pescaldo.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Pescaldo.
            Pescadero.Cantidad = Pescaldo.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Pescaldo.
            Pescadero.Total = Pescadero.Total+Pescaldo.getPrecio()*Pescaldo.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Pescaldo.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Pescaldo.getNombre()+", $"+Pescaldo.getPrecio()+", lleva "+Pescaldo.getCantidad()+" Kg";
            break;
         case 10:
            Articulo Figuritas = new Articulo("Figuritas de Pescado Empanizado",79,0);
            Figuritas.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Figuritas.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.Articulo = Figuritas.getNombre();//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Figuritas.
            Pescadero.Precio = Figuritas.getPrecio();//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Figuritas.
            Pescadero.Cantidad = Figuritas.getCantidad();//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Figuritas.
            Pescadero.Total = Pescadero.Total+Figuritas.getPrecio()*Figuritas.getCantidad();//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Figuritas.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.Articulos = Cajero.Articulos+"\n"+Figuritas.getNombre()+", $"+Figuritas.getPrecio()+", lleva "+Figuritas.getCantidad()+" Kg";
            break;
         case 0:
            break;
     }
 }
 else{
  JOptionPane.showMessageDialog(null,"No seleccionaste un numero valido.");
 }
}
while(d!=0);
             break;
         case 0:
             break;
     }
 }
 else{
  JOptionPane.showMessageDialog(null,"No seleccionaste un numero valido.");
 }
}
while(D!=0); 
Cajero.Total = Carnicero.Total+Fruteria.Total+Pescadero.Total;//Se asigna el atributo de precio total en la clase cajero con la suma entre los precios totales que posee cada clase.
Cajero cajero = new Cajero("Jorge","Cajero");
JOptionPane.showMessageDialog(null,"Cajas del Supermercado");//Se imprime un mensaje que indica que ahora se encuentra en las cajas.
cajero.Presentacion();//Realiza el método Saludo de la clase Cajero.
Cajero.Caja();//Realiza el método Caja de la clase Cajero.
/*Error solucionado: Al asignar y mostrar primero los atributos y métodos de la clase carnicero, y después asignar y mostrar los
atributos y métodos de la clase cajero, se logra realizar el proceso como se esperaba; de todos modos, aún pienso que ésta práctica no
es óptima, por lo que me dedicaré a investigar alguna manera de hacer esto de forma más efectiva y práctica.*/

/*Avance: Se encapsularon los atributos de la clase artículo y se crearon los getters y setters para cada artículo.*/
    }}