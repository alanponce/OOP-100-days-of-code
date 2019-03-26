#ifndef OPERACIONESCONJUNTOS_H //Sirve para que no se procese dos veces la clase, solo se incluye si no se incluyo antes
#define OPERACIONESCONJUNTOS_H
#include "Conjunto.h" //incluimos nuesta clase conjunto

class OperacionesConjuntos //declaramos nuestra clase con el nombre de operacionesconjuntos  
{
	public://lo declaramos publico para que cualquier objeto  de la clase pueda acceder
		OperacionesConjuntos();
		
		Conjunto crearConjuntoVacio();// se declara una funcion que creara un conjunto vacio 
		Conjunto Union(Conjunto x, Conjunto y);//declaramos una funcion que realizara la union de los conjuntos
		Conjunto Interseccion(Conjunto x, Conjunto y);//declaramos una funcion que realizarala interseccion entre conjuntos
		bool EsSubConjunto (Conjunto x, Conjunto y);
};

#endif //fin de la inclusion de clase
