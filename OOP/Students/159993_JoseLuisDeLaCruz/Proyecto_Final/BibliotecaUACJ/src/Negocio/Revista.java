package Negocio;//paquete negocio
 // @author Jose Luis De La Cruz
 
public class Revista extends Documento{//nos dice que la clase es publica y se llama revista y tiene herencia en documento
    private int volumen;//Nos dice que volumen va ser entero y su modificador de acceso sera privado
    private int numero;//Nos dice que numero va ser entero y su modificador de acceso sera privado
    private String mes;//Nos dice que mes va ser string y su modificador de acceso sera privado

    public Revista(int codigo, String titulo, String autor, String editorial, int anoPub,int volumen,int numero,String mes) {//Nos dice que documentos tendra todos los datos anteriores que tenia registro
        super(codigo, titulo, autor, editorial, anoPub);//usamos el metodo super para invocar
        this.volumen=volumen;
        this.numero=numero;
        this.mes=mes;
    }

    public int getVolumen() {//cuando ingresemos el volumen correctamente nos va devolver al registro
        return volumen;//Nos regresa a volumen
    }

    public void setVolumen(int volumen) {//Nos dice que cada objeto tiene que tener su propia clase en este caso volumen
        this.volumen = volumen;//Nos dice que si volumen es verdadero entonces compilara
    }

    public int getNumero() {//cuando ingresemos el numero correctamente nos va devolver al registro
        return numero;//nos regresa a numero
    }

    public void setNumero(int numero) {//Nos dice que cada objeto tiene que tener su propia clase en este caso numero
        this.numero = numero;//Nos dice que si numero es verdadero entonces compilara
    }

    public String getMes() {//cuando ingresemos el mes correctamente nos va devolver al registro
        return mes;//nos regresa a mes
    }

    public void setMes(String mes) {//Nos dice que cada objeto tiene que tener su propia clase en este caso mes
        this.mes = mes;//Nos dice que si mes es verdadero entonces compilara
    }

    public String toString() {
        return super.toString()+"volumen=" + volumen +"\n"+  ", numero=" + numero + "\n"+ ", mes=" + mes +"\n";//si todo coincide entonces el codigo compilara
    }   
}
