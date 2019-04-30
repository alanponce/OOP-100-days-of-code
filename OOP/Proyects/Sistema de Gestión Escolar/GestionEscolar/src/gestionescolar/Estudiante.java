package gestionescolar;
public class Estudiante extends Person {
    //Atributos de la clase Estudiante
    private String numAlumno;
    private char grado;
    private char grupo;
    
    //Metodos de la clase Estudiante
    public Estudiante(){
        this.numAlumno = null;
        this.grado = '\u0000';
        this.grupo = '\u0000';
    }

    public String getNumAlumno() {
        return numAlumno;
    }

    public void setNumAlumno(String numAlumno) {
        this.numAlumno = numAlumno;
    }

    public char getGrado() {
        return grado;
    }
 
    public void setGrado(char grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    
}
