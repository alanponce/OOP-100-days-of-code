/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author ivanv
 */
public class Administrador extends Empleados implements Ventas{
    
    Administrador(int id, String nombre,String apellido, String fechanacimiento, String departamento, String contrasena,double salario){
        super(id,nombre,apellido,fechanacimiento,departamento,contrasena,salario);
    }
    
    @Override
    public double Sueldo(double salario) {
        return (salario*6)+2500;
    }
    
    public Comidas agregarDesayunos(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){
        Comidas d=new Desayunos(idproducto,nombre,precio,tipo,descripcion,ingredientes);
        return d;
    }
    
    public Comidas agregarCenas(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){
        Comidas c=new Cenas(idproducto,nombre,precio,tipo,descripcion,ingredientes);
        return c;
    }
    
    public Postres agregarPostres(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor){
        Postres p=new Postres(idproducto,nombre,precio,tipo,descripcion,sabor);
        return p;
    }
    
    public Bebidas agregarAguasNaturales(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor,String tamano){
        Bebidas a=new AguasNaturales(idproducto,nombre, precio, tipo, descripcion,sabor,tamano);
        return a;
    }
    
    public Bebidas agregarRefresco(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor, String marca){
        Bebidas r=new Refrescos(idproducto,nombre, precio, tipo, descripcion,sabor,marca);
        return r;
    }
    
    public Bebidas agregarCervezas(int idproducto,String nombre, double precio, String tipo, String descripcion, String marca,float gradosalcohol){
        Bebidas ce=new Cervezas(idproducto,nombre, precio, tipo, descripcion,marca,gradosalcohol);
        return ce;
    }
   
    public Comidas EliminarDesayunos(Comidas d) {
       d=null;
       return d;
    }
    
    public Comidas EliminarCenas(Comidas c) {
       c=null;
       return c;
    }    
    
    public Comidas EliminarPostres(Comidas p) {
       p=null;
       return p;
    } 
    
    public Comidas EliminarAguasNaturales(Comidas a) {
       a=null;
       return a;
    } 
    
    public Comidas EliminarRefrescos(Comidas r) {
       r=null;
       return r;
    } 
    
    public Comidas EliminarCervezas(Comidas ce) {
       ce=null;
       return ce;
    } 

    @Override
    public Ventas Cobrar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
