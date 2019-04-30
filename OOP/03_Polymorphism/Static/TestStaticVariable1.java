/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */

//Java Program to demonstrate the use of static variable  
class Student{  
   String id; 
   String name;  
   static String college ="UACJ";//static variable  
   
//constructor  
   Student(String student_id, String student_name){  
   id = student_id;  
   name = student_name;  
   }  
   
   
   //method to display the values  
   void display (){
       System.out.println(id+" "+name+" "+college);}  
}  

//Test class to show the values of objects  
public class TestStaticVariable1{  
 public static void main(String args[]){  
 
     Student s1 = new Student("al155678","Maria Sanchez");  
 
     Student s2 = new Student("al169871","Pedro Torres");  
 
       //we can change the college of all objects by the single line of code  
       //Student.college="IIT/CU";  

        s1.display();  
        s2.display();  
 }  
}  
