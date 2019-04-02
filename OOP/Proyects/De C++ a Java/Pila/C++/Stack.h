#ifndef STACK_H //definimos nuestra clase stack
#define STACK_H //definimos stack como macro

typedef int TipoDeDato;//con el metodo typedef declaramos una variable de tipo entero y la llamamos tipo de dato
const int TAM = 50; //creamos la variable de tipo entero TAM y la inicializamos en cero

class Stack //creamos la clase llamada stack
{
	private: //declaramos los datos privados
		int TOP; //creamos una variable de tipo entero y la llamamos TOP
		TipoDeDato arrStack[TAM]; //creamos un arreglo lo llamamos TAM
		
  public: //declaramos los datos publicos
		Stack ();
		bool Push(TipoDeDato elemento); //creamos una funcion push de tipo bool para poder ingresar un elemento
		TipoDeDato Pop(); //creamos un tipo de dato pop
		void Empty(); //creamos un metodo void Empty o mejor dicho que no devuelve ningun valor
		TipoDeDato Top();//creamos un tipo de dato top
		bool isEmpty(); //creamos una funcion isEmpty de tipo bool
		bool isFull(); //funcion isFull de tipo bool
};

#endif
