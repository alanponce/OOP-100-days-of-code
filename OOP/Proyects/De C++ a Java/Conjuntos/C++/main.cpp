#include <iostream>
#include "Conjunto.h"
#include "OperacionesConjuntos.h"

using namespace std;

int main(int argc, char** argv) {
	Conjunto a, b;
	OperacionesConjuntos d;
	
	
	cout<<"Conjunto 1 \n";
	b.Insertar(1);
	b.Insertar(2);
	b.Insertar(3);
	b.imprimir();
	
	cout<<"\n\nConjunto 2 \n";
	a.Insertar(3);
	a.Insertar(4);
	a.Insertar(5);
	a.imprimir();
	
	/*	b.Eliminar(1);
	
	b.Mostrar(2);
	
	b.esVacio();
	
	b.Pertenece(1);
	
	b.tamano();
	
	b.imprimir();  */
	
	cout<<"\n\nUnion de conjuntos: \n";
	d.Union(b,a);
	
	cout<<"\n\nIntereseccion de conjuntos: \n";
	d.Interseccion(b,a);
	
	return 0;
}
