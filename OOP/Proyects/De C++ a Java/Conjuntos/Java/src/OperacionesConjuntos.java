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
        
            // creamos un par de ciclos for, si el conjunto entra en el ciclo lo muestra
            for(int i=0; i<y.tamaño(); i++){ 
                if(!c.Pertenece(y.Mostrar(i)))
                    c.Insertar(y.Mostrar(i));
            }
            c.imprimir();
            return c;
    }
    
    Crear_Conjunto Interseccion(Crear_Conjunto x, Crear_Conjunto y){//creamos un conjunto union entre un conjunto x y otro conjunto y
        Crear_Conjunto c = new Crear_Conjunto();
        
        // creamos un par de ciclos for si el conjunto entra en el ciclo lo muestra
        for(int i = 0; i<x.tamaño(); i++){
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
