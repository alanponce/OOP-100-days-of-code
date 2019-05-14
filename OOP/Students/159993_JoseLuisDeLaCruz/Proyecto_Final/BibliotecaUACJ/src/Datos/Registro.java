package Datos;//paquete de datos

import Negocio.Documento;//Nos permite importar los datos de negocios a nuestro registro
import java.util.ArrayList;//Nos permite almacenar los valores de los datos en la lista
import javax.swing.JOptionPane;//Nos permite al momento de ingresar datos y mostrar información para poder usar correctamente los datos que se ingresan

 //@author Jose Luis De La Cruz

public class Registro {//Nos dice que la clase es publica y que se llama Registro
    static ArrayList<Documento>listaDocumentos;//Nos permitira almacenar los documentos en la memoria de forma similar a los Arrays

    public Registro() {//nos dice que la clase registro es publica
        listaDocumentos=new ArrayList<Documento>();//Nos permite almacenar los nuevos documentos en un nuevo Array
    }

    public static ArrayList<Documento> getListaDocumentos() {//Nos dice que podamos almacenar una lista de documentos
        return listaDocumentos;//Nos regresa a la lista documentos
    }

    public static void setListaDocumentos(ArrayList<Documento> listaDocumentos) {//Nos dice que va almacenar los documentos con los demas documentos que ya tengamos existentes
        Registro.listaDocumentos = listaDocumentos;//Nos guarda los documentos que ingresemos en la lista de documentos
    }
    
    public static void agregarDoc(Documento doc){///Nos dice que podemos agregar documentos
        boolean repetido=false;//si el documento no existe entonces es falso
        for(Documento d:listaDocumentos){
            if(d.getCodigo()==doc.getCodigo()){
                repetido=true;
                JOptionPane.showMessageDialog(null, "No se puede agregar puesto que el numero de doc ya existe");//Nos muestra un mensaje que nos dice si el numero de documento es repetido
                break;
            }
        }
        if(repetido==false){//si el documento no esta repetido entonces es verdadero
            listaDocumentos.add(doc);
            JOptionPane.showMessageDialog(null, "Documento agregado satisfactoriamente");//Nos muestra un mensaje que nos dice que el documento ah sido agregado satisfactoriamente
        }
        
    }
    public static void eliminarDoc(int cod){//Nos dice que es una clase publica y se llama eliminar documentos
        boolean existe=false;//Nos dice que si el documento existe entonces sera falso
        for(Documento d:listaDocumentos){
            if(d.getCodigo()==cod){
                existe=true;//si el documento existe entonces es eliminado
                listaDocumentos.remove(d);//Nos elimina el documento
                JOptionPane.showMessageDialog(null, "Documento eliminado");//Nos muestra un mensaje que nos dice que el docuento fue eliminado
                 break;
            }
        }
        if(existe==false){//Si el documento con el codigo no existe entonces no sera eliminado
            JOptionPane.showMessageDialog(null, "No existe un documento con el codigo ingresado");//Nos muestra un mensaje que nos dice que el documento con el codigo no existe
        }
        
    }
    public static void listar(){//Nos permite listar los documentos
        for(Documento d:listaDocumentos){//Esta opcion nos permite ver la lista de documentos
            System.out.println(d.toString());//Nos dice que el si el documento existe entonces si imprimira
        }
    } 
}