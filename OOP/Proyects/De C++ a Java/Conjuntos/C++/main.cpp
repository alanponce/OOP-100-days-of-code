#include <iostream>	//libreria que es utilizada para las operaciones de entrada y salida "cin" y "cout"
#include "Conjunto.h"	//Se incluye la clase Conjunto
#include "OperacionesConjuntos.h"	//Se incluye la clase OperacionesConjuntos

using namespace std;	//Permite usar el coun y cin

int main(int argc, char** argv) {
	Conjunto a, b;	//Se crea objetos a y b de la clase conjunto
	OperacionesConjuntos d;	  //Se crea un objeto d de la clase OperacionesConjuntos
	
	
	cout<<"Conjunto 1 \n";	  //Se imprime que se manejara el conjunto 1
	b.Insertar(1);	  //Se inserta un valor en el conjunto
	b.Insertar(2);	  //Se inserta un valor en el conjunto
	b.Insertar(3);	  //Se inserta un valor en el conjunto
	b.imprimir();	  //Imprime el primer conjunto
	
	cout<<"\n\nConjunto 2 \n";	  //Se imprime que se manejara el conjunto 2
	a.Insertar(3);	  //Se inserta un valor en el conjunto
	a.Insertar(4);	  //Se inserta un valor en el conjunto
	a.Insertar(5);	  //Se inserta un valor en el conjunto
	a.imprimir();	  //Imprime el segundo conjunto
	
	cout<<"\n\nUnion de conjuntos: \n";	//Se immprime que se hara una union
	d.Union(b,a);	//Se realiza la union de conjunbtos
	
	cout<<"\n\nIntereseccion de conjuntos: \n";	//Se imprime que se hara una interseccion
	d.Interseccion(b,a);	//Se realiza la interseccion
	
	return 0;
}
