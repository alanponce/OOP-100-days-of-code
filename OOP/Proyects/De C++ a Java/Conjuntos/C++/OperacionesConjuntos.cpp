#include "OperacionesConjuntos.h" //incluimos nuestra clase  operacionesconjuntos

OperacionesConjuntos::OperacionesConjuntos()
{
}

Conjunto OperacionesConjuntos::crearConjuntoVacio(){//creamos una funcion que vacie el conjunto 
	Conjunto c;
	c.Vaciar();
}

Conjunto OperacionesConjuntos::Union(Conjunto x, Conjunto y){ //creamos una funcion que haga la union entre el conjunto x y el conjunto y
	Conjunto c;
	c=x;
	
	for(int i=0; i<y.tamano();i++)//se crea un ciclo for
		if(!c.Pertenece(y.Mostrar(i)))//si el elemento pertenece al conjunto lo muestra
			c.Insertar(y.Mostrar(i));
		
	c.imprimir();//imprime la union de los conjuntos
	return c;
}


Conjunto OperacionesConjuntos::Interseccion(Conjunto x, Conjunto y){ //creamos una funcion que realize la interseccion entre el conjunto x y el conjunto y
	Conjunto c;
	Conjunto c;
	
	for(int i =0; i<x.tamano();i++)//creamos un ciclo for con la variable de tipo entero inicializandola en cero
		for(int j=0;j<y.tamano();j++)//creamos un ciclo for con la variable de tipo entero inicializandola en cero
			if(y.Pertenece(x.Mostrar(i)))
				if(!c.Pertenece(x.Mostrar(i)))//si el elemento pertenece al conjunto lo muestra
					c.Insertar(x.Mostrar(i));	
	c.imprimir(); //imprime la interseccion de los conjuntos X y Y		
}
