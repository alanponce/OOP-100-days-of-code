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
public class Mesero extends Empleados{
    
    Mesero(int id, String nombre,String apellido, String fechanacimiento, String departamento, String contrasena,double salario){
    super(id,nombre,apellido,fechanacimiento,departamento,contrasena,salario);
    }
    
    @Override
    public double Sueldo(double salario) {
        return (salario*6)+500;
    }
}
