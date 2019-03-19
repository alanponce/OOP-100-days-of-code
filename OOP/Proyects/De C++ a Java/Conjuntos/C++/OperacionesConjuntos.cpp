#include "OperacionesConjuntos.h"

OperacionesConjuntos::OperacionesConjuntos()
{
}

Conjunto OperacionesConjuntos::crearConjuntoVacio(){
	Conjunto c;
	c.Vaciar();
}

Conjunto OperacionesConjuntos::Union(Conjunto x, Conjunto y){
	Conjunto c;
	c=x;
	
	for(int i=0; i<y.tamano();i++)
		if(!c.Pertenece(y.Mostrar(i)))
			c.Insertar(y.Mostrar(i));
		
	c.imprimir();
	return c;
}


Conjunto OperacionesConjuntos::Interseccion(Conjunto x, Conjunto y){
	Conjunto c;
	
	for(int i =0; i<x.tamano();i++)
		for(int j=0;j<y.tamano();j++)
			if(y.Pertenece(x.Mostrar(i)))
				if(!c.Pertenece(x.Mostrar(i)))
					c.Insertar(x.Mostrar(i));	
	c.imprimir();			
}
