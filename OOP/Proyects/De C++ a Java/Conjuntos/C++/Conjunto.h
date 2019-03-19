#include <iostream>
#ifndef CONJUNTO_H
#define CONJUNTO_H

class Conjunto
{
	private: 
	int conjunto[50];
	int tam;
	 
	public:
		Conjunto();
		
		void Vaciar();
		void Insertar(int x);
		void Eliminar(int x);
		
		bool esVacio();
		bool Pertenece(int x);
		
		int tamano();
		int Mostrar(int posicion);
		
		void imprimir();
};

#endif
