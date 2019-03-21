package pilas;//En el package pilas estaran las clases relacionadas entre si


public class Pilas {

    public static void main(String[] args) {
        Stack p = new Stack();//Se declara el objeto p de la clase Stack
        
        //Mostramos si la pila es vacia o no con la funcion isEmpty mediante el objeto p
        System.out.print("\nLa pila esta vacia? "+p.isEmpty());
        //Mostramos si la pila esta llena o no con la funcion isFull mediante el objeto p
        System.out.print("\nLa pila esta llena? "+p.isFull());
        
        //Con el objeto p llammos la funcion push para introducir datos de tipo int a la pila
        p.push(1);
        p.push(2);
        p.push(3);
        
        //Mostramos los datos extraidos de la pila con la funcion pop 
        System.out.print("\nDato extraido de la pila: "+p.pop());
        System.out.print("\nDato extraido de la pila: "+p.pop());
        
        //Mostramos el tope de la pila con la funcion TOP
        System.out.print("\nUltimo dato en la pila: "+p.TOP());
        
        
       
    }
    
}
