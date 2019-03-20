package conjunto;//creamos un package llamandolo conjunto en el que estaran todas las clases que se relacionan entre si


public class Conjunto { //Creamos una clase y la llamamos Conjunto
    
    public static void main(String[] args) {// creamos el main
        //Creamos tres  conjuntos y los llamamos a,b,c respectivamente
       Crear_Conjunto a = new Crear_Conjunto();
       Crear_Conjunto b = new Crear_Conjunto();
       Crear_Conjunto c = new Crear_Conjunto();
       
       System.out.print("Conjunto 1 \n");//imprime el primer conjunto de numeros
        a.Insertar(2);
        a.Insertar(9);
        a.Insertar(6);
        
        a.imprimir();
        
        
       System.out.print("\nConjunto 2\n");//imprime el segundo conjunto de numeros
        b.Insertar(9);
        b.Insertar(6);
        b.Insertar(1);
        
        b.imprimir();
       
        
        OperacionesConjuntos d = new OperacionesConjuntos();//llamamos a la operacion entre conjuntos
        
        System.out.print("\nUnion de los Conjuntos: ");//nos imprime la union entre el conjunto a y b
            d.Union(a, b);
        
        System.out.print("\nInterseccion de Conjuntos: ");//nos imprime la interseccion entre los conjuntos a y b
            d.Interseccion(a, b);
            
               
       
    }
    
}
