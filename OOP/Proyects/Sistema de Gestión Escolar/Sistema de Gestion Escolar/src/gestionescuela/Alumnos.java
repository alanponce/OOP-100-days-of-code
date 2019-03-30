package gestionescuela;


public class Alumnos {
    //Atributos de la clase alumnos
    String nombre;  
    String apellidos;
    String gradoEsc;
    int id; 
    String grupoEsc;
    String fNacimiento;
    
    //Metodos de la clase alumnos
    public void establecerNombre(String nombrealumno){
         this.nombre=nombrealumno;
    }
    public void establecerApellidos(String apellidoalumno){
         this.apellidos=apellidoalumno;
    }
    public void establecerGrado(String gradoescolar){
         this.gradoEsc=gradoescolar;
    }
    public void establecerID(int ide){
         this.id=ide;
    }
    public void establecerGrupo(String grupoalumno){
         this.grupoEsc=grupoalumno;
    }
    public void establecerFecha(String fecha){
         this.fNacimiento=fecha;
    }
    
    public String obtenerNombre(){
        System.out.println("El nombre del alumno es: "+nombre);
        return nombre;
    }
    public String obtenerApellidos(){
        System.out.println("El apellido del alumno es: "+apellidos);
        return apellidos;
    }
    public String obtenerGrado(){
        System.out.println("El grado del alumno es: "+gradoEsc);
        return gradoEsc;
    }
    public String obtenerGrupo(){
        System.out.println("El grupo del alumno es: "+grupoEsc);
        return grupoEsc;
    }
    public int obtenerID(){
        System.out.println("El numero de identificacion del alumno es: "+id);
        return id;
    }
    public String obtenerFecha(){
        System.out.println("El grupo del alumno es: "+fNacimiento);
        return fNacimiento;
    }
    public void mostrarRes(){
        System.out.println("El nombre del alumno es: "+nombre);
        System.out.println("El apellido del alumno es: "+apellidos);
        System.out.println("El grado del alumno es: "+gradoEsc);
        System.out.println("El grupo del alumno es: "+grupoEsc);
        System.out.println("El numero de identificacion del alumno es: "+id);
        System.out.println("La fecha de nacimiento del alumno es: "+fNacimiento);
    }


 
}