/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author ENEMY345
 */
public class Registro {
    //System.out.println("Bienvenido al registro\nIngrese los datos: \n");
    //
    //System.out.println("Matricula:");
    //matricula = scan.nextInt();
    //System.out.println("Nombre:");
    //nombre = scan.nextLine();
    //System.out.println("Vehiculo");
    //vehiculo = scan.nextLine();
    //System.out.println("Es discapacitado:");
    //discpacidad = scan.next();
    //System.out.println("Es Maestro:");
    //maestro = scan.next();
    
    int[] matriculas = {};
    String[] nombres = {};
    String[] vehiculos = {};
    boolean[] discapacitados = {};
    boolean[] maestros = {};
    int conclusion;
    int i = 1;
    
    public void registrar(int matricula,String nombre,String vehiculo,boolean discapacidad,boolean maestro)
    {
            matriculas[i] = matricula;
            nombres[i] = nombre;
            vehiculos[i] = vehiculo;
            discapacitados[i] = discapacidad;
            maestros[i] = maestro;
            i++;
    }
}
