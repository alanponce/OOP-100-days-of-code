package conjunto;//creamos el package conjunto en donde estaran las clases 

public class OperacionesConjuntos { //creamos la clase llamandola OperacionesConjuntos
    public OperacionesConjuntos(){
        
    }
    
    void CrearConjuntoVacio(){  
           Crear_Conjunto c = new Crear_Conjunto();//creamos un conjunto nuevo llamado c
           c.Vaciar();
    }
    
    Crear_Conjunto Union(Crear_Conjunto x, Crear_Conjunto y ){//creamos un conjunto union entre un conjunto x y otro conjunto y
        Crear_Conjunto c = new Crear_Conjunto();
        c = x;
            for(int i=0; i<y.tamaño(); i++){ // creamos un par de ciclos for dandoles un valor inicial igual a cero si el conjunto entra en el ciclo lo muestra
                if(!c.Pertenece(y.Mostrar(i)))
                    c.Insertar(y.Mostrar(i));
            }
            c.imprimir();
            return c;
    }
    
    Crear_Conjunto Interseccion(Crear_Conjunto x, Crear_Conjunto y){//creamos un conjunto union entre un conjunto x y otro conjunto y
        Crear_Conjunto c = new Crear_Conjunto();
        
        for(int i = 0; i<x.tamaño(); i++){// creamos un par de ciclos for si el conjunto entra en el ciclo lo muestra
            for(int j = 0; i<y.tamaño(); j++){
                if(y.Pertenece(x.Mostrar(i))){
                    if(!c.Pertenece(x.Mostrar(i)))
                        c.Insertar(j);
                
                }       
            } 
        }
    c.imprimir();
    return c;
    } 
}
