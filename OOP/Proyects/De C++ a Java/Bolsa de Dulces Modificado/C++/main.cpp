#include "CBolsa.h"		//se incluye la clase CBolsa
//#include "dulces.h"		//se incluye la clase dulces

int main(int argc, char** argv) {	//funcion global main de tipo entero que tiene argumentos, el primero que es el numero de argumentos y el segundo que es un puntero de cadena 
	CBolsa b;	//Se crea un objeto b de la clase CBolsa
	
	b.meterdulce(1);	//Con el objeto b se llama a la funcion meter dulce
	b.meterdulce(2);	//Con el objeto b se llama a la funcion meter dulce
	b.meterdulce(3);	//Con el objeto b se llama a la funcion meter dulce
	
	b.sacardulce(1);	//Con el objeto b se llama a la funcion sacar dulce
	b.Imprimir();		//Con el objeto b se llama a la funcion imprimir
	
	return 0;
}
