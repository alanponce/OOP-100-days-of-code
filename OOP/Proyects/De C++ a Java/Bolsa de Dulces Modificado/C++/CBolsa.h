#ifndef CBOLSA_H  //Sirve para que no se procese dos veces la clase, solo se incluye si no se incluyo antes
#define CBOLSA_H
#include "dulces.h" 	//Se incluye la clase dulces

class CBolsa	//se declara la clase llamada CBolsa
{
	dulces d;	//Se crea un objeto d de la clase dulces
	
	public:		//pueden ser accedidos de cualquier parte donde este declarado un objeto de la clase
		
		CBolsa();	//Constructor de la clase
	
		int meterdulce(int color);		//Recibe un entero y permite acceder al dato privado color de la clase dulces
		int sacardulce(int color);		//Recibe un entero y permite acceder al dato privado color de la clase dulces
		
		void Imprimir();	//no recibe argumentos y se utilizara para mostrar por pantalla la información.
		
};
#endif
