package conjunto;


public class Conjunto {
    
    public static void main(String[] args) {
       Crear_Conjunto a = new Crear_Conjunto();
       Crear_Conjunto b = new Crear_Conjunto();
       Crear_Conjunto c = new Crear_Conjunto();
       
       System.out.print("Conjunto 1 \n");
        a.Insertar(2);
        a.Insertar(9);
        a.Insertar(6);
        
        a.imprimir();
        
        
       System.out.print("\nConjunto 2\n");
        b.Insertar(9);
        b.Insertar(6);
        b.Insertar(1);
        
        b.imprimir();
       
        
        OperacionesConjuntos d = new OperacionesConjuntos();
        
        System.out.print("\nUnion de los Conjuntos: ");
            d.Union(a, b);
        
        System.out.print("\nInterseccion de Conjuntos: ");
            d.Interseccion(a, b);
            
               
       
    }
    
}