#ifndef OPERACIONESCONJUNTOS_H
#define OPERACIONESCONJUNTOS_H
#include "Conjunto.h"

class OperacionesConjuntos
{
	public:
		OperacionesConjuntos();
		
		Conjunto crearConjuntoVacio();
		Conjunto Union(Conjunto x, Conjunto y);
		Conjunto Interseccion(Conjunto x, Conjunto y);
		bool EsSubConjunto (Conjunto x, Conjunto y);
};

#endif
