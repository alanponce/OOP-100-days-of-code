/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author hecto
 */
public abstract class Employee extends Person {
    private int EmpID; //Variable  Id del empleado
    private String EmpGender; //Variable  Genero del empleado
    private float EmpSalary; //Variable  Salario del empleado
    
    
    public int getEmpID(){
        return EmpID; //Obtener EmpId
    }
    public void setEmpID(int EmpID){
        this.EmpID=EmpID; //Guardar la EmpID
    } 
    
    public String getEmpGender(){
        return EmpGender;
    }
    public void setEmpGender(String EmpGender){
        this.EmpGender=EmpGender;
    }
    
    public float getEmpSalary(){
        return EmpSalary;
    }
    public void setEmpSalary(float EmpSalary){
        this.EmpSalary=EmpSalary;
    }
       
}
