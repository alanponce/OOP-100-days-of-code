package conjunto;

public class OperacionesConjuntos {
    public OperacionesConjuntos(){
        
    }
    
    void CrearConjuntoVacio(){
           Crear_Conjunto c = new Crear_Conjunto();
           c.Vaciar();
    }
    
    Crear_Conjunto Union(Crear_Conjunto x, Crear_Conjunto y ){
        Crear_Conjunto c = new Crear_Conjunto();
        c = x;
            for(int i=0; i<y.tamaño(); i++){
                if(!c.Pertenece(y.Mostrar(i)))
                    c.Insertar(y.Mostrar(i));
            }
            c.imprimir();
            return c;
    }
    
    Crear_Conjunto Interseccion(Crear_Conjunto x, Crear_Conjunto y){
        Crear_Conjunto c = new Crear_Conjunto();
        
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
