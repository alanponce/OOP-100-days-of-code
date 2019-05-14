package Negocio;//paquete negocio
//@author Jose Luis De La Cruz 

public class Documento {//Nos dice que la clase es publica y que se llama documento
    private int codigo;//Nos dice que codigo va ser entero y su modificador de acceso sera privado
    private String titulo;//Nos dice que titulo va ser string y que su modificador de acceso sera privado
    private String autor;//Nos dice que autor va ser string y que su modificador de acceso sera privado
    private String editorial;//Nos dice que editorial va ser string y que su modificador de acceso sera privado
    private int anoPub;//Nos dice que añopub va ser entero y su modificador de acceso sera privado

    public Documento(int codigo, String titulo, String autor, String editorial, int anoPub) {//Nos dice que documentos tendra todos los datos anteriores que tenia registro
        this.codigo = codigo;//si es codigo es codigo
        this.titulo = titulo;// cuando sea titulo sera titulo
        this.autor = autor;//nos dice que si es autor sera autor
        this.editorial = editorial;//que si es editorial sera editorial
        this.anoPub = anoPub;//nos dice que cuando sea año pub sera año pub
    }

    public int getCodigo() {//cuando ingresemos el codigo correctamente nos va devolver al registro
        return codigo;//nos regresa al codigo
    }

    public void setCodigo(int codigo) {//Nos dice que cada objeto tiene que tener su propia clase en este caso codigo
        this.codigo = codigo;//Nos dice que si el codigo es verdadero entonces compilara
    }

    public String getTitulo() {//cuando ingresemos el titulo correctamente nos va devolver al registro
        return titulo;//Nos regresa al titulo
    }

    public void setTitulo(String titulo) {//Nos dice que cada objeto tiene que tener su propia clase en este caso titulo
        this.titulo = titulo;//Nos dice que si el titulo es verdadero entonces compilara
    }

    public String getAutor() {//cuando ingresemos el autor correctamente nos va devolver al registro
        return autor;//nos regresa al autor
    }

    public void setAutor(String autor) {//Nos dice que cada objeto tiene que tener su propia clase en este caso autor
        this.autor = autor;//Nos dice que si el autor es verdadero entonces compilara
    }

    public String getEditorial() {//cuando ingresemos el Editorial correctamente nos va devolver al registro
        return editorial;//nos regresa al editorial
    }

    public void setEditorial(String editorial) {//Nos dice que cada objeto tiene que tener su propia clase en este caso Editorial
        this.editorial = editorial;//Nos dice que si el editorial es verdadero entonces compilara
    }

    public int getAnoPub() {//cuando ingresemos el anopub correctamente nos va devolver al registro
        return anoPub;//nos regresa el anoPub
    }

    public void setAnoPub(int anoPub) {//Nos dice que cada objeto tiene que tener su propia clase en este caso anopub
        this.anoPub = anoPub;//Nos dice que si el anopub es verdadero entonces compilara
    }

    public String toString() {
        return "codigo=" + codigo +"\n"+ ", titulo=" + titulo +"\n"+ ", autor=" + autor + "\n"+ ", editorial=" + editorial +"\n"+  ", anoPub=" + anoPub +"\n";//si todo esta bien nos regresa al principio
    }
    
    
}
