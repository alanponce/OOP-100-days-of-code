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
 d = Integer.parseInt(Carnicero.getEleccion());//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Chuleta = new Articulo("Chuleta de Cerdo",92,0);//Se crea una chuleta, la cual es un objeto de la clase carnes.
            Chuleta.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chuleta.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Chuleta.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
            Carnicero.setPrecio(Chuleta.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
            Carnicero.setCantidad(Chuleta.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Chuleta.getPrecio()*Chuleta.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
            //Verificar si la asignacion de valores a estos atributos de la clase carnicero se puede realizar de una manera que use menos codigo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Chuleta.getNombre()+", $"+Chuleta.getPrecio()+", lleva "+Chuleta.getCantidad()+" Kg");
            break;
         case 2:
            Articulo Molida = new Articulo("Carne Molida",118,0);
            Molida.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Molida.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Molida.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto molida.
            Carnicero.setPrecio(Molida.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto molida.
            Carnicero.setCantidad(Molida.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto molida.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Molida.getPrecio()*Molida.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto molida.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Molida.getNombre()+", $"+Molida.getPrecio()+", lleva "+Molida.getCantidad()+" Kg");
            break;
         case 3:
            Articulo Lengua = new Articulo("Lengua",260,0);
            Lengua.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Lengua.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Lengua.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Lengua.
            Carnicero.setPrecio(Lengua.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Lengua.
            Carnicero.setCantidad(Lengua.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Lengua.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Lengua.getPrecio()*Lengua.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Lengua.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Lengua.getNombre()+", $"+Lengua.getPrecio()+", lleva "+Lengua.getCantidad()+" Kg");
            break;
         case 4:
            Articulo Salchicha = new Articulo("Salchicha",98,0);
            Salchicha.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Salchicha.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Salchicha.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Salchicha.
            Carnicero.setPrecio(Salchicha.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Salchicha.
            Carnicero.setCantidad(Salchicha.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Salchicha.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Salchicha.getPrecio()*Salchicha.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Salchicha.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Salchicha.getNombre()+", $"+Salchicha.getPrecio()+", lleva "+Salchicha.getCantidad()+" Kg");
            break;
         case 5:
            Articulo Chorizo = new Articulo("Chorizo",60,0);
            Chorizo.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chorizo.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Chorizo.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chorizo.
            Carnicero.setPrecio(Chorizo.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chorizo.
            Carnicero.setCantidad(Chorizo.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chorizo.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Chorizo.getPrecio()*Chorizo.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chorizo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Chorizo.getNombre()+", $"+Chorizo.getPrecio()+", lleva "+Chorizo.getCantidad()+" Kg");
            break;
            case 6:
            Articulo Chicharron = new Articulo("Chicharrón de Cerdo",176,0);
            Chicharron.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Chicharron.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Chicharron.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chicharron.
            Carnicero.setPrecio(Chicharron.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chicharron.
            Carnicero.setCantidad(Chicharron.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chicharron.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Chicharron.getPrecio()*Chicharron.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chicharron.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Chicharron.getNombre()+", $"+Chicharron.getPrecio()+", lleva "+Chicharron.getCantidad()+" Kg");
            break;
         case 7:
            Articulo Milanesa = new Articulo("Milanesa de Cerdo",94,0);
            Milanesa.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Milanesa.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Milanesa.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Milanesa.
            Carnicero.setPrecio(Milanesa.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Milanesa.
            Carnicero.setCantidad(Milanesa.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Milanesa.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Milanesa.getPrecio()*Milanesa.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Milanesa.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Milanesa.getNombre()+", $"+Milanesa.getPrecio()+", lleva "+Milanesa.getCantidad()+" Kg");
            break;
         case 8:
            Articulo Costilla = new Articulo("Costilla de Cerdo",110,0);
            Costilla.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Costilla.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Costilla.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Costilla.
            Carnicero.setPrecio(Costilla.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Costilla.
            Carnicero.setCantidad(Costilla.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Costilla.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Costilla.getPrecio()*Costilla.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Costilla.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Costilla.getNombre()+", $"+Costilla.getPrecio()+", lleva "+Costilla.getCantidad()+" Kg");
            break;
         case 9:
            Articulo Sirloin = new Articulo("Sirloin de Ternera",229,0);
            Sirloin.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Sirloin.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Sirloin.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Sirloin.
            Carnicero.setPrecio(Sirloin.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Sirloin.
            Carnicero.setCantidad(Sirloin.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Sirloin.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Sirloin.getPrecio()*Sirloin.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Sirloin.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Sirloin.getNombre()+", $"+Sirloin.getPrecio()+", lleva "+Sirloin.getCantidad()+" Kg");
            break;
         case 10:
            Articulo Pata = new Articulo("Pata de Res",54,0);
            Pata.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Pata.getNombre()+" ¿Qué Cantidad?")));
            Carnicero.setArticulo(Pata.getNombre());//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Pata.
            Carnicero.setPrecio(Pata.getPrecio());//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Pata.
            Carnicero.setCantidad(Pata.getCantidad());//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Pata.
            Carnicero.setPrecioTotal(Carnicero.getPrecioTotal()+Pata.getPrecio()*Pata.getCantidad());//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Pata.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Pata.getNombre()+", $"+Pata.getPrecio()+", lleva "+Pata.getCantidad()+" Kg");
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
 d = Integer.parseInt(Fruteria.getEleccion());//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo Manzana = new Articulo("Manzana",35,0);
            Manzana.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Manzana.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Manzana.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Manzana.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Manzana.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Manzana.getPrecio()*Manzana.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Manzana.getNombre()+", $"+Manzana.getPrecio()+", lleva "+Manzana.getCantidad()+" Kg");
            break;
         case 2:
            Articulo Naranja = new Articulo("Naranja",13,0);
            Naranja.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Naranja.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Naranja.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Naranja.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Naranja.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Naranja.getPrecio()*Naranja.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Naranja.getNombre()+", $"+Naranja.getPrecio()+", lleva "+Naranja.getCantidad()+" Kg");
            break;
         case 3:
            Articulo Platano = new Articulo("Platano",16,0);
            Platano.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Platano.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Platano.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Platano.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Platano.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Platano.getPrecio()*Platano.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Platano.getNombre()+", $"+Platano.getPrecio()+", lleva "+Platano.getCantidad()+" Kg");
            break;
         case 4:
            Articulo Mango = new Articulo("Mango",40,0);
            Mango.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Mango.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Mango.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Mango.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Mango.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Mango.getPrecio()*Mango.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Mango.getNombre()+", $"+Mango.getPrecio()+", lleva "+Mango.getCantidad()+" Kg");
            break;
         case 5:
            Articulo Guayaba = new Articulo("Guayaba",39,0);
            Guayaba.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Guayaba.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Guayaba.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Guayaba.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Guayaba.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Guayaba.getPrecio()*Guayaba.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Guayaba.getNombre()+", $"+Guayaba.getPrecio()+", lleva "+Guayaba.getCantidad()+" Kg");
            break;
         case 6:
            Articulo Zanahoria = new Articulo("Zanahoria",16,0);
            Zanahoria.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Zanahoria.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Zanahoria.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Zanahoria.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Zanahoria.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Zanahoria.getPrecio()*Zanahoria.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Zanahoria.getNombre()+", $"+Zanahoria.getPrecio()+", lleva "+Zanahoria.getCantidad()+" Kg");
            break;
         case 7:
            Articulo Cebolla = new Articulo("Cebolla",30,0);
            Cebolla.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Cebolla.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Cebolla.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Cebolla.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Cebolla.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Cebolla.getPrecio()*Cebolla.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Cebolla.getNombre()+", $"+Cebolla.getPrecio()+", lleva "+Cebolla.getCantidad()+" Kg");
            break;
         case 8:
            Articulo Apio = new Articulo("Apio",26,0);
            Apio.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Apio.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Apio.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Apio.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Apio.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Apio.getPrecio()*Apio.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Apio.getNombre()+", $"+Apio.getPrecio()+", lleva "+Apio.getCantidad()+" Kg");
            break;
         case 9:
            Articulo Brocoli = new Articulo("Brócoli",39,0);
            Brocoli.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Brocoli.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Brocoli.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Brocoli.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Brocoli.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Brocoli.getPrecio()*Brocoli.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Brocoli.getNombre()+", $"+Brocoli.getPrecio()+", lleva "+Brocoli.getCantidad()+" Kg");
            break;
         case 10:
            Articulo Lechuga = new Articulo("Lechuga",18,0);
            Lechuga.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Lechuga.getNombre()+" ¿Qué Cantidad?")));            
            Fruteria.setArticulo(Lechuga.getNombre());//Se asigna el atributo de artículo en la clase fruteria con el nombre que posee el objeto.
            Fruteria.setPrecio(Lechuga.getPrecio());//Se asigna el atributo de precio en la clase fruteria con el precio que posee el objeto.
            Fruteria.setCantidad(Lechuga.getCantidad());//Se asigna el atributo de cantidad en la clase fruteria con la cantidad que posee el objeto.
            Fruteria.setPrecioTotal(Fruteria.getPrecioTotal()+Lechuga.getPrecio()*Lechuga.getCantidad());//Se asigna el atributo de precio total en la clase fruteria con el precio total que posee el objeto.
            fruteria.Decision();//Realiza el método Proceso de la clase Fruteria.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Lechuga.getNombre()+", $"+Lechuga.getPrecio()+", lleva "+Lechuga.getCantidad()+" Kg");
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
 d = Integer.parseInt(Pescadero.getEleccion());//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(d>=0&&d<=10){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 10 o si no se encuentra entre estos valores.
     switch(d){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Articulo FileteB = new Articulo("Filete de Basa",100,0);
            FileteB.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteB.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(FileteB.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteB.
            Pescadero.setPrecio(FileteB.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteB.
            Pescadero.setCantidad(FileteB.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteB.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+FileteB.getPrecio()*FileteB.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteB.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+FileteB.getNombre()+", $"+FileteB.getPrecio()+", lleva "+FileteB.getCantidad()+" Kg");
            break;
         case 2:
            Articulo Camaron = new Articulo("Camarón",275,0);
            Camaron.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Camaron.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(Camaron.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Camaron.
            Pescadero.setPrecio(Camaron.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Camaron.
            Pescadero.setCantidad(Camaron.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Camaron.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+Camaron.getPrecio()*Camaron.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Camaron.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Camaron.getNombre()+", $"+Camaron.getPrecio()+", lleva "+Camaron.getCantidad()+" Kg");
            break;
         case 3:
            Articulo FileteS = new Articulo("Filete de Salmón",375,0);
            FileteS.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteS.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(FileteS.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteS.
            Pescadero.setPrecio(FileteS.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteS.
            Pescadero.setCantidad(FileteS.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteS.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+FileteS.getPrecio()*FileteS.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteS.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+FileteS.getNombre()+", $"+FileteS.getPrecio()+", lleva "+FileteS.getCantidad()+" Kg");
            break;
         case 4:
            Articulo FiletePA = new Articulo("Filete de Pescado de Alaska",90,0);
            FiletePA.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FiletePA.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(FiletePA.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FiletePA.
            Pescadero.setPrecio(FiletePA.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FiletePA.
            Pescadero.setCantidad(FiletePA.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FiletePA.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+FiletePA.getPrecio()*FiletePA.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FiletePA.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+FiletePA.getNombre()+", $"+FiletePA.getPrecio()+", lleva "+FiletePA.getCantidad()+" Kg");
            break;
         case 5:
            Articulo FileteM = new Articulo("Filete de Mojarra",105,0);
            FileteM.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+FileteM.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(FileteM.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto FileteM.
            Pescadero.setPrecio(FileteM.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto FileteM.
            Pescadero.setCantidad(FileteM.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto FileteM.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+FileteM.getPrecio()*FileteM.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto FileteM.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+FileteM.getNombre()+", $"+FileteM.getPrecio()+", lleva "+FileteM.getCantidad()+" Kg");
            break;
            case 6:
            Articulo Barrita = new Articulo("Barrita de Pescado",79,0);
            Barrita.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Barrita.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(Barrita.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Barrita.
            Pescadero.setPrecio(Barrita.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Barrita.
            Pescadero.setCantidad(Barrita.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Barrita.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+Barrita.getPrecio()*Barrita.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Barrita.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Barrita.getNombre()+", $"+Barrita.getPrecio()+", lleva "+Barrita.getCantidad()+" Kg");
            break;
         case 7:
            Articulo Mojarra = new Articulo("Mojarra Entera",64,0);
            Mojarra.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Mojarra.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(Mojarra.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Mojarra.
            Pescadero.setPrecio(Mojarra.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Mojarra.
            Pescadero.setCantidad(Mojarra.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Mojarra.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+Mojarra.getPrecio()*Mojarra.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Mojarra.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Mojarra.getNombre()+", $"+Mojarra.getPrecio()+", lleva "+Mojarra.getCantidad()+" Kg");
            break;
         case 8:
            Articulo Huachinango = new Articulo("Huachinango",269,0);
            Huachinango.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Huachinango.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(Huachinango.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Huachinango.
            Pescadero.setPrecio(Huachinango.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Huachinango.
            Pescadero.setCantidad(Huachinango.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Huachinango.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+Huachinango.getPrecio()*Huachinango.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Huachinango.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Huachinango.getNombre()+", $"+Huachinango.getPrecio()+", lleva "+Huachinango.getCantidad()+" Kg");
            break;
         case 9:
            Articulo Pescaldo = new Articulo("Pescado para Caldo",85,0);
            Pescaldo.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Pescaldo.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(Pescaldo.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Pescaldo.
            Pescadero.setPrecio(Pescaldo.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Pescaldo.
            Pescadero.setCantidad(Pescaldo.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Pescaldo.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+Pescaldo.getPrecio()*Pescaldo.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Pescaldo.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Pescaldo.getNombre()+", $"+Pescaldo.getPrecio()+", lleva "+Pescaldo.getCantidad()+" Kg");
            break;
         case 10:
            Articulo Figuritas = new Articulo("Figuritas de Pescado Empanizado",79,0);
            Figuritas.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Va a llevar "+Figuritas.getNombre()+" ¿Qué Cantidad?")));            
            Pescadero.setArticulo(Figuritas.getNombre());//Se asigna el atributo de artículo en la clase pescadero con el nombre que posee el objeto Figuritas.
            Pescadero.setPrecio(Figuritas.getPrecio());//Se asigna el atributo de precio en la clase pescadero con el precio que posee el objeto Figuritas.
            Pescadero.setCantidad(Figuritas.getCantidad());//Se asigna el atributo de cantidad en la clase pescadero con la cantidad que posee el objeto Figuritas.
            Pescadero.setPrecioTotal(Pescadero.getPrecioTotal()+Figuritas.getPrecio()*Figuritas.getCantidad());//Se asigna el atributo de precio total en la clase pescadero con el precio total que posee el objeto Figuritas.
            pescadero.Proceso();//Realiza el método Proceso de la clase pescadero.
            Cajero.setArticulos(Cajero.getArticulos()+"\n"+Figuritas.getNombre()+", $"+Figuritas.getPrecio()+", lleva "+Figuritas.getCantidad()+" Kg");
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
Cajero.setPrecioTotal(Carnicero.getPrecioTotal()+Fruteria.getPrecioTotal()+Pescadero.getPrecioTotal());//Se asigna el atributo de precio total en la clase cajero con la suma entre los precios totales que posee cada clase.
Cajero cajero = new Cajero("Jorge","Cajero");
JOptionPane.showMessageDialog(null,"Cajas del Supermercado");//Se imprime un mensaje que indica que ahora se encuentra en las cajas.
cajero.Presentacion();//Realiza el método Saludo de la clase Cajero.
Cajero.Caja();//Realiza el método Caja de la clase Cajero.
/*Error solucionado: Al asignar y mostrar primero los atributos y métodos de la clase carnicero, y después asignar y mostrar los
atributos y métodos de la clase cajero, se logra realizar el proceso como se esperaba; de todos modos, aún pienso que ésta práctica no
es óptima, por lo que me dedicaré a investigar alguna manera de hacer esto de forma más efectiva y práctica.*/

/*Avance: Se ha creado un archivo .java para cada clase.*/
    }}