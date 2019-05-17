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
public class Mesero extends Empleados implements Operaciones{//declaro la clase Mesero que hereda de la clase abstracta Empleados
    
    Mesero(int id, String nombre, String fechanacimiento, String departamento,double salario){//declaro el constructor de la clase empleados con sus respectivos argumentos
    super(id,nombre,fechanacimiento,departamento,salario);//usando la palabra reservada super llamamos al constructor de la clase padre Empleados
    }
    
    @Override
    public double Sueldo(double salario) {
        double bono=salario*.10;//declaro una variable de tipo double llamada bono, en la cual se calcula un bono del 10% de su salario
        return salario+bono;//el sueldo total del mesero es su sueldo mas el bono
    }
    
    @Override
    public Orden orden(int idOrder,Productos productos,int cantidad) {//metodo sobreescrito de la interfaz operaciones
        Orden o=new Orden(idOrder,productos,cantidad);//crea un objeto de la clase orden
        return o;// retorna el objeto
    }
    
}
