package Negocio;

// @author Jose Luis De La Cruz 

public class Libro extends Documento{//nos dice que la clase es publica y se llama libro y tiene herencia en documento
    private boolean prestado;//Nos dice que su modificador de acceso sera privado y se llamara prestado

    public Libro(int codigo, String titulo, String autor, String editorial, int anoPub,boolean prestado) {//si todo esta correctamente entonces podemos poner en prestado
        super(codigo, titulo, autor, editorial, anoPub);//usamos el metodo super 
        this.prestado=prestado;
    }

    public boolean isPrestado() {//si el formato es correcto entonces podemos pedir prestado
        return prestado;//nos regresa a prestado
    }

    public void setPrestado(boolean prestado) {//nos dice que si los datos son correctos podemos pedir el libro o revista prestado
        this.prestado = prestado;
    }

    public String toString() {
        return super.toString()+"prestado=" + prestado +"\n"+"-------------------------"+"\n";//el metodo super no permite pedir prestado los libros
    }
    
    
    
    
}
