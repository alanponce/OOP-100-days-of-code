#include "Stack.h"//incluimos nuestra clase Stack
#include <iostream> //incluimos la libreria iostream

Stack::Stack()//se crea el constructor
{
	TOP=0;//inicializamos top en cero
}

bool Stack::isEmpty(){// creamos una funcion tipo bool isEmpty
	return(TOP==0);//si TOP es igual a cero ,es verdadero,si es diferente de cero es Falso
}

bool Stack::Push(int elemento){//creamos la funcion push de tipo bool donde podremos ingresar un elemento 
	if(isFull())//si la pila ya esta llena
		return false;//retorna falso
	arrStack[TOP]=elemento;//el valor del arrreglo Top es igual al elemento
	TOP++;//top incrementa su valor
}

TipoDeDato Stack::Pop(){//creamos una funcion de tipo de dato pop
	int x;//declaramos una variable x de tipo entero
	
	if(isEmpty())//si la pila esta vacia
		return -1000000;//regresa -1000000
	
	TOP--; //top decrementa su valor
	x=arrStack[TOP];//la variable x es igual al valor de TOP del arreglo
	return x;//regresa el valor de x
}

TipoDeDato Stack::Top(){//creamos una funcion de tipo de dato top
	int x;//declaramos una variable x  de tipo entero
	
	if(isEmpty())//si la pila esta vacia
		return -1000000;//regresa -1000000
	
	x=arrStack[TOP-1];//la variable x es igual al valor en la posicion TOP-1 del arreglo
	return x;//regresa el valor de x
}

bool Stack::isFull(){//creamos la funcion de tipo bool isFull
	return(TOP==TAM);//regresa top y su tamano 
}
