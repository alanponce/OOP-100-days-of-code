
package pilas;//En el package pilas estaran las clases relacionadas entre si

 
public class Stack {
    int TAM = 50;//Declaramos la variablo TAM (tamaño) de tipo entero con un valor de 50
    private int TOP;//Declaramos la variable privada TOP de tipo entero
    private int[] arrStack = new int[TAM];//Declaramos el arreglo privado de tipo entero y el velor del arreglo es igual a TAM
    
    
    public Stack(){//Creamos el constructor
        TOP = 0;//TOP se incializa en 0
    }
    
    public boolean isEmpty(){//Se crea la funcion de tipo boleana isEmpty
        return(TOP==0);//si TOP=0 entonces es verdadero, si no es Falso
    }
    
    public boolean isFull() {//Se crea la funcion de tipo boleana isFull
        return(TOP==TAM);//Si TOP=Tam entonces es verdadero, si no es Falso
    }
    public void push(int e){//Se crea la funcion push de tipo void, en la cual se ingresara un valor de tipo entero
        if(isFull()){//Si la pila esta llena
            System.out.print("Pila llena");//Mostrar pila llena 
        }//Si no
        arrStack[TOP]=e;//ingresa e en el arreglo en la posicion TOP
        TOP++;//Top incrementa su valor 
    }

    public int pop(){//Se crea la funcion pop de tipo entero
        int x;//Se declara la variable x de tipo enter
        
        if(isEmpty()){//Si la pila esta vacia
            return -10000000;//Regresa -1000000
        }//si no
        TOP--;//TOP decrementa su valor
        x = arrStack[TOP];//x es igual a el valor del arreglo que este en la posicio TOP
        return x;//Regresa el valor de x
    } 
   
    public int TOP(){//Se crea la funcion Top de tipo entero
        int x;//Se declara la variable x de tipo entero
        
        if(isEmpty()){//Si la pila esta vacia
            System.out.print("Pila vacia");//Mostramos que la pila esta vacia
        }//si no
        
        x = arrStack[TOP-1];//x es igual al valor en la posicion TOP-1 del arreglo
        return x;//Regresa el valor de x
    }
 
    
    
}
