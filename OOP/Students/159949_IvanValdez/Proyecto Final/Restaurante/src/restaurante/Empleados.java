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
public abstract class Empleados{
    private int id;
    private String nombre;
    private String apellido;
    private final String fechanacimiento;
    private String departamento;
    private String contrasena;
    private double salario;
    
    Empleados(int id, String nombre,String apellido, String fechanacimiento, String departamento, String contrasena,double salario){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechanacimiento=fechanacimiento;
        this.departamento=departamento;
        this.contrasena=contrasena;
    }
    
    public abstract double Sueldo(double salario);  
}
