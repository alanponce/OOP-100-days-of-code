//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 29/03/2019
package proyecto.supermercado;
import javax.swing.JOptionPane;
public class ProyectoSupermercado {
    public static void main(String[]args){
Cajero cajero = new Cajero("Jorge","Cajero","",0);
Carnicero carnicero = new Carnicero("Juan","Carnicero");//Se crea un objeto de la clase carnicero.
Fruteria fruteria = new Fruteria();//Se crea un objeto de la clase Fruteria.
Pescadero pescadero = new Pescadero("Pedro","Pescadero");//Se crea un objeto de la clase pescadero.
int D,d;
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
D = Integer.parseInt(JOptionPane.showInputDialog(null,"Estás en el supermercado, desde la entrada se pueden ver las diferentes secciones: \n1.Carniceria \n2.Frutas y Verduras \n3. Pescadería\n0. Cajas \n¿A donde te diriges?: "));    
if(D>=0&&D<=3){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 3 o si no se encuentra entre estos valores.
     switch(D){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
carnicero.Presentacion();//Realiza el método Presentacion de la clase Carnicero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
carnicero.Catalogo();//Se muestra el catalogo de productos que tiene la carniceria.
 d = Integer.parseInt(carnicero.getEleccion());//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Chuleta = new Articulo("Chuleta de Cerdo",92,0);//Se crea una chuleta, la cual es un objeto de la clase carnes.
            Chuleta.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chuleta.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Chuleta.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
            carnicero.setPrecio(Chuleta.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
            carnicero.setCantidad(Chuleta.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Chuleta.getPrecio()*Chuleta.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
            //Verificar si la asignacion de valores a estos atributos de la clase carnicero se puede realizar de una manera que use menos codigo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Chuleta.getNombre()+", $"+Chuleta.getPrecio()+", lleva "+Chuleta.getCantidad()+" Kg");
            break;
         case 2:
            Articulo Molida = new Articulo("Carne Molida",118,0);
            Molida.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Molida.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Molida.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto molida.
            carnicero.setPrecio(Molida.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto molida.
            carnicero.setCantidad(Molida.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto molida.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Molida.getPrecio()*Molida.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto molida.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Molida.getNombre()+", $"+Molida.getPrecio()+", lleva "+Molida.getCantidad()+" Kg");
            break;
         case 3:
            Articulo Lengua = new Articulo("Lengua",260,0);
            Lengua.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Lengua.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Lengua.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Lengua.
            carnicero.setPrecio(Lengua.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Lengua.
            carnicero.setCantidad(Lengua.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Lengua.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Lengua.getPrecio()*Lengua.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Lengua.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Lengua.getNombre()+", $"+Lengua.getPrecio()+", lleva "+Lengua.getCantidad()+" Kg");
            break;
         case 4:
            Articulo Salchicha = new Articulo("Salchicha",98,0);
            Salchicha.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Salchicha.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Salchicha.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Salchicha.
            carnicero.setPrecio(Salchicha.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Salchicha.
            carnicero.setCantidad(Salchicha.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Salchicha.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Salchicha.getPrecio()*Salchicha.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Salchicha.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Salchicha.getNombre()+", $"+Salchicha.getPrecio()+", lleva "+Salchicha.getCantidad()+" Kg");
            break;
         case 5:
            Articulo Chorizo = new Articulo("Chorizo",60,0);
            Chorizo.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chorizo.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Chorizo.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chorizo.
            carnicero.setPrecio(Chorizo.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chorizo.
            carnicero.setCantidad(Chorizo.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chorizo.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Chorizo.getPrecio()*Chorizo.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chorizo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            cajero.setArticulos(cajero.getArticulos()+"\n"+Chorizo.getNombre()+", $"+Chorizo.getPrecio()+", lleva "+Chorizo.getCantidad()+" Kg");
            break;
            case 6:
            Articulo Chicharron = new Articulo("Chicharrón de Cerdo",176,0);
            Chicharron.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chicharron.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Chicharron.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chicharron.
            carnicero.setPrecio(Chicharron.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chicharron.
            carnicero.setCantidad(Chicharron.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chicharron.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Chicharron.getPrecio()*Chicharron.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chicharron.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Chicharron.getNombre()+", $"+Chicharron.getPrecio()+", lleva "+Chicharron.getCantidad()+" Kg");
            break;
         case 7:
            Articulo Milanesa = new Articulo("Milanesa de Cerdo",94,0);
            Milanesa.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Milanesa.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Milanesa.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Milanesa.
            carnicero.setPrecio(Milanesa.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Milanesa.
            carnicero.setCantidad(Milanesa.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Milanesa.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Milanesa.getPrecio()*Milanesa.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Milanesa.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Milanesa.getNombre()+", $"+Milanesa.getPrecio()+", lleva "+Milanesa.getCantidad()+" Kg");
            break;
         case 8:
            Articulo Costilla = new Articulo("Costilla de Cerdo",110,0);
            Costilla.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Costilla.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Costilla.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Costilla.
            carnicero.setPrecio(Costilla.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Costilla.
            carnicero.setCantidad(Costilla.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Costilla.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Costilla.getPrecio()*Costilla.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Costilla.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Costilla.getNombre()+", $"+Costilla.getPrecio()+", lleva "+Costilla.getCantidad()+" Kg");
            break;
         case 9:
            Articulo Sirloin = new Articulo("Sirloin de Ternera",229,0);
            Sirloin.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Sirloin.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Sirloin.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Sirloin.
            carnicero.setPrecio(Sirloin.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Sirloin.
            carnicero.setCantidad(Sirloin.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Sirloin.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Sirloin.getPrecio()*Sirloin.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Sirloin.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Sirloin.getNombre()+", $"+Sirloin.getPrecio()+", lleva "+Sirloin.getCantidad()+" Kg");
            break;
         case 10:
            Articulo Pata = new Articulo("Pata de Res",54,0);
            Pata.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Pata.getNombre()+" ¿Qué Cantidad?")));
            carnicero.setArticulo(Pata.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Pata.
            carnicero.setPrecio(Pata.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Pata.
            carnicero.setCantidad(Pata.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Pata.
            carnicero.setPrecioTotal(carnicero.getPrecioTotal()+Pata.getPrecio()*Pata.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Pata.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            cajero.setArticulos(cajero.getArticulos()+"\n"+Pata.getNombre()+", $"+Pata.getPrecio()+", lleva "+Pata.getCantidad()+" Kg");
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
fruteria.Presentacion();//Realiza el método Presentacion de la clase fruteria.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
fruteria.Estantes();//Se muestra la estanteria de productos que tiene la sección.
 d = Integer.parseInt(fruteria.getEleccion());//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Manzana = new Articulo("Manzana",35,0);
            Manzana.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Manzana.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Manzana.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Manzana.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Manzana.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Manzana.getPrecio()*Manzana.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Manzana.getNombre()+", $"+Manzana.getPrecio()+", lleva "+Manzana.getCantidad()+" Kg");
            break;
         case 2:
            Articulo Naranja = new Articulo("Naranja",13,0);
            Naranja.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Naranja.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Naranja.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Naranja.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Naranja.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Naranja.getPrecio()*Naranja.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Naranja.getNombre()+", $"+Naranja.getPrecio()+", lleva "+Naranja.getCantidad()+" Kg");
            break;
         case 3:
            Articulo Platano = new Articulo("Platano",16,0);
            Platano.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Platano.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Platano.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Platano.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Platano.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Platano.getPrecio()*Platano.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Platano.getNombre()+", $"+Platano.getPrecio()+", lleva "+Platano.getCantidad()+" Kg");
            break;
         case 4:
            Articulo Mango = new Articulo("Mango",40,0);
            Mango.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Mango.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Mango.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Mango.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Mango.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Mango.getPrecio()*Mango.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Mango.getNombre()+", $"+Mango.getPrecio()+", lleva "+Mango.getCantidad()+" Kg");
            break;
         case 5:
            Articulo Guayaba = new Articulo("Guayaba",39,0);
            Guayaba.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Guayaba.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Guayaba.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Guayaba.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Guayaba.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Guayaba.getPrecio()*Guayaba.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Guayaba.getNombre()+", $"+Guayaba.getPrecio()+", lleva "+Guayaba.getCantidad()+" Kg");
            break;
         case 6:
            Articulo Zanahoria = new Articulo("Zanahoria",16,0);
            Zanahoria.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Zanahoria.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Zanahoria.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Zanahoria.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Zanahoria.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Zanahoria.getPrecio()*Zanahoria.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Zanahoria.getNombre()+", $"+Zanahoria.getPrecio()+", lleva "+Zanahoria.getCantidad()+" Kg");
            break;
         case 7:
            Articulo Cebolla = new Articulo("Cebolla",30,0);
            Cebolla.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Cebolla.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Cebolla.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Cebolla.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Cebolla.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Cebolla.getPrecio()*Cebolla.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Cebolla.getNombre()+", $"+Cebolla.getPrecio()+", lleva "+Cebolla.getCantidad()+" Kg");
            break;
         case 8:
            Articulo Apio = new Articulo("Apio",26,0);
            Apio.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Apio.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Apio.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Apio.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Apio.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Apio.getPrecio()*Apio.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Apio.getNombre()+", $"+Apio.getPrecio()+", lleva "+Apio.getCantidad()+" Kg");
            break;
         case 9:
            Articulo Brocoli = new Articulo("Brócoli",39,0);
            Brocoli.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Brocoli.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Brocoli.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Brocoli.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Brocoli.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Brocoli.getPrecio()*Brocoli.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Brocoli.getNombre()+", $"+Brocoli.getPrecio()+", lleva "+Brocoli.getCantidad()+" Kg");
            break;
         case 10:
            Articulo Lechuga = new Articulo("Lechuga",18,0);
            Lechuga.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Lechuga.getNombre()+" ¿Qué Cantidad?")));            
            fruteria.setArticulo(Lechuga.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            fruteria.setPrecio(Lechuga.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            fruteria.setCantidad(Lechuga.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            fruteria.setPrecioTotal(fruteria.getPrecioTotal()+Lechuga.getPrecio()*Lechuga.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Lechuga.getNombre()+", $"+Lechuga.getPrecio()+", lleva "+Lechuga.getCantidad()+" Kg");
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
pescadero.Presentacion();//Realiza el método Presentacion de la clase Pescadero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
pescadero.Catalogo();//Se muestra el catalogo de productos que tiene la pescadería.
 d = Integer.parseInt(pescadero.getEleccion());//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo FileteB = new Articulo("Filete de Basa",100,0);
            FileteB.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteB.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(FileteB.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteB.
            pescadero.setPrecio(FileteB.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteB.
            pescadero.setCantidad(FileteB.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteB.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+FileteB.getPrecio()*FileteB.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteB.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+FileteB.getNombre()+", $"+FileteB.getPrecio()+", lleva "+FileteB.getCantidad()+" Kg");
            break;
         case 2:
            Articulo Camaron = new Articulo("Camarón",275,0);
            Camaron.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Camaron.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(Camaron.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Camaron.
            pescadero.setPrecio(Camaron.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Camaron.
            pescadero.setCantidad(Camaron.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Camaron.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+Camaron.getPrecio()*Camaron.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Camaron.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Camaron.getNombre()+", $"+Camaron.getPrecio()+", lleva "+Camaron.getCantidad()+" Kg");
            break;
         case 3:
            Articulo FileteS = new Articulo("Filete de Salmón",375,0);
            FileteS.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteS.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(FileteS.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteS.
            pescadero.setPrecio(FileteS.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteS.
            pescadero.setCantidad(FileteS.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteS.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+FileteS.getPrecio()*FileteS.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteS.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+FileteS.getNombre()+", $"+FileteS.getPrecio()+", lleva "+FileteS.getCantidad()+" Kg");
            break;
         case 4:
            Articulo FiletePA = new Articulo("Filete de Pescado de Alaska",90,0);
            FiletePA.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FiletePA.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(FiletePA.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FiletePA.
            pescadero.setPrecio(FiletePA.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FiletePA.
            pescadero.setCantidad(FiletePA.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FiletePA.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+FiletePA.getPrecio()*FiletePA.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FiletePA.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+FiletePA.getNombre()+", $"+FiletePA.getPrecio()+", lleva "+FiletePA.getCantidad()+" Kg");
            break;
         case 5:
            Articulo FileteM = new Articulo("Filete de Mojarra",105,0);
            FileteM.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteM.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(FileteM.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteM.
            pescadero.setPrecio(FileteM.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteM.
            pescadero.setCantidad(FileteM.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteM.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+FileteM.getPrecio()*FileteM.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteM.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+FileteM.getNombre()+", $"+FileteM.getPrecio()+", lleva "+FileteM.getCantidad()+" Kg");
            break;
            case 6:
            Articulo Barrita = new Articulo("Barrita de Pescado",79,0);
            Barrita.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Barrita.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(Barrita.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Barrita.
            pescadero.setPrecio(Barrita.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Barrita.
            pescadero.setCantidad(Barrita.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Barrita.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+Barrita.getPrecio()*Barrita.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Barrita.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Barrita.getNombre()+", $"+Barrita.getPrecio()+", lleva "+Barrita.getCantidad()+" Kg");
            break;
         case 7:
            Articulo Mojarra = new Articulo("Mojarra Entera",64,0);
            Mojarra.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Mojarra.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(Mojarra.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Mojarra.
            pescadero.setPrecio(Mojarra.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Mojarra.
            pescadero.setCantidad(Mojarra.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Mojarra.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+Mojarra.getPrecio()*Mojarra.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Mojarra.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Mojarra.getNombre()+", $"+Mojarra.getPrecio()+", lleva "+Mojarra.getCantidad()+" Kg");
            break;
         case 8:
            Articulo Huachinango = new Articulo("Huachinango",269,0);
            Huachinango.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Huachinango.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(Huachinango.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Huachinango.
            pescadero.setPrecio(Huachinango.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Huachinango.
            pescadero.setCantidad(Huachinango.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Huachinango.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+Huachinango.getPrecio()*Huachinango.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Huachinango.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Huachinango.getNombre()+", $"+Huachinango.getPrecio()+", lleva "+Huachinango.getCantidad()+" Kg");
            break;
         case 9:
            Articulo Pescaldo = new Articulo("Pescado para Caldo",85,0);
            Pescaldo.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Pescaldo.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(Pescaldo.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Pescaldo.
            pescadero.setPrecio(Pescaldo.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Pescaldo.
            pescadero.setCantidad(Pescaldo.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Pescaldo.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+Pescaldo.getPrecio()*Pescaldo.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Pescaldo.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Pescaldo.getNombre()+", $"+Pescaldo.getPrecio()+", lleva "+Pescaldo.getCantidad()+" Kg");
            break;
         case 10:
            Articulo Figuritas = new Articulo("Figuritas de Pescado Empanizado",79,0);
            Figuritas.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Figuritas.getNombre()+" ¿Qué Cantidad?")));            
            pescadero.setArticulo(Figuritas.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Figuritas.
            pescadero.setPrecio(Figuritas.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Figuritas.
            pescadero.setCantidad(Figuritas.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Figuritas.
            pescadero.setPrecioTotal(pescadero.getPrecioTotal()+Figuritas.getPrecio()*Figuritas.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Figuritas.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            cajero.setArticulos(cajero.getArticulos()+"\n"+Figuritas.getNombre()+", $"+Figuritas.getPrecio()+", lleva "+Figuritas.getCantidad()+" Kg");
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
cajero.setPrecioTotal(carnicero.getPrecioTotal()+fruteria.getPrecioTotal()+pescadero.getPrecioTotal());//Se asigna el atributo de precio total en la clase cajero con la suma entre los precios totales que posee cada clase.
cajero.setPrecioFinal((float) (cajero.getPrecioTotal()+cajero.getPrecioTotal()*cajero.getIVA()));
JOptionPane.showMessageDialog(null,"Cajas del Supermercado");//Se imprime un mensaje que indica que ahora se encuentra en las cajas.
cajero.Presentacion();//Realiza el método Saludo de la clase Cajero.
cajero.Caja();//Realiza el método Caja de la clase Cajero.
/*Error solucionado: Al asignar y mostrar primero los atributos y métodos de la clase carnicero, y después asignar y mostrar los
atributos y métodos de la clase cajero, se logra realizar el proceso como se esperaba; de todos modos, aún pienso que ésta práctica no
es óptima, por lo que me dedicaré a investigar alguna manera de hacer esto de forma más efectiva y práctica.*/

/*Avance: La clase Artículo se ha declarado como estática, se eliminaron setters innecesarios.
Se agregó la variable estática IVA a la clase supermercadó y se agregó el atributo de precio final
con sus getters y setters.*/
    }}