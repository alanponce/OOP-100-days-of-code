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
public abstract class Empleados{//declaro la clase abstracta empleados con un modificador de acceso publico
    private final int id;//declaro la variable de tipo int llamada id, con modificador de acceso privado y de tipo final, ya que una vez que se le asigna un id a un empleado, este no deberia de cambiar
    private String nombre;//declaro la variable tipo String llamada nombre, con modificador de acceso privado
    private String fechanacimiento;//declaro la variable tipo String llamada fechanacimiento, con modificador de acceso privado
    private String departamento;//declaro la variable tipo String llamada departamento, con modificador de acceso privado
    private double salario;//declaro la variable dipo double llamada salado, con modificador de acceso privado
    
    Empleados(int id, String nombre, String fechanacimiento, String departamento,double salario){//declaro el constructor de la clase empleados con sus respectivos argumentos
        this.id=id;//le asigno el valor a la variable id de la clase con el parametro recibido. 
        this.nombre=nombre;//e asigno el valor a la variable nombre de la clase con el parametro recibido.
        this.fechanacimiento=fechanacimiento;//e asigno el valor a la variable fechanacimiento de la clase con el parametro recibido.
        this.departamento=departamento;//e asigno el valor a la variable departamento de la clase con el parametro recibido.
        this.salario=salario;//e asigno el valor a la variable salario de la clase con el parametro recibido.
    }
    
    public int getId(){//metodo para obtener el id, con modificador de acceso publico y que retorna un int
        return this.id;
    }
    
    public String getNombre(){//metodo para obtener el nombre, con modificador de acceso publico y que retorna un String
        return this.nombre;
    }
        
    public String getFechaNacimiento(){//metodo para obtener la fechanacimiento, con modificador de acceso publico y que retorna un String
        return this.fechanacimiento;
    }
    
    public String getDepartamento(){//metodo para obtener el departamento, con modificador de acceso publico y que retorna un String
        return this.departamento;
    }
    
    public double getSalario(){//metodo para obtener el salario, con modificador de acceso publico y que retorna un double
        return this.salario;
    }
    
    public void SetNombre(String nombre){//metodo que nos permite poner el nombre, con modificador de acceso publico, recibe un String y retorna void
        this.nombre=nombre;
    }
    
    public void SetFechaNacimiento(String fechanacimiento){//metodo que nos permite poner la fechanacimiento, con modificador de acceso publico, recibe un String y retorna void
        this.fechanacimiento=fechanacimiento;
    }
    
    public void Setdepartamento(String departamento){//metodo que nos permite poner el departamento, con modificador de acceso publico, recibe un String y retorna void
        this.departamento=departamento;
    }
    
    public void SetSalario(double salario){//metodo que nos permite poner el salario, con modificador de acceso publico, recibe un double y retorna void
        this.salario=salario;
    }
    
    public abstract double Sueldo(double salario);//metodo abscarcto que recibe un double y retorna un double, con modificador de acceso publico 
    
    
}
