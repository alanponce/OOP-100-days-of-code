#include <iostream> //incluimos la biblioteca standard iostream
#ifndef CONJUNTO_H //definimos nuestra clase conjunto
#define CONJUNTO_H //definimos lconjunto como macro

class Conjunto //creamos nuestra clase y la llamamos conjunto
{
	private: //declaramos los datos privados 
	int conjunto[50];//creamos una variable de tipo entero llamada conjunto
	int tam;//creamos una variable de tipo entero llamada tam
	 
	public://declaramos datos publicos
		Conjunto();
		
		void Vaciar();//declaramos la funcion vaciar
		void Insertar(int x);//declaramos la duncion insertar para un caracter de tipo entero
		void Eliminar(int x);//declaramos una funcion eliminar para un caracter de tipo entero
		
		bool esVacio();//declaramos una variable de tipo bool llamandola vacio
		bool Pertenece(int x);//declaramos una variable de tipo bool pertenece para un caracter de tipo entero
		
		int tamano();//declaramos una variable int que nos muestre el tamano del conjunto
		int Mostrar(int posicion);//declaramos una variable int que nos muestre la posicion
		
		void imprimir();//declaramos la funcion para imprimir
};

#endif
