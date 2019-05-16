
import devs.com.sistema.ventas.modelos.Producto;


public class Procesos {
  //Imprimir el producto con mayor Stock
  public void imprimirmayorStock(Producto prod1,Producto prod2,Producto prod3){
      //se valida si el producto 1 es mayor que los demas productos
      if (prod1.getExistencias()>prod2.getExistencias() & prod2.getExistencias()>prod3.getExistencias()) {
           System.out.println("----------------------------------------------------------------------------------------------");
          System.out.println("El Producto con Mayor Stock es: "+prod1.getNombre()+" "+prod1.getExistencias());
      }
      //Validamos si el producto tres es mayor a los demas productos
      else if(prod3.getExistencias()>prod2.getExistencias() & prod2.getExistencias()>prod1.getExistencias()){
           System.out.println("El Producto con Mayor Stock es: "+prod3.getNombre()+" "+prod3.getExistencias());
      }
      //Caso por defecto:si ningun caso anterior ocurre el producto 2 es mayor
      else{
           System.out.println("El Producto con Mayor Stock es: "+prod2.getNombre()+" "+prod2.getExistencias());
      }
       System.out.println("----------------------------------------------------------------------------------------------");
     

}
  //Imprimir el producto con menor stock
   public void imprimirmenorstock(Producto prod1,Producto prod2,Producto prod3){
        System.out.println("----------------------------------------------------------------------------------------------");
        //se valida si el producto 1 es menor que los demas productos
       if (prod1.getExistencias()>prod2.getExistencias() & prod2.getExistencias()>prod3.getExistencias()) {
          System.out.println("El Producto con Menor Stock es: "+prod3.getNombre()+" "+prod3.getExistencias());
      }
        //Validamos si el producto tres es menor a los demas productos
      else if(prod3.getExistencias()>prod2.getExistencias() & prod2.getExistencias()>prod1.getExistencias()){
           System.out.println("El Producto con Mayor Stock es: "+prod1.getNombre()+" "+prod1.getExistencias());
      }
       //Caso por defecto:si ningun caso anterior ocurre el producto 2 es menor
      else{
           System.out.println("El Producto con Mayor Stock es: "+prod2.getNombre()+" "+prod2.getExistencias());
      }
        System.out.println("----------------------------------------------------------------------------------------------");
   }
    public static void main(String[] args) {
        //Instanciamos el objeto producto
         Producto prod=new Producto("Camisas",12.25,12.74,14);
       Producto prod1=new Producto("Sueter",12.25,12.74,10);
      Producto prod3=new Producto("Silla",12.25,12.74,18);
      
      //instanciamos la Clase Procesos para obtener Acceso a todos sus metodos
      Procesos pro=new Procesos();
      
      //Mandamos a llamr la funcion que imprime el producto con mayor stock
      pro.imprimirmayorStock(prod1, prod, prod3);
      
       //Mandamos a llamar la funcion que imprime el producto con menor stock
      pro.imprimirmenorstock(prod1, prod, prod3);
    }
  }
