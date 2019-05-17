/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;//Aqui se declara el paquete en el que se guardan todas las clases que estamos usando.

/**
 *
 * @author ivanv
 */
public class Orden {//declaro la clase Orden con modificador de acceso publico
    private final int idOrder;//declaro la variable de tipo int llamada idOrder, con modificador de acceso privado y de tipo final, ya que una vez que se le asigna un id a una orden, este no deberia de cambiar
    private Productos producto;//declaro la variable tipo String llamada productos, con modificador de acceso privado
    private int cantidad;//declaro la variable tipo int llamada cantidad, con modificador de acceso privado
    public final double iva=0.08;//declaro la variable de tipo double llamada iva, con modificador de acceso privado y de tipo final ya que el valor del iva es del 8% y no se modificara.
    
    Orden(int idOrder,Productos productos, int cantidad){//declaro el constructor de la clase empleados con sus respectivos argumentos
        this.idOrder=idOrder;//le asigno el valor a la variable idOrder de la clase con el parametro recibido. 
        this.producto=productos;//le asigno el valor a la variable productos de la clase con el parametro recibido.
        this.cantidad=cantidad;//le asigno el valor a la variable productos de la clase con el parametro recibido.
    }
    
    public int getIdOrder(){//metodo para obtener el idOrder, con modificador de acceso publico y que retorna un int
        return this.idOrder;
    }
    
    public Productos getProductos(){//metodo para obtener los productos, con modificador de acceso publico y que retorna un string
        return this.producto;
    }
    
    public int getCantidad(){//metodo para obtener el idOrder, con modificador de acceso publico y que retorna un int
        return this.cantidad;
    }
    
    public void SetProductos(Productos productos){//metodo que nos permite poner los productos, con modificador de acceso publico, recibe un String y retorna void
        this.producto=productos;
    }
    
    public void Setcantidad(int cantidad){//metodo que nos permite poner los productos, con modificador de acceso publico, recibe un String y retorna void
        this.cantidad=cantidad;
    }
    
    public double Total(Productos producto, int cantidad){//metodo para la venta total, con modificador de acceso publico y retorna un double
        double subtotal=producto.getPrecio()*cantidad;//se declara la variable subtotal de tiipo double y se obtiene el precio del objeto y se multiplica por la cantidad de productos
        double total=subtotal+(subtotal*iva);//se declara la variable total y se le agrega el iva
        return total;//se regresa el total
    }
    
    
}
