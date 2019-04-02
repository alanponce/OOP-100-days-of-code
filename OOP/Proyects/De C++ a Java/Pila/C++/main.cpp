#include <iostream> //incluimos la libreria iostream 
#include "Stack.h" //incluimos la clase stack

using namespace std;//permite el uso de cout y cin

int main(int argc, char** argv) { ////funcion global main de tipo entero que tiene argumentos, el primero que es el numero de argumentos y el segundo que es un puntero de cadena 
	
	Stack p;//declaramos un objeto p de la clase stack
	
	p.isEmpty();//el objeto p esta vacio
	p.isFull();//
	//con el objeto p se llama a la funcion push
	p.Push(1);
	p.Push(2);
	p.Push(3);
	
	cout<<"Datos que se sacaron de la pila\n";// se imprimen los datos que se sacaron de la pila
	
	cout<<p.Pop()<<endl;//se muestran los datos mediante la funcion pop
	cout<<p.Pop()<<endl;//
	
	cout<<"\nUltimo dato en la pila: ";//se imprime el ultimo dato de la pila
	cout<<p.Top();////muestra el dato de la pila con nuestra funcion top
	
	
	return 0;
}
