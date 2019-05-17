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
public class Administrador extends Empleados implements Operaciones{//declaro la clase Administrador que hereda de la clase abstracta Empleados e implementa la interfaz Operaciones
    
    Administrador(int id, String nombre, String fechanacimiento, String departamento,double salario){//declaro el constructor de la clase empleados con sus respectivos argumentos
        super(id,nombre,fechanacimiento,departamento,salario);//usando la palabra reservada super llamamos al constructor de la clase padre Empleados
    }
    
    @Override
    public double Sueldo(double salario) {//Sobreescribo el metodo abstracto Sueldo de la clase Empleados, con modificador de acceso publico, recibe un double y retorna un double
        double bono=salario*.20;//declaro una variable de tipo double llamada bono, en la cual se calcula un bono del 20% de su salario
        return salario+bono;//el sueldo total del administrador es su sueldo mas el bono
    }
    
    public Comidas agregarDesayunos(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){//Metodo para agregar un objeto de la clase Desayunos, con modificador de acceso publico
        Comidas d=new Desayunos(idproducto,nombre,precio,tipo,descripcion,ingredientes);//instancio un objeto de la clase desayuno por medio de la clase comidas llamado d
        return d;//retorno el objeto creado
    }
    
    public Comidas agregarCenas(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){//Metodo para agregar un objeto de la clase Cenas, con modificador de acceso publico
        Comidas c=new Cenas(idproducto,nombre,precio,tipo,descripcion,ingredientes);//instancio un objeto de la clase cena por medio de la clase comidas llamado c
        return c;//retorno el objeto creado
    }
    
    public Postres agregarPostres(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor){//Metodo para agregar un objeto de la clase Postres, con modificador de acceso publico
        Postres p=new Postres(idproducto,nombre,precio,tipo,descripcion,sabor);//instancio un objeto de la clase Postres llamado p
        return p;//retorno el objeto creado
    }
    //sobrecargo el metodo agregarBebidas gracias a que reciben parametro diferentes segun su tipo
    public Bebidas agregarBebidas(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor){//Metodo para agregar un objeto de la clase Bebidas, con modificador de acceso publico
        Bebidas a=new AguasNaturales(idproducto,nombre, precio, tipo, descripcion,sabor);//instancio un objeto de la clase AguasNaturales por medio de la clase Bebidas llamado a
        return a;//retorno el objeto creado
    }
    
    public Bebidas agregarBebidas(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor, String marca){//Metodo para agregar un objeto de la clase Bebidas, con modificador de acceso publico
        Bebidas r=new Refrescos(idproducto,nombre, precio, tipo, descripcion,sabor,marca);//instancio un objeto de la clase Refrescos por medio de la clase Bebidas llamado r
        return r;//retorno el objeto creado
    }
    
    public Bebidas agregarBebidas(int idproducto,String nombre, double precio, String tipo, String descripcion, String marca,double gradosalcohol){//Metodo para agregar un objeto de la clase Bebidas, con modificador de acceso publico
        Bebidas ce=new Cervezas(idproducto,nombre, precio, tipo, descripcion,marca,gradosalcohol);//instancio un objeto de la clase Cervezas por medio de la clase Bebidas llamado ce
        return ce;//retorno el objeto creado
    }
   
    public Comidas EliminarDesayunos(Comidas d){//Metodo para eliminar un desayuno, con modificador de acceso publico
       d=null;//igualamos al objeto a null
       return d;//retornamos el objeto con valor null
    }
    
    public Comidas EliminarCenas(Comidas c){//Metodo para eliminar una cena, con modificador de acceso publico
       c=null;//igualamos al objeto a null
       return c;//retornamos el objeto con valor null
    }    
    
    public Postres EliminarPostres(Postres p){//Metodo para eliminar un postre, con modificador de acceso publico
       p=null;//igualamos al objeto a null
       return p;//retornamos el objeto con valor null
    } 
    
    public Bebidas EliminarAguasNaturales(Bebidas a){//Metodo para eliminar una agua natural, con modificador de acceso publico
       a=null;//igualamos al objeto a null
       return a;//retornamos el objeto con valor null
    } 
    
    public Bebidas EliminarRefrescos(Bebidas r){//Metodo para eliminar un refresco, con modificador de acceso publico
       r=null;//igualamos al objeto a null
       return r;//retornamos el objeto con valor null
    } 
    
    public Bebidas EliminarCervezas(Bebidas ce){//Metodo para eliminar una cerveza, con modificador de acceso publico
       ce=null;//igualamos al objeto a null
       return ce;//retornamos el objeto con valor null
    } 

    @Override
    public Orden orden(int idOrder,Productos productos,int cantidad) {//metodo sobreescrito de la interfaz operaciones
        Orden o=new Orden(idOrder,productos,cantidad);//crea un objeto de la clase orden
        return o;// retorna el objeto
    }
}
