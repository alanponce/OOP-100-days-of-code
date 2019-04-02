package pilas;//en el paquete pilas estaran las clases relacionadas entre ellas mismas

public class Stack_Generic <T>{//creamos nuestra clase y la declaramos publica
    int TAM = 50;//declaramos una variable de tipo entero y la inicializamos en 50
    private int TOP; //declaramos un dato privado y de tipo entero
    private int[] arrStack = new int [TAM];//declaramos un nuevo objeto de tipo entero llamadop TAM
 
    public Stack_Generic(){//declaramos la clase publica
        TOP = 0;//inicializamos top igual a cero
    }
    
    public boolean isEmpty(){//declaramos una funcion de tipo bool isEmpty y la hacemos publica
        return(TOP==0);//si la pila esta vacia top es igual a cero
    }
    
    public boolean isFull(){//declaramos la funcion de tipo bool isFull y la hacemos publica
        return(TOP==TAM);// si la pila esta llena retorna el tamano de la pila
    }
    
    public void push (T e){
        if (isFull())//si la pila esta llena
            System.out.print("Pila llena");//imprime que la pila esta llena
        //arrStack[TOP] = e;
        TOP++;//la variable top aumenta 
    }
    
    public int pop(){//declaramos la funcion pop publica
        int x;//declaramos x como entero
        
        if (isEmpty())//si la pila esta vacia
            return -1000000;//retorna el valor -1000000
        TOP--;//el valor de top decrece
        x = arrStack[TOP];//x es igual al valor del arreglo Top
        return x;//retorna el valor x
    }
    
    public int TOP(){//declaramos publica la variable top de tipo entero
        int x;//declaramos x como variable de tipo entero
        
        if (isEmpty())//si la pila esta vacia
            System.out.print("Pila vacia");//imprime que la pila esta vacia
        x = arrStack[TOP-1];//x es igual al valor del arreglo top-1
        return x;//retorna el valor de x
    }
}
